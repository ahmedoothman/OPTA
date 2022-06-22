/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javafiles;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Date;

public class Email 
{
    private static String id;
    private static Date date;
    private static String name = "User";
    private static String roomName ="Room A";
    private static int roomID = 1;
    private static String email = null;
    private static double price = 100;
    
    public Email(String Cemail,int roomID){
        Account person = new Account(); 
        person.getAccInfo(Cemail);
        ReservationRooms[] reslist = ReservationRooms.viewReservations(Cemail);
        int temp = 0;
        for(int i =0;i<reslist.length;i++){
            if(reslist[i].getRoomID() == roomID){
                temp = i;
                break;
            }
        }
        this.id = id;
        this.date = reslist[temp].getArrivalDate();
        this.name = person.getFname() +" "+person.getLname();
        if(reslist[temp].getRoomID() == 1){
         this.roomName = "Room A";
        }else if(reslist[temp].getRoomID() == 2){
            this.roomName = "Room B";
        }else{
        this.roomName = "Room C";
        }
        this.roomID = roomID;
        this.price = reslist[temp].getTotalPrice();
        this.email = person.getEmail();
        try {
            Email.sendMail(email);
        } catch (Exception ex) {
            Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void sendMail(String recepient) throws Exception
    {
        Properties properties=new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp-mail.outlook.com");
        properties.put("mail.smtp.port","587");
        
        String account="opta_hotels@outlook.com";
        String password="OptaHotelS1_2022";
       
       Session session =Session.getInstance(properties, new Authenticator()
        {  
            @Override
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(account, password);
            }
        });
       Message messege= prepareMessage(session,account,recepient);
       Transport.send(messege);
    }
    private static Message prepareMessage(Session session, String account, String recepient) 
    {
        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(account));
            msg.setRecipient(Message.RecipientType.TO,new InternetAddress(recepient));
            String htmlcode="   <div style='width:600px; height:auto; background:#e8e9eb; font-family:Myanmar Text;'>\n" +
"                <div style='width:600px; height:40px; background:#165c7a; text-align:center;color:white;'>\n" +
"                    <h1>OPTA</h1>\n" +
"                </div>\n" +
"                <h1 style='text-align: center; margin-top:40px;'><span style='color:#165c7a;'>Mr./Mrs.</span><span style='color:#313232;'> "+name+"</span></h1> \n" +
"                <h2 style='color:#26a842; text-align:center; margin:0;'>"+ roomName +" Reserved</h2>\n" +
"                <div style='text-align: center; font-size: 20px; font-weight: 600;'>\n" +
"                    <span>Total Price: $"+price+"</span> <br><span>Starting From :"+ date+"</span>\n" +
"                </div>\n" +
"                <h2 style='text-align:center; color:#165c7a; font-weight:bold;'>Thank you for choosing our hotel</h2>\n" +
"            </div>";
            msg.setSubject("OPTA Reservation confirmation");
            //msg.setText(""); //this for normal code
            msg.setContent(htmlcode,"text/html"); //this for html
            return msg;
        } catch (Exception ex) {
            Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, ex);
        }return null;
    }   
    public static void main(String[] args) throws MessagingException, Exception 
    {
       //Email.sendMail("ahmed.othman.ghazzawi@gmail.com");
        
    }   
}