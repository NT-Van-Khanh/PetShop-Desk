package hdt.petshopproject.form;

import hdt.petshopproject.DAO.hangHoa_List;
import hdt.petshopproject.model.hangHoa;
import hdt.petshopproject.swing.scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TabStock extends javax.swing.JPanel {

    private DefaultTableModel tblModel = new DefaultTableModel();
    private hangHoa hh_up = new hangHoa();

    public TabStock() {
        initComponents();
        ScrollBarCustom sb = new ScrollBarCustom(10, 10, 100);
        sb.setForeground(new Color(130, 130, 130));
        jScrollPane1.setVerticalScrollBar(sb);
        initTable();
        fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        themThuCung = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        HH_T_Hovaten = new javax.swing.JTextField();
        HH_T_Loai = new javax.swing.JTextField();
        HH_T_soTien = new javax.swing.JTextField();
        HH_T_thoat = new javax.swing.JButton();
        HH_T_Luu = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        HH_T_Nam = new javax.swing.JRadioButton();
        HH_T_Cai = new javax.swing.JRadioButton();
        HH_T_ngayNhap = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        HH_T_chiTiet = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        capNhat = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        HH_C_Hovaten = new javax.swing.JTextField();
        HH_C_Loai = new javax.swing.JTextField();
        HH_C_soTien = new javax.swing.JTextField();
        HH_C_thoat = new javax.swing.JButton();
        HH_C_capNhat = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        HH_C_Nam = new javax.swing.JRadioButton();
        HH_C_Cai = new javax.swing.JRadioButton();
        HH_C_ngayNhap = new com.toedter.calendar.JDateChooser();
        HH_C_xoa = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        HH_C_chiTiet = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        HH_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        HH_Combo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        HH_timKiem = new javax.swing.JTextField();
        HH_TM = new javax.swing.JButton();
        HH_LM = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        themThuCung.setMinimumSize(new java.awt.Dimension(575, 325));
        themThuCung.setModal(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Tên :");

        jLabel5.setText("Loài:");

        jLabel8.setText("Ngày nhập:");

        jLabel9.setText("Giá tiền:");

        HH_T_Hovaten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HH_T_HovatenActionPerformed(evt);
            }
        });

        HH_T_soTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        HH_T_soTien.setText("x.000.000.000 ");

        HH_T_thoat.setBackground(new java.awt.Color(255, 51, 51));
        HH_T_thoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HH_T_thoat.setForeground(new java.awt.Color(255, 255, 255));
        HH_T_thoat.setText("Thoát");
        HH_T_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HH_T_thoatActionPerformed(evt);
            }
        });

        HH_T_Luu.setBackground(new java.awt.Color(0, 204, 51));
        HH_T_Luu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HH_T_Luu.setForeground(new java.awt.Color(255, 255, 255));
        HH_T_Luu.setText("Lưu");
        HH_T_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HH_T_LuuActionPerformed(evt);
            }
        });

        jLabel10.setText("Giới tính:");

        buttonGroup2.add(HH_T_Nam);
        HH_T_Nam.setText("Đực");
        HH_T_Nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HH_T_NamActionPerformed(evt);
            }
        });

        buttonGroup2.add(HH_T_Cai);
        HH_T_Cai.setText("Cái");
        HH_T_Cai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HH_T_CaiActionPerformed(evt);
            }
        });

        HH_T_ngayNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HH_T_ngayNhapMouseExited(evt);
            }
        });
        HH_T_ngayNhap.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                HH_T_ngayNhapPropertyChange(evt);
            }
        });

        jLabel16.setText("Ghi chú:");

        HH_T_chiTiet.setColumns(20);
        HH_T_chiTiet.setRows(5);
        jScrollPane2.setViewportView(HH_T_chiTiet);

        jLabel12.setBackground(new java.awt.Color(0, 102, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Ảnh");
        jLabel12.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HH_T_thoat, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HH_T_Luu, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HH_T_Hovaten, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(HH_T_ngayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HH_T_soTien, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(HH_T_Loai, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(HH_T_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(HH_T_Cai, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(HH_T_Hovaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HH_T_Loai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(HH_T_Cai, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)))
                            .addComponent(HH_T_Nam, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HH_T_ngayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(HH_T_soTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(HH_T_Luu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HH_T_thoat))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nhập thông tin Thú Cưng");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout themThuCungLayout = new javax.swing.GroupLayout(themThuCung.getContentPane());
        themThuCung.getContentPane().setLayout(themThuCungLayout);
        themThuCungLayout.setHorizontalGroup(
            themThuCungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, themThuCungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(themThuCungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        themThuCungLayout.setVerticalGroup(
            themThuCungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, themThuCungLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        capNhat.setMinimumSize(new java.awt.Dimension(650, 400));
        capNhat.setModal(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Tên ");

        jLabel11.setText("Loai");

        jLabel13.setText("Ngày nhập");

        jLabel14.setText("Giá tiền");

        HH_C_Hovaten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HH_C_HovatenActionPerformed(evt);
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

        HH_C_capNhat.setBackground(new java.awt.Color(0, 204, 51));
        HH_C_capNhat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HH_C_capNhat.setForeground(new java.awt.Color(255, 255, 255));
        HH_C_capNhat.setText("Cập nhật");
        HH_C_capNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HH_C_capNhatActionPerformed(evt);
            }
        });

        jLabel15.setText("Giới tính");

        buttonGroup1.add(HH_C_Nam);
        HH_C_Nam.setText("Đực");
        HH_C_Nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HH_C_NamActionPerformed(evt);
            }
        });

        buttonGroup1.add(HH_C_Cai);
        HH_C_Cai.setText("Cái");

        HH_C_ngayNhap.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                HH_C_ngayNhapPropertyChange(evt);
            }
        });

        HH_C_xoa.setBackground(new java.awt.Color(102, 0, 0));
        HH_C_xoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HH_C_xoa.setForeground(new java.awt.Color(255, 255, 255));
        HH_C_xoa.setText("Xóa");
        HH_C_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HH_C_xoaActionPerformed(evt);
            }
        });

        HH_C_chiTiet.setColumns(20);
        HH_C_chiTiet.setRows(5);
        jScrollPane3.setViewportView(HH_C_chiTiet);

        jLabel17.setText("Chi tiết");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel13))))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HH_C_Loai, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HH_C_Hovaten, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(HH_C_ngayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel14))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(HH_C_soTien, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(126, 126, 126))
                                .addComponent(HH_C_thoat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(HH_C_capNhat)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(HH_C_Cai, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(HH_C_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(50, 50, 50)
                                .addComponent(HH_C_xoa))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(HH_C_thoat)
                .addGap(124, 124, 124))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(HH_C_Hovaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HH_C_Loai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HH_C_soTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addComponent(HH_C_ngayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(HH_C_Nam))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(121, 121, 121))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(HH_C_Cai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HH_C_capNhat)
                            .addComponent(HH_C_xoa))
                        .addGap(43, 43, 43))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cập nhật thông tin Thú Cưng");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout capNhatLayout = new javax.swing.GroupLayout(capNhat.getContentPane());
        capNhat.getContentPane().setLayout(capNhatLayout);
        capNhatLayout.setHorizontalGroup(
            capNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(capNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        capNhatLayout.setVerticalGroup(
            capNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, capNhatLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTextField1.setText("jTextField1");

        HH_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên thú cưng", "Giới tính", "Ngày nhập", "Giá tiền", "Chi tiết"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        HH_table.setMinimumSize(new java.awt.Dimension(500, 1000));
        HH_table.setRowHeight(25);
        HH_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        HH_table.getTableHeader().setReorderingAllowed(false);
        HH_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HH_tableMouseClicked(evt);
            }
        });
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

        HH_Combo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HH_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên thú cưng" }));
        HH_Combo.setMaximumSize(new java.awt.Dimension(160, 30));
        HH_Combo.setMinimumSize(new java.awt.Dimension(160, 30));
        HH_Combo.setPreferredSize(new java.awt.Dimension(160, 30));
        HH_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HH_ComboActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Sắp xếp theo:");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 30));

        HH_timKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HH_timKiem.setMinimumSize(new java.awt.Dimension(230, 30));
        HH_timKiem.setName("[230,30]"); // NOI18N
        HH_timKiem.setPreferredSize(new java.awt.Dimension(230, 30));
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

        HH_TM.setBackground(new java.awt.Color(0, 255, 51));
        HH_TM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HH_TM.setForeground(new java.awt.Color(255, 255, 255));
        HH_TM.setText("Thêm mới");
        HH_TM.setMaximumSize(new java.awt.Dimension(120, 30));
        HH_TM.setMinimumSize(new java.awt.Dimension(120, 30));
        HH_TM.setPreferredSize(new java.awt.Dimension(120, 30));
        HH_TM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HH_TMMouseClicked(evt);
            }
        });

        HH_LM.setBackground(new java.awt.Color(235, 235, 235));
        HH_LM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HH_LM.setForeground(new java.awt.Color(51, 51, 51));
        HH_LM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh.png"))); // NOI18N
        HH_LM.setText("Làm mới");
        HH_LM.setMaximumSize(new java.awt.Dimension(120, 30));
        HH_LM.setMinimumSize(new java.awt.Dimension(120, 30));
        HH_LM.setPreferredSize(new java.awt.Dimension(120, 30));
        HH_LM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HH_LMMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Tìm kiếm");
        jLabel6.setMaximumSize(new java.awt.Dimension(55, 30));
        jLabel6.setMinimumSize(new java.awt.Dimension(55, 30));

        jButton1.setBackground(new java.awt.Color(235, 235, 235));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-search-25.png"))); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(35, 30));
        jButton1.setMinimumSize(new java.awt.Dimension(35, 30));
        jButton1.setPreferredSize(new java.awt.Dimension(35, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HH_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(HH_TM, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HH_LM, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HH_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HH_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(HH_LM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(HH_TM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HH_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
            JOptionPane.showMessageDialog(this, "Không thể tìm kiếm!!");
        }
        tblModel.setRowCount(0);
        for (hangHoa hh : lstHH) {
            tblModel.addRow(new String[]{String.valueOf(hh.getID()), hh.getTen(), hh.isGioiTinh() ? "Cái" : "Đực", hh.getNgNhap(), String.valueOf(hh.getGiaTien()), hh.getChiTiet()});
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
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tblModel);
        HH_table.setRowSorter(sorter);
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
    }//GEN-LAST:event_HH_ComboActionPerformed

    private void HH_T_NamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HH_T_NamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HH_T_NamActionPerformed

    private void HH_T_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HH_T_LuuActionPerformed
        try {
            hangHoa hh = new hangHoa();
            hh.setTen(HH_T_Hovaten.getText());
            hh.setLoai(HH_T_Loai.getText());
            hh.setChiTiet(HH_T_chiTiet.getText());
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDate = dateFormat.format(HH_T_ngayNhap.getDate());
            hh.setNgNhap(formattedDate);
            hh.setGiaTien(Integer.parseInt(HH_T_soTien.getText()));
            if (HH_T_Nam.isSelected()) {
                hh.setGioiTinh(false);
            } else {
                hh.setGioiTinh(false);
            }
            hangHoa_List dao = new hangHoa_List();
            dao.insert(hh);
            JOptionPane.showMessageDialog(this, "Thêm thành công!!");
            fillTable();
            HH_T_Hovaten.setText("");
            HH_T_Loai.setText("");
            HH_T_chiTiet.setText("");
            HH_T_ngayNhap.setDate(null);
            HH_T_soTien.setText("");
            HH_T_Nam.setSelected(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vui lòng kiểm tra lại dữ liệu!!");
        }
    }//GEN-LAST:event_HH_T_LuuActionPerformed

    private void HH_T_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HH_T_thoatActionPerformed
        // TODO add your handling code here:
        themThuCung.setVisible(false);
    }//GEN-LAST:event_HH_T_thoatActionPerformed

    private void HH_TMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HH_TMMouseClicked
        HH_T_Nam.setSelected(true);
        themThuCung.setVisible(true);
    }//GEN-LAST:event_HH_TMMouseClicked

    private void HH_T_HovatenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HH_T_HovatenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HH_T_HovatenActionPerformed

    private void HH_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HH_tableMouseClicked
        try {
            int index = HH_table.getSelectedRow();
            hh_up.setID(Integer.parseInt(HH_table.getValueAt(index, 0).toString()));
            hangHoa_List dao = new hangHoa_List();
            hh_up = dao.fillHH(hh_up.getID());
            HH_C_Hovaten.setText(hh_up.getTen());
            HH_C_Loai.setText(hh_up.getLoai());
            HH_C_chiTiet.setText(hh_up.getChiTiet());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(hh_up.getNgNhap());
            HH_C_ngayNhap.setDate(date);
            HH_C_soTien.setText(String.valueOf(hh_up.getGiaTien()));
            if (hh_up.isGioiTinh()) {
                HH_C_Cai.setSelected(true);
            } else {
                HH_C_Nam.setSelected(true);
            }
            capNhat.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không thể mở cập nhật!!");
        }
    }//GEN-LAST:event_HH_tableMouseClicked

    private void HH_C_HovatenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HH_C_HovatenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HH_C_HovatenActionPerformed

    private void HH_C_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HH_C_thoatActionPerformed
        capNhat.setVisible(false);
    }//GEN-LAST:event_HH_C_thoatActionPerformed

    private void HH_C_capNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HH_C_capNhatActionPerformed
        try {
            hangHoa hh = new hangHoa();
            hh.setID(hh_up.getID());
            hh.setTen(HH_C_Hovaten.getText());
            hh.setLoai(HH_C_Loai.getText());
            hh.setChiTiet(HH_C_chiTiet.getText());
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDate = dateFormat.format(HH_C_ngayNhap.getDate());
            hh.setNgNhap(formattedDate);
            hh.setGiaTien(Integer.parseInt(HH_C_soTien.getText()));
            if (HH_C_Nam.isSelected()) {
                hh.setGioiTinh(false);
            } else {
                hh.setGioiTinh(true);
            }
            hangHoa_List dao = new hangHoa_List();
            System.out.print(hh.getChiTiet());
            dao.update(hh);
            capNhat.setVisible(false);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!!");
            fillTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không thể cập nhật!!");
        }
    }//GEN-LAST:event_HH_C_capNhatActionPerformed

    private void HH_C_NamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HH_C_NamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HH_C_NamActionPerformed

    private void HH_C_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HH_C_xoaActionPerformed
        try {
            int chos = JOptionPane.showConfirmDialog(HH_C_capNhat, "Bạn có muốn xóa ?", "Xóa Thư Cưng", JOptionPane.YES_NO_OPTION);
            if (chos == JOptionPane.YES_OPTION) {
                hangHoa_List dao = new hangHoa_List();
                boolean check = dao.delete(hh_up.getID());
                if (check == true) {
                    capNhat.setVisible(false);
                    fillTable();
                    JOptionPane.showMessageDialog(this, "Xóa thành công!!");
                } else {
                    JOptionPane.showMessageDialog(this, "Không thể xóa!!");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không thể xóa!!");
        }
    }//GEN-LAST:event_HH_C_xoaActionPerformed

    private void HH_T_ngayNhapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HH_T_ngayNhapMouseExited

    }//GEN-LAST:event_HH_T_ngayNhapMouseExited

    private void HH_T_ngayNhapPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_HH_T_ngayNhapPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();
            Date currentDate = new java.util.Date();

            if (selectedDate != null && selectedDate.after(currentDate)) {
                JOptionPane.showMessageDialog(this, "Ngày chọn ở tương lai!!");
            }
        }
    }//GEN-LAST:event_HH_T_ngayNhapPropertyChange

    private void HH_C_ngayNhapPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_HH_C_ngayNhapPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();
            Date currentDate = new java.util.Date();

            if (selectedDate != null && selectedDate.after(currentDate)) {
                JOptionPane.showMessageDialog(this, "Ngày chọn ở tương lai!!");
            }
        }
    }//GEN-LAST:event_HH_C_ngayNhapPropertyChange

    private void HH_T_CaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HH_T_CaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HH_T_CaiActionPerformed

    private void initTable() {
        String[] header = new String[]{"ID", "Tên thú cưng", "Giới tính", "Ngày nhập", "Giá tiền", "Chi tiết"};
        tblModel.setColumnIdentifiers(header);
        HH_table.setModel(tblModel);
    }

    private void fillTable() {
        List<hangHoa> lstHH = new ArrayList<>();
        try {
            hangHoa_List dao = new hangHoa_List();
            lstHH = dao.getAll();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Dữ liệu lỗi!!");
        }

        tblModel.setRowCount(0);
        for (hangHoa hh : lstHH) {
            tblModel.addRow(new String[]{String.valueOf(hh.getID()), hh.getTen(), hh.isGioiTinh() ? "Cái" : "Đực", hh.getNgNhap(), String.valueOf(hh.getGiaTien()), hh.getChiTiet()});
        }
        tblModel.fireTableDataChanged();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton HH_C_Cai;
    private javax.swing.JTextField HH_C_Hovaten;
    private javax.swing.JTextField HH_C_Loai;
    private javax.swing.JRadioButton HH_C_Nam;
    private javax.swing.JButton HH_C_capNhat;
    private javax.swing.JTextArea HH_C_chiTiet;
    private com.toedter.calendar.JDateChooser HH_C_ngayNhap;
    private javax.swing.JTextField HH_C_soTien;
    private javax.swing.JButton HH_C_thoat;
    private javax.swing.JButton HH_C_xoa;
    private javax.swing.JComboBox<String> HH_Combo;
    private javax.swing.JButton HH_LM;
    private javax.swing.JButton HH_TM;
    private javax.swing.JRadioButton HH_T_Cai;
    private javax.swing.JTextField HH_T_Hovaten;
    private javax.swing.JTextField HH_T_Loai;
    private javax.swing.JButton HH_T_Luu;
    private javax.swing.JRadioButton HH_T_Nam;
    private javax.swing.JTextArea HH_T_chiTiet;
    private com.toedter.calendar.JDateChooser HH_T_ngayNhap;
    private javax.swing.JTextField HH_T_soTien;
    private javax.swing.JButton HH_T_thoat;
    private javax.swing.JTable HH_table;
    private javax.swing.JTextField HH_timKiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JDialog capNhat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JDialog themThuCung;
    // End of variables declaration//GEN-END:variables
}
