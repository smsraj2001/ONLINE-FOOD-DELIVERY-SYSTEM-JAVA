import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SignInJDialog extends javax.swing.JDialog {
    
    String signInName;
    char[] passWord;
    char[] passWord2;
    
     static ImageIcon icon = createImageIcon("images/correct-md1.gif");
    public SignInJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")

    private void initComponents() {

        signInTitle_jLabel = new javax.swing.JLabel();
        signIn_jPanel = new javax.swing.JPanel();
        signInID_jLabel = new javax.swing.JLabel();
        signInID_jTextField = new javax.swing.JTextField();
        signInPw_jLabel = new javax.swing.JLabel();
        signInPw_jPasswordField = new javax.swing.JPasswordField();
        signIn_jButton = new javax.swing.JButton();
        regsiter_jPanel = new javax.swing.JPanel();
        regID_jLabel = new javax.swing.JLabel();
        regID_jTextField = new javax.swing.JTextField();
        regPw_jLabel = new javax.swing.JLabel();
        regPw_jPasswordField = new javax.swing.JPasswordField();
        regConfirmPw_jLabel = new javax.swing.JLabel();
        regConfirmPw_jPasswordField = new javax.swing.JPasswordField();
        regAddress_jLabel = new javax.swing.JLabel();
        regAddress_jTextField = new javax.swing.JTextField();
        regCity_jLabel = new javax.swing.JLabel();
        regCity_jTextField = new javax.swing.JTextField();
        regZip_jLabel = new javax.swing.JLabel();
        regZip_jTextField = new javax.swing.JTextField();
        regTel_jLabel = new javax.swing.JLabel();
        regTel_jTextField = new javax.swing.JTextField();
        register_jButton = new javax.swing.JButton();
        signInBack_jButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("sign In or Register");

        signInTitle_jLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); 
        signInTitle_jLabel.setForeground(new java.awt.Color(255, 0, 0));
        signInTitle_jLabel.setText("Sign in or Register !");

        signIn_jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sign in", 0, 0, null, new java.awt.Color(255, 0, 0)));

        signInID_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        signInID_jLabel.setText("User Name:");

        signInID_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInID_jTextFieldActionPerformed(evt);
            }
        });

        signInPw_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        signInPw_jLabel.setText("Password:");

        signInPw_jPasswordField.setText("jPasswo");
        signInPw_jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInPw_jPasswordFieldActionPerformed(evt);
            }
        });

        signIn_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        signIn_jButton.setForeground(new java.awt.Color(255, 0, 0));
        signIn_jButton.setText("Sign In");
        signIn_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signIn_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signIn_jPanelLayout = new javax.swing.GroupLayout(signIn_jPanel);
        signIn_jPanel.setLayout(signIn_jPanelLayout);
        signIn_jPanelLayout.setHorizontalGroup(
            signIn_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signIn_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(signIn_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signInID_jLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(signInPw_jLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(signIn_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signIn_jPanelLayout.createSequentialGroup()
                        .addComponent(signIn_jButton)
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addComponent(signInID_jTextField)
                    .addComponent(signInPw_jPasswordField))
                .addContainerGap())
        );
        signIn_jPanelLayout.setVerticalGroup(
            signIn_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signIn_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(signIn_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signInID_jLabel)
                    .addComponent(signInID_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(signIn_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signInPw_jLabel)
                    .addComponent(signInPw_jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signIn_jButton)
                .addContainerGap())
        );

        regsiter_jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register", 0, 0, null, new java.awt.Color(255, 0, 0)));

        regID_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        regID_jLabel.setText("User Name:");

        regID_jTextField.setCaretColor(new java.awt.Color(0, 0, 255));
        regID_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regID_jTextFieldActionPerformed(evt);
            }
        });

        regPw_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        regPw_jLabel.setText("Password:");

        regPw_jPasswordField.setText("jPassw1");
        regPw_jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regPw_jPasswordFieldActionPerformed(evt);
            }
        });

        regConfirmPw_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        regConfirmPw_jLabel.setText("Confirm Password:");

        regConfirmPw_jPasswordField.setText("jPassw1");
        regConfirmPw_jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regConfirmPw_jPasswordFieldActionPerformed(evt);
            }
        });

        regAddress_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        regAddress_jLabel.setText("Address Line:");

        regAddress_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAddress_jTextFieldActionPerformed(evt);
            }
        });

        regCity_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        regCity_jLabel.setText("City:");

        regCity_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regCity_jTextFieldActionPerformed(evt);
            }
        });

        regZip_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        regZip_jLabel.setText("Zip code:");

        regZip_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regZip_jTextFieldActionPerformed(evt);
            }
        });

        regTel_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        regTel_jLabel.setText("Telephone:");

        regTel_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regTel_jTextFieldActionPerformed(evt);
            }
        });

        register_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        register_jButton.setForeground(new java.awt.Color(255, 51, 0));
        register_jButton.setText("Register");
        register_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout regsiter_jPanelLayout = new javax.swing.GroupLayout(regsiter_jPanel);
        regsiter_jPanel.setLayout(regsiter_jPanelLayout);
        regsiter_jPanelLayout.setHorizontalGroup(
            regsiter_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regsiter_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(regsiter_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regTel_jLabel)
                    .addComponent(regZip_jLabel)
                    .addComponent(regCity_jLabel)
                    .addComponent(regConfirmPw_jLabel)
                    .addComponent(regID_jLabel)
                    .addComponent(regPw_jLabel)
                    .addComponent(regAddress_jLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regsiter_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regID_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regPw_jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regConfirmPw_jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regAddress_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regCity_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regZip_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regTel_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_jButton))
                .addContainerGap())
        );

        regsiter_jPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {regAddress_jTextField, regCity_jTextField, regConfirmPw_jPasswordField, regID_jTextField, regPw_jPasswordField, regTel_jTextField, regZip_jTextField});

        regsiter_jPanelLayout.setVerticalGroup(
            regsiter_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regsiter_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(regsiter_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regID_jLabel)
                    .addComponent(regID_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regsiter_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regPw_jLabel)
                    .addComponent(regPw_jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regsiter_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regConfirmPw_jLabel)
                    .addComponent(regConfirmPw_jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regsiter_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regAddress_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regAddress_jLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regsiter_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regCity_jLabel)
                    .addComponent(regCity_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regsiter_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regZip_jLabel)
                    .addComponent(regZip_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regsiter_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regTel_jLabel)
                    .addComponent(regTel_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(register_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        regsiter_jPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {regAddress_jTextField, regCity_jTextField, regConfirmPw_jPasswordField, regID_jTextField, regPw_jPasswordField, regTel_jTextField, regZip_jTextField});

        signInBack_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        signInBack_jButton.setForeground(new java.awt.Color(255, 0, 0));
        signInBack_jButton.setText("Back");
        signInBack_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInBack_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(signInBack_jButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(signIn_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(regsiter_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(signInTitle_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(signInTitle_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(signIn_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regsiter_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signInBack_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void signInPw_jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {
      signInPw_jPasswordField.selectAll();
    }

    private void regConfirmPw_jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {
         regConfirmPw_jPasswordField.selectAll();
    }

    private void regAddress_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
       regAddress_jTextField.selectAll();
    }

    private void regCity_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        regCity_jTextField.selectAll();
    }

    private void regTel_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
         regTel_jTextField.selectAll();
    }

    private void register_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
     MainWindow.signInState ="register";
        signInName= regID_jTextField.getText();
     passWord= regPw_jPasswordField.getPassword();
     passWord2= regConfirmPw_jPasswordField.getPassword();
     ReadXMLDataBase dataBase=new ReadXMLDataBase();
        boolean signIntest= dataBase.checkCustomerData(signInName,new String(passWord));
        if(signIntest==true){
            JOptionPane.showMessageDialog(null,
                      "User name already exsits. Try again.", "Error Message", JOptionPane.WARNING_MESSAGE);
            regID_jTextField.selectAll();
          regID_jTextField.requestFocusInWindow();  
        }
       else if(!Arrays.equals(passWord, passWord2)){
            JOptionPane.showMessageDialog(null,
                      "Passwords and Confirm Passwords don't macth.", "Error Message", JOptionPane.WARNING_MESSAGE);
           regPw_jPasswordField.selectAll();  
          regPw_jPasswordField.requestFocusInWindow();  
        }
       else{ 
                CurrentCustomer.UserName= signInName;
                CurrentCustomer.Password= new String(passWord);  
                CurrentCustomer.Address=regAddress_jTextField.getText();
                CurrentCustomer.City = regCity_jTextField.getText();
                CurrentCustomer.Zipcode = regZip_jTextField.getText();
                CurrentCustomer.Telephone = regTel_jTextField.getText();
 
               dataBase.writeCustomerData("write");
       Arrays.fill(passWord, '0');
       Arrays.fill(passWord2, '0');
        MainWindow.signInState ="in";
        MainWindow.MyAccount_button.setEnabled(true);
             MainWindow.MyOrderList_button.setEnabled(true);
              MainWindow.feelHungry_jButton.setEnabled(true);
             JOptionPane.showMessageDialog(rootPane,  "Successfully registered", "Message",  
                     JOptionPane.INFORMATION_MESSAGE, icon);
        setVisible(false);
        MainWindow.SignIn_button.setEnabled(false);
        
    }
    }
    private void signInID_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
     regID_jTextField.selectAll();
    }

    private void regPw_jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {
       regPw_jPasswordField.selectAll();
    }

    private void regZip_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        regZip_jTextField.selectAll();
    }

    private void signIn_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
             signInName= signInID_jTextField.getText();
     passWord= signInPw_jPasswordField.getPassword();
    boolean signIntest= new ReadXMLDataBase().checkCustomerData(signInName,new String(passWord));

    Arrays.fill(passWord, '0');
        if (signIntest==true ){
            MainWindow.signInState ="in";
            MainWindow.MyAccount_button.setEnabled(true);
             MainWindow.MyOrderList_button.setEnabled(true);
             MainWindow.feelHungry_jButton.setEnabled(true);
             JOptionPane.showMessageDialog(rootPane,  "Successfully log in", "Message",  
                     JOptionPane.INFORMATION_MESSAGE, icon);
            dispose();
            MainWindow.SignIn_button.setEnabled(false);
      }
      else{ JOptionPane.showMessageDialog(rootPane,
                      "Invalid user name or password. Try again.", "Error Message", JOptionPane.WARNING_MESSAGE);
           signInID_jTextField.selectAll();
          signInID_jTextField.requestFocusInWindow();
       }
    }

    private void regID_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        regID_jTextField.selectAll();
    }

    private void signInBack_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
              setVisible(false);
    }
    /**
     * @param args the command line arguments
     */
    public  void createSignInDialog() {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignInJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignInJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignInJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignInJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                       dispose();
                    }
                });
                pack();
                setVisible(true);
            }
        });
    }
    
     static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = SignInJDialog.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    private javax.swing.JLabel regAddress_jLabel;
    private javax.swing.JTextField regAddress_jTextField;
    private javax.swing.JLabel regCity_jLabel;
    private javax.swing.JTextField regCity_jTextField;
    private javax.swing.JLabel regConfirmPw_jLabel;
    private javax.swing.JPasswordField regConfirmPw_jPasswordField;
    private javax.swing.JLabel regID_jLabel;
    private javax.swing.JTextField regID_jTextField;
    private javax.swing.JLabel regPw_jLabel;
    private javax.swing.JPasswordField regPw_jPasswordField;
    private javax.swing.JLabel regTel_jLabel;
    private javax.swing.JTextField regTel_jTextField;
    private javax.swing.JLabel regZip_jLabel;
    private javax.swing.JTextField regZip_jTextField;
    private javax.swing.JButton register_jButton;
    private javax.swing.JPanel regsiter_jPanel;
    private javax.swing.JButton signInBack_jButton;
    private javax.swing.JLabel signInID_jLabel;
    private javax.swing.JTextField signInID_jTextField;
    private javax.swing.JLabel signInPw_jLabel;
    private javax.swing.JPasswordField signInPw_jPasswordField;
    private javax.swing.JLabel signInTitle_jLabel;
    private javax.swing.JButton signIn_jButton;
    private javax.swing.JPanel signIn_jPanel;
}
