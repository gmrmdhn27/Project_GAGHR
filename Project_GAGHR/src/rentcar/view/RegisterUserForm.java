package rentcar.view;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rentcar.dao.UserDAO;
import rentcar.model.User;
import rentcar.util.Hashutil;

public class RegisterUserForm extends javax.swing.JFrame {
    
    public UserDAO userDAO = new UserDAO();
    private int selectedId = -1;
    int xx, xy;

    public RegisterUserForm() {
        initComponents();
        
        Component[] comps = getContentPane().getComponents();

        rentcar.util.BackgroundPanel bg = new rentcar.util.BackgroundPanel("/rentcar/img/backiee-102533.jpg");
        bg.setLayout(null);

        for (Component c : comps) {
            bg.add(c);
        }

        setContentPane(bg);

        setSize(900, 500);
        setLocationRelativeTo(null);
        
        tampilUser();
        resetForm();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Fira Code", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DAFTAR AKUN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 204, -1));

        jLabel2.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 109, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 239, -1));

        jLabel3.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 109, -1));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("TAMBAH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jButton2.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jButton2.setText("UBAH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 239, -1));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("HAPUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        jButton4.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jButton4.setText("LOGIN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 521, 269));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentcar/img/close.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String username = jTextField1.getText().trim();
        String password = new String(jPasswordField1.getPassword()).trim();
        
        if(username.isEmpty() || password.isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Username dan Password tidak boleh kosong");
            return;
            
        }
        
        User user = new User();
        user.setUsername(username);
        user.setPassword(Hashutil.hashPassword(password));
        user.setRole("user");
        
        
        if(userDAO.register(user)) {
            
            JOptionPane.showMessageDialog(this, "User berhasil ditambahkan");
            tampilUser();
            resetForm();
            
        } else {
            
            JOptionPane.showMessageDialog(this, "Gagal menambahkan user.");
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(selectedId == -1) {
            
            JOptionPane.showMessageDialog(this, "Silahkan pilih user dari tabel.");
            return;
            
        }
        
        String username = jTextField1.getText().trim();
        String password = new String(jPasswordField1.getPassword()).trim();
        
        if(username.isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Username tidak boleh kosong");
            return;
            
        }
        
        User user = new User();
        user.setId(selectedId);
        user.setUsername(username);
        user.setRole("user");
        
        if(!password.isEmpty()) {
            
            user.setPassword(Hashutil.hashPassword(password));
            
        } else {
            
            JOptionPane.showMessageDialog(this, "Silahkan isi ulang password untuk ubah.");
            return;
            
        }
        
        if(userDAO.updateUser(user)) {
            
            JOptionPane.showMessageDialog(this, "User berhasil diubah");
            tampilUser();
            resetForm();
            
        } else {
            
            JOptionPane.showMessageDialog(this, "Gagal mengubah user");
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(selectedId == -1) {
            
            JOptionPane.showMessageDialog(this, "Pilih user dari tabel untuk dihapus.");
            return;
            
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus user ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION) {
            
            if(userDAO.deleteUser(selectedId)) {
                
                JOptionPane.showMessageDialog(this, "User berhasil dihapus");
                tampilUser();
                resetForm();
                
            } else {
                
                JOptionPane.showMessageDialog(this, "Gagal menghapus user");
                
            }
            
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int row = jTable1.getSelectedRow();
        selectedId = Integer.parseInt(jTable1.getValueAt(row, 0).toString());
        jTextField1.setText(jTable1.getValueAt(row, 1).toString());
        jPasswordField1.setText("");
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        new LoginFrame().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
        xx = evt.getX();
        xy = evt.getY();
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
        
    }//GEN-LAST:event_formMouseDragged

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        dispose();
        
    }//GEN-LAST:event_jLabel4MouseClicked

    
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
            java.util.logging.Logger.getLogger(RegisterUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RegisterUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void tampilUser() {
    
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Username", "Role"}, 0);
        for(User u : userDAO.getAllUsers()) {
            
            model.addRow(new Object[]{u.getId(), u.getUsername(), u.getRole()});
            
        }
        
        jTable1.setModel(model);
        
    }

    private void resetForm() {
    
        jTextField1.setText("");
        jPasswordField1.setText("");
        selectedId = -1;
    
    }
}
