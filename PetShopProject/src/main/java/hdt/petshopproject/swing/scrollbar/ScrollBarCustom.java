/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt.petshopproject.swing.scrollbar;

import hdt.petshopproject.swing.scrollbar.ModernScrollBarUI;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBarCustom extends JScrollBar {

    public ScrollBarCustom(int width, int height,int size) {

        setUI(new ModernScrollBarUI(size));
        setPreferredSize(new Dimension(width,height));
        setForeground(new Color(51,51,51));
        setUnitIncrement(20);
        setOpaque(false);
    }
    public ScrollBarCustom(int width, int height) {

        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(width,height));
        setForeground(new Color(51,51,51));
        setUnitIncrement(20);
        setOpaque(false);
    }


}