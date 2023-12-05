package hdt.petshopproject.form;

import hdt.petshopproject.DAO.khachHang_List;
import hdt.petshopproject.model.Customer;
import hdt.petshopproject.swing.scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TabCustomer extends javax.swing.JPanel {

    private DefaultTableModel tblModel = new DefaultTableModel();

    public TabCustomer() {
        initComponents();
        initTable();
        fillTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CT_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        CT_combo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        CT_inputTK = new javax.swing.JTextField();
        CT_LM = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setMinimumSize(new java.awt.Dimension(400, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 200));

        ScrollBarCustom sb = new ScrollBarCustom(10,10,100);
        sb.setForeground(new Color(130,130,130));
        jScrollPane1.setVerticalScrollBar(sb);

        CT_table.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Họ và tên", "Số điện thoại", "Địa chỉ", "Chi tiết"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CT_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        CT_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CT_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        CT_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(CT_table);
        if (CT_table.getColumnModel().getColumnCount() > 0) {
            CT_table.getColumnModel().getColumn(0).setResizable(false);
            CT_table.getColumnModel().getColumn(1).setResizable(false);
            CT_table.getColumnModel().getColumn(2).setResizable(false);
            CT_table.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 100));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 100));

        CT_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên" }));
        CT_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CT_comboActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Sắp xếp");

        CT_inputTK.setText("Tìm kiếm");
        CT_inputTK.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CT_inputTKFocusGained(evt);
            }
        });
        CT_inputTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CT_inputTKActionPerformed(evt);
            }
        });
        CT_inputTK.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                CT_inputTKPropertyChange(evt);
            }
        });

        CT_LM.setText("Làm mới");
        CT_LM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CT_LMMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CT_inputTK, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CT_LM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CT_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CT_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(CT_inputTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CT_LM))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void CT_inputTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CT_inputTKActionPerformed
        List<Customer> lstKH = new ArrayList<>();
        try {
            khachHang_List dao = new khachHang_List();

            lstKH = dao.findByTen(CT_inputTK.getText());
        } catch (Exception e) {
            System.out.print("Lỗi tim kiem Customer!!!");
        }
        tblModel.setRowCount(0);
        for (Customer kh : lstKH) {
            tblModel.addRow(new String[]{String.valueOf(kh.getID()), kh.getHoVaTen(), kh.getSdt(), kh.getDiaChi(), "--"});
        }
        tblModel.fireTableDataChanged();
    }//GEN-LAST:event_CT_inputTKActionPerformed

    private void CT_inputTKFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CT_inputTKFocusGained
        CT_inputTK.setText("");
    }//GEN-LAST:event_CT_inputTKFocusGained

    private void CT_inputTKPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_CT_inputTKPropertyChange

    }//GEN-LAST:event_CT_inputTKPropertyChange

    private void CT_LMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CT_LMMouseClicked
        fillTable();
        CT_inputTK.setText("Tìm kiếm");
        CT_combo.setSelectedIndex(0);
    }//GEN-LAST:event_CT_LMMouseClicked

    private void CT_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CT_comboActionPerformed
        String choss = (String) CT_combo.getSelectedItem();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tblModel);
        CT_table.setRowSorter(sorter);
        if (choss.equals("ID")) {
            sorter.setSortable(0, true);
            List<RowSorter.SortKey> sortKeys = new ArrayList<>();
            sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
            sorter.setSortKeys(sortKeys);
        } else {
            sorter.setSortable(1, true);
            List<RowSorter.SortKey> sortKeys = new ArrayList<>();
            sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
            sorter.setSortKeys(sortKeys);
        }
    }//GEN-LAST:event_CT_comboActionPerformed

    private void initTable() {
        String[] header = new String[]{"ID", "Họ và tên", "Số điện thoại", "Địa chỉ", "Chi tiết"};
        tblModel.setColumnIdentifiers(header);
        CT_table.setModel(tblModel);
    }

    private void fillTable() {
        List<Customer> lstKH = new ArrayList<>();
        try {
            khachHang_List dao = new khachHang_List();

            lstKH = dao.getAll();
        } catch (Exception e) {
            System.out.print("Lỗi table Customer!!!");
        }

        tblModel.setRowCount(0);
        for (Customer kh : lstKH) {
            tblModel.addRow(new String[]{String.valueOf(kh.getID()), kh.getHoVaTen(), kh.getSdt(), kh.getDiaChi(), "--"});
        }
        tblModel.fireTableDataChanged();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CT_LM;
    private javax.swing.JComboBox<String> CT_combo;
    private javax.swing.JTextField CT_inputTK;
    private javax.swing.JTable CT_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
