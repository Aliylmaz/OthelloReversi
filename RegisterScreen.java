package OthelloReversi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/**
 * @author fbali
 */
public class RegisterScreen extends javax.swing.JFrame {

    /**
     * Creates new form RegisterScreen
     */
    // ArrayList<Users> Users;
    public RegisterScreen() {
        initComponents();
        //RegisterScreen

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
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TextFieldUserId = new javax.swing.JTextField();
        btn_register = new javax.swing.JButton();
        TextFieldPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        TextFieldName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextFieldSurname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextFieldMail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jGirisEkraniDon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "KAYIT İŞLEMİ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Şifre :");

        TextFieldUserId.setBackground(new java.awt.Color(255, 255, 255));

        btn_register.setBackground(new java.awt.Color(255, 255, 255));
        btn_register.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_register.setForeground(new java.awt.Color(0, 0, 0));
        btn_register.setText("Kayıt Ol");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        TextFieldPassword.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("İsim  :");

        TextFieldName.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Soyisim :");

        TextFieldSurname.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Kullanıcı adı :");

        TextFieldMail.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Mail :");

        jGirisEkraniDon.setBackground(new java.awt.Color(255, 255, 255));
        jGirisEkraniDon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jGirisEkraniDon.setForeground(new java.awt.Color(0, 0, 0));
        jGirisEkraniDon.setText(" Giriş Ekranı -->");
        jGirisEkraniDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGirisEkraniDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_register)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(TextFieldPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(TextFieldName, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(TextFieldSurname, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(TextFieldMail, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(TextFieldUserId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(8, 8, 8)))
                                .addContainerGap(195, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jGirisEkraniDon)
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextFieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(TextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(TextFieldUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(TextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btn_register)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(jGirisEkraniDon))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //kullanıcı ad,soyad,mail,kullanıcı adı ve şifre alanlarını alıyoruz
        Users users = new Users();
        users.ad = TextFieldName.getText();
        users.Soyad = TextFieldSurname.getText();
        users.mail = TextFieldMail.getText();
        users.kullaniciAdi = TextFieldUserId.getText();
        users.sifre = TextFieldPassword.getText();
        try {
            //ad alanının boş olup olmadığını kontrol ediyoruz ve regex ile kontrol ediyoruz
            Pattern p3 = Pattern.compile("[a-zA-Z0-9._-]+");
            Matcher m3 = p3.matcher(TextFieldName.getText());
            if (TextFieldName.getText().isEmpty()) {
                throw new Exception("Please, Fill Name area!");

            }
            if (m3.find() && m3.group().equals(TextFieldName.getText())) {
                System.out.println("valid name");
            } else {
                throw new Exception("Please, enter valid name!");
            }
            //soyad alanının boş olup olmadığını kontrol ediyoruz ve regex ile kontrol ediyoruz

            Pattern p4 = Pattern.compile("[a-zA-Z0-9._-]+");
            Matcher m4 = p4.matcher(TextFieldSurname.getText());
            if (TextFieldSurname.getText().isEmpty()) {
                throw new Exception("Please, Fill  Surname area!");

            }
            if (m4.find() && m4.group().equals(TextFieldSurname.getText())) {
                System.out.println("valid surname");
            } else {
                throw new Exception("Please, enter valid surname!");
            }
            //mail alanının boş olup olmadığını kontrol ediyoruz ve regex ile kontrol ediyoruz

            Pattern p = Pattern.compile("^([a-z]+\\w*){3,}@((gmail|hotmail|outlook|yahoo)\\.(com|net|org))$");
               Matcher m = p.matcher(TextFieldMail.getText());
            if (TextFieldMail.getText().isEmpty()) {
                throw new Exception("Please, Fill Mail area!");
            }
            if (m.find() && m.group().equals(TextFieldMail.getText())) {
                System.out.println("valid mail");
            } else {
                throw new Exception("Please, enter valid mail!");
            }
            //kullanıcı adı alanının boş olup olmadığını kontrol ediyoruz ve regex ile kontrol ediyoruz

            Pattern p1 = Pattern.compile("[a-zA-Z0-9._-]+");
            Matcher m1 = p1.matcher(TextFieldUserId.getText());
            if (TextFieldUserId.getText().isEmpty()) {

                throw new Exception("Please, Fill UserId area!");
            }
            if (m1.find() && m1.group().equals(TextFieldUserId.getText())) {
                System.out.println("valid user name");
            } else {
                throw new Exception("Please, enter valid user Id!");
            }
            //şifre alanının boş olup olmadığını kontrol ediyoruz ve regex ile kontrol ediyoruz
            Pattern p2 = Pattern.compile("^[a-zA-Z0-9._-]{5,12}$");

            Matcher m2 = p2.matcher(TextFieldPassword.getText());
            if (TextFieldPassword.getText().isEmpty()) {

                throw new Exception("Please, Fill Password area!");
            }
            if (m2.find() && m2.group().equals(TextFieldPassword.getText())) {
                System.out.println("valid password");
            } else {
                throw new Exception("Please, enter valid password!");
            }
            //şifre alanı ile tekrar şifre alanının aynı olup olmadığını kontrol ediyoruz

            //şifreyi tekrar girme alanı ile şifre alanının aynı olup olmadığını kontrol ediyoruz
            String rpassword = JOptionPane.showInputDialog(this, "Please insert your password again");
            if (users.sifre.compareTo(rpassword) != 0) {
                throw new Exception(" your password not match");
            }
            // mail adresinin daha önce kayıtlı olup olmadığını kontrol ediyoruz

            int option = JOptionPane.showConfirmDialog(this, "Are you sure", "Registiration", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                //  boolean sameperson =false;
                boolean emailAlreadyRegistered = false;
                try (BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] userData = line.split(",");
                        if (userData[2].equals(users.getMail())) {
                            emailAlreadyRegistered = true;

                            break;
                        }
                    }

                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error reading file", "Error", JOptionPane.ERROR_MESSAGE);
                }

                if (emailAlreadyRegistered) {
                    JOptionPane.showMessageDialog(this, "This email address is already registered!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    //kullanıcı bilgilerini dosyaya yazıyoruz
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("users.txt", true))) {
                        String text = users.getAd() + "," + users.getSoyad() + "," + users.getMail() + "," + users.getKullaniciAdi() + "," + users.getSifre();
                        bw.write(text);
                        bw.newLine();
                        JOptionPane.showMessageDialog(this, "The person added", "Add", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, "Error writing to file", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                //kullanıcı bilgilerini dosyaya yazdıktan sonra alanları temizliyoruz

                this.TextFieldName.setText("");
                this.TextFieldSurname.setText("");
                this.TextFieldMail.setText("");
                this.TextFieldUserId.setText("");
                this.TextFieldPassword.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Exception", JOptionPane.ERROR_MESSAGE);

        }
    }


    private void jGirisEkraniDonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //giriş ekranına dönüyoruz
        LoginScreen logScr = new LoginScreen();

        logScr.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField TextFieldMail;
    private javax.swing.JTextField TextFieldName;
    private javax.swing.JPasswordField TextFieldPassword;
    private javax.swing.JTextField TextFieldSurname;
    private javax.swing.JTextField TextFieldUserId;
    private javax.swing.JButton btn_register;
    private javax.swing.JButton jGirisEkraniDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration
}
