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
public class Level1Inspection extends javax.swing.JInternalFrame {

    /**
     * Creates new form Level1Inspection
     */
    public Level1Inspection() {
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

        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        orderedItemsTbl =  new com.afrisoftech.dbadmin.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TenderTxt = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        SupplierTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TenderTxt1 = new javax.swing.JTextField();
        jPanel411 = new javax.swing.JPanel();
        originalSupNametxt = new javax.swing.JTextField();
        searchButton11 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grn2PayablesLinkingTable = new com.afrisoftech.dbadmin.JTable();
        jPanel4 = new javax.swing.JPanel();
        Save = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Level 1 Inspection");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LPO Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel8.setLayout(new java.awt.GridBagLayout());

        orderedItemsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(orderedItemsTbl);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel8.add(jScrollPane4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 2.0;
        getContentPane().add(jPanel8, gridBagConstraints);

        /*        javax.swing.SpinnerDateModel spinerDate = new javax.swing.SpinnerDateModel();
        dateSpinner = new javax.swing.JSpinner(spinerDate);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        jPanel1.add(dateSpinner, gridBagConstraints);

        */
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel111.setText("LPO/Invoice");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(jLabel111, gridBagConstraints);

        jLabel1.setText("Store Ordered");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel1, gridBagConstraints);

        TenderTxt.setEditable(false);
        TenderTxt.setForeground(new java.awt.Color(0, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 80);
        jPanel1.add(TenderTxt, gridBagConstraints);

        jLabel112.setText("Supplier");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(jLabel112, gridBagConstraints);

        SupplierTxt.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(SupplierTxt, gridBagConstraints);

        jLabel2.setText("Quotation/Tender");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel2, gridBagConstraints);

        TenderTxt1.setEditable(false);
        TenderTxt1.setForeground(new java.awt.Color(0, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 80);
        jPanel1.add(TenderTxt1, gridBagConstraints);

        jPanel411.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel411.setLayout(new java.awt.GridBagLayout());

        originalSupNametxt.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel411.add(originalSupNametxt, gridBagConstraints);

        searchButton11.setToolTipText("Search");
        searchButton11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        searchButton11.setMaximumSize(new java.awt.Dimension(74, 53));
        searchButton11.setMinimumSize(new java.awt.Dimension(74, 53));
        searchButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        searchButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton11ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel411.add(searchButton11, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 3.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jPanel411, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 9.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Received Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel5.setLayout(new java.awt.GridBagLayout());

        grn2PayablesLinkingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Delivey No", "Item", "Price/Item", "QTY", "Total Amt", "Approve", "Reject", "Remarks"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grn2PayablesLinkingTable.setGridColor(new java.awt.Color(204, 204, 255));
        //this.procurementPlanTbl.getColumnModel().getColumn(i).setCellEditor(new javax.swing.DefaultCellEditor((javax.swing.JComboBox)new com.afrisoftech.lib.DatePicker()));
        grn2PayablesLinkingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grn2PayablesLinkingTableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                grn2PayablesLinkingTableMouseReleased(evt);
            }
        });
        grn2PayablesLinkingTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                grn2PayablesLinkingTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(grn2PayablesLinkingTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 5.0;
        getContentPane().add(jPanel5, gridBagConstraints);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setMinimumSize(new java.awt.Dimension(250, 27));
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 27));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        Save.setMnemonic('s');
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(Save, gridBagConstraints);

        cancelbtn.setMnemonic('l');
        cancelbtn.setText("Clear");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(cancelbtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        getContentPane().add(jPanel4, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grn2PayablesLinkingTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grn2PayablesLinkingTableMouseClicked
        //        if (grn2PayablesLinkingTable.getSelectedColumn() == 9) // jCheckBox2.setSelected(false);
        //        {
            //            linkGRNToCreditorBtn.setEnabled(false);
            //        }
        //        {
            //            Double totalAmnt = 0.0, qtytotal = 0.0;
            //            if (Boolean.valueOf(grn2PayablesLinkingTable.getModel().getValueAt(grn2PayablesLinkingTable.getSelectedRow(), 9).toString()) == java.lang.Boolean.TRUE) {
                //                totalAmnt = 0.0;
                //                qtytotal = 0.0;
                //                if (v.contains(grn2PayablesLinkingTable.getSelectedRow())) {
                    //                    //  v.remove(grn2PayablesLinkingTable.getSelectedRow());
                    //                } else if (!v.contains(grn2PayablesLinkingTable.getSelectedRow())) {
                    //                    v.add(grn2PayablesLinkingTable.getSelectedRow());
                    //                }
                //            } else if (Boolean.valueOf(grn2PayablesLinkingTable.getModel().getValueAt(grn2PayablesLinkingTable.getSelectedRow(), 9).toString()) == java.lang.Boolean.FALSE) {
                //                totalAmnt = 0.0;
                //                qtytotal = 0.0;
                //                v.remove(grn2PayablesLinkingTable.getSelectedRow());
                //            }
            //
            //            for (int i = 0; i < v.size(); i++) {
                //                Double total = Double.parseDouble(grn2PayablesLinkingTable.getModel().getValueAt(Integer.parseInt(v.elementAt(i).toString()), 7).toString());
                //                totalAmnt = totalAmnt + total;
                //                Double totals = Double.parseDouble(grn2PayablesLinkingTable.getModel().getValueAt(Integer.parseInt(v.elementAt(i).toString()), 6).toString());
                //                qtytotal = qtytotal + totals;
                //
                //            }
            //
            //            System.out.println(totalAmnt);
            //            totalGrnAmountTxt.setText(totalAmnt.toString());
            //            qtyTtField.setText(qtytotal.toString());
            //
            //        }
    }//GEN-LAST:event_grn2PayablesLinkingTableMouseClicked

    private void grn2PayablesLinkingTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grn2PayablesLinkingTableMouseReleased
        //        if (grn2PayablesLinkingTable.getSelectedColumn() == 1) {
            //
            //            if (grn2PayablesLinkingTable.getValueAt(grn2PayablesLinkingTable.getSelectedRow(), 1) != null) {
                //
                //                java.awt.Point point = this.lpoNumberTxt.getLocationOnScreen();
                //
                //                jSearchDialog2.setSize(900, 200);
                //
                //                jSearchDialog2.setLocation(point);
                //
                //                jSearchDialog2.setVisible(true);
                //
                //                orderNumberTxt.grabFocus();
                //
                //                orderNumberTxt.setText(grn2PayablesLinkingTable.getValueAt(grn2PayablesLinkingTable.getSelectedRow(), 1).toString());
                //            }
            //        }        // TODO add your handling code here:
    }//GEN-LAST:event_grn2PayablesLinkingTableMouseReleased

    private void grn2PayablesLinkingTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grn2PayablesLinkingTableKeyReleased
        /*     double resFloat = 0.00;
        //  double totalSum = 0.00;
        double floatTotal = java.lang.Double.parseDouble(jTextField1.getText());

        if (jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4) != null) {
            double amtToalloc = java.lang.Double.parseDouble(jTextField2.getText());
            double floatCol2 = java.lang.Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());

            double floatCol3 = java.lang.Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
            double balance = java.lang.Double.parseDouble(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());

            if (floatCol3 <= amtToalloc && amtToalloc >= 0){

                double resVal =floatCol2 - floatCol3;

                jTable1.setValueAt(new java.lang.Float(resVal), jTable1.getSelectedRow(), 5);
            } else
            if (floatCol3 > amtToalloc && amtToalloc > 0){
                javax.swing.JOptionPane.showMessageDialog(this,"You cannot allocate amount higher than the amount to allocate","Comfirmation Message!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }

            this.tableModelTableChanged();
        }else
        if (jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4) == null) {
            jTable1.setValueAt(new java.lang.Double(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString()), jTable1.getSelectedRow(), 5);
            this.tableModelTableChanged();
        }
        */
        // Add your handling code here:
    }//GEN-LAST:event_grn2PayablesLinkingTableKeyReleased

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
//        String users=null,user=null;
//        String correct_name=null;
//        try{
//            java.sql.Statement pst2v = connectDB.createStatement();
//            java.sql.ResultSet rsv = pst2v.executeQuery("select current_user");
//            if (rsv.next()) {
//                users = rsv.getObject(1).toString();
//                // Stock = rs.getObject(2).toString();
//            }
//            java.sql.Statement pst2v3 = connectDB.createStatement();
//            java.sql.ResultSet rsv3 = pst2v3.executeQuery("select distinct concat(f_name,' ',l_name) as name from secure_menu_access where login_name='"+users+"'");
//            if (rsv3.next()) {
//                user = rsv3.getObject(1).toString();
//                // Stock = rs.getObject(2).toString();
//            }
//            correct_name=user;
//
//            if(correct_name.contains("'")){
//                correct_name=  user.substring(0, user.indexOf("'"));
//            }
//            else if(!correct_name.contains("'")){
//                correct_name= user;
//            }
//
//            System.out.println("the user name is"+user);
//        }
//        catch(Exception userex){
//            System.out.println("user error is "+userex);
//        }
//
//        try {
//            connectDB.setAutoCommit(false);
//            for (int k = 0; k < grn2PayablesLinkingTable.getRowCount(); k++) {
//                if (grn2PayablesLinkingTable.getValueAt(k, 0) != null) {
//                    if (Boolean.valueOf(grn2PayablesLinkingTable.getModel().getValueAt(k, 6).toString()) == java.lang.Boolean.TRUE) {
//
//                        String comment;
//                        if(grn2PayablesLinkingTable.getValueAt(k, 7)==null ){
//                            comment="";
//                        }else{
//                            comment=grn2PayablesLinkingTable.getValueAt(k, 7).toString();
//                        }
//
//                        java.sql.PreparedStatement pstmt81212 = connectDB.prepareStatement(""
//                            + "update st_stock_cardex set supplies=true,supplies_name='"+correct_name+"',supplies_date=now(),supplies_remarks='"+comment+"' where supplies=false and approved=false and chairperson=false and technical=false and delivery_note_no='" + grn2PayablesLinkingTable.getValueAt(k, 1).toString() + "' and order_no='" + lpo + "' and item ='"+grn2PayablesLinkingTable.getValueAt(k, 2).toString()+"'");
//                        //        java.sql.PreparedStatement pstmt8121 = connectDB.prepareStatement("UPDATE ac_ledger SET reconciled = true WHERE cheque_no ILIKE '" + grn2PayablesLinkingTable.getValueAt(i, 1).toString() + "' AND dealer ilike '" + supplierNameTxt.getText().toString() + "' and date = '" + grn2PayablesLinkingTable.getValueAt(i, 0).toString() + "' and transaction_no = '" + grn2PayablesLinkingTable.getValueAt(i, 4).toString() + "'");
//
//                        pstmt81212.executeUpdate();
//                    }
//                }
//            }
//            connectDB.commit();
//            connectDB.setAutoCommit(true);
//            // com.afrisoftech.lib.DocumentTracer.setDocumentLocation(connectDB, lpoNumberTxt.getText(), commentsTxt.getText(), "EXPENDITURE_EXAMINATION", "EXPENDITURE_VOTEBOOK");
//            cancelbtn.doClick();
//            javax.swing.JOptionPane.showMessageDialog(this, "Well Done !! Approved Done Successfully", "Comfirmation Message!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
//            ApprovalTbl.setModel(com.afrisoftech.dbadmin.TableModel.createTableVectors(connectDB, "SELECT distinct order_no as LPO_LSO_NO,supplier as supplier_name from st_stock_cardex st where (grn_no!='rejected' or grn_no is null) and supplies=false and chairperson=false and technical=false and st.approved=FALSE  and st.transaction_type ilike 'Receiving' and delivered_by!= 'Reversal' group by supplier,order_no  order by supplier_name"));
//
//        }  catch (SQLException ex) {
//            Logger.getLogger(SuppliesGuyApprovalintfr.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_SaveActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
//        SupplierTxt.setText(null);
//        lpoTxt.setText(null);
//
//        TenderTxt.setText(null);
//        TenderTxt1.setText(null);
//        for (int k = 0; k <orderedItemsTbl.getRowCount(); k++) {
//            for (int r = 0; r < orderedItemsTbl.getColumnCount(); r++) {
//                orderedItemsTbl.getModel().setValueAt(null, k, r);
//            }
//        }
//
//        for (int k = 0; k <ApprovalTbl.getRowCount(); k++) {
//            for (int r = 0; r < ApprovalTbl.getColumnCount(); r++) {
//                ApprovalTbl.getModel().setValueAt(null, k, r);
//            }
//        }
//
//        for (int k = 0; k <grn2PayablesLinkingTable.getRowCount(); k++) {
//            for (int r = 0; r < grn2PayablesLinkingTable.getColumnCount(); r++) {
//                grn2PayablesLinkingTable.getModel().setValueAt(null, k, r);
//            }
//        }
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void searchButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton11ActionPerformed
//        searchButton221Clicked();         // Add your handling code here:
        // Add your handling code here:
    }//GEN-LAST:event_searchButton11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JTextField SupplierTxt;
    private javax.swing.JTextField TenderTxt;
    private javax.swing.JTextField TenderTxt1;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JTable grn2PayablesLinkingTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel411;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable orderedItemsTbl;
    private javax.swing.JTextField originalSupNametxt;
    private javax.swing.JButton searchButton11;
    // End of variables declaration//GEN-END:variables
}
