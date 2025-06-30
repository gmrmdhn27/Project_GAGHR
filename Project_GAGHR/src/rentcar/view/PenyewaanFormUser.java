package rentcar.view;

import java.awt.Component;
import rentcar.dao.PenyewaanDAO;
import rentcar.model.Penyewaan;
import rentcar.model.User;
import rentcar.dao.MobilDAO;
import rentcar.model.Mobil;

import java.util.Map;
import java.util.HashMap;

import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PenyewaanFormUser extends javax.swing.JFrame {
    
    private User loggedUser;
    public Mobil selectedMobil = null;
    public PenyewaanDAO penyewaanDAO = new PenyewaanDAO();
    public MobilDAO mobilDAO = new MobilDAO();
    public Map<String, Mobil> mobilMap = new HashMap<>();
    public int selectedId = -1;
    int xx, xy;
    
    public PenyewaanFormUser(User user) {
        
        this.loggedUser = user;
        initComponents();
        
        Component[] comps = getContentPane().getComponents();

        rentcar.util.BackgroundPanel bg = new rentcar.util.BackgroundPanel("/rentcar/img/backiee-102533.jpg");
        bg.setLayout(null);

        for (Component c : comps) {
            bg.add(c);
        }

        setContentPane(bg);

        setSize(1200, 500);
        setLocationRelativeTo(null);
        tampilPenyewaan();
        resetForm();
        clearMobilInfo();        
        jDateChooser1.getDateEditor().addPropertyChangeListener(e -> hitungHarga());
        jDateChooser2.getDateEditor().addPropertyChangeListener(e -> hitungHarga());        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblMerk = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lblTipe = new javax.swing.JTextField();
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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 141, -1));

        jLabel3.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tgl Sewa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 115, -1));

        jLabel4.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Tgl kembali");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 115, -1));

        jLabel5.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Total bayar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 115, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 370, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 370, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 370, -1));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SEWA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 75, -1));

        jButton4.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jButton4.setText("<<<");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 75, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 507, 241));

        jLabel8.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Harga Mobil");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 115, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 370, -1));

        jLabel9.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Merk");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 115, -1));
        getContentPane().add(lblMerk, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 370, -1));

        jLabel10.setFont(new java.awt.Font("Fira Code", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Tipe");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 115, -1));
        getContentPane().add(lblTipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 370, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rentcar/img/close.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(selectedMobil == null) {
            
            JOptionPane.showMessageDialog(this, "Mobil tidak ditemukan atau tidak tersedia.");
            return;
            
        }
        
        
        Date tglSewa = jDateChooser1.getDate();
        Date tglKembali = jDateChooser2.getDate();
        
        if(tglSewa == null || tglKembali == null) {
            
            JOptionPane.showMessageDialog(this, "Tanggal sewa dan kembali harus diisi");
            return;
            
        }
        
        long durasi = (tglKembali.getTime() - tglSewa.getTime()) / (1000 * 60 * 60 * 24);
        
        if(durasi <= 0) {
            
            JOptionPane.showMessageDialog(this, "Tanggal kembali harus setelah tanggal sewa");
            return;
            
        }
        
        double total = selectedMobil.getHargaSewa() * durasi;
        
        Penyewaan p = new Penyewaan();
        
        p.setUserId(loggedUser.getId());
        p.setMobilId(selectedMobil.getId());
        p.setTanggalSewa(tglSewa);
        p.setTanggalKembali(tglKembali);
        p.setTotalBayar(total);
        p.setStatus("Diproses");
        
        if(penyewaanDAO.insertPenyewaan(p)) {
            
            JOptionPane.showMessageDialog(this, "Penyewaan berhasil disimpan");
            resetForm();
            
        } else {
            
            JOptionPane.showMessageDialog(this, "Gagal menyimpan penyewaan");
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new UserDashboard(loggedUser).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int row = jTable1.getSelectedRow();
        DecimalFormat df = new DecimalFormat("###.000");
        
        String idMobil = jTable1.getValueAt(row, 0).toString();

        int id = Integer.parseInt(idMobil);
        Mobil m = mobilDAO.findById(id);

        if (m != null) {
            lblMerk.setText(m.getMerk());
            lblTipe.setText(m.getTipe());
            jTextField2.setText(String.valueOf(df.format(m.getHargaSewa())));
            selectedMobil = m;
        }
        hitungHarga();
        
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
            java.util.logging.Logger.getLogger(PenyewaanFormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenyewaanFormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenyewaanFormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenyewaanFormUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new PenyewaanFormUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField lblMerk;
    private javax.swing.JTextField lblTipe;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
    
        lblMerk.setText("");
        lblTipe.setText("");
        jTextField2.setText("");
        selectedMobil = null;
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        
        
    }

    private void tampilPenyewaan() {
        
       int no = 1;
       DecimalFormat df = new DecimalFormat("###.000");
        
       DefaultTableModel model = new DefaultTableModel(new String[]{"Id", "No", "Merk", "Tipe", "Tahun", "Harga sewa", "Status"}, 0);
       for(Mobil m : mobilDAO.getAllMobil()) {
            
            model.addRow(new Object[]{m.getId(), no++, m.getMerk(), m.getTipe(), m.getTahun(), df.format(m.getHargaSewa()), m.getStatus()});
            
       }
        jTable1.setModel(model);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setWidth(0);

    }

    private void clearMobilInfo() {
    
        lblMerk.setText("");
        lblTipe.setText("");
        jTextField2.setText("");
        selectedMobil = null;
    
    }

    private void hitungHarga() {
    
        Date tglSewa = jDateChooser1.getDate();
        Date tglKembali = jDateChooser2.getDate();

        if (tglSewa != null && tglKembali != null && selectedMobil != null) {
            long selisih = tglKembali.getTime() - tglSewa.getTime();
            long jumlahHari = selisih / (1000 * 60 * 60 * 24);

            if (jumlahHari <= 0) {
                jTextField1.setText("0");
                return;
            }

            double totalHarga = selectedMobil.getHargaSewa() * jumlahHari;

            DecimalFormat df = new DecimalFormat("#,###.###");
            jTextField1.setText(df.format(totalHarga));
            jTextField2.setText(df.format(totalHarga));
        }
    }
    
    
}
