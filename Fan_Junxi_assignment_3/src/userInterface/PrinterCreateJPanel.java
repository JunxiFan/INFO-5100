/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.Product;
import business.ProductDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author fjx19
 */
public class PrinterCreateJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private ProductDirectory productDirectory;
    /**
     * Creates new form CreateProductJPanel
     */


    PrinterCreateJPanel(JPanel userProcessContainer, ProductDirectory productDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.productDirectory = productDirectory;
        vendorTxt.setText(productDirectory.getVendorID());

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        productNameTxt = new javax.swing.JTextField();
        modelNumTxt = new javax.swing.JTextField();
        vendorTxt = new javax.swing.JTextField();
        descriptionTxt = new javax.swing.JTextField();
        basePriceTxt = new javax.swing.JTextField();
        ceilingPriceTxt = new javax.swing.JTextField();
        floorPriceTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        featureTxtArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create New Printer Product");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel2.setText("Product Name:");

        jLabel3.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel3.setText("Model Number:");

        jLabel4.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel4.setText("vendor:");

        jLabel5.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel5.setText("Description Statement:");

        jLabel6.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel6.setText("Base Price:");

        jLabel7.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel7.setText("ceiling Price:");

        jLabel8.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel8.setText("Floor Price:");

        jLabel9.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel9.setText("Features:");

        vendorTxt.setEnabled(false);

        featureTxtArea.setColumns(20);
        featureTxtArea.setRows(5);
        jScrollPane1.setViewportView(featureTxtArea);

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        backBtn.setText("<<back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(8, 8, 8)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(basePriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ceilingPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(floorPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1)
                                    .addComponent(descriptionTxt)
                                    .addComponent(modelNumTxt)
                                    .addComponent(productNameTxt)
                                    .addComponent(vendorTxt)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(vendorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(productNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(modelNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(descriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(basePriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ceilingPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(floorPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        PrinterCatalogJPanel printerCatalogJPanel = (PrinterCatalogJPanel)component;
        //获取cardlayout的上一个JPanel
        
        printerCatalogJPanel.populateTable();
        //在array中更新数据
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String productName = productNameTxt.getText();
            String modelNum = modelNumTxt.getText();
            String vendor = vendorTxt.getText();
            String description = descriptionTxt.getText();
            String basePrice = basePriceTxt.getText();
            String ceilingPrice = ceilingPriceTxt.getText();
            String floorPrice = floorPriceTxt.getText();
            String features = featureTxtArea.getText();
            String productType = "Printer";
            
            
            Product product = productDirectory.addProduct();
            product.setProductName(productName);
            product.setModelNum(modelNum);
            product.setVendor(vendor);
            product.setDescription(description);
            product.setBasePrice(basePrice);
            product.setCeilingPrice(ceilingPrice);
            product.setFloorPrice(floorPrice);
            product.setFeatures(features);
            product.setProductType(productType);
            
            JOptionPane.showMessageDialog(null, "Account Created!");
        }
        catch (NumberFormatException nfe){
             JOptionPane.showMessageDialog(null, "Please enter correct format.");
        }
        productNameTxt.setText("");
        modelNumTxt.setText("");
        descriptionTxt.setText("");
        basePriceTxt.setText("");
        ceilingPriceTxt.setText("");
        floorPriceTxt.setText("");
        featureTxtArea.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField basePriceTxt;
    private javax.swing.JTextField ceilingPriceTxt;
    private javax.swing.JTextField descriptionTxt;
    private javax.swing.JTextArea featureTxtArea;
    private javax.swing.JTextField floorPriceTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField modelNumTxt;
    private javax.swing.JTextField productNameTxt;
    private javax.swing.JTextField vendorTxt;
    // End of variables declaration//GEN-END:variables
}
