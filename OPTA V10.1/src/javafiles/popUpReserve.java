/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javafiles;


import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;
//import java.sql.Date;
/**
 *
 * @author aoosm
 */
public class popUpReserve extends javax.swing.JFrame {
    private int rooms = 0;
    private Date arrivalDate;
    private Date leavingDate;
    private String payment;
    private String id;  
    private String Cemail;

    private int hotelId;
    private int roomId;
    private double price;

    /** 
     * Creates new form popUpReserve
     */
    public popUpReserve() {
        this("11112222333344","ahmed@othman.io",3);
        noRooms.setBackground(new java.awt.Color(0,0,0,1));
        Border emptyBorder = BorderFactory.createEmptyBorder();
        arrive.setBorder(emptyBorder);
        
    
    }
      public popUpReserve(String id,String email,int roomID) {
        initComponents();
        errDate.setVisible(false);
        errNum.setVisible(false);

        noRooms.setBackground(new java.awt.Color(0,0,0,1));
        Border emptyBorder = BorderFactory.createEmptyBorder();
        arrive.setBorder(emptyBorder);
        this.id = id;
        this.Cemail = email;
        this.roomId = roomID;
        JTextFieldDateEditor editor = (JTextFieldDateEditor) arrive.getDateEditor();
        editor.setEditable(false);
        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) leaving.getDateEditor();
        editor1.setEditable(false);
        if(roomID == 1){
            titleClass.setText("Class A");
        }else if(roomID == 2 ){
            titleClass.setText("Class B");
        }else{
            titleClass.setText("Class C");
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        errDate = new javax.swing.JLabel();
        errNum = new javax.swing.JLabel();
        titleClass = new javax.swing.JLabel();
        noRooms = new javax.swing.JFormattedTextField();
        submit = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        leaving = new com.toedter.calendar.JDateChooser();
        arrive = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        errDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaimgs/errDate.png"))); // NOI18N
        jPanel1.add(errDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 220, 40));

        errNum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaimgs/errSorr.png"))); // NOI18N
        jPanel1.add(errNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 500, 60));

        titleClass.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        titleClass.setForeground(new java.awt.Color(255, 255, 255));
        titleClass.setText("Class A");
        titleClass.setToolTipText("");
        jPanel1.add(titleClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 60, 30));

        noRooms.setBorder(null);
        noRooms.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        noRooms.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        noRooms.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noRoomsKeyTyped(evt);
            }
        });
        jPanel1.add(noRooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 180, 30));

        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaimgs/Submit.png"))); // NOI18N
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 170, 50));

        jLabel17.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(62, 63, 63));
        jLabel17.setText("Credit card");
        jLabel17.setToolTipText("");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, -1, 60));

        jLabel16.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(62, 63, 63));
        jLabel16.setText("At arrival");
        jLabel16.setToolTipText("");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, 40));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setBorder(null);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setBorder(null);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        jLabel15.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(62, 63, 63));
        jLabel15.setText("paying");
        jLabel15.setToolTipText("");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        jCheckBox3.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(49, 50, 50));
        jCheckBox3.setBorder(null);
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 20, 40));

        jLabel13.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(27, 94, 124));
        jLabel13.setText("(10$ per day)");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 130, 30));

        jLabel14.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(62, 63, 63));
        jLabel14.setText("Gym");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, 30));

        jCheckBox2.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(49, 50, 50));
        jCheckBox2.setBorder(null);
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 20, 40));

        jLabel11.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(27, 94, 124));
        jLabel11.setText("(10$ per day)");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 130, 30));

        jLabel12.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(62, 63, 63));
        jLabel12.setText("Sauna");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, 30));

        jLabel10.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(62, 63, 63));
        jLabel10.setText("Parking");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, 30));

        jLabel9.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(27, 94, 124));
        jLabel9.setText("(10$ per day)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 130, 30));

        jCheckBox1.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(49, 50, 50));
        jCheckBox1.setBorder(null);
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 20, 40));

        leaving.setDateFormatString("dd/MM/yyyy");
        leaving.setFocusable(false);
        leaving.setOpaque(false);
        jPanel1.add(leaving, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 180, 30));

        arrive.setBackground(new java.awt.Color(255, 255, 255));
        arrive.setForeground(new java.awt.Color(51, 51, 51));
        arrive.setDateFormatString("dd/MM/yyyy");
        arrive.setFocusable(false);
        jPanel1.add(arrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 180, 30));

        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(49, 50, 50));
        jLabel7.setText("Leaving at");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaimgs/inputBox.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 220, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaimgs/inputBox.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 220, 50));

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(49, 50, 50));
        jLabel6.setText("Arrival at");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaimgs/inputBox.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 220, 50));

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(49, 50, 50));
        jLabel4.setText("Number of rooms");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaimgs/icons8_Close_30px_1.png"))); // NOI18N
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        jPanel1.add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaimgs/nav.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaimgs/PopUpBack.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 485));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        dispose();
    }//GEN-LAST:event_CloseMouseClicked
      private static java.sql.Date convert(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
    private void makeReservations(){
        Rooms[] roomList =  Rooms.viewRooms(1);
        //System.out.println(roomId);
        //System.out.println(roomList.length);
        price = (roomList[(roomId-1)].getPrice()) * rooms;
        ReservationRooms rev;
        java.sql.Date arv,leav;
        arv =convert(arrivalDate);
        leav = convert(leavingDate);
        String amenties = "";
        if(jCheckBox1.isSelected())
        {
            amenties += jLabel10.getText() + "_";
        }
        if(jCheckBox2.isSelected())
        {
            amenties += jLabel12.getText() + "_";
        }
        if(jCheckBox3.isSelected())
        {
            amenties += jLabel14.getText() + "_";
        }
        rev = new ReservationRooms(Cemail,payment,amenties,arv ,leav ,price,rooms, roomId);
        rev.addReservationRoom();
    }
    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        // checking for exceeding the available rooms
        int roomCheck = Integer.parseInt(noRooms.getText());
        Rooms r1 = new Rooms();
        r1.setRoomID(roomId);
        if(roomCheck > r1.isRoomAvailalbe() || roomCheck <=0){
            //here ---->
           errNum.setVisible(true);
            return;
        }
            
        
        rooms = roomCheck;
        
        //DateFormat d = new SimpleDateFormat("dd/MM/yyyy");
      /*  arrivalDate =d.format(arrive.getDate());
        leavingDate = d.format(leaving.getDate());*/
         arrivalDate = arrive.getDate();
         leavingDate = leaving.getDate();
         Date currentDate = new Date(); 
         //check about date! 
         if(currentDate.compareTo(arrivalDate)>0 || currentDate.compareTo(leavingDate)>0)
            errDate.setVisible(true);
         else if (arrivalDate.compareTo(leavingDate)>0)
           errDate.setVisible(true);
         else{
             makeReservations();
             new popUpReserveRes(Cemail,roomId).setVisible(true);
             dispose();
         }       
    }//GEN-LAST:event_submitMouseClicked

    private void noRoomsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noRoomsKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_noRoomsKeyTyped

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        payment = "at arrival";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        payment = "credit card";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(popUpReserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popUpReserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popUpReserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popUpReserve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new popUpReserve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private com.toedter.calendar.JDateChooser arrive;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel errDate;
    private javax.swing.JLabel errNum;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private com.toedter.calendar.JDateChooser leaving;
    private javax.swing.JFormattedTextField noRooms;
    private javax.swing.JLabel submit;
    private javax.swing.JLabel titleClass;
    // End of variables declaration//GEN-END:variables
}