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
            add(cSanPham.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        cardSanPham7 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham5 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham4 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham3 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham1 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham2 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham8 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham9 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham10 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham11 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham12 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham13 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham14 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham15 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham16 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham17 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham18 = new hdt.petshopproject.form.home.cardSanPham();
        cardSanPham19 = new hdt.petshopproject.form.home.cardSanPham();

        jMenu1.setText("jMenu1");

        setMaximumSize(new java.awt.Dimension(1000, 32767));
        setMinimumSize(new java.awt.Dimension(910, 495));
        setPreferredSize(new java.awt.Dimension(910, 709));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10);
        flowLayout1.setAlignOnBaseline(true);
        setLayout(flowLayout1);
        add(cardSanPham7);
        add(cardSanPham5);
        add(cardSanPham4);
        add(cardSanPham3);
        add(cardSanPham1);
        add(cardSanPham2);
        add(cardSanPham8);
        add(cardSanPham9);
        add(cardSanPham10);
        add(cardSanPham11);
        add(cardSanPham12);
        add(cardSanPham13);
        add(cardSanPham14);
        add(cardSanPham15);
        add(cardSanPham16);
        add(cardSanPham17);
        add(cardSanPham18);
        add(cardSanPham19);
    }// </editor-fold>//GEN-END:initComponents
    List <cardSanPham> cSanPham= new ArrayList<>();
    private boolean choseJBT=false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private hdt.petshopproject.form.home.cardSanPham cardSanPham1;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham10;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham11;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham12;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham13;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham14;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham15;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham16;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham17;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham18;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham19;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham2;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham3;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham4;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham5;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham7;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham8;
    private hdt.petshopproject.form.home.cardSanPham cardSanPham9;
    private javax.swing.JMenu jMenu1;
    // End of variables declaration//GEN-END:variables
}
