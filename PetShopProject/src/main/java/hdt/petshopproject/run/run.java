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
        lbNameAccount = new javax.swing.JLabel();
        shopName = new javax.swing.JLabel();
        Logo = new javax.swing.JButton();
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
        pSetting = new javax.swing.JPanel();
        bSetting = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        mutiTab = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pet Shop");
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(600, 500));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        main.setLayout(new java.awt.BorderLayout());

        header.setBackground(new java.awt.Color(8, 35, 62));
        header.setEnabled(false);
        header.setMinimumSize(new java.awt.Dimension(100, 60));
        header.setPreferredSize(new java.awt.Dimension(100, 60));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(200, 200, 200));
        jButton1.setText("ID ACCOUNT");
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lbNameAccount.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lbNameAccount.setForeground(new java.awt.Color(245, 245, 245));
        lbNameAccount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNameAccount.setText("TÊN TÀI KHOẢN   ");

        shopName.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        shopName.setForeground(new java.awt.Color(220, 220, 20));
        shopName.setText("PetShop");

        Logo.setBackground(new java.awt.Color(13, 61, 110));
        Logo.setText("Logo");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shopName, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 588, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNameAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shopName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(lbNameAccount)
                        .addGap(0, 0, 0)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        main.add(header, java.awt.BorderLayout.PAGE_START);

        body.setBackground(new java.awt.Color(0, 0, 0));
        body.setLayout(new javax.swing.BoxLayout(body, javax.swing.BoxLayout.LINE_AXIS));

        menu.setBackground(new java.awt.Color(10, 10, 10));
        menu.setMaximumSize(new java.awt.Dimension(210, 32767));
        menu.setMinimumSize(new java.awt.Dimension(210, 300));
        menu.setName(""); // NOI18N
        menu.setOpaque(false);
        menu.setPreferredSize(new java.awt.Dimension(210, 300));
        menu.setVerifyInputWhenFocusTarget(false);
        menu.setLayout(new javax.swing.BoxLayout(menu, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setMaximumSize(new java.awt.Dimension(210, 50));
        jPanel1.setMinimumSize(new java.awt.Dimension(210, 50));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(210, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        menu.add(jPanel1);

        pHome.setBackground(new java.awt.Color(25, 25, 25));
        pHome.setMaximumSize(new java.awt.Dimension(210, 45));
        pHome.setMinimumSize(new java.awt.Dimension(100, 45));
        pHome.setOpaque(false);
        pHome.setPreferredSize(new java.awt.Dimension(210, 45));

        bHome.setBackground(new java.awt.Color(20, 20, 20));
        bHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bHome.setForeground(new java.awt.Color(255, 255, 255));
        bHome.setText("Trang chủ");
        bHome.setToolTipText("");
        bHome.setContentAreaFilled(false);
        bHome.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bHomeMouseMoved(evt);
            }
        });
        bHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bHomeMouseExited(evt);
            }
        });
        bHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pHomeLayout = new javax.swing.GroupLayout(pHome);
        pHome.setLayout(pHomeLayout);
        pHomeLayout.setHorizontalGroup(
            pHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bHome, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        pHomeLayout.setVerticalGroup(
            pHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bHome, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        menu.add(pHome);

        pBill.setBackground(new java.awt.Color(25, 25, 25));
        pBill.setMaximumSize(new java.awt.Dimension(210, 45));
        pBill.setMinimumSize(new java.awt.Dimension(100, 45));
        pBill.setOpaque(false);
        pBill.setPreferredSize(new java.awt.Dimension(210, 45));

        bBill.setBackground(new java.awt.Color(20, 20, 20));
        bBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bBill.setForeground(new java.awt.Color(255, 255, 255));
        bBill.setText("Hóa đơn");
        bBill.setToolTipText("");
        bBill.setContentAreaFilled(false);
        bBill.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bBillMouseMoved(evt);
            }
        });
        bBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bBillMouseExited(evt);
            }
        });
        bBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBillLayout = new javax.swing.GroupLayout(pBill);
        pBill.setLayout(pBillLayout);
        pBillLayout.setHorizontalGroup(
            pBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bBill, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        pBillLayout.setVerticalGroup(
            pBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bBill, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        menu.add(pBill);

        pCustomer.setBackground(new java.awt.Color(25, 25, 25));
        pCustomer.setMaximumSize(new java.awt.Dimension(210, 45));
        pCustomer.setMinimumSize(new java.awt.Dimension(100, 45));
        pCustomer.setOpaque(false);
        pCustomer.setPreferredSize(new java.awt.Dimension(210, 45));

        bCustomer.setBackground(new java.awt.Color(20, 20, 20));
        bCustomer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bCustomer.setForeground(new java.awt.Color(255, 255, 255));
        bCustomer.setText("Khách hàng");
        bCustomer.setContentAreaFilled(false);
        bCustomer.setMaximumSize(new java.awt.Dimension(200, 40));
        bCustomer.setPreferredSize(new java.awt.Dimension(200, 40));
        bCustomer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bCustomerMouseMoved(evt);
            }
        });
        bCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bCustomerMouseExited(evt);
            }
        });
        bCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCustomerLayout = new javax.swing.GroupLayout(pCustomer);
        pCustomer.setLayout(pCustomerLayout);
        pCustomerLayout.setHorizontalGroup(
            pCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        pCustomerLayout.setVerticalGroup(
            pCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        menu.add(pCustomer);

        pStock.setBackground(new java.awt.Color(25, 25, 25));
        pStock.setForeground(new java.awt.Color(255, 255, 255));
        pStock.setMaximumSize(new java.awt.Dimension(210, 45));
        pStock.setMinimumSize(new java.awt.Dimension(100, 45));
        pStock.setOpaque(false);
        pStock.setPreferredSize(new java.awt.Dimension(210, 45));

        bStock.setBackground(new java.awt.Color(20, 20, 20));
        bStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bStock.setForeground(new java.awt.Color(255, 255, 255));
        bStock.setText("Kho");
        bStock.setContentAreaFilled(false);
        bStock.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bStockMouseMoved(evt);
            }
        });
        bStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bStockMouseExited(evt);
            }
        });
        bStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pStockLayout = new javax.swing.GroupLayout(pStock);
        pStock.setLayout(pStockLayout);
        pStockLayout.setHorizontalGroup(
            pStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bStock, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        pStockLayout.setVerticalGroup(
            pStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bStock, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        menu.add(pStock);

        pRevenue.setBackground(new java.awt.Color(25, 25, 25));
        pRevenue.setMaximumSize(new java.awt.Dimension(210, 45));
        pRevenue.setMinimumSize(new java.awt.Dimension(100, 45));
        pRevenue.setOpaque(false);
        pRevenue.setPreferredSize(new java.awt.Dimension(210, 45));

        bRevenue.setBackground(new java.awt.Color(20, 20, 20));
        bRevenue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bRevenue.setForeground(new java.awt.Color(255, 255, 255));
        bRevenue.setText("Doanh thu");
        bRevenue.setContentAreaFilled(false);
        bRevenue.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bRevenueMouseMoved(evt);
            }
        });
        bRevenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bRevenueMouseExited(evt);
            }
        });
        bRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRevenueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pRevenueLayout = new javax.swing.GroupLayout(pRevenue);
        pRevenue.setLayout(pRevenueLayout);
        pRevenueLayout.setHorizontalGroup(
            pRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bRevenue, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        pRevenueLayout.setVerticalGroup(
            pRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bRevenue, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        menu.add(pRevenue);

        pSetting.setBackground(new java.awt.Color(25, 25, 25));
        pSetting.setForeground(new java.awt.Color(255, 255, 255));
        pSetting.setMaximumSize(new java.awt.Dimension(210, 45));
        pSetting.setMinimumSize(new java.awt.Dimension(100, 45));
        pSetting.setOpaque(false);
        pSetting.setPreferredSize(new java.awt.Dimension(210, 45));

        bSetting.setBackground(new java.awt.Color(20, 20, 20));
        bSetting.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bSetting.setForeground(new java.awt.Color(255, 255, 255));
        bSetting.setText("Cài đặt");
        bSetting.setContentAreaFilled(false);
        bSetting.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bSettingMouseMoved(evt);
            }
        });
        bSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bSettingMouseExited(evt);
            }
        });
        bSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSettingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSettingLayout = new javax.swing.GroupLayout(pSetting);
        pSetting.setLayout(pSettingLayout);
        pSettingLayout.setHorizontalGroup(
            pSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bSetting, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        pSettingLayout.setVerticalGroup(
            pSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bSetting, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        menu.add(pSetting);

        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(200, 390));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
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
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        //setExtendedState(MAXIMIZED_BOTH);
        
    }//GEN-LAST:event_formComponentResized

    private void bCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCustomerActionPerformed
        bCustomer.setForeground(new Color(0,153,204));
        pCustomer.setOpaque(true);
        showForm(tabCustomer,3);
    }//GEN-LAST:event_bCustomerActionPerformed

    private void bBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBillActionPerformed
        bBill.setForeground(new Color(0,153,204));
        pBill.setOpaque(true);
        showForm(tabBill,2);
    }//GEN-LAST:event_bBillActionPerformed

    private void bStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStockActionPerformed
 
        bStock.setForeground(new Color(0,153,204));
        pStock.setOpaque(true);
        showForm(tabStock,4);
    }//GEN-LAST:event_bStockActionPerformed

    private void bRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRevenueActionPerformed
        // TODO add your handling code here:
        bRevenue.setForeground(new Color(0,153,204));
        pRevenue.setOpaque(true);
        showForm(tabRevenue,5);
    }//GEN-LAST:event_bRevenueActionPerformed

    private void bSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSettingActionPerformed
        // TODO add your handling code here:
        bSetting.setForeground(new Color(0,153,204));
        pSetting.setOpaque(true);
        showForm(tabSetting,6);
    }//GEN-LAST:event_bSettingActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tabNhanVien.setLocationRelativeTo(null);
        tabNhanVien.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void bHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHomeActionPerformed
        bHome.setForeground(new Color(0,153,204));
        pHome.setOpaque(true);
        showForm(tabHome,1);
    }//GEN-LAST:event_bHomeActionPerformed

    private void bHomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bHomeMouseMoved
        bHome.setOpaque(true);
    }//GEN-LAST:event_bHomeMouseMoved

    private void bHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bHomeMouseExited
        bHome.setOpaque(false);
    }//GEN-LAST:event_bHomeMouseExited

    private void bBillMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBillMouseMoved
        bBill.setOpaque(true);
    }//GEN-LAST:event_bBillMouseMoved

    private void bBillMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBillMouseExited
        bBill.setOpaque(false);
    }//GEN-LAST:event_bBillMouseExited

    private void bCustomerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCustomerMouseMoved
        bCustomer.setOpaque(true);
    }//GEN-LAST:event_bCustomerMouseMoved

    private void bCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCustomerMouseExited
        bCustomer.setOpaque(false);
    }//GEN-LAST:event_bCustomerMouseExited

    private void bStockMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bStockMouseMoved
        bStock.setOpaque(true);
    }//GEN-LAST:event_bStockMouseMoved

    private void bStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bStockMouseExited
        bStock.setOpaque(false);
    }//GEN-LAST:event_bStockMouseExited

    private void bRevenueMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRevenueMouseMoved
        bRevenue.setOpaque(true);
    }//GEN-LAST:event_bRevenueMouseMoved

    private void bRevenueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRevenueMouseExited
        bRevenue.setOpaque(false);
    }//GEN-LAST:event_bRevenueMouseExited

    private void bSettingMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSettingMouseMoved
        bSetting.setOpaque(true);
    }//GEN-LAST:event_bSettingMouseMoved

    private void bSettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSettingMouseExited
        bSetting.setOpaque(false);
    }//GEN-LAST:event_bSettingMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    private void showForm(Component com,int index){
