package hdt.petshopproject.form;

import hdt.petshopproject.DAO.nhanVien_List;
import hdt.petshopproject.model.nhanVien;
import hdt.petshopproject.swing.TableGradientCell;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TabNhanVien extends javax.swing.JDialog {

    private DefaultTableModel tblModel = new DefaultTableModel();
    private nhanVien nv_up = new nhanVien();
    

    public TabNhanVien(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        centerFrameOnScreen();
        NV_table.setDefaultRenderer(Object.class, new TableGradientCell());
        initTable();
        fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        themNhanVien = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        T_Hovaten = new javax.swing.JTextField();
        T_diaChi = new javax.swing.JTextField();
        T_sdt = new javax.swing.JTextField();
        T_luong = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        T_Nam = new javax.swing.JRadioButton();
        T_Nu = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        T_taiKhoan = new javax.swing.JTextField();
        T_pass = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        T_ngSinh = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        capNhat = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        C_Hovaten = new javax.swing.JTextField();
        C_diaChi = new javax.swing.JTextField();
        C_sdt = new javax.swing.JTextField();
        C_luong = new javax.swing.JTextField();
        C_exit = new javax.swing.JButton();
        C_CN = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        C_Nam = new javax.swing.JRadioButton();
        C_Nu = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        C_taiKhoan = new javax.swing.JTextField();
        C_pass = new javax.swing.JPasswordField();
        jLabel28 = new javax.swing.JLabel();
        C_ngSinh = new com.toedter.calendar.JDateChooser();
        C_xoa = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        NV_LM = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        NV_InputTK = new javax.swing.JTextField();
        NV_sxTen = new javax.swing.JButton();
        NV_sxID = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NV_table = new javax.swing.JTable();

        themNhanVien.setMinimumSize(new java.awt.Dimension(650, 400));
        themNhanVien.setModal(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Họ tên");

        jLabel5.setText("Địa chỉ");

        jLabel6.setText("Số điện thoại");

        jLabel8.setText("Ngày sinh");

        jLabel9.setText("Lương");

        jButton6.setText("Thoát");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Lưu");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel10.setText("Giới tính");

        buttonGroup1.add(T_Nam);
        T_Nam.setText("Nam");

        buttonGroup1.add(T_Nu);
        T_Nu.setText("Nữ");

        jLabel11.setText("Tài khoản");

        jLabel12.setText("Mật khẩu");

        T_ngSinh.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                T_ngSinhPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)))
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(T_Hovaten, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(T_diaChi, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(T_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel12)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel11)))
                            .addGap(29, 29, 29)
                            .addComponent(T_luong, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(T_ngSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(T_taiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(T_Nam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(T_Nu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(T_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(T_Hovaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(T_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(39, 39, 39))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(T_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(T_luong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(T_ngSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(T_taiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(1, 1, 1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(T_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(T_Nam)
                            .addComponent(T_Nu))))
                .addGap(0, 34, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nhập thông tin nhân viên");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout themNhanVienLayout = new javax.swing.GroupLayout(themNhanVien.getContentPane());
        themNhanVien.getContentPane().setLayout(themNhanVienLayout);
        themNhanVienLayout.setHorizontalGroup(
            themNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(themNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(themNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        themNhanVienLayout.setVerticalGroup(
            themNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, themNhanVienLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        capNhat.setMinimumSize(new java.awt.Dimension(650, 400));
        capNhat.setModal(true);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel21.setText("Họ tên");

        jLabel22.setText("Địa chỉ");

        jLabel23.setText("Số điện thoại");

        jLabel24.setText("Ngày sinh");

        jLabel25.setText("Lương");

        C_exit.setText("Thoát");
        C_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_exitActionPerformed(evt);
            }
        });

        C_CN.setText("Cập nhật");
        C_CN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_CNActionPerformed(evt);
            }
        });

        jLabel26.setText("Giới tính");

        buttonGroup1.add(C_Nam);
        C_Nam.setText("Nam");

        buttonGroup1.add(C_Nu);
        C_Nu.setText("Nữ");

        jLabel27.setText("Tài khoản");

        jLabel28.setText("Mật khẩu");

        C_ngSinh.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                C_ngSinhPropertyChange(evt);
            }
        });

        C_xoa.setBackground(new java.awt.Color(255, 51, 51));
        C_xoa.setForeground(new java.awt.Color(255, 255, 255));
        C_xoa.setText("Xóa");
        C_xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C_xoaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel23)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel22))))
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(C_Hovaten, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(C_diaChi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(C_pass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(C_ngSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(C_Nam)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(C_Nu))
                                    .addComponent(C_sdt, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(C_luong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C_taiKhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(C_CN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(C_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(C_xoa)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(C_Hovaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(C_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25)
                        .addComponent(C_luong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(C_CN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C_exit)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(C_ngSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C_taiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel27))))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(C_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(C_Nam)
                        .addComponent(C_Nu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(C_xoa)
                .addContainerGap())
        );

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Cập nhật thông tin nhân viên");
        jLabel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout capNhatLayout = new javax.swing.GroupLayout(capNhat.getContentPane());
        capNhat.getContentPane().setLayout(capNhatLayout);
        capNhatLayout.setHorizontalGroup(
            capNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(capNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        capNhatLayout.setVerticalGroup(
            capNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, capNhatLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setMinimumSize(new java.awt.Dimension(658, 120));
        jPanel2.setPreferredSize(new java.awt.Dimension(658, 120));

        jLabel7.setText("Tìm kiếm");

        NV_LM.setText("Làm mới");
        NV_LM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NV_LMMouseClicked(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        NV_InputTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NV_InputTKActionPerformed(evt);
            }
        });

        NV_sxTen.setText("Sắp xếp theo tên");
        NV_sxTen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NV_sxTenMouseClicked(evt);
            }
        });

        NV_sxID.setText("Sắp xếp theo ID");
        NV_sxID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NV_sxIDMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DANH SÁCH NHÂN VIÊN");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NV_InputTK, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NV_LM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NV_sxID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NV_sxTen)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(NV_InputTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NV_LM))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem)
                        .addComponent(NV_sxID)
                        .addComponent(NV_sxTen)))
                .addContainerGap())
        );

        NV_table.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Họ và tên", "Giới tính", "Địa chỉ", "Số điện thoại", "Ngày sinh", "Tài khoản"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        NV_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        NV_table.getTableHeader().setReorderingAllowed(false);
        NV_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NV_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(NV_table);
        if (NV_table.getColumnModel().getColumnCount() > 0) {
            NV_table.getColumnModel().getColumn(0).setPreferredWidth(50);
            NV_table.getColumnModel().getColumn(1).setPreferredWidth(150);
            NV_table.getColumnModel().getColumn(2).setPreferredWidth(70);
            NV_table.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initTable() {
        String[] header = new String[]{"ID", "Họ và tên", "Giới tính", "Địa chỉ", "Số điện thoại", "Ngày sinh", "Tài khoản"};
        tblModel.setColumnIdentifiers(header);
        NV_table.setModel(tblModel);
    }

    private void fillTable() {
        List<nhanVien> lstNV = new ArrayList<>();
        try {
            nhanVien_List dao = new nhanVien_List();
            lstNV = dao.getAll();
        } catch (Exception e) {
            System.out.print("Lỗi table nhan vien !!!");
        }

        tblModel.setRowCount(0);
        for (nhanVien nv : lstNV) {
            tblModel.addRow(new String[]{String.valueOf(nv.getID_NV()), nv.getHoVaTen(), (nv.isGioiTinh() ? "Nữ" : "Nam"), nv.getDiaChi(), nv.getSdt(), nv.getNgSinh(), nv.getTaiKhoan()});
        }
        tblModel.fireTableDataChanged();
    }

    private void NV_InputTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NV_InputTKActionPerformed
        List<nhanVien> lstNV = new ArrayList<>();
        try {
            nhanVien_List dao = new nhanVien_List();

            lstNV = dao.findByTen(NV_InputTK.getText());
        } catch (Exception e) {
            System.out.print("Lỗi tim kiem nhanvien!!!");
        }
        tblModel.setRowCount(0);
        for (nhanVien nv : lstNV) {
            tblModel.addRow(new String[]{String.valueOf(nv.getID_NV()), nv.getHoVaTen(), (nv.isGioiTinh() ? "Nữ" : "Nam"), nv.getDiaChi(), nv.getSdt(), nv.getNgSinh(), nv.getTaiKhoan()});
        }
        tblModel.fireTableDataChanged();
    }//GEN-LAST:event_NV_InputTKActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        T_Nam.setSelected(true);
        T_ngSinh.setDateFormatString("dd/MM/yyyy");
        themNhanVien.setVisible(true);

    }//GEN-LAST:event_btnThemActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        themNhanVien.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            nhanVien nv = new nhanVien();
            nv.setHoVaTen(T_Hovaten.getText());
            nv.setDiaChi(T_diaChi.getText());
            nv.setSdt(T_sdt.getText());
            nv.setLuong(Integer.parseInt(T_luong.getText()));
            
            // thay đổi để chx date theo mẫu
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDate = dateFormat.format(T_ngSinh.getDate());
            
            nv.setNgSinh(formattedDate);
            nv.setTaiKhoan(T_taiKhoan.getText());
            nv.setMatKhau(String.valueOf(T_pass.getPassword()));
            if (T_Nam.isSelected()) {
                nv.setGioiTinh(false);
            } else if (T_Nu.isSelected()) {
                nv.setGioiTinh(true);
            }
            nhanVien_List dao = new nhanVien_List();
            dao.insert(nv);          
            JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công!!");
            fillTable();
            T_Hovaten.setText("");
            T_diaChi.setText("");
            T_sdt.setText("");
            T_luong.setText("");
            T_ngSinh.setDate(null);
            T_taiKhoan.setText("");
            T_pass.setText("");
            T_Nam.setSelected(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ!!");
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void NV_LMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NV_LMMouseClicked
        fillTable();
        NV_InputTK.setText("");
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tblModel);
        NV_table.setRowSorter(sorter);

        // Tắt việc sắp xếp
        sorter.setSortKeys(Collections.emptyList());
    }//GEN-LAST:event_NV_LMMouseClicked

    private void NV_sxIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NV_sxIDMouseClicked
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tblModel);
        NV_table.setRowSorter(sorter);

        sorter.setSortable(0, true);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING)); // Sắp xếp giảm dần
        sorter.setSortKeys(sortKeys);
    }//GEN-LAST:event_NV_sxIDMouseClicked

    private void NV_sxTenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NV_sxTenMouseClicked
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tblModel);
        NV_table.setRowSorter(sorter);

        sorter.setSortable(1, true);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING)); // Sắp xếp giảm dần
        sorter.setSortKeys(sortKeys);
    }//GEN-LAST:event_NV_sxTenMouseClicked

    private void C_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_exitActionPerformed
        capNhat.setVisible(false);
    }//GEN-LAST:event_C_exitActionPerformed

    private void C_CNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_CNActionPerformed
        try{
            nhanVien_List dao = new nhanVien_List();
            nv_up.setHoVaTen(C_Hovaten.getText());
            nv_up.setDiaChi(C_diaChi.getText());
            nv_up.setSdt(C_sdt.getText());
            nv_up.setLuong(Integer.parseInt(C_luong.getText()));
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDate = dateFormat.format(C_ngSinh.getDate());
            nv_up.setNgSinh(formattedDate);
            
            nv_up.setTaiKhoan(C_taiKhoan.getText());
            nv_up.setMatKhau(String.valueOf(C_pass.getPassword()));
            if( C_Nam.isSelected() ){
                nv_up.setGioiTinh(false);
            }else nv_up.setGioiTinh(true);
            dao.update(nv_up);
            capNhat.setVisible(false);
            fillTable();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!!");
        }
        catch( Exception e){
            JOptionPane.showMessageDialog(this, "Lỗi cập nhật!!");
        }
    }//GEN-LAST:event_C_CNActionPerformed

    private void NV_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NV_tableMouseClicked
        try {
            int index = NV_table.getSelectedRow();
            nv_up.setID_NV(Integer.parseInt(tblModel.getValueAt(index, 0).toString()));
            nhanVien_List dao = new nhanVien_List();
            nv_up = dao.fillNV(nv_up.getID_NV());
            C_Hovaten.setText(nv_up.getHoVaTen());
            C_diaChi.setText(nv_up.getDiaChi());
            C_sdt.setText(nv_up.getSdt());
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(nv_up.getNgSinh());
            C_ngSinh.setDate(date);
            C_luong.setText(String.valueOf(nv_up.getLuong()));
            C_taiKhoan.setText(nv_up.getTaiKhoan());
            C_pass.setText(nv_up.getMatKhau());
            if( nv_up.isGioiTinh() ){
                C_Nu.setSelected(true);
            }else C_Nam.setSelected(true);
            capNhat.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cập nhật dữ liệu!!!");
        }
    }//GEN-LAST:event_NV_tableMouseClicked

    private void C_xoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C_xoaMouseClicked
        try{
            int chos = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa!!!","Xóa Nhân Viên", JOptionPane.YES_NO_OPTION);
            if( chos == JOptionPane.YES_OPTION){
                nhanVien_List dao = new nhanVien_List();
                boolean check = dao.delete(nv_up.getID_NV());
                if( check ){
                    fillTable();
                    capNhat.setVisible(false);
                   JOptionPane.showMessageDialog(this, "Xóa thành công!!!");        
                }
                else JOptionPane.showMessageDialog(this, "Không thể xóa!!");
            }else{
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Không xóa được!!!");
        }
    }//GEN-LAST:event_C_xoaMouseClicked

    private void T_ngSinhPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_T_ngSinhPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();

            if (selectedDate != null) {
                // Convert từ Date sang LocalDate
                LocalDate birthDate = selectedDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

                LocalDate currentDate = LocalDate.now();

                // Tính tuổi
                int age = Period.between(birthDate, currentDate).getYears();
                if (age < 18) {
                    JOptionPane.showMessageDialog(this, "Chưa đủ 18 tuổi!!");
                }
                    }
                }
    }//GEN-LAST:event_T_ngSinhPropertyChange

    private void C_ngSinhPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_C_ngSinhPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();

            if (selectedDate != null) {
                // Convert từ Date sang LocalDate
                LocalDate birthDate = selectedDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

                LocalDate currentDate = LocalDate.now();

                // Tính tuổi
                int age = Period.between(birthDate, currentDate).getYears();
                if (age < 18) {
                    JOptionPane.showMessageDialog(this, "Chưa đủ 18 tuổi!!");
                }
                    }
                }
    }//GEN-LAST:event_C_ngSinhPropertyChange

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
            java.util.logging.Logger.getLogger(TabNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TabNhanVien dialog = new TabNhanVien(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);

            }
        });
    }

    private void centerFrameOnScreen() {
        // Lấy kích thước màn hình
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Tính toán vị trí để đặt JFrame ở giữa màn hình
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;

        // Đặt vị trí của JFrame
        setLocation(x, y);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C_CN;
    private javax.swing.JTextField C_Hovaten;
    private javax.swing.JRadioButton C_Nam;
    private javax.swing.JRadioButton C_Nu;
    private javax.swing.JTextField C_diaChi;
    private javax.swing.JButton C_exit;
    private javax.swing.JTextField C_luong;
    private com.toedter.calendar.JDateChooser C_ngSinh;
    private javax.swing.JPasswordField C_pass;
    private javax.swing.JTextField C_sdt;
    private javax.swing.JTextField C_taiKhoan;
    private javax.swing.JButton C_xoa;
    private javax.swing.JTextField NV_InputTK;
    private javax.swing.JButton NV_LM;
    private javax.swing.JButton NV_sxID;
    private javax.swing.JButton NV_sxTen;
    private javax.swing.JTable NV_table;
    private javax.swing.JTextField T_Hovaten;
    private javax.swing.JRadioButton T_Nam;
    private javax.swing.JRadioButton T_Nu;
    private javax.swing.JTextField T_diaChi;
    private javax.swing.JTextField T_luong;
    private com.toedter.calendar.JDateChooser T_ngSinh;
    private javax.swing.JPasswordField T_pass;
    private javax.swing.JTextField T_sdt;
    private javax.swing.JTextField T_taiKhoan;
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDialog capNhat;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog themNhanVien;
    // End of variables declaration//GEN-END:variables
}
