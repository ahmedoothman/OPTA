/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javafiles;

import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author aoosm
 */
public class popUpReserveMeals extends javax.swing.JFrame {
    private Meal[] meals;
    private int[] mealsList = new int[10];
    private int[] quantity = new int[10];
    private String customerID = null;
    private int noMeals;
     private String email ;
    ArrayList<JCheckBox> rows = new ArrayList<>();
    ArrayList<JLabel>  numberlist = new ArrayList<>();

    
    public popUpReserveMeals(int id,String customerId,String email) {
        initComponents();
        String mealName = "name";
        this.customerID = customerId;
        this.email = email;
        // initialize the quantity array
        for(int i =0;i<10;i++){
            quantity[i] = 1;
        }
        //get meals list for that restaurants
        meals = Meal.viewMeal(id);
        //System.out.println(meals.length);
        noMeals = meals.length;
        //System.out.println(meals.length);       
        //System.out.println(noMeals);
        ////////////////////////////////////////////////
        int vel = 0;
        JLabel backPop = new JLabel();
        JLabel[] name = new JLabel[noMeals]; 
        JLabel[] price = new JLabel[noMeals];
        JLabel[] plus = new JLabel[noMeals];
        JLabel[] minus = new JLabel[noMeals];
        JLabel[] whiteBox = new JLabel[noMeals];
        JCheckBox[] meal = new JCheckBox[noMeals];
        //number= new JLabel[10];
        JLabel[] number = new JLabel[noMeals];
        
        //loping meals list in the gui
        for(int i =0;i<noMeals;i++){
            
            meal[i] = new JCheckBox();
            name[i] = new JLabel();
            price[i] = new JLabel();
            plus[i] = new JLabel();
            minus[i] = new JLabel();
            whiteBox[i] = new JLabel();
           
            number[i] = new JLabel();
            number[i].setText(Integer.toString(quantity[i]));
            number[i].setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
            number[i].setForeground(new java.awt.Color(62, 63, 63));
            whiteBox[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaimgs/number.png"))); // NOI18N
            name[i].setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
            name[i].setForeground(new java.awt.Color(62, 63, 63));
            name[i].setText(meals[i].getName());
            price[i].setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
            price[i].setForeground(new java.awt.Color(22, 92, 122));
            price[i].setText("( "+Double.toString(meals[i].getPrice())+" $ )");
            plus[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaimgs/+.png"))); // NOI18N
            plus[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            plus[i].setToolTipText(Integer.toString(i));
            plus[i].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    plusMouseClicked(evt);
                } 
                
                
            });
            minus[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaimgs/-.png"))); // NOI18N
            minus[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            minus[i].setToolTipText(Integer.toString(i));
            minus[i].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    minusMouseClicked(evt);
                }
            });
            jPanel1.add(minus[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 131+vel, -1, -1));
            jPanel1.add(plus[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 131+vel, 60, -1));
            jPanel1.add(price[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120+vel, 130, 60));
            jPanel1.add(name[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120+vel, 130, 60));
            jPanel1.add(meal[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130+vel, -1, 30));
            jPanel1.add(number[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130+vel, -1, 40));
            jPanel1.add(whiteBox[i], new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130+vel, -1, -1));
            numberlist.add(number[i]);
            rows.add(meal[i]); 
            vel += 50;
        }
               
        
    
      //  backPop.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        //jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 170, 50));
      backPop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaimgs/PopUpBack.png"))); // NOI18N
      jPanel1.add(backPop,  new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));     
    }
        public popUpReserveMeals() {
         this(1,"1234","email here");
        //initComponents();
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        nav = new javax.swing.JLabel();
        submit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(873, 486));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaimgs/icons8_Close_30px_1.png"))); // NOI18N
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        jPanel1.add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        nav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaimgs/nav.png"))); // NOI18N
        jPanel1.add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, -1));

        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaimgs/Submit.png"))); // NOI18N
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 170, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(873, 486));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        for(int i = 0; i<noMeals;i++){
            if(rows.get(i).isSelected()){
                mealsList[i] = meals[i].getMealID();
                addMealRes(i);
            }
        }

        dispose();

    }//GEN-LAST:event_submitMouseClicked
    private void addMealRes(int index){
        double  price = meals[index].getPrice();
        price *= quantity[index];
        int mealID = mealsList[index];
        //   public ReservationMeal(String email, int MealID, double totalPrice, int numberOfMeal, String paymentType) {
        //ReservationMeal rev = new ReservationMeal(1, customerID, mealID, null, price, quantity[index], null,null);
        ReservationMeal rev = new ReservationMeal(email,mealID,price,quantity[index],"will not pay");
       
        rev.addReservationMeal();
        
        
    }
        private void plusMouseClicked(java.awt.event.MouseEvent evt) {
     JLabel btn = (JLabel) evt.getSource();
        int pos =Integer.parseInt(btn.getToolTipText());
        //System.out.println(pos);
        quantity[pos] +=1;
        numberlist.get(pos).setText(Integer.toString(quantity[pos]));
    }
    private void minusMouseClicked(java.awt.event.MouseEvent evt) {
        //System.out.println("clicked!!");
        //numberlist.get(0).setText(Integer.toString(quantity[0]));
        JLabel btn = (JLabel) evt.getSource();
        int pos =Integer.parseInt(btn.getToolTipText());
        //System.out.println(pos);
        if(quantity[pos]>1){
            quantity[pos] -=1;
            numberlist.get(pos).setText(Integer.toString(quantity[pos]));
        }
        
        
    }
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
            java.util.logging.Logger.getLogger(popUpReserveMeals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popUpReserveMeals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popUpReserveMeals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popUpReserveMeals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new popUpReserveMeals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nav;
    private javax.swing.JLabel submit;
    // End of variables declaration//GEN-END:variables
}
