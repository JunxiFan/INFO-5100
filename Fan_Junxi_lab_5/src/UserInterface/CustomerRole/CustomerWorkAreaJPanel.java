/*
 * ProductManagerWorkAreaJPanel.java
 *
 * Created on October 3, 2008, 8:06 AM
 */
package UserInterface.CustomerRole;

import Business.MasterOrderCatalog;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rushabh
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    private MasterOrderCatalog masterOrderCatalog;

    public CustomerWorkAreaJPanel(JPanel userProcessContainer, SupplierDirectory supplierDirectory, MasterOrderCatalog masterOrderCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplierDirectory = supplierDirectory;
        this.masterOrderCatalog = masterOrderCatalog;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("My Work Area (Customer Role)");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Browse Product Catalog >>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Vijaya", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CustomerRole/bestbuy.gif"))); // NOI18N
        jLabel2.setText("Welcome To Please Buy !");
        jLabel2.setIconTextGap(7);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
BrowseProducts panel = new BrowseProducts(userProcessContainer, supplierDirectory,masterOrderCatalog);
        userProcessContainer.add("BrowseProducts", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
