import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserAccount extends javax.swing.JDialog {

       boolean editState =false;
       static  String tempName;
    public UserAccount(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        UserAccount_jPanel = new javax.swing.JPanel();
        name_jLabel = new javax.swing.JLabel();
        name_jTextField = new javax.swing.JTextField();
        password_jLabel = new javax.swing.JLabel();
        password_jTextField = new javax.swing.JTextField();
        address_jLabel = new javax.swing.JLabel();
        address_jTextField = new javax.swing.JTextField();
        city_jLabel = new javax.swing.JLabel();
        city_jTextField = new javax.swing.JTextField();
        zipcode_jLabel = new javax.swing.JLabel();
        zipcode_jTextField = new javax.swing.JTextField();
        telephone_jLabel = new javax.swing.JLabel();
        telephone_jTextField = new javax.swing.JTextField();
        favorites_jLabel = new javax.swing.JLabel();
        icon_jLabel = new javax.swing.JLabel();
        finish_jButton = new javax.swing.JButton();
        edit_jButton = new javax.swing.JButton();
        lastOrder_jLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        LastOrder_jTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        Favorties_jTable = new javax.swing.JTable();
        back_jButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Account");

        name_jLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        name_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        name_jLabel.setText("User Name:");

        name_jTextField.setText(CurrentCustomer.UserName);
        name_jTextField.setEditable(false);
        name_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_jTextFieldActionPerformed(evt);
            }
        });

        password_jLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        password_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        password_jLabel.setText("Password:");

        password_jTextField.setText(CurrentCustomer.Password);
        password_jTextField.setEditable(false);
        password_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_jTextFieldActionPerformed(evt);
            }
        });

        address_jLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        address_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        address_jLabel.setText("Address Line:");

        address_jTextField.setText(CurrentCustomer.Address);
        address_jTextField.setEditable(false);
        address_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_jTextFieldActionPerformed(evt);
            }
        });

        city_jLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        city_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        city_jLabel.setText("City:");

        city_jTextField.setText(CurrentCustomer.City);
        city_jTextField.setEditable(false);
        city_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                city_jTextFieldActionPerformed(evt);
            }
        });

        zipcode_jLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        zipcode_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        zipcode_jLabel.setText("Zip Code:");

        zipcode_jTextField.setText(CurrentCustomer.Zipcode);
        zipcode_jTextField.setEditable(false);
        zipcode_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipcode_jTextFieldActionPerformed(evt);
            }
        });

        telephone_jLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        telephone_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        telephone_jLabel.setText("Telephone:");

        telephone_jTextField.setText(CurrentCustomer.Telephone);
        telephone_jTextField.setEditable(false);
        telephone_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telephone_jTextFieldActionPerformed(evt);
            }
        });

        favorites_jLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        favorites_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        favorites_jLabel.setText("Favorites List:");

        icon_jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/smiley-faces-vector2.png"))); 

        finish_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        finish_jButton.setForeground(new java.awt.Color(255, 0, 0));
        finish_jButton.setText("Confirm");
        finish_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish_jButtonActionPerformed(evt);
            }
        });

        edit_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        edit_jButton.setForeground(new java.awt.Color(255, 0, 0));
        edit_jButton.setText("Edit Information");
        edit_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_jButtonActionPerformed(evt);
            }
        });

        lastOrder_jLabel.setFont(new java.awt.Font("Tahoma", 1, 11));
        lastOrder_jLabel.setForeground(new java.awt.Color(0, 0, 255));
        lastOrder_jLabel.setText("Last Order:");

        LastOrder_jTable.setBackground(new java.awt.Color(220, 220, 220));
        LastOrder_jTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LastOrder_jTable.setFont(new java.awt.Font("Tahoma", 2, 11)); 
        LastOrder_jTable.setForeground(new java.awt.Color(255, 0, 0));
        LastOrder_jTable.setModel(new DefaultTableModel(
            CurrentCustomer.readList(CurrentCustomer.lastOrder),
            new String [] {
                "Course"
            }
        ));
        LastOrder_jTable.setTableHeader(null);
        LastOrder_jTable.setToolTipText("not editable");
        LastOrder_jTable.setEnabled(false);
        jScrollPane3.setViewportView(LastOrder_jTable);

        Favorties_jTable.setBackground(new java.awt.Color(220, 220, 220));
        Favorties_jTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Favorties_jTable.setFont(new java.awt.Font("Tahoma", 2, 11)); 
        Favorties_jTable.setForeground(new java.awt.Color(255, 0, 0));
        Favorties_jTable.setModel(new DefaultTableModel(
            CurrentCustomer.readList(CurrentCustomer.favoritesList),
            new String [] {
                "Course"
            }
        ));
        Favorties_jTable.setTableHeader(null);
        Favorties_jTable.setEnabled(false);
        jScrollPane4.setViewportView(Favorties_jTable);

        back_jButton.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        back_jButton.setForeground(new java.awt.Color(255, 0, 0));
        back_jButton.setText("Back");
        back_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UserAccount_jPanelLayout = new javax.swing.GroupLayout(UserAccount_jPanel);
        UserAccount_jPanel.setLayout(UserAccount_jPanelLayout);
        UserAccount_jPanelLayout.setHorizontalGroup(
            UserAccount_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserAccount_jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back_jButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_jButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finish_jButton)
                .addGap(4, 4, 4))
            .addGroup(UserAccount_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UserAccount_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UserAccount_jPanelLayout.createSequentialGroup()
                        .addGroup(UserAccount_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(telephone_jLabel)
                            .addComponent(zipcode_jLabel)
                            .addComponent(city_jLabel)
                            .addComponent(address_jLabel)
                            .addComponent(password_jLabel)
                            .addComponent(name_jLabel)
                            .addComponent(favorites_jLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UserAccount_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_jTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(password_jTextField)
                            .addComponent(address_jTextField)
                            .addComponent(city_jTextField)
                            .addComponent(zipcode_jTextField)
                            .addComponent(telephone_jTextField))
                        .addGap(18, 18, 18)
                        .addComponent(icon_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UserAccount_jPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(UserAccount_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastOrder_jLabel))
                        .addGap(17, 17, 17))))
        );
        UserAccount_jPanelLayout.setVerticalGroup(
            UserAccount_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserAccount_jPanelLayout.createSequentialGroup()
                .addGroup(UserAccount_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UserAccount_jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(UserAccount_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_jLabel)
                            .addComponent(name_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UserAccount_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password_jLabel)
                            .addComponent(password_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UserAccount_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address_jLabel)
                            .addComponent(address_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UserAccount_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(city_jLabel)
                            .addComponent(city_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UserAccount_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zipcode_jLabel)
                            .addComponent(zipcode_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UserAccount_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telephone_jLabel)
                            .addComponent(telephone_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(icon_jLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UserAccount_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastOrder_jLabel)
                    .addComponent(favorites_jLabel))
                .addGap(7, 7, 7)
                .addGroup(UserAccount_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(UserAccount_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_jButton)
                    .addComponent(finish_jButton)
                    .addComponent(back_jButton)))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); 
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Account Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UserAccount_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UserAccount_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void name_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        name_jTextField.selectAll();
    }

    private void address_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        address_jTextField.selectAll();
    }

    private void password_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        password_jTextField.selectAll();
    }

    private void zipcode_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        zipcode_jTextField.selectAll();
    }

    private void telephone_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        telephone_jTextField.selectAll();
    }

    private void city_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        city_jTextField.selectAll();
    }

    private void edit_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        editState =true;
        name_jTextField.setEditable(true);
       name_jTextField.selectAll();
        name_jTextField.requestFocusInWindow();
        address_jTextField.setEditable(true);
        password_jTextField.setEditable(true);
        zipcode_jTextField.setEditable(true);
        telephone_jTextField.setEditable(true);
        city_jTextField.setEditable(true);
        Favorties_jTable.setEnabled(true);     
    }

    private void finish_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(editState==true){
            tempName = CurrentCustomer.UserName;
            CurrentCustomer.UserName = name_jTextField.getText();
            CurrentCustomer.Password = password_jTextField.getText();
            CurrentCustomer.Address = address_jTextField.getText();
            CurrentCustomer.City = city_jTextField.getText();
            CurrentCustomer.Zipcode =zipcode_jTextField.getText();
            CurrentCustomer.Telephone = telephone_jTextField.getText();
             CurrentCustomer.favoritesList.clear();
        for(int count = 0; count <  Favorties_jTable.getRowCount(); count++){
            if(Favorties_jTable.getValueAt(count, 0).toString().equals(""))
            {continue;}
            else{
                CurrentCustomer.creatFavorites(Favorties_jTable.getValueAt(count, 0).toString());
                new ReadXMLDataBase().writeCustomerData("change"); 
                }
        }
            updateFavoritesData();
             JOptionPane.showMessageDialog(rootPane,  "Saved updated account information", "Message",  
                     JOptionPane.INFORMATION_MESSAGE, SignInJDialog.icon);
          if(JOptionPane.INFORMATION_MESSAGE==1){
              setVisible(false);
          }   
        }
        else if(editState==false){ 
            setVisible(false);  
        }
        
    }

    private void back_jButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
    }
 public void updateFavoritesData() {
      Favorties_jTable.setModel(new DefaultTableModel(
            CurrentCustomer.readList(CurrentCustomer.favoritesList),
            new String [] {
                "Course"
            }
        ));
        Favorties_jTable.setTableHeader(null);
        Favorties_jTable.setEnabled(false);
        DefaultTableModel tableModel = (DefaultTableModel)Favorties_jTable.getModel();
        tableModel.fireTableDataChanged();
}
    /**
     * @param args the command line arguments
     */
    public void createUserAccountDialog() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                setVisible(true);
            }
        });
    }

    private javax.swing.JTable Favorties_jTable;
    private javax.swing.JTable LastOrder_jTable;
    private javax.swing.JPanel UserAccount_jPanel;
    private javax.swing.JLabel address_jLabel;
    private javax.swing.JTextField address_jTextField;
    private javax.swing.JButton back_jButton;
    private javax.swing.JLabel city_jLabel;
    private javax.swing.JTextField city_jTextField;
    private javax.swing.JButton edit_jButton;
    private javax.swing.JLabel favorites_jLabel;
    private javax.swing.JButton finish_jButton;
    private javax.swing.JLabel icon_jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lastOrder_jLabel;
    private javax.swing.JLabel name_jLabel;
    private javax.swing.JTextField name_jTextField;
    private javax.swing.JLabel password_jLabel;
    private javax.swing.JTextField password_jTextField;
    private javax.swing.JLabel telephone_jLabel;
    private javax.swing.JTextField telephone_jTextField;
    private javax.swing.JLabel zipcode_jLabel;
    private javax.swing.JTextField zipcode_jTextField;
}
