/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hdt.petshopproject.form;

import hdt.petshopproject.DAO.hangHoa_List;
import hdt.petshopproject.model.hangHoa;
import hdt.petshopproject.swing.scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class TabStock extends javax.swing.JPanel {
    private DefaultTableModel tblModel = new DefaultTableModel();
    
    public TabStock() {
        initComponents();
        ScrollBarCustom sb = new ScrollBarCustom(10,10,100);
        sb.setForeground(new Color(130,130,130));
        jScrollPane1.setVerticalScrollBar(sb);
        initTable();
        fillTable();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        HH_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        HH_Combo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        HH_timKiem = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        HH_LM = new javax.swing.JButton();

        HH_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên thú cưng", "Giới tính", "Ngày nhập", "Số lượng", "Giá tiền", "Chi tiết"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        HH_table.setMinimumSize(new java.awt.Dimension(500, 1000));
        HH_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        HH_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(HH_table);
        if (HH_table.getColumnModel().getColumnCount() > 0) {
            HH_table.getColumnModel().getColumn(0).setResizable(false);
            HH_table.getColumnModel().getColumn(0).setPreferredWidth(150);
            HH_table.getColumnModel().getColumn(1).setResizable(false);
            HH_table.getColumnModel().getColumn(1).setPreferredWidth(200);
            HH_table.getColumnModel().getColumn(2).setResizable(false);
            HH_table.getColumnModel().getColumn(2).setPreferredWidth(100);
            HH_table.getColumnModel().getColumn(3).setResizable(false);
            HH_table.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 100));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 100));

        HH_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên thú cưng" }));
        HH_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HH_ComboActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Sắp xếp theo:");

        HH_timKiem.setText("Tìm kiếm");
        HH_timKiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                HH_timKiemFocusGained(evt);
            }
        });
        HH_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HH_timKiemActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Thêm mới");

        HH_LM.setForeground(new java.awt.Color(51, 51, 51));
        HH_LM.setText("Làm mới");
        HH_LM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HH_LMMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HH_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HH_LM, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HH_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HH_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(HH_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(HH_LM))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HH_timKiemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HH_timKiemFocusGained
        HH_timKiem.setText("");
    }//GEN-LAST:event_HH_timKiemFocusGained

    private void HH_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HH_timKiemActionPerformed
        List<hangHoa> lstHH = new ArrayList<>();
        try {
            hangHoa_List dao = new hangHoa_List();

            lstHH = dao.findByTen(HH_timKiem.getText());
        } catch (Exception e) {
            System.out.print("Lỗi tim kiem HH!!!");
        }
        tblModel.setRowCount(0);
        for (hangHoa hh : lstHH) {
            tblModel.addRow(new String[]{String.valueOf(hh.getID()) , hh.getTen() , hh.isGioiTinh() ? "Cái" : "Đực", hh.getNgNhap() , String.valueOf(hh.getSoluong()), String.valueOf(hh.getGiaTien()) , "--"});
        }
        tblModel.fireTableDataChanged();
    }//GEN-LAST:event_HH_timKiemActionPerformed

    private void HH_LMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HH_LMMouseClicked
        fillTable();
        HH_timKiem.setText("Tìm kiếm");
        HH_Combo.setSelectedIndex(0);
    }//GEN-LAST:event_HH_LMMouseClicked

    private void HH_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HH_ComboActionPerformed
        String choss = (String) HH_Combo.getSelectedItem();
        System.out.print(choss);
        List<hangHoa> lstHH = new ArrayList<>();
        try {
            hangHoa_List dao = new hangHoa_List();
            if (choss == "ID") {
                lstHH = dao.sapXepID();
            } else {
                lstHH = dao.sapXepTen();
            }
        } catch (Exception e) {
            System.out.print("Lỗi sap xep hang hoa!!!");
        }
        tblModel.setRowCount(0);
        for (hangHoa hh : lstHH) {
            tblModel.addRow(new String[]{String.valueOf(hh.getID()) , hh.getTen() , hh.isGioiTinh() ? "Cái" : "Đực", hh.getNgNhap() , String.valueOf(hh.getSoluong()), String.valueOf(hh.getGiaTien()) , "--"});
        }
        tblModel.fireTableDataChanged();
    }//GEN-LAST:event_HH_ComboActionPerformed
    
    private void initTable() {
        String[] header = new String[]{"ID", "Tên thú cưng", "Giới tính", "Ngày nhập", "Số lượng", "Giá tiền", "Chi tiết"};
        tblModel.setColumnIdentifiers(header);
        HH_table.setModel(tblModel);
    }

    private void fillTable() {
        List<hangHoa> lstHH = new ArrayList<>();
        try {
            hangHoa_List dao = new hangHoa_List();
            lstHH = dao.getAll();
        } catch (Exception e) {
            System.out.print("Lỗi table !!!");
        }

        tblModel.setRowCount(0);
        for (hangHoa hh : lstHH) {
            tblModel.addRow(new String[]{String.valueOf(hh.getID()) , hh.getTen() , hh.isGioiTinh() ? "Cái" : "Đực", hh.getNgNhap() , String.valueOf(hh.getSoluong()), String.valueOf(hh.getGiaTien()) , "--"});
        }
        tblModel.fireTableDataChanged();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> HH_Combo;
    private javax.swing.JButton HH_LM;
    private javax.swing.JTable HH_table;
    private javax.swing.JTextField HH_timKiem;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
