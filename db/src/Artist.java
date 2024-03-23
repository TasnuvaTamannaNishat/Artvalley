
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Artist extends javax.swing.JFrame {

   
    public Artist() {
        initComponents();
        ArtistTable();
    }

    public void ArtistTable()
    {
                try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       Connection con =DriverManager.getConnection(
          "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
      
           
        
        String query = "select * from artists";
           PreparedStatement pst = con.prepareStatement(query);
         Statement statement = con.createStatement();
       ResultSet rs = statement
                    .executeQuery(query);
       ResultSetMetaData RSM = rs.getMetaData();
       int c;
       c= RSM.getColumnCount();
       DefaultTableModel DF =(DefaultTableModel)artab.getModel() ;
       DF.setRowCount(0);
       while (rs.next())
       {
           Vector v2 = new Vector ();
           for (int i=1; i<=c;i++)
           {
               v2.add(rs.getString("Artist_id"));
               v2.add(rs.getString("Artist_Name"));
               v2.add(rs.getString("Artist_Phone"));
               v2.add(rs.getString("Artist_email"));
               v2.add(rs.getString("Artist_Credit_card"));
              
           }
           DF.addRow(v2);
           
       }
   
   
         }
         catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
        }
    }                                        

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Artist_Name = new javax.swing.JTextField();
        Artist_Phone = new javax.swing.JTextField();
        Artist_email = new javax.swing.JTextField();
        Artist_Credit_card = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        artab = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setText("Artist Form");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(444, 13, 188, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Artist Name :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(242, 168, 105, 39);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Phone Number of Artist :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(149, 245, 198, 39);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Email Address :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(225, 317, 122, 39);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Credit Card Number :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(179, 403, 168, 39);

        Artist_Name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Artist_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Artist_NameActionPerformed(evt);
            }
        });
        getContentPane().add(Artist_Name);
        Artist_Name.setBounds(545, 167, 320, 40);

        Artist_Phone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Artist_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Artist_PhoneActionPerformed(evt);
            }
        });
        getContentPane().add(Artist_Phone);
        Artist_Phone.setBounds(545, 244, 320, 40);

        Artist_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Artist_emailActionPerformed(evt);
            }
        });
        getContentPane().add(Artist_email);
        Artist_email.setBounds(545, 318, 320, 40);

        Artist_Credit_card.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Artist_Credit_card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Artist_Credit_cardActionPerformed(evt);
            }
        });
        getContentPane().add(Artist_Credit_card);
        Artist_Credit_card.setBounds(545, 391, 320, 40);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(486, 526, 148, 37);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(100, 526, 148, 37);

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Next ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(863, 526, 148, 37);

        artab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Artist_id", "Artist_Name", "Artist_Phone", "Artist_email", "Artist_Credit_card"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(artab);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 698, 1100, 290);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Artist_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Artist_PhoneActionPerformed
       
    }//GEN-LAST:event_Artist_PhoneActionPerformed

    private void Artist_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Artist_emailActionPerformed
      
    }//GEN-LAST:event_Artist_emailActionPerformed

    private void Artist_Credit_cardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Artist_Credit_cardActionPerformed
        
    }//GEN-LAST:event_Artist_Credit_cardActionPerformed

    private void Artist_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Artist_NameActionPerformed
       
    }//GEN-LAST:event_Artist_NameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      artwork d = new artwork();
  d.show();
  dispose();       
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
         try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       Connection con =DriverManager.getConnection(
          "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
      
           
         String Aname = Artist_Name.getText();
         String Aphone = Artist_Phone.getText();
         String Aemail = Artist_email.getText();
         String Acredit = Artist_Credit_card.getText();
        String query = "insert into artists (Artist_Name,Artist_Phone,Artist_email,Artist_Credit_card) values(?,?,?,?)";
           PreparedStatement pst = con.prepareStatement(query);
           pst.setString(1, Aname);
             pst.setString(2, Aphone);
               pst.setString(3, Aemail);
                 pst.setString(4, Acredit);
    
   int k = pst.executeUpdate();
   if(k==1)
   {
       JOptionPane.showMessageDialog(this, "Added Successfully!");
       ArtistTable();
   }
   else 
       {
       JOptionPane.showMessageDialog(this, "Failed!");
   }
         }
         catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Artist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Artist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Artist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Artist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Artist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Artist_Credit_card;
    private javax.swing.JTextField Artist_Name;
    private javax.swing.JTextField Artist_Phone;
    private javax.swing.JTextField Artist_email;
    private javax.swing.JTable artab;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
