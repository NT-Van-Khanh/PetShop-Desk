
package hdt.petshopproject.form;

import hdt.petshopproject.DAO.hoaDon_List;
import hdt.petshopproject.model.hoaDon;
import hdt.petshopproject.swing.scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class TabBill extends javax.swing.JPanel {
    private DefaultTableModel tblModel = new DefaultTableModel();

    public TabBill() {
        initComponents();     
        ScrollBarCustom sb = new ScrollBarCustom(10,10,100);
        sb.setForeground(new Color(130,130,130));
        jScrollPane1.setVerticalScrollBar(sb);
        initTable();
        fillTable();
    }

    
    @SuppressWarnings("unchecked")
    
    private void initTable() {
        String[] header = new String[]{"Mã hóa đơn", "Tên khách hàng", "Ngày tạo", "Thành tiền", "Chi tiết"};
        tblModel.setColumnIdentifiers(header);
        B_table.setModel(tblModel);
    }
    
    private void fillTable() {
        List<hoaDon> lstHD = new ArrayList<>();
        try {
            hoaDon_List dao = new hoaDon_List();
            lstHD = dao.getAll();
        } catch (Exception e) {
            System.out.print("Lỗi table !!!");
        }

        tblModel.setRowCount(0);
        for (hoaDon hd : lstHD) {
            tblModel.addRow(new String[]{ String.valueOf(hd.getIdHD()), hd.getTenKH(), hd.getNgTao(), String.valueOf(hd.getThanhTien()),"--"});
        }
        tblModel.fireTableDataChanged();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        B_Combo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        B_Input = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        B_LM = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        B_table = new javax.swing.JTable();

        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 100));

        B_Combo.setForeground(new java.awt.Color(255, 255, 255));
        B_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã đơn hàng", "Tên khách hàng" }));
        B_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ComboActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Sắp xếp theo:");

        B_Input.setText("Tim kiếm");
        B_Input.setToolTipText("Tìm kiếm");
        B_Input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                B_InputFocusGained(evt);
            }
        });
        B_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_InputActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Thêm mới");

        B_LM.setForeground(new java.awt.Color(51, 51, 51));
        B_LM.setText("Làm mới");
        B_LM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_LMMouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("|");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(B_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B_LM, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(B_LM)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        B_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Tên khách hàng", "Ngày tạo", "Thành Tiền", "Chi tiết"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        B_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        B_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B_table.setDragEnabled(true);
        B_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        B_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(B_table);
        if (B_table.getColumnModel().getColumnCount() > 0) {
            B_table.getColumnModel().getColumn(0).setResizable(false);
            B_table.getColumnModel().getColumn(0).setPreferredWidth(150);
            B_table.getColumnModel().getColumn(1).setResizable(false);
            B_table.getColumnModel().getColumn(1).setPreferredWidth(300);
            B_table.getColumnModel().getColumn(2).setResizable(false);
            B_table.getColumnModel().getColumn(2).setPreferredWidth(150);
            B_table.getColumnModel().getColumn(3).setResizable(false);
            B_table.getColumnModel().getColumn(3).setPreferredWidth(200);
            B_table.getColumnModel().getColumn(4).setResizable(false);
            B_table.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void B_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_InputActionPerformed
        List<hoaDon> lstHD = new ArrayList<>();
        try {
            hoaDon_List dao = new hoaDon_List();

            lstHD = dao.findByTen(B_Input.getText());
        } catch (Exception e) {
            System.out.print("Lỗi tim kiem Hd!!!");
        }
        tblModel.setRowCount(0);
        for (hoaDon hd : lstHD) {
            tblModel.addRow(new String[]{ String.valueOf(hd.getIdHD()), hd.getTenKH(), hd.getNgTao(), String.valueOf(hd.getThanhTien()),"--"});
        }
        tblModel.fireTableDataChanged();
    }//GEN-LAST:event_B_InputActionPerformed

    private void B_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_ComboActionPerformed

    private void B_LMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_LMMouseClicked
        fillTable();
        B_Input.setText("Tìm kiếm");
        B_Combo.setSelectedIndex(0);
    }//GEN-LAST:event_B_LMMouseClicked

    private void B_InputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_B_InputFocusGained
        B_Input.setText("");
    }//GEN-LAST:event_B_InputFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> B_Combo;
    private javax.swing.JTextField B_Input;
    private javax.swing.JButton B_LM;
    private javax.swing.JTable B_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
