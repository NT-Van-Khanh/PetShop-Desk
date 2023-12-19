/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hdt.petshopproject.form.home;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;


public class ListSanPham extends javax.swing.JPanel {


    public ListSanPham() {
        initComponents();
         for(int i=0;i<8;i++){
            cSanPham.add(new cardSanPham());
            jPanel1.add(cSanPham.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cardSanPham7 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham5 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham4 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham3 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham1 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham2 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham8 = new hdt.petshopproject.form.home.cardSanPham();

        jMenu1.setText("jMenu1");

        jPanel3.setMinimumSize(new java.awt.Dimension(100, 25));
        jPanel3.setPreferredSize(new java.awt.Dimension(1020, 25));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 51));
        jButton2.setText("Tên loài");
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jButton2MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton2MouseMoved(evt);
            }
        });
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2)
        );

        jPanel1.add(cardSanPham7);
        jPanel1.add(cardSanPham5);
        jPanel1.add(cardSanPham4);
        jPanel1.add(cardSanPham3);
        jPanel1.add(cardSanPham1);
        jPanel1.add(cardSanPham2);
        jPanel1.add(cardSanPham8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        if(!choseJBT){
            jButton2.setBackground(new Color(204,204,204));
            this.choseJBT=true;
        }
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
//        jButton2.setBackground(new Color(218,218,218));
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseDragged
        jButton2.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jButton2MouseDragged

    private void jButton2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseMoved
        if(choseJBT==false)
            jButton2.setBackground(new Color(218,218,218));
    }//GEN-LAST:event_jButton2MouseMoved

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
//         jButton2.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jButton2MouseExited
    List <cardSanPham> cSanPham= new ArrayList<>();
    private boolean choseJBT=false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private hdt.petshopproject.form.home.cardSanPham cardSanPham1;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham2;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham3;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham4;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham5;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham7;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham8;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
