/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inventory;

/**
 *
 * @author System Partners
 */
public class CloseSupplier extends javax.swing.JInternalFrame {

    /**
     * Creates new form CloseSupplier
     */
    public CloseSupplier() {
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

        jLabel582 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField36 = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox3 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jCheckBox4 = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Activate/Suspend Supplier");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel582.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel582.setText("Suppliers's Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        getContentPane().add(jLabel582, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jTextField36.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jTextField36, gridBagConstraints);

        searchButton.setToolTipText("Search");
        searchButton.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        searchButton.setMaximumSize(new java.awt.Dimension(74, 53));
        searchButton.setMinimumSize(new java.awt.Dimension(74, 53));
        searchButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(searchButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel2, gridBagConstraints);

        jLabel2.setText("Reason");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jTextField2, gridBagConstraints);

        jLabel1.setText("Supplier Code");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jLabel1, gridBagConstraints);

        jTextField1.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jTextField1, gridBagConstraints);

        jCheckBox3.setBackground(new java.awt.Color(51, 255, 51));
        jCheckBox3.setForeground(new java.awt.Color(51, 0, 255));
        jCheckBox3.setText("Suspend");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jCheckBox3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jSeparator1, gridBagConstraints);

        jButton2.setMnemonic('O');
        jButton2.setText("Ok");
        jButton2.setToolTipText("Click here to enter data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton2, gridBagConstraints);

        jButton4.setMnemonic('C');
        jButton4.setText("Close");
        jButton4.setToolTipText("Click here to close window");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jButton4, gridBagConstraints);

        jLabel3.setText("Authorised By");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jTextField3, gridBagConstraints);

        jCheckBox4.setBackground(new java.awt.Color(51, 255, 51));
        jCheckBox4.setForeground(new java.awt.Color(51, 0, 255));
        jCheckBox4.setText("Activate");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jCheckBox4, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchButtonClicked();        // Add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String selectedchkbx;
        if (this.jCheckBox3.isSelected()){

            try {
                java.sql.PreparedStatement pstmt = connectDB.prepareStatement("begin work; update st_suppliers set closed = 'false',date_closed = current_date,closed_by =current_user,authorised_by = '"+jTextField2.getText()+"' where code ='"+jTextField1.getText()+"' and supplier_name = '"+jTextField36.getText()+"';commit work");

                //  java.sql.PreparedStatement pstmt = connectDB.prepareStatement ("begin work; update pb_doctors_list set status = 'Suspended' where staff_no ='"+jTextField1.getText()+"';commit work");
                //java.sql.PreparedStatement pstmt = con.prepareStatement ("begin work; update shares_receiptsb set deposit = (deposit + '"+jTextField3.getText()+"' + '"+jTextField12.getText()+"') where code = '"+jComboBox1.getSelectedItem()+"'and deposit = '"+jCheckBox1.getText().toString()+"';commit work");
                pstmt.executeUpdate();
                jLabel4.setForeground(java.awt.Color.red);
                jLabel4.setText("Account Suspended");
            }   catch(java.sql.SQLException sq){
                System.out.println(sq.getMessage());
                javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);

            }

        } else{
            try {
                java.sql.PreparedStatement pstmt = connectDB.prepareStatement("begin work; update st_suppliers set closed = 'true',date_closed = current_date,closed_by =current_user,authorised_by = '"+jTextField2.getText()+"' where code ='"+jTextField1.getText()+"' and supplier_name = '"+jTextField36.getText()+"';commit work");
                //java.sql.PreparedStatement pstmt = con.prepareStatement ("begin work; update shares_receiptsb set deposit = (deposit + '"+jTextField3.getText()+"' + '"+jTextField12.getText()+"') where code = '"+jComboBox1.getSelectedItem()+"'and deposit = '"+jCheckBox1.getText().toString()+"';commit work");
                pstmt.executeUpdate();
                jLabel4.setForeground(java.awt.Color.magenta);
                jLabel4.setText("Account Closed");
            }   catch(java.sql.SQLException sq){
                System.out.println(sq.getMessage());
                javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);

            }
        }
        /*
        } else{
            if (this.jCheckBox2.isSelected()){

                try {
                    java.sql.PreparedStatement pstmt = connectDB.prepareStatement ("begin work; update pb_doctors_list set status = 'Suspended' where staff_no ='"+jTextField1.getText()+"';commit work");
                    //java.sql.PreparedStatement pstmt = con.prepareStatement ("begin work; update shares_receiptsb set deposit = (deposit + '"+jTextField3.getText()+"' + '"+jTextField12.getText()+"') where code = '"+jComboBox1.getSelectedItem()+"'and deposit = '"+jCheckBox1.getText().toString()+"';commit work");
                    pstmt.executeUpdate();
                    jLabel4.setForeground(java.awt.Color.red);
                    jLabel4.setText("Account Suspended");
                }   catch(java.sql.SQLException sq){
                    System.out.println(sq.getMessage());
                    javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);

                }

            } else{
                if (this.jCheckBox3.isSelected()){

                    try {
                        java.sql.PreparedStatement pstmt = connectDB.prepareStatement ("begin work; update pb_doctors_list set status = '"+jCheckBox3.getText()+"' where staff_no ='"+jTextField1.getText()+"';commit work");
                        //java.sql.PreparedStatement pstmt = con.prepareStatement ("begin work; update shares_receiptsb set deposit = (deposit + '"+jTextField3.getText()+"' + '"+jTextField12.getText()+"') where code = '"+jComboBox1.getSelectedItem()+"'and deposit = '"+jCheckBox1.getText().toString()+"';commit work");
                        pstmt.executeUpdate();
                        jLabel4.setForeground(java.awt.Color.blue);
                        jLabel4.setText("Account Activated");
                    }   catch(java.sql.SQLException sq){
                        System.out.println(sq.getMessage());
                        javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);

                    }

                }
            }
        }
        */

        /*else{
            if (this.jCheckBox4.isSelected()){

                try {
                    java.sql.PreparedStatement pstmt = connectDB.prepareStatement ("begin work; update ac_scheme_providers set charge_interest = true where scheme_manager ='"+jTextField36.getText()+"';commit work");
                    //java.sql.PreparedStatement pstmt = con.prepareStatement ("begin work; update shares_receiptsb set deposit = (deposit + '"+jTextField3.getText()+"' + '"+jTextField12.getText()+"') where code = '"+jComboBox1.getSelectedItem()+"'and deposit = '"+jCheckBox1.getText().toString()+"';commit work");
                    pstmt.executeUpdate();
                    jLabel4.setForeground(java.awt.Color.red);
                    jLabel4.setText("Interest Chargeable");
                }   catch(java.sql.SQLException sq){
                    System.out.println(sq.getMessage());
                    javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);

                }

            } else{
                if (this.jCheckBox41.isSelected()){

                    try {
                        java.sql.PreparedStatement pstmt = connectDB.prepareStatement ("begin work; update ac_schemes set charge_interest = false where scheme_manager ='"+jTextField36.getText()+"';commit work");
                        //java.sql.PreparedStatement pstmt = con.prepareStatement ("begin work; update shares_receiptsb set deposit = (deposit + '"+jTextField3.getText()+"' + '"+jTextField12.getText()+"') where code = '"+jComboBox1.getSelectedItem()+"'and deposit = '"+jCheckBox1.getText().toString()+"';commit work");
                        pstmt.executeUpdate();
                        jLabel4.setForeground(java.awt.Color.blue);
                        jLabel4.setText("Interest Not Chargeable");
                    }   catch(java.sql.SQLException sq){
                        System.out.println(sq.getMessage());
                        javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);

                    }

                }
            }
        }
        }
        }

        java.util.Calendar calendar = java.util.Calendar.getInstance();

        long dateNow = calendar.getTimeInMillis();

        java.sql.Date datenowSql= new java.sql.Date(dateNow);

        System.out.println(datenowSql.toString());

        java.sql.Connection con;
        /*
        try {
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement ("begin work; update depreciation_method set depreciation_method = '"+selectedchkbx+"';commit work");
            //java.sql.PreparedStatement pstmt = con.prepareStatement ("begin work; update shares_receiptsb set deposit = (deposit + '"+jTextField3.getText()+"' + '"+jTextField12.getText()+"') where code = '"+jComboBox1.getSelectedItem()+"'and deposit = '"+jCheckBox1.getText().toString()+"';commit work");
            pstmt.executeUpdate();
            jLabel4.setForeground(java.awt.Color.blue);
            jLabel4.setText("Insert successful");
        }   catch(java.sql.SQLException sq){
            System.out.println(sq.getMessage());
            javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);

        }

        /*
        try {
            java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into depreciation_methods values(initcap(?))");
            pstmt.setString(1,selectedchkbx);
            pstmt.executeUpdate();
            jLabel4.setForeground(java.awt.Color.blue);
            jLabel4.setText("Insert successful");
        }   catch(java.sql.SQLException sq){
            System.out.println(sq.getMessage());
            javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(),"Error Message!",javax.swing.JOptionPane.ERROR_MESSAGE);

            jLabel4.setForeground(java.awt.Color.red);
            // jLabel4.setText("Sorry. Another Branch Code already exists");
        }
        */
        // Add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // Add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);// Add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel582;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}