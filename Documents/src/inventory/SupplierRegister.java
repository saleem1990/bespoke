/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;


import static sys.MainFrame.medicdspane;

/**
 *
 * @author System Partners
 */
public class SupplierRegister extends javax.swing.JInternalFrame {

    /**
     * Creates new form SupplierRegister
     */
    String username = null;
    java.sql.Connection connectDB = null;

    public SupplierRegister(java.sql.Connection conndb, String user) {
        connectDB = conndb;
        username = user;

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
        java.awt.GridBagConstraints gridBagConstraints;

        jSearchDialog11 = new javax.swing.JDialog();
        jSearchPanel1 = new javax.swing.JPanel();
        jTextField1111 = new javax.swing.JTextField();
        jSearchScrollPane1 = new javax.swing.JScrollPane();
        jSearchTable1 = new dbadmin.JTable();
        jButton91 = new javax.swing.JButton();
        jPanel52 = new javax.swing.JPanel();
        jLabel572 = new javax.swing.JLabel();
        jLabel582 = new javax.swing.JLabel();
        jLabel592 = new javax.swing.JLabel();
        jLabel602 = new javax.swing.JLabel();
        jLabel612 = new javax.swing.JLabel();
        jLabel622 = new javax.swing.JLabel();
        jLabel642 = new javax.swing.JLabel();
        jLabel652 = new javax.swing.JLabel();
        kra_pin = new javax.swing.JTextField();
        town = new javax.swing.JTextField();
        business_no = new javax.swing.JTextField();
        bank_account = new javax.swing.JTextField();
        clearbtn = new javax.swing.JButton();
        jButton252 = new javax.swing.JButton();
        jSeparator71 = new javax.swing.JSeparator();
        saveData = new javax.swing.JButton();
        postal_address = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        website = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        contact_person = new javax.swing.JTextField();
        supplierNametxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        email_address = new javax.swing.JTextField();
        country = new javax.swing.JTextField();
        county = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel573 = new javax.swing.JLabel();
        bank_branch = new javax.swing.JTextField();
        jLabel574 = new javax.swing.JLabel();
        vatno = new javax.swing.JTextField();
        telephone = new javax.swing.JTextField();
        jPanel61 = new javax.swing.JPanel();
        jTextField361 = new javax.swing.JTextField();
        searchButton1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jSearchDialog11.setModal(true);
        jSearchDialog11.setUndecorated(true);
        jSearchDialog11.getContentPane().setLayout(new java.awt.GridBagLayout());

        jSearchPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSearchPanel1.setLayout(new java.awt.GridBagLayout());

        jTextField1111.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1111CaretUpdate(evt);
            }
        });
        jTextField1111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1111ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 100);
        jSearchPanel1.add(jTextField1111, gridBagConstraints);

        jSearchTable1.setShowHorizontalLines(false);
        /*    try {
            searchRowSet.setCommand("select product,selling_price,gl_code FROM st_stock_prices WHERE department = 'Pharmacy' order by product");
            searchRowSet.setConnectionSource(pConnDB);

            searchRowSet.execute();

            // crset2.setExecuteOnLoad(true);
            jSearchTable.setModel(new org.netbeans.lib.sql.models.TableModel(searchRowSet, new org.netbeans.lib.sql.models.TableModel.Column[] {
                new org.netbeans.lib.sql.models.TableModel.Column("product", "Description", false),
                new org.netbeans.lib.sql.models.TableModel.Column("selling_price", "Amount", false),
                new org.netbeans.lib.sql.models.TableModel.Column("gl_code", "Gl_code", false)

            }));
            // jSearchScrollPane.setViewportView(jSearchTable);

        } catch(java.sql.SQLException sqlex){
            javax.swing.JOptionPane.showMessageDialog(this,sqlex.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);

            System.out.println(sqlex.getMessage());
        }
        */
        jSearchTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchTable1MouseClicked(evt);
            }
        });
        jSearchScrollPane1.setViewportView(jSearchTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 20.0;
        jSearchPanel1.add(jSearchScrollPane1, gridBagConstraints);

        jButton91.setText("Dispose");
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchPanel1.add(jButton91, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jSearchDialog11.getContentPane().add(jSearchPanel1, gridBagConstraints);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Register Supplier");
        setToolTipText("");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel52.setLayout(new java.awt.GridBagLayout());

        jLabel572.setText("Bank Account No");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jLabel572, gridBagConstraints);

        jLabel582.setText("Supplier Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jLabel582, gridBagConstraints);

        jLabel592.setText("Town");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jLabel592, gridBagConstraints);

        jLabel602.setText("Postal Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jLabel602, gridBagConstraints);

        jLabel612.setText("Email Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jLabel612, gridBagConstraints);

        jLabel622.setText("Telephone No");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jLabel622, gridBagConstraints);

        jLabel642.setText("Business/Company Reg No");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jLabel642, gridBagConstraints);

        jLabel652.setText("Country");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jLabel652, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel52.add(kra_pin, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel52.add(town, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel52.add(business_no, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(bank_account, gridBagConstraints);

        clearbtn.setMnemonic('l');
        clearbtn.setText("Clear");
        clearbtn.setToolTipText("Click here to clear fields");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(clearbtn, gridBagConstraints);

        jButton252.setMnemonic('c');
        jButton252.setText("Close");
        jButton252.setToolTipText("Click here to close window");
        jButton252.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton252ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jButton252, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel52.add(jSeparator71, gridBagConstraints);

        saveData.setMnemonic('O');
        saveData.setText("Save");
        saveData.setToolTipText("Click here to enter data");
        saveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDataActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(saveData, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel52.add(postal_address, gridBagConstraints);

        jLabel15.setText("County");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel52.add(jLabel15, gridBagConstraints);

        jLabel25.setText("Website/URL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jLabel25, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel52.add(website, gridBagConstraints);

        jLabel66.setText("KRA PIN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        jPanel52.add(jLabel66, gridBagConstraints);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel52.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(contact_person, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(supplierNametxt, gridBagConstraints);

        jLabel6.setText("Contact Person");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jLabel6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel52.add(email_address, gridBagConstraints);

        country.setText("Kenya");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel52.add(country, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(county, gridBagConstraints);

        jLabel13.setText("Search Name for Editing");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanel52.add(jLabel13, gridBagConstraints);

        jLabel573.setText("Bank/Branch");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jLabel573, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel52.add(bank_branch, gridBagConstraints);

        jLabel574.setText("VAT No");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(jLabel574, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel52.add(vatno, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel52.add(telephone, gridBagConstraints);

        jPanel61.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel61.setMinimumSize(new java.awt.Dimension(82, 37));
        jPanel61.setLayout(new java.awt.GridBagLayout());

        jTextField361.setEditable(false);
        jTextField361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField361ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel61.add(jTextField361, gridBagConstraints);

        searchButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kiwi/images/date.gif"))); // NOI18N
        searchButton1.setToolTipText("Search");
        searchButton1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        searchButton1.setMaximumSize(new java.awt.Dimension(74, 53));
        searchButton1.setMinimumSize(new java.awt.Dimension(74, 53));
        searchButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        jPanel61.add(searchButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel52.add(jPanel61, gridBagConstraints);

        jButton1.setText("Suspend/Activate Supplier Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        jPanel52.add(jButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel52, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        supplierNametxt.setText("");
        kra_pin.setText("");
        contact_person.setText("");
        town.setText("");
        business_no.setText("");
        bank_account.setText("");
        website.setText("");
        postal_address.setText("");
        country.setText("");
        jTextField361.setText("");
        county.setText("");
        telephone.setText("");
        email_address.setText("");
        postal_address.setText("");
        vatno.setText("");
        bank_branch.setText("");

        // Add your handling code here:
    }//GEN-LAST:event_clearbtnActionPerformed

    private void jButton252ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton252ActionPerformed
        setVisible(false);   // Add your handling code here:
    }//GEN-LAST:event_jButton252ActionPerformed

    private void saveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDataActionPerformed

        String creditors_no = null;
        int count = 0;
        try {
            connectDB.setAutoCommit(false);
            if (saveData.getText().equalsIgnoreCase("Update")) {
                java.sql.PreparedStatement pstmt311 = connectDB.prepareStatement("UPDATE inventory_suppliers SET "
                        + "supplier_name = '" + supplierNametxt.getText().toUpperCase() + "',"
                        + "town = '" + town.getText().toUpperCase() + "',"
                        + "county = '" + county.getText().toUpperCase() + "',"
                        + "contact_person = '" + contact_person.getText().toUpperCase() + "',"
                        + "telephone = '" + telephone.getText().toUpperCase() + "',"
                        + "bank_account = '" + bank_account.getText().toUpperCase() + "',"
                        + "business_no = '" + business_no.getText().toUpperCase() + "',"
                        + "email_address = '" + email_address.getText().toLowerCase() + "',"
                        + "postal_address = '" + postal_address.getText().toUpperCase() + "',"
                        + "kra_pin = '" + kra_pin.getText().toUpperCase() + "',"
                        + "vatno = '" + vatno.getText().toUpperCase() + "',"
                        + "bank_branch = '" + bank_branch.getText().toUpperCase() + "',"
                        + "website = '" + website.getText().toLowerCase() + "',"
                        + "country = '" + country.getText().toUpperCase() + "'"
                        + "WHERE supplier_code = '" + jTextField361.getText() + "'");
                pstmt311.executeUpdate();
                javax.swing.JOptionPane.showMessageDialog(this, "Update Done Successfully","Comfirmation",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                clearbtn.doClick();
            } else {

                java.sql.Statement psst = connectDB.createStatement();

                java.sql.ResultSet rstst = psst.executeQuery("select count(*) from inventory_suppliers where lower(supplier_name)='" + supplierNametxt.getText().trim().toLowerCase() + "'");
                while (rstst.next()) {
                    count = rstst.getInt(1);
                }
                if (count != 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, "The supplier already exists", "Error Message!", javax.swing.JOptionPane.ERROR_MESSAGE);
                } else if (count == 0) {
                    java.sql.Statement pss = connectDB.createStatement();

                    java.sql.ResultSet rsts = pss.executeQuery("select 'CR'||lpad(nextval('supplier_seq')::text,3,0::TEXT)");
                    while (rsts.next()) {

                        creditors_no = rsts.getObject(1).toString();
                    }
                    java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into inventory_suppliers (supplier_name,"
                            + "supplier_code,town,county,"
                            + "contact_person,telephone,bank_account,business_no,"
                            + "email_address,postal_address,kra_pin,vatno,"
                            + "bank_branch,website,country)"
                            + " values(?,?,?,?,?,"
                            + "        ?,?,?,?,?,"
                            + "        ?,?,?,?,?)");
                    pstmt.setObject(1, supplierNametxt.getText().toUpperCase());
                    pstmt.setObject(2, creditors_no);
                    pstmt.setObject(3, town.getText().toUpperCase());
                    pstmt.setObject(4, county.getText().toUpperCase());
                    pstmt.setObject(5, contact_person.getText().toUpperCase());
                    pstmt.setObject(6, telephone.getText());
                    pstmt.setObject(7, bank_account.getText().toUpperCase());
                    pstmt.setObject(8, business_no.getText().toUpperCase());
                    pstmt.setObject(9, email_address.getText().toLowerCase());
                    pstmt.setObject(10, postal_address.getText().toUpperCase());
                    pstmt.setObject(11, kra_pin.getText().toUpperCase());
                    pstmt.setObject(12, vatno.getText().toUpperCase());
                    pstmt.setObject(13, bank_branch.getText().toUpperCase());
                    pstmt.setObject(14, website.getText().toLowerCase());
                    pstmt.setObject(15, country.getText().toUpperCase());
                    pstmt.executeUpdate();
                    connectDB.commit();
                    connectDB.setAutoCommit(true);

                    javax.swing.JOptionPane.showMessageDialog(this, "Data saved successfully", "Confirmation Message", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    clearbtn.doClick();
                }
            }
        } catch (java.sql.SQLException sq) {
            sq.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(), "Error Message!", javax.swing.JOptionPane.ERROR_MESSAGE);
            try {
                connectDB.rollback();
            } catch (java.sql.SQLException sql) {
                javax.swing.JOptionPane.showMessageDialog(this, sql.getMessage(), "Error Message!", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }

        // Add your handling code here:
    }//GEN-LAST:event_saveDataActionPerformed

    private void jTextField1111CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1111CaretUpdate
        jSearchTable1.setModel(dbadmin.TableModel.createTableVectors(connectDB, "SELECT supplier_code,supplier_name FROM inventory_suppliers WHERE supplier_name ILIKE '%" + jTextField1111.getText() + "%' ORDER BY supplier_name"));
        jSearchScrollPane1.setViewportView(jSearchTable1);
        // Add your handling code here:
    }//GEN-LAST:event_jTextField1111CaretUpdate

    private void jSearchTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchTable1MouseClicked
        try {
            java.sql.Statement pstmt = connectDB.createStatement();
            java.sql.ResultSet rs = pstmt.executeQuery("SELECT * FROM inventory_suppliers WHERE supplier_name = '" + jSearchTable1.getValueAt(jSearchTable1.getSelectedRow(), 1).toString() + "' ORDER BY supplier_name");
            while (rs.next()) {
                supplierNametxt.setText(rs.getString("supplier_name"));
                jTextField361.setText(rs.getString("supplier_code"));
                town.setText(rs.getString("town"));
                county.setText(rs.getString("county"));
                contact_person.setText(rs.getString("contact_person"));
                telephone.setText(rs.getString("telephone"));
                bank_account.setText(rs.getString("bank_account"));
                business_no.setText(rs.getString("business_no"));
                email_address.setText(rs.getString("email_address"));
                postal_address.setText(rs.getString("postal_address"));
                kra_pin.setText(rs.getString("kra_pin"));
                vatno.setText(rs.getString("vatno"));
                bank_branch.setText(rs.getString("bank_branch"));
                website.setText(rs.getString("website"));
                country.setText(rs.getString("country"));
            }
        } catch (java.sql.SQLException sqlex) {
            System.out.println(sqlex.getMessage());

        }
        saveData.setLabel("Update");
        jSearchDialog11.dispose();
        // Add your handling code here:
    }//GEN-LAST:event_jSearchTable1MouseClicked

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
        this.jSearchDialog11.dispose();        // Add your handling code here:
    }//GEN-LAST:event_jButton91ActionPerformed

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed

        searchButton11Clicked();

        // Add your handling code here:
    }//GEN-LAST:event_searchButton1ActionPerformed

    private void jTextField1111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1111ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1111ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     // TODO add your handling code here:
          this.dispose();
        inventory.CloseSupplier comp = new inventory.CloseSupplier(connectDB, username);
        medicdspane.add(comp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        comp.setVisible(true);
        comp.setSize(medicdspane.getSize());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField361ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField361ActionPerformed
    private void searchButton11Clicked() {

        System.out.println("Showing dialog");

        jSearchDialog11.dispose();
        java.awt.Point point = this.jTextField361.getLocationOnScreen();

        jSearchDialog11.setSize(400, 200);

        jSearchDialog11.setLocation(point);
        jSearchDialog11.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bank_account;
    private javax.swing.JTextField bank_branch;
    private javax.swing.JTextField business_no;
    private javax.swing.JButton clearbtn;
    private javax.swing.JTextField contact_person;
    private javax.swing.JTextField country;
    private javax.swing.JTextField county;
    private javax.swing.JTextField email_address;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton252;
    private javax.swing.JButton jButton91;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel572;
    private javax.swing.JLabel jLabel573;
    private javax.swing.JLabel jLabel574;
    private javax.swing.JLabel jLabel582;
    private javax.swing.JLabel jLabel592;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel602;
    private javax.swing.JLabel jLabel612;
    private javax.swing.JLabel jLabel622;
    private javax.swing.JLabel jLabel642;
    private javax.swing.JLabel jLabel652;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JDialog jSearchDialog11;
    private javax.swing.JPanel jSearchPanel1;
    private javax.swing.JScrollPane jSearchScrollPane1;
    private javax.swing.JTable jSearchTable1;
    private javax.swing.JSeparator jSeparator71;
    private javax.swing.JTextField jTextField1111;
    private javax.swing.JTextField jTextField361;
    private javax.swing.JTextField kra_pin;
    private javax.swing.JTextField postal_address;
    private javax.swing.JButton saveData;
    private javax.swing.JButton searchButton1;
    private javax.swing.JTextField supplierNametxt;
    private javax.swing.JTextField telephone;
    private javax.swing.JTextField town;
    private javax.swing.JTextField vatno;
    private javax.swing.JTextField website;
    // End of variables declaration//GEN-END:variables
}
