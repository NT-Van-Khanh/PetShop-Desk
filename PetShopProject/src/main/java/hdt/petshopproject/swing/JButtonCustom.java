package hdt.petshopproject.swing;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicButtonUI;

public class JButtonCustom extends javax.swing.JButton{
    public void setUILine(){
                setUI(new BasicButtonUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                AbstractButton b = (AbstractButton) c;
                ButtonModel model = b.getModel();
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(b.getBackground());
                g2.fillRect(0, 0, b.getWidth(), b.getHeight());
                if (model.isRollover()) {
                    g2.setColor(Color.GRAY); // Màu khi di chuột qua
                    g2.drawRect(0, 0, b.getWidth() - 1, b.getHeight() - 1);
                }
                g2.setColor(b.getForeground());
                g2.setFont(b.getFont());
                FontMetrics fm = g2.getFontMetrics();
                String buttonText = b.getText();
                int textWidth = fm.stringWidth(buttonText);
                int textHeight = fm.getHeight();
                int x = (b.getWidth() - textWidth) / 2;
                int y = (b.getHeight() - textHeight) / 2 + fm.getAscent();
                g2.drawString(buttonText, x, y);
            }
        });
        setBorderPainted(false);
        setFocusPainted(false);
        setContentAreaFilled(false);
    }

}
