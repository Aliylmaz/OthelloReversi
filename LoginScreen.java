package OthelloReversi;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author fbali
 */
public class LoginScreen extends javax.swing.JFrame {

    public static String loggedInUser1 = null;
    public static String loggedInUser2 = null;
    public static String isSameId1 = null;
    public static String isSameId2 = null;
    public static String isSamePass1 = null;
    public static String isSamePass2 = null;

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
        initComponents();
        this.setTitle("Giriş Paneli");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldKullaniciAdi1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSifre1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Btn_Giris1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldKullaniciAdi2 = new javax.swing.JTextField();
        jTextFieldSifre2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Btn_Giris2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_Register = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButtonBaslat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(220, 286));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Kullanıcı adı :");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Şifre :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Player 1");

        Btn_Giris1.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Giris1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_Giris1.setForeground(new java.awt.Color(0, 0, 0));
        Btn_Giris1.setText("Giriş");
        Btn_Giris1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Giris1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel2)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextFieldSifre1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFieldKullaniciAdi1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(Btn_Giris1)))
                                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextFieldKullaniciAdi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextFieldSifre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addComponent(Btn_Giris1)
                                .addContainerGap(89, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(220, 286));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Kullanıcı adı :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Şifre :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Player 2");

        Btn_Giris2.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Giris2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_Giris2.setForeground(new java.awt.Color(0, 0, 0));
        Btn_Giris2.setText("Giriş");
        Btn_Giris2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Giris2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(68, 68, 68)
                                                                .addComponent(jTextFieldSifre2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextFieldKullaniciAdi2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 60, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel6)
                                                .addGap(60, 60, 60))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(Btn_Giris2)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextFieldKullaniciAdi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jTextFieldSifre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(Btn_Giris2)
                                .addContainerGap(90, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(150, 286));
        jPanel3.setLayout(null);

        btn_Register.setBackground(new java.awt.Color(255, 255, 255));
        btn_Register.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Register.setForeground(new java.awt.Color(0, 0, 0));
        btn_Register.setText("Kayıt ol");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Register);
        btn_Register.setBounds(40, 40, 95, 32);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Hesabın yoksa kayıt ol");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(40, 80, 97, 14);

        jButtonBaslat.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBaslat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonBaslat.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBaslat.setText("Başlat");
        jButtonBaslat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBaslatActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonBaslat);
        jButtonBaslat.setBounds(50, 160, 82, 32);

        getContentPane().add(jPanel3);

        pack();
    }// </editor-fold>

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //kayıt ol butonuna basıldığında kayıt ekranını aç
        RegisterScreen reg = new RegisterScreen();
        reg.setTitle("Kayıt Paneli");

        reg.setVisible(true);
        this.dispose();

    }

    private void Btn_Giris1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here;
        //ilk kullanıcı için giriş bilgileri doğrulama
        try {
            BufferedReader br = new BufferedReader(new FileReader("users.txt"));
            String line;

            boolean loggedIn1 = false;

            while ((line = br.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData[3].equals(jTextFieldKullaniciAdi1.getText()) && userData[4].equals((jTextFieldSifre1.getText()))) {
                    // kullanıcı adı ve şifre doğruysa giriş yap ve ad,id ve şifreyi kaydet
                    loggedIn1 = true;
                    loggedInUser1 = userData[0].toUpperCase(); // kullanıcının adını kaydet
                    isSameId1 = userData[3];
                    isSamePass1 = userData[4];

                    break;
                }
            }
            br.close();
            // Kullanıcı adı ve şifre doğruysa butonu yeşil yap ve hazır yaz
            if (loggedIn1) {
                Btn_Giris1.setBackground(Color.green);
                Btn_Giris1.setText("HAZIR");
                // İkinci ekranı aç
            } else {
                // Kullanıcı adı veya şifre hatalıysa butonu beyaz yap ve hata mesajı ver
                JOptionPane.showMessageDialog(this, "Kullanıcı adı veya şifre hatalı!");
                Btn_Giris1.setBackground(Color.white);
                Btn_Giris1.setText("Giriş");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Dosya okunurken hata oluştu.");
        }


    }

    private void Btn_Giris2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        try {
            // ikinci kullanıcı için giriş bilgileri doğrulama
            boolean loggedIn2;
            try ( BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
                String line;
                loggedIn2 = false;
                while ((line = br.readLine()) != null) {
                    String[] userData = line.split(",");
                    if (userData[3].equals(jTextFieldKullaniciAdi2.getText()) && userData[4].equals((jTextFieldSifre2.getText()))) {
                        // kullanıcı adı ve şifre doğruysa giriş yap kullanıcının ad, id ve şifresini kaydet
                        loggedIn2 = true;
                        loggedInUser2 = userData[0].toUpperCase();
                        isSameId2 = userData[3];
                        isSamePass2 = userData[4];
                        break;
                    }
                }
            }
            if (loggedIn2) {
                // Kullanıcı adı ve şifre doğruysa butonu yeşil yap ve hazır yaz
                Btn_Giris2.setBackground(Color.green);
                Btn_Giris2.setText("HAZIR");

                // İkinci ekranı aç
            } else {
                // Kullanıcı adı veya şifre hatalıysa butonu beyaz yap ve hata mesajı ver
                JOptionPane.showMessageDialog(this, "Kullanıcı adı veya şifre hatalı!");
                Btn_Giris2.setBackground(Color.white);
                Btn_Giris2.setText("Giriş");

            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Dosya okunurken hata oluştu.");
        }

    }

    private void jButtonBaslatActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:


        // Oyuncular hazır durumda ise oyunu başlat
        if (Btn_Giris1.getText().trim().equals("HAZIR") && Btn_Giris2.getText().trim().equals("HAZIR")) {

            // Aynı kullanıcılar seçilemez
            if (isSameId1.compareTo(isSameId2) == 0 && isSamePass1.compareTo(isSamePass2) == 0) {
                JOptionPane.showMessageDialog(this, "Aynı kullanıcılar seçilemez", "Hata", JOptionPane.ERROR_MESSAGE);
            } else {
                // Oyun başlıyor mesajı ver ve oyun ekranını aç ve menü üzerinde kullanıcı adlarını göster
                JOptionPane.showMessageDialog(this, "Oyun Başlıyor", "Oyun", JOptionPane.INFORMATION_MESSAGE);
                GameMenu menu = new GameMenu();
                menu.getFirstPersonName().setText(loggedInUser1);
                menu.getSecondPersonName().setText(loggedInUser2);
                menu.setVisible(true);
                this.dispose();

            }

        } else {
            JOptionPane.showMessageDialog(this, "Bazı oyuncular Hazır değil", "Hazır durumu sorgulama", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton Btn_Giris1;
    private javax.swing.JButton Btn_Giris2;
    private javax.swing.JButton btn_Register;
    private javax.swing.JButton jButtonBaslat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldKullaniciAdi1;
    private javax.swing.JTextField jTextFieldKullaniciAdi2;
    private javax.swing.JTextField jTextFieldSifre1;
    private javax.swing.JTextField jTextFieldSifre2;
    // End of variables declaration
}
