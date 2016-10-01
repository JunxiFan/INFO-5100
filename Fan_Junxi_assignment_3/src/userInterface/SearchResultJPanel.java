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
public class SearchResultJPanel extends javax.swing.JPanel {
     private JPanel userProcessContainer;
     private Product product;
     private ProductDirectory productDirectory;
     private String productNameResult ;
     private String vendorResult;
     private String floorPriceResult;
     private String descriptionResult;
     
    /**
     * Creates new form SearchResultJPanel
     */

    SearchResultJPanel(JPanel userProcessContainer, Product product, ProductDirectory productDirectory) {
         initComponents();
         this.userProcessContainer = userProcessContainer;
         this.product = product;
         this.productDirectory = productDirectory;
         productNameResult = productDirectory.getProductNameResult();
         descriptionResult = productDirectory.getDescriptionResult();
         vendorResult = productDirectory.getVendorResult();
         floorPriceResult = productDirectory.getFloorPriceResult();
         

         populateTable();
    }
    
    
     void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)CatalogTbl.getModel();
        dtm.setRowCount(0);

        for(Product product : productDirectory.getProductList())
        {   
            

            Object row[] = new Object[4];
            row[0] = product;
            row[1] = product.getDescription();
            row[2] = product.getVendor();
            row[3] = product.getFloorPrice();
            
            if(productNameResult.equals(row[0].toString()) && productNameResult.length()>0)
                dtm.addRow(row);
            else if(descriptionResult.equals(row[1].toString()) && descriptionResult.length()>0)
                dtm.addRow(row);
            else if(vendorResult.equals(row[2].toString()) && vendorResult.length()>0)
                dtm.addRow(row);
            else if(floorPriceResult.equals(row[3].toString()) && floorPriceResult.length()>0)
                dtm.addRow(row);
//            else{
//                row[0] = "No such product exisits.";
//                row[1] = "";
//                row[2] = "";
//                row[3] = "";
//                dtm.addRow(row);
//            }
           
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

        jScrollPane1 = new javax.swing.JScrollPane();
        CatalogTbl = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        CatalogTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Description", "Vendor", "Floor Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CatalogTbl);

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Result");

        jButton1.setText("View Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(backBtn))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(126, 126, 126)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(backBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        productDirectory.setProductNameResult(null);
        productDirectory.setDescriptionResult(null);
        productDirectory.setVendorResult(null);
        productDirectory.setFloorPriceResult(null);
        
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int selectedrow = CatalogTbl.getSelectedRow();
         
        if(selectedrow >= 0){
     
                Product product = (Product) CatalogTbl.getValueAt(selectedrow, 0);
                CustomerViewJPanel panel = new CustomerViewJPanel(userProcessContainer, product);
                userProcessContainer.add("CustomerSearchJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
        }
        
         else
            JOptionPane.showMessageDialog(null, "Please select any row", "warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CatalogTbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
