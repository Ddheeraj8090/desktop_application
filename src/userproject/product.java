/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userproject;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dheeraj Yadav
 */
public class product extends javax.swing.JFrame { 

    /**
     * Creates new form product
     */
    public product() {
        initComponents();
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtctoep = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtpqc = new javax.swing.JTextField();
        lblresult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userproject/icon/male_user_50px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 60, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("|");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 40, 60));

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome to easy buy");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 250, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userproject/icon/icons8_menu_48px_1.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 60));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("|");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 30, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userproject/icon/search_26px.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 40, 60));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("|");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, -1, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userproject/icon/group_message_26px.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 40, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userproject/icon/bell_26px.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 40, 60));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hello, User");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, 120, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1930, 70));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userproject/icon/home_24px.png"))); // NOI18N
        jButton3.setText("   HOME");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 270, 80));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userproject/icon/shopping_cart_24px.png"))); // NOI18N
        jButton2.setText("  ORDERS");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 270, 80));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userproject/icon/template_26px.png"))); // NOI18N
        jButton4.setText("  PRODUCTS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 270, 80));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userproject/icon/shopping_cart_24px.png"))); // NOI18N
        jButton5.setText("  CARD TO EDIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 270, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 270, 960));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "PNO.", "PRODUCT NAME", "PRICE ", "PRODUCT DESC.", "QTY AVAILABLE"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel4.add(jScrollPane1);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 680, 300));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Enter QTY.");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 210, 20));

        txtctoep.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtctoep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtctoepActionPerformed(evt);
            }
        });
        jPanel3.add(txtctoep, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 190, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setForeground(new java.awt.Color(255, 153, 153));
        jButton1.setText("Add To Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 110, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Enter Product ID Aad To Cart");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 210, 20));

        txtpqc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtpqc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpqcActionPerformed(evt);
            }
        });
        jPanel3.add(txtpqc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 190, 30));

        lblresult.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jPanel3.add(lblresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 560, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 1660, 960));

        setSize(new java.awt.Dimension(1946, 1062));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

tabledata();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtctoepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtctoepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtctoepActionPerformed

    private void txtpqcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpqcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpqcActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
/*product button*/

        po();








        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        
        /*cart to edit btn*/
        
        carttoedit c = new carttoedit();
        c.setVisible(true);



       
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product().setVisible(true);
            }
        });
    }
    
    public void tabledata(){
        Connection con=null;
        
         try{
         String url = "jdbc:mysql://localhost:3306/project";
                    String uname = "root";
                    String passs = "";

                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection(url, uname, passs);

                    Statement st = con.createStatement();

                    String q = "select * from product";
                    ResultSet rs = st.executeQuery(q);
                    DefaultTableModel bleModel  = (DefaultTableModel)table.getModel();
                   bleModel.removeRow(0);
        
                    while(rs.next()){
                        
                        String arr[]={String.valueOf(rs.getInt("sn")),String.valueOf(rs.getString("pname")),String.valueOf(rs.getInt("pprice")),String.valueOf(rs.getString("pdesc")),String.valueOf(rs.getInt("pqty"))};
                        bleModel.addRow(arr);
                    }
               
        
    }catch(Exception a){
        System.out.println(a);
        
    }
    }
    
     public void po() {
        
           String id=txtpqc.getText();
        
            try {
                String url = "jdbc:mysql://localhost:3306/project";
                String username = "root";
                String password = "";

                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url, username, password);

                Statement statement = connection.createStatement();

                ResultSet resultSet = statement.executeQuery("select * from product where sn='" + id + "'");
               
                String arr[] = new String[4];
                
                    while (resultSet.next()) {
                   
                    arr[0] = resultSet.getString(1);
                    arr[1] = resultSet.getString(2);
                    arr[2] = resultSet.getString(3);
                    arr[3] = resultSet.getString(4);
               
                    }
                

               String qty=txtctoep.getText();
                String q = "Select pqty from product where sn='" + id + "'";
                ResultSet rs = statement.executeQuery(q);
                int to = 0;
                while (rs.next()) {
                    to = rs.getInt(1);
                }
                int number = Integer.parseInt(qty);
                if (number <= to) {
                    try {

                       
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection(url, username, password);

                        Statement st = connection.createStatement();

                        String bq = "insert into ctoe(sn,pname,pprice,pdesc,bqty) values(?,?,?,?,?)";

                        PreparedStatement pst = con.prepareStatement(bq);

                        pst.setString(1, arr[0]);
                        pst.setString(2, arr[1]);
                        pst.setString(3, arr[2]);
                        pst.setString(4, arr[3]);
                        pst.setInt(5, number);

                        pst.executeUpdate();
                        
                        lblresult.setText("Product Add To Successfully");
                        /*System.out.println("enter 0 to payment and enter 1 to add or product");
                        int s = sc.nextInt();
                        if (s == 0) {
                            ctoe();
                            break;
                        }*/


                    } catch (Exception a) {
                        System.out.println(a);
                    }
                } else {
                    lblresult.setText("QTY. Not Available  = "+qty);
                    
                }


            } catch (Exception e) {
                System.out.println(e);
            }

        
    }
     
     


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblresult;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtctoep;
    private javax.swing.JTextField txtpqc;
    // End of variables declaration//GEN-END:variables
}