//        int index=1;
        if(index!=tabNumber){
        switch( tabNumber){
                case 1:
                    bHome.setForeground(new Color(255,255,255));
                    pHome.setOpaque(false);
                    break;
                case 2:
                    bBill.setForeground(new Color(255,255,255));
                    pBill.setOpaque(false);
                    break;   
                case 3:
                    bCustomer.setForeground(new Color(255,255,255));
                    pCustomer.setOpaque(false);
                    break;   
                case 4:
                    bStock.setForeground(new Color(255,255,255));
                    pStock.setOpaque(false);
                    break;   
                case 5:
                    bRevenue.setForeground(new Color(255,255,255));
                    pRevenue.setOpaque(false);
                     break;               
                case 6:
                    bSetting.setForeground(new Color(255,255,255));
                    pSetting.setOpaque(false);
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
    private javax.swing.JButton Logo;
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
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbNameAccount;
    private javax.swing.JPanel main;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel mutiTab;
    private javax.swing.JPanel pBill;
    private javax.swing.JPanel pCustomer;
    private javax.swing.JPanel pHome;
    private javax.swing.JPanel pRevenue;
    private javax.swing.JPanel pSetting;
    private javax.swing.JPanel pStock;
    private javax.swing.JLabel shopName;
    // End of variables declaration//GEN-END:variables
}
