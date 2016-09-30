/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.Product;
import business.ProductDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fjx19
 */
public class HardwareCatalogJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private ProductDirectory productDirectory;
    private Product product;
    private String vendorID;
    private String vendor;
    private String catalog;
    private String productType;


    /**
     * Creates new form ComCatalogJPanel
     */

    HardwareCatalogJPanel(JPanel userProcessContainer, ProductDirectory productDirectory) {
         initComponents();
         this.userProcessContainer = userProcessContainer;
         this.productDirectory = productDirectory;
         
         populateTable();
    }
     void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)CatalogTbl.getModel();
        dtm.setRowCount(0);


        
        for(Product product : productDirectory.getProductList())
        {   
//            catalog = productDirectory.getCatalog();
            catalog = "Hardware";
            productType = product.getProductType();
           if(catalog.equals(productType)){
            Object row[] = new Object[3];
            row[0] = product;
            row[1] = product.getModelNum();
            row[2] = product.getVendor();
            dtm.addRow(row);
           }
        }
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CatalogTbl = new javax.swing.JTable();
        detailsBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hardware Parts Catalog");

        CatalogTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Model Number", "Vendor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CatalogTbl);

        detailsBtn.setText("View Product Details");
        detailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsBtnActionPerformed(evt);
            }
        });

        createBtn.setText("Create New Prouct");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Please input product name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(backBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(detailsBtn)
                                .addComponent(deleteBtn)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(searchBtn))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailsBtn)
                    .addComponent(backBtn)
                    .addComponent(createBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedrow = CatalogTbl.getSelectedRow();
        vendorID = productDirectory.getVendorID();
       

        if(selectedrow >=0 )
        {
            vendor = (String) CatalogTbl.getValueAt(selectedrow, 2);
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION && vendorID.equals(vendor)){
                Product product = (Product) CatalogTbl.getValueAt(selectedrow, 0);
                productDirectory.deleteProduct(product);
                JOptionPane.showMessageDialog(null, "Account has been deleted");
                populateTable();
            }
            else if(dialogResult == JOptionPane.YES_OPTION && !vendorID.equals(vendor)){
                JOptionPane.showMessageDialog(null, "You can't delete other vendor's product!", "warning", JOptionPane.WARNING_MESSAGE);
            }
            
            if(dialogResult == JOptionPane.NO_OPTION){
                 JOptionPane.showMessageDialog(null, "Delete has been canceled");
            }
        }

        
        else
            JOptionPane.showMessageDialog(null, "Please select any row");
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        HardwareCreateJPanel panel = new HardwareCreateJPanel(userProcessContainer, productDirectory);
        userProcessContainer.add("HardwareCreateJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createBtnActionPerformed

    private void detailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsBtnActionPerformed
        // TODO add your handling code here:
         int selectedrow = CatalogTbl.getSelectedRow();
         vendorID = productDirectory.getVendorID();
         vendor = (String) CatalogTbl.getValueAt(selectedrow, 2);
         
        if(selectedrow >= 0){
            if(vendorID.equals(vendor)){
                Product product = (Product) CatalogTbl.getValueAt(selectedrow, 0);
                HardwareViewJPanel panel = new HardwareViewJPanel(userProcessContainer, product);
                userProcessContainer.add("HardwareViewJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
            else
                JOptionPane.showMessageDialog(null, "You can't select other vendor's product!", "warning", JOptionPane.WARNING_MESSAGE);
        }
         else
            JOptionPane.showMessageDialog(null, "Please select any row", "warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_detailsBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        Product result = productDirectory.searchProductName(searchTxt.getText());
        if(result==null){
            JOptionPane.showMessageDialog(null, "Account does not exist!", "Sorry", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            HardwareViewJPanel panel = new HardwareViewJPanel(userProcessContainer, result);
            userProcessContainer.add("ViewSearchResult", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }   
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CatalogTbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton detailsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxt;
    // End of variables declaration//GEN-END:variables


}
