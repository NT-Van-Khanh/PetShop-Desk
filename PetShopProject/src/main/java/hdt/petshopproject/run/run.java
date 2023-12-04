package hdt.petshopproject.run;

import java.awt.Component;
import hdt.petshopproject.form.TabBill;
import hdt.petshopproject.form.TabCustomer;
import hdt.petshopproject.form.home.TabHome;
import hdt.petshopproject.form.TabNhanVien;
import hdt.petshopproject.form.TabRevenue;
import hdt.petshopproject.form.TabSetting;
import hdt.petshopproject.form.TabStock;
import hdt.petshopproject.swing.scrollbar.ScrollBarCustom;
import hdt.petshopproject.window.ThanhToan;
import java.awt.Color;
import java.util.EventListener;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class run extends javax.swing.JFrame {

    /**
     * Creates new form petshop
     */
    public run() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
       
//        ScrollBarCustom sb = new ScrollBarCustom(10,10,100);
//        sb.setForeground(new Color(130,130,130));
//        jScrollPane1.setVerticalScrollBar(sb);
        showForm(tabHome,1);
//        scaleImage(35,36,"C:\\Code\\Java\\Java_Doan\\PetShop\\icon\\home-225.png");
        
    }
//    public class Event implements EventListener(){
//        
//    };
    public void scaleImage(javax.swing.JButton button,int width,int heigth, String link){
        javax.swing.ImageIcon icon=new javax.swing.ImageIcon(link);
        java.awt.Image tmp = icon.getImage();
        //java.awt.Image.SCALE_SMOOTH
        tmp=tmp.getScaledInstance(width, heigth,java.awt.Image.SCALE_REPLICATE  );
        icon= new javax.swing.ImageIcon(tmp);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        body = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pHome = new javax.swing.JPanel();
        bHome = new javax.swing.JButton();
        pBill = new javax.swing.JPanel();
        bBill = new javax.swing.JButton();
        pCustomer = new javax.swing.JPanel();
        bCustomer = new javax.swing.JButton();
        pStock = new javax.swing.JPanel();
        bStock = new javax.swing.JButton();
        pRevenue = new javax.swing.JPanel();
        bRevenue = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        bSetting = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        mutiTab = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pet Shop");
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(800, 500));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        main.setLayout(new java.awt.BorderLayout());

        header.setBackground(new java.awt.Color(8, 35, 62));
        header.setEnabled(false);
        header.setMinimumSize(new java.awt.Dimension(40, 60));
        header.setPreferredSize(new java.awt.Dimension(40, 60));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ID ACCOUNT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(743, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );

        main.add(header, java.awt.BorderLayout.PAGE_START);

        body.setBackground(new java.awt.Color(0, 0, 0));
        body.setLayout(new javax.swing.BoxLayout(body, javax.swing.BoxLayout.LINE_AXIS));

        menu.setBackground(new java.awt.Color(0, 0, 0));
        menu.setMaximumSize(new java.awt.Dimension(220, 32767));
        menu.setMinimumSize(new java.awt.Dimension(220, 300));
        menu.setName(""); // NOI18N
        menu.setOpaque(false);
        menu.setPreferredSize(new java.awt.Dimension(220, 100));
        menu.setVerifyInputWhenFocusTarget(false);
        menu.setLayout(new javax.swing.BoxLayout(menu, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        menu.add(jPanel1);

        pHome.setMinimumSize(new java.awt.Dimension(100, 40));
        pHome.setOpaque(false);
        pHome.setPreferredSize(new java.awt.Dimension(220, 40));

        bHome.setBackground(new java.awt.Color(0, 0, 0));
        bHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bHome.setForeground(new java.awt.Color(255, 255, 255));
        bHome.setText("Home");
        bHome.setBorder(null);
        bHome.setContentAreaFilled(false);
        bHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bHome.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        bHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pHomeLayout = new javax.swing.GroupLayout(pHome);
        pHome.setLayout(pHomeLayout);
        pHomeLayout.setHorizontalGroup(
            pHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bHome, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        pHomeLayout.setVerticalGroup(
            pHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bHome, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        menu.add(pHome);

        pBill.setMinimumSize(new java.awt.Dimension(100, 40));
        pBill.setOpaque(false);
        pBill.setPreferredSize(new java.awt.Dimension(220, 40));

        bBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bBill.setForeground(new java.awt.Color(255, 255, 255));
        bBill.setText("Bill");
        bBill.setToolTipText("");
        bBill.setContentAreaFilled(false);
        bBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBillLayout = new javax.swing.GroupLayout(pBill);
        pBill.setLayout(pBillLayout);
        pBillLayout.setHorizontalGroup(
            pBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bBill, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        pBillLayout.setVerticalGroup(
            pBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bBill, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        menu.add(pBill);

        pCustomer.setMinimumSize(new java.awt.Dimension(100, 40));
        pCustomer.setOpaque(false);
        pCustomer.setPreferredSize(new java.awt.Dimension(220, 40));

        bCustomer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bCustomer.setForeground(new java.awt.Color(255, 255, 255));
        bCustomer.setText("Customer");
        bCustomer.setContentAreaFilled(false);
        bCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCustomerLayout = new javax.swing.GroupLayout(pCustomer);
        pCustomer.setLayout(pCustomerLayout);
        pCustomerLayout.setHorizontalGroup(
            pCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        pCustomerLayout.setVerticalGroup(
            pCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        menu.add(pCustomer);

        pStock.setForeground(new java.awt.Color(255, 255, 255));
        pStock.setMinimumSize(new java.awt.Dimension(100, 40));
        pStock.setOpaque(false);

        bStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bStock.setForeground(new java.awt.Color(255, 255, 255));
        bStock.setText("Stock");
        bStock.setContentAreaFilled(false);
        bStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pStockLayout = new javax.swing.GroupLayout(pStock);
        pStock.setLayout(pStockLayout);
        pStockLayout.setHorizontalGroup(
            pStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bStock, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        pStockLayout.setVerticalGroup(
            pStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bStock, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        menu.add(pStock);

        pRevenue.setMinimumSize(new java.awt.Dimension(100, 40));
        pRevenue.setOpaque(false);
        pRevenue.setPreferredSize(new java.awt.Dimension(220, 40));

        bRevenue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bRevenue.setForeground(new java.awt.Color(255, 255, 255));
        bRevenue.setText("Revenue");
        bRevenue.setContentAreaFilled(false);
        bRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRevenueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pRevenueLayout = new javax.swing.GroupLayout(pRevenue);
        pRevenue.setLayout(pRevenueLayout);
        pRevenueLayout.setHorizontalGroup(
            pRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bRevenue, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        pRevenueLayout.setVerticalGroup(
            pRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bRevenue, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        menu.add(pRevenue);

        jPanel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(220, 40));

        bSetting.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bSetting.setForeground(new java.awt.Color(255, 255, 255));
        bSetting.setText("Setting");
        bSetting.setContentAreaFilled(false);
        bSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSettingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bSetting, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bSetting, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        menu.add(jPanel8);

        jPanel9.setOpaque(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        menu.add(jPanel9);

        body.add(menu);

        mutiTab.setBackground(new java.awt.Color(255, 255, 255));
        mutiTab.setPreferredSize(new java.awt.Dimension(719, 800));
        mutiTab.setLayout(new java.awt.BorderLayout());
        body.add(mutiTab);

        main.add(body, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        //setExtendedState(MAXIMIZED_BOTH);
        
    }//GEN-LAST:event_formComponentResized

    private void bHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHomeActionPerformed
        // TODO add your handling code here:
        bHome.setForeground(new Color(0,153,204));
//        bHome.setBackground(new Color(0,153,204));
        showForm(tabHome,1);
        
    }//GEN-LAST:event_bHomeActionPerformed

    private void bCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCustomerActionPerformed
        // TODO add your handling code here:
        bCustomer.setForeground(new Color(0,153,204));
        showForm(tabCustomer,3);
    }//GEN-LAST:event_bCustomerActionPerformed

    private void bBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBillActionPerformed
        // TODO add your handling code here:
        bBill.setForeground(new Color(0,153,204));
        showForm(tabBill,2);
    }//GEN-LAST:event_bBillActionPerformed

    private void bStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStockActionPerformed
        // TODO add your handling code here:
        bStock.setForeground(new Color(0,153,204));
        showForm(tabStock,4);
    }//GEN-LAST:event_bStockActionPerformed

    private void bRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRevenueActionPerformed
        // TODO add your handling code here:
        bRevenue.setForeground(new Color(0,153,204));
        showForm(tabRevenue,5);
    }//GEN-LAST:event_bRevenueActionPerformed

    private void bSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSettingActionPerformed
        // TODO add your handling code here:
        bSetting.setForeground(new Color(0,153,204));
        showForm(tabSetting,6);
    }//GEN-LAST:event_bSettingActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tabNhanVien.setLocationRelativeTo(null);
        tabNhanVien.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed
    private void showForm(Component com,int index){
//        int index=1;
        if(index!=tabNumber){
        switch( tabNumber){
                case 1:
                    bHome.setForeground(new Color(255,255,255));
                    break;
                case 2:
                    bBill.setForeground(new Color(255,255,255));
                    break;   
                case 3:
                    bCustomer.setForeground(new Color(255,255,255));
                    break;   
                case 4:
                    bStock.setForeground(new Color(255,255,255));
                    break;   
                case 5:
                    bRevenue.setForeground(new Color(255,255,255));
                     break;               
                case 6:
                    bSetting.setForeground(new Color(255,255,255));
                    break;
                default:
                    break;
            }
            this.tabNumber=index;   
        }
        mutiTab.removeAll();
        mutiTab.add(com);
        mutiTab.revalidate();
        mutiTab.repaint();
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
            java.util.logging.Logger.getLogger(run.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(run.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(run.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(run.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new run().setVisible(true);
            }
        });
    }
            // TODO add your handling code here:
    private ThanhToan thanhToan = new ThanhToan(this,rootPaneCheckingEnabled);
    private TabNhanVien  tabNhanVien = new TabNhanVien(this, rootPaneCheckingEnabled);
    private final TabCustomer tabCustomer = new TabCustomer();
    private final TabHome tabHome = new TabHome();
    private final TabBill tabBill = new TabBill();
    private final TabStock tabStock = new TabStock();
    private final TabRevenue tabRevenue = new TabRevenue();
    private final TabSetting tabSetting = new TabSetting();
    
    private int tabNumber=1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBill;
    private javax.swing.JButton bCustomer;
    private javax.swing.JButton bHome;
    private javax.swing.JButton bRevenue;
    private javax.swing.JButton bSetting;
    private javax.swing.JButton bStock;
    private javax.swing.JPanel body;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel main;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel mutiTab;
    private javax.swing.JPanel pBill;
    private javax.swing.JPanel pCustomer;
    private javax.swing.JPanel pHome;
    private javax.swing.JPanel pRevenue;
    private javax.swing.JPanel pStock;
    // End of variables declaration//GEN-END:variables
}
