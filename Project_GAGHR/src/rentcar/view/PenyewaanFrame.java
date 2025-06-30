package rentcar.view;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import rentcar.dao.PenyewaanDAO;
import rentcar.model.Penyewaan;
import rentcar.dao.UserDAO;
import rentcar.model.User;
import rentcar.dao.MobilDAO;
import rentcar.model.Mobil;

public class PenyewaanFrame extends javax.swing.JFrame {

    public User loggedUser;
    public int selectedId = -1;
    public PenyewaanDAO penyewaanDAO = new PenyewaanDAO();
    public UserDAO userDAO = new UserDAO();
    public MobilDAO mobilDAO = new MobilDAO();
    int xx, xy;
    
    public PenyewaanFrame(User user) {
        
        this.loggedUser = user;
        initComponents();
        
         Component[] comps = getContentPane().getComponents();

        rentcar.util.BackgroundPanel bg = new rentcar.util.BackgroundPanel("/rentcar/img/backiee-102533.jpg");
        bg.setLayout(null);

        for (Component c : comps) {
            bg.add(c);
        }

        setContentPane(bg);

        setSize(1230, 500);
        setLocationRelativeTo(null);
        tampilPenyewaan();
        resetForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        jLabel1.setText("FORM PENYEWAAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 141, -1));

        jButton2.setBackground(new java.awt.Color(51, 255, 51));
        jButton2.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SELESAI");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jButton3.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jButton3.setText("KELOLA STATUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jButton4.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jButton4.setText("<<<");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 75, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 616, 241));

        jLabel8.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Nama Penyewa");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 399, -1));

        jLabel9.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Info Mobil");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 86, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 399, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 287, -1));

        jLabel10.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Status");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 86, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentcar/img/close.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(selectedId == -1) {
               
            JOptionPane.showMessageDialog(this, "Pilih penyewaan lebih dulu");
            return;
            
        }
        
        int konfirmasi = JOptionPane.showConfirmDialog(this, "Yakin ingin menyelesaikan penyewaan ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        
        if(konfirmasi == JOptionPane.YES_OPTION) {
            
            if(penyewaanDAO.updateStatus(selectedId, "selesai")) {
                
                JOptionPane.showMessageDialog(this, "Penyewaan ditandai selesai.");
                tampilPenyewaan();
                selectedId = -1;
                
            } else {
                
                JOptionPane.showMessageDialog(this, "Gagal memperbarui status");
                
            }
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(selectedId == -1) {
            
            JOptionPane.showMessageDialog(this, "Pilih penyewaan yang ingin dilihat statusnya");
            return;
            
        }
        
        String[] opsi = {"diproses", "selesai", "dibatalkan"};
        
        String statusBaru = (String) JOptionPane.showInputDialog(this, "Pilih status baru:", "Ubah status", JOptionPane.QUESTION_MESSAGE, null, opsi, opsi[0]);
        
        System.out.println("Selected ID: " + selectedId);
        System.out.println("Status baru: " + statusBaru);
        if(statusBaru != null && penyewaanDAO.updateStatus(selectedId, statusBaru)) {
            
            JOptionPane.showMessageDialog(this, "Status berhasil diperbarui");
            tampilPenyewaan();
//            selectedId = -1;
            resetForm();
            
        } else if(statusBaru != null) {
            
            JOptionPane.showMessageDialog(this, "Gagal memperbarui status");
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        new AdminDashboard(loggedUser).setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int row = jTable1.getSelectedRow();
        selectedId = Integer.parseInt(jTable1.getValueAt(row, 0).toString());
        
        jTextField2.setText(jTable1.getValueAt(row, 2).toString());
        jTextField3.setText(jTable1.getValueAt(row, 3).toString());
        jTextField4.setText(jTable1.getValueAt(row, 7).toString());
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
        xx = evt.getX();
        xy = evt.getY();
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
        
    }//GEN-LAST:event_formMouseDragged

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        dispose();
        
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(PenyewaanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenyewaanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenyewaanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenyewaanFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
//                new PenyewaanFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    private void tampilPenyewaan() {
    
        int no = 1;
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "No", "Nama Penyewa", "Merk", "Tgl Sewa", "Tgl Kembali", "Total", "Status"}, 0);
        model.setRowCount(0);
        
        for(Penyewaan p : penyewaanDAO.getAllPenyewaan()) {
            
            User u = userDAO.findById(p.getUserId());
            Mobil m = mobilDAO.findById(p.getMobilId());
            
            model.addRow(new Object[]{
                p.getId(),
                no++,
                u != null ? u.getUsername() : "User tidak ditemukan",
                m != null ? m.getMerk() + " " + m.getTipe() : "Mobil tidak ditemukan",
                p.getTanggalSewa(),
                p.getTanggalKembali(),
                String.format("%.3f", p.getTotalBayar()), // format total
                p.getStatus()
            });
            
        }
        jTable1.setModel(model);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setWidth(0);
    }

    private void resetForm() {
    
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        selectedId = -1;   
    
    }
}
