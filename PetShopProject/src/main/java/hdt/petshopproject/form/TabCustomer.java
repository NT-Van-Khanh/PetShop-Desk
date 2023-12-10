package hdt.petshopproject.form;

import hdt.petshopproject.DAO.khachHang_List;
import hdt.petshopproject.model.Customer;
import hdt.petshopproject.swing.scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TabCustomer extends javax.swing.JPanel {

    private DefaultTableModel tblModel = new DefaultTableModel();
    private Customer kh_up = new Customer();
    
    public TabCustomer() {
        initComponents();
        initTable();
        fillTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        themKhachHang = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CT_T_Hovaten = new javax.swing.JTextField();
        CT_T_sdt = new javax.swing.JTextField();
        CT_T_diaChi = new javax.swing.JTextField();
        HH_T_thoat = new javax.swing.JButton();
        CT_T_Luu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        updateKH = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CT_C_Hovaten = new javax.swing.JTextField();
        CT_C_sdt = new javax.swing.JTextField();
        CT_C_diaChi = new javax.swing.JTextField();
        HH_C_thoat = new javax.swing.JButton();
        CT_C_Luu = new javax.swing.JButton();
        HH_T_xoa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CT_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        CT_combo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        CT_inputTK = new javax.swing.JTextField();
        CT_LM = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        themKhachHang.setMinimumSize(new java.awt.Dimension(650, 400));
        themKhachHang.setModal(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Tên ");

        jLabel5.setText("Số điện thoại");

        jLabel6.setText("Địa chỉ");

        CT_T_Hovaten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CT_T_HovatenActionPerformed(evt);
            }
        });

        HH_T_thoat.setBackground(new java.awt.Color(255, 51, 51));
        HH_T_thoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HH_T_thoat.setForeground(new java.awt.Color(255, 255, 255));
        HH_T_thoat.setText("Thoát");
        HH_T_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HH_T_thoatActionPerformed(evt);
            }
        });

        CT_T_Luu.setBackground(new java.awt.Color(153, 255, 153));
        CT_T_Luu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CT_T_Luu.setForeground(new java.awt.Color(255, 255, 255));
        CT_T_Luu.setText("Lưu");
        CT_T_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CT_T_LuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CT_T_Hovaten, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                        .addComponent(CT_T_sdt, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CT_T_diaChi))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(CT_T_Luu)
                        .addGap(31, 31, 31)
                        .addComponent(HH_T_thoat)))
                .addGap(106, 106, 106))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CT_T_Hovaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CT_T_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5))
                    .addComponent(CT_T_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CT_T_Luu)
                    .addComponent(HH_T_thoat))
                .addGap(20, 20, 20))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nhập thông tin Khách Hàng");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout themKhachHangLayout = new javax.swing.GroupLayout(themKhachHang.getContentPane());
        themKhachHang.getContentPane().setLayout(themKhachHangLayout);
        themKhachHangLayout.setHorizontalGroup(
            themKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(themKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(themKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        themKhachHangLayout.setVerticalGroup(
            themKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, themKhachHangLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        updateKH.setMinimumSize(new java.awt.Dimension(650, 400));
        updateKH.setModal(true);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Tên ");

        jLabel8.setText("Số điện thoại");

        jLabel9.setText("Địa chỉ");

        CT_C_Hovaten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CT_C_HovatenActionPerformed(evt);
            }
        });

        HH_C_thoat.setBackground(new java.awt.Color(255, 51, 51));
        HH_C_thoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HH_C_thoat.setForeground(new java.awt.Color(255, 255, 255));
        HH_C_thoat.setText("Thoát");
        HH_C_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HH_C_thoatActionPerformed(evt);
            }
        });

        CT_C_Luu.setBackground(new java.awt.Color(0, 204, 0));
        CT_C_Luu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CT_C_Luu.setForeground(new java.awt.Color(255, 255, 255));
        CT_C_Luu.setText("Cập nhật");
        CT_C_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CT_C_LuuActionPerformed(evt);
            }
        });

        HH_T_xoa.setBackground(new java.awt.Color(153, 0, 0));
        HH_T_xoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HH_T_xoa.setForeground(new java.awt.Color(255, 255, 255));
        HH_T_xoa.setText("Xóa");
        HH_T_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HH_T_xoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CT_C_Hovaten, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                            .addComponent(CT_C_sdt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CT_C_diaChi))
                        .addGap(106, 106, 106))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(CT_C_Luu)
                        .addGap(31, 31, 31)
                        .addComponent(HH_C_thoat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                        .addComponent(HH_T_xoa))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(CT_C_Hovaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CT_C_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(5, 5, 5))
                    .addComponent(CT_C_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CT_C_Luu)
                    .addComponent(HH_C_thoat))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(HH_T_xoa))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cập nhật thông tin Khách Hàng");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout updateKHLayout = new javax.swing.GroupLayout(updateKH.getContentPane());
        updateKH.getContentPane().setLayout(updateKHLayout);
        updateKHLayout.setHorizontalGroup(
            updateKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        updateKHLayout.setVerticalGroup(
            updateKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateKHLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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
        CT_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CT_tableMouseClicked(evt);
            }
        });
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

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Thêm mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CT_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CT_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(CT_inputTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CT_LM)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
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
            JOptionPane.showMessageDialog(this, "Không tìm kiếm được!!");
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

    private void CT_T_HovatenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CT_T_HovatenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CT_T_HovatenActionPerformed

    private void HH_T_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HH_T_thoatActionPerformed
        // TODO add your handling code here:
        themKhachHang.setVisible(false);
    }//GEN-LAST:event_HH_T_thoatActionPerformed

    private void CT_T_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CT_T_LuuActionPerformed
        try {
            Customer kh = new Customer();
            kh.setHoVaTen(CT_T_Hovaten.getText());
            kh.setSdt(CT_T_sdt.getText());
            kh.setDiaChi(CT_T_diaChi.getText());
            khachHang_List dao = new khachHang_List();
            dao.insert(kh);
            fillTable();
            JOptionPane.showMessageDialog(this, "Thêm thành công!!");
            CT_T_Hovaten.setText("");
            CT_T_sdt.setText("");
            CT_T_diaChi.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vui lòng kiểm tra lại!!");
        }
    }//GEN-LAST:event_CT_T_LuuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        themKhachHang.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CT_C_HovatenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CT_C_HovatenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CT_C_HovatenActionPerformed

    private void HH_C_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HH_C_thoatActionPerformed
        updateKH.setVisible(false);
    }//GEN-LAST:event_HH_C_thoatActionPerformed

    private void CT_C_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CT_C_LuuActionPerformed
        try {
            Customer kh = new Customer();
            kh.setID(kh_up.getID());
            kh.setHoVaTen(CT_C_Hovaten.getText());
            kh.setSdt(CT_C_sdt.getText());
            kh.setDiaChi(CT_C_diaChi.getText());
            khachHang_List dao = new khachHang_List();
            dao.update(kh);
            updateKH.setVisible(false);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!!");
            fillTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không thể cập nhật!!");
        }
    }//GEN-LAST:event_CT_C_LuuActionPerformed

    private void HH_T_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HH_T_xoaActionPerformed
        try {
            int chos = JOptionPane.showConfirmDialog(updateKH, "Bạn có muốn xóa ?", "Xóa Thư Cưng", JOptionPane.YES_NO_OPTION);
            if (chos == JOptionPane.YES_OPTION) {
                khachHang_List dao = new khachHang_List();
                boolean check = dao.delete(kh_up.getID());
                if (check == true) {
                    updateKH.setVisible(false);
                    fillTable();
                    JOptionPane.showMessageDialog(this, "Xóa thành công!!");
                } else {
                    JOptionPane.showMessageDialog(this, "Không thể xóa!!");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không thể xóa!!");
        }
    }//GEN-LAST:event_HH_T_xoaActionPerformed

    private void CT_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CT_tableMouseClicked
        try {
            int index = CT_table.getSelectedRow();
            kh_up.setID(Integer.parseInt(CT_table.getValueAt(index, 0).toString()));
            khachHang_List dao = new khachHang_List();
            kh_up = dao.findByID(kh_up.getID());
            CT_C_Hovaten.setText(kh_up.getHoVaTen());
            CT_C_sdt.setText(kh_up.getSdt());
            CT_C_diaChi.setText(kh_up.getDiaChi());
            updateKH.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không thể mở cập nhật!!");
        }
    }//GEN-LAST:event_CT_tableMouseClicked

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
            JOptionPane.showMessageDialog(this, "Dữ liệu lỗi!!");
        }

        tblModel.setRowCount(0);
        for (Customer kh : lstKH) {
            tblModel.addRow(new String[]{String.valueOf(kh.getID()), kh.getHoVaTen(), kh.getSdt(), kh.getDiaChi(), "--"});
        }
        tblModel.fireTableDataChanged();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CT_C_Hovaten;
    private javax.swing.JButton CT_C_Luu;
    private javax.swing.JTextField CT_C_diaChi;
    private javax.swing.JTextField CT_C_sdt;
    private javax.swing.JButton CT_LM;
    private javax.swing.JTextField CT_T_Hovaten;
    private javax.swing.JButton CT_T_Luu;
    private javax.swing.JTextField CT_T_diaChi;
    private javax.swing.JTextField CT_T_sdt;
    private javax.swing.JComboBox<String> CT_combo;
    private javax.swing.JTextField CT_inputTK;
    private javax.swing.JTable CT_table;
    private javax.swing.JButton HH_C_thoat;
    private javax.swing.JButton HH_T_thoat;
    private javax.swing.JButton HH_T_xoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog themKhachHang;
    private javax.swing.JDialog updateKH;
    // End of variables declaration//GEN-END:variables
}
