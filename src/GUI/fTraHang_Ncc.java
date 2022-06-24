/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.*;
import DAO.daoTraNhaCungCap;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.lang.*;

/**
 *
 * @author Viet Thang
 */
public class fTraHang_Ncc extends javax.swing.JFrame {

    /**
     * Creates new form fTraHang_Ncc
     */
    public int id_nv;
    public ArrayList<PhieuTraKho> DanhSachTraKho;
    public ArrayList<PhieuTraKho> DuLieuMau = DanhSachTraKho;
    public long count, SoTrang, Trang = 1;

    public fTraHang_Ncc() {
        initComponents();
        setIcon();
    }

    public fTraHang_Ncc(int id_nv) {
        this.id_nv = id_nv;
        DanhSachTraKho = BUS.busTraNhaCungCap.getInstance().getListTraKho();
        DuLieuMau = DanhSachTraKho;
        initComponents();
        setIcon();
        build();
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Logo2.png")));
    }

    public void build() {
        jButtonSua.setEnabled(false);
        jButtonHuy.setEnabled(false);
        DanhSachTraKho = DuLieuMau;
        this.count = this.DanhSachTraKho.size();
        jLabelKetQua.setText("Có tổng cộng " + count + " kết quả");
        if (count % 20 == 0) {
            SoTrang = count / 20;
        } else {
            SoTrang = count / 20 + 1;
        }
        jLabelSoTrang.setText("1/" + SoTrang);
        jLabelTrang.setText("1");
        ArrayList<PhieuTraKho> table = BUS.busTraNhaCungCap.getInstance().get20PhieuTraKho(DanhSachTraKho, 1);
        ShowListTraKho(table);
        NhanVienDangNhap();
    }

    public void ShowListTraKho(ArrayList<PhieuTraKho> arr) {
        DefaultTableModel model = (DefaultTableModel) jTableXuatKho.getModel();
        while (jTableXuatKho.getRowCount() > 0) {
            model.removeRow(0);
        }
        if (arr.isEmpty() == false) {
            arr.stream().forEach((item) -> {
                ChiTietLoSanPham ctlsp = DAO.daoChiTietLoSanPham.getInstance().getChiTietLoSanPham(item.id_lo_sp);
                LoSanPham lsp = DAO.daoLoSanPham.getInstance().getLoSanPham(item.id_lo_sp);
                ChiTietPhieuNhap pn = DAO.daoChiTietPhieuNhap.getInstance().getChiTietPhieuNhap(lsp.id_phieu_nhap);
                NguonCungCap ncc = DAO.daoNguonCungCap.getInstance().getNguonCungCap(pn.id_nguon_cc);
                SanPham sp = DAO.daoSanPham.getInstance().getSanPham(ctlsp.id_sp);
                NhanVien nv = DAO.daoTaiKhoan.getInstance().getNhanVien(item.id_nv);
                model.addRow(new Object[] { item.id_phieu_tra_kho, item.thoi_gian_tra, ncc.ten_nha_cc, sp.ten_sp,
                        item.sl_san_pham, nv.ten_nv });
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableXuatKho = new javax.swing.JTable();
        jButtonTaoMoi = new javax.swing.JButton();
        jTextFieldTimKiem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonTaiLai = new javax.swing.JButton();
        jButtonTimKiem = new javax.swing.JButton();
        jLabelKetQua = new javax.swing.JLabel();
        jButtonSua = new javax.swing.JButton();
        jButtonHuy = new javax.swing.JButton();
        jComboBoxNhanVien = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jButtonNhoMax = new javax.swing.JButton();
        jButtonNho = new javax.swing.JButton();
        jLabelTrang = new javax.swing.JLabel();
        jButtonLon = new javax.swing.JButton();
        jButtonLonMax = new javax.swing.JButton();
        jLabelSoTrang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Phiếu trả nhà cung cấp");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Phần mềm quản lý kho nhà hàng 5 sao");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(980, 444));

        jTableXuatKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Thời gian trả", "Tên nhà cung cấp", "Tên sản phẩm", "Số lượng", "Nhân viên phụ trách"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableXuatKho.setRowHeight(30);
        jTableXuatKho.setAutoCreateRowSorter(true);
        jTableXuatKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableXuatKhoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableXuatKho);

        jButtonTaoMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ImageIcon imgTaoMoi = new ImageIcon(getClass().getResource("/icon/icons8-plus-48.png"));
        ImageIcon ImgTaoMoi = new ImageIcon(imgTaoMoi.getImage().getScaledInstance(19, 19, Image.SCALE_SMOOTH));
        jButtonTaoMoi.setText("Tạo mới");
        jButtonTaoMoi.setIcon(ImgTaoMoi);
        jButtonTaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTaoMoiActionPerformed(evt);
            }
        });

        jTextFieldTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldTimKiemKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTimKiemKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DANH SÁCH PHIẾU TRẢ NHÀ CUNG CẤP");

        jButtonTaiLai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ImageIcon imgLamMoi = new ImageIcon(getClass().getResource("/icon/icons8-synchronize-30.png"));
        ImageIcon ImgLamMoi = new ImageIcon(imgLamMoi.getImage().getScaledInstance(19, 19, Image.SCALE_SMOOTH));
        jButtonTaiLai.setIcon(ImgLamMoi);
        jButtonTaiLai.setText("Tải lại");
        jButtonTaiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTaiLaiActionPerformed(evt);
            }
        });

        jButtonTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ImageIcon img = new ImageIcon(getClass().getResource("/icon/icons8-search.png"));
        ImageIcon Img = new ImageIcon(img.getImage().getScaledInstance(19, 19, Image.SCALE_SMOOTH));
        jButtonTimKiem.setIcon(Img);
        jButtonTimKiem.setText("Tìm Kiếm");
        jButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimKiemActionPerformed(evt);
            }
        });

        jLabelKetQua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelKetQua.setForeground(new java.awt.Color(255, 255, 255));
        jLabelKetQua.setText("Có tổng cộng 000 kết quả");

        jButtonSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ImageIcon imgSua = new ImageIcon(getClass().getResource("/icon/icons8-maintenance-48.png"));
        ImageIcon ImgSua = new ImageIcon(imgSua.getImage().getScaledInstance(19, 19, Image.SCALE_SMOOTH));
        jButtonSua.setText("Sửa");
        jButtonSua.setIcon(ImgSua);

        jButtonHuy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ImageIcon imgHuy = new ImageIcon(getClass().getResource("/icon/icons8-waste-48.png"));
        ImageIcon ImgHuy = new ImageIcon(imgHuy.getImage().getScaledInstance(19, 19, Image.SCALE_SMOOTH));
        jButtonHuy.setText("Huỷ");
        jButtonHuy.setIcon(ImgHuy);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonTaoMoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonHuy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTaiLai)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelKetQua)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTaoMoi)
                    .addComponent(jTextFieldTimKiem)
                    .addComponent(jButtonTaiLai)
                    .addComponent(jButtonTimKiem)
                    .addComponent(jButtonHuy)
                    .addComponent(jButtonSua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelKetQua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jComboBoxNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNhanVienActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jButtonNhoMax.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNhoMax.setText("<<");
        jButtonNhoMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNhoMaxActionPerformed(evt);
            }
        });

        jButtonNho.setText("<");
        jButtonNho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNhoActionPerformed(evt);
            }
        });

        jLabelTrang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTrang.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTrang.setText("jLabel2");

        jButtonLon.setText(">");
        jButtonLon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLonActionPerformed(evt);
            }
        });

        jButtonLonMax.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonLonMax.setText(">>");
        jButtonLonMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLonMaxActionPerformed(evt);
            }
        });

        jLabelSoTrang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSoTrang.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSoTrang.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNhoMax, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTrang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLonMax)
                .addGap(18, 18, 18)
                .addComponent(jLabelSoTrang)
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNhoMax)
                    .addComponent(jButtonNho)
                    .addComponent(jButtonLon)
                    .addComponent(jButtonLonMax)
                    .addComponent(jLabelSoTrang)
                    .addComponent(jLabelTrang))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableXuatKhoMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTableXuatKhoMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int selectedRowIndex = jTableXuatKho.getSelectedRow();
            int id = jTableXuatKho.getValueAt(selectedRowIndex, 0).hashCode();
            JFrame Xem = new fPrintPhieuXuat(id_nv, id);
            Xem.setVisible(true);
        }
        jButtonSua.setEnabled(true);
        jButtonHuy.setEnabled(true);
        // TODO add your handling code here:
    }// GEN-LAST:event_jTableXuatKhoMouseClicked

    private void jButtonTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonTaoMoiActionPerformed
        JFrame XuatKho = new fTraHang_Kho(id_nv);
        XuatKho.setVisible(true);
        // TODO add your handling code here:
    }// GEN-LAST:event_jButtonTaoMoiActionPerformed

    private void jTextFieldTimKiemKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextFieldTimKiemKeyReleased
        /*
         * String [][] Data;
         * //System.out.println("Giai doan 1");
         * Data=DAO.daoTraNhaCungCap.getInstance().FindListTraKho(jTextFieldTimKiem.
         * getText());
         * // System.out.println("Giai doan 2");
         * DefaultTableModel model = (DefaultTableModel) jTableXuatKho.getModel();
         * while (jTableXuatKho.getRowCount() > 0) {
         * model.removeRow(0);
         * }
         * int i=0;
         * while(Data[i][0]!=null)
         * {
         * //System.out.println("Giai doan 3");
         * model.addRow(new Object[]{
         * Data[i][0],
         * Data[i][1],
         * Data[i][2],
         * Data[i][3],
         * Data[i][4],
         * Data[i][5]});
         * i++;
         * }
         */
        // TODO add your handling code here:
        if ("".equals(jTextFieldTimKiem.getText())) {
            build();
        }
    }// GEN-LAST:event_jTextFieldTimKiemKeyReleased

    private void jButtonTaiLaiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonTaiLaiActionPerformed
        invalidate();
        validate();
        repaint();
        DuLieuMau = BUS.busTraNhaCungCap.getInstance().getListTraKho();
        // build();
        DanhSachTraKho = DuLieuMau;
        this.count = this.DanhSachTraKho.size();
        jLabelKetQua.setText("Có tổng cộng " + count + " kết quả");
        if (count % 20 == 0) {
            SoTrang = count / 20;
        } else {
            SoTrang = count / 20 + 1;
        }
        jLabelSoTrang.setText("1/" + SoTrang);
        jLabelTrang.setText("1");
        ArrayList<PhieuTraKho> table = BUS.busTraNhaCungCap.getInstance().get20PhieuTraKho(DanhSachTraKho, 1);
        ShowListTraKho(table);
        // TODO add your handling code here:
    }// GEN-LAST:event_jButtonTaiLaiActionPerformed

    public void FindList() {
        this.DanhSachTraKho = BUS.busTraNhaCungCap.getInstance().FindListTraKho(DuLieuMau, jTextFieldTimKiem.getText());
        if (DanhSachTraKho.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Không có dữ liệu phiếu trả",
                    "Lỗi",
                    JOptionPane.ERROR_MESSAGE);
            build();
        } else {
            this.count = this.DanhSachTraKho.size();
            jLabelKetQua.setText("Có tổng cộng " + count + " kết quả");
            if (count % 20 == 0) {
                SoTrang = count / 20;
            } else {
                SoTrang = count / 20 + 1;
            }
            jLabelSoTrang.setText("1/" + SoTrang);
            jLabelTrang.setText("1");
            ArrayList<PhieuTraKho> table = BUS.busTraNhaCungCap.getInstance().get20PhieuTraKho(DanhSachTraKho, 1);
            ShowListTraKho(table);
        }
    }

    public void NhanVienDangNhap() {
        if (id_nv != 0) {
            TaiKhoan tk = DAO.daoTaiKhoan.getInstance().getTaiKhoan(id_nv);
            NhanVien nv = DAO.daoTaiKhoan.getInstance().getNhanVien(tk.id_nv);
            jComboBoxNhanVien.addItem(nv.ten_nv);
            jComboBoxNhanVien.addItem("Thông tin");
            jComboBoxNhanVien.addItem("Thoát");
        } else {
            jComboBoxNhanVien.addItem("Chưa đăng nhập");
        }
    }

    private void jComboBoxNhanVienActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBoxNhanVienActionPerformed
        String valueIn = String.valueOf(jComboBoxNhanVien.getSelectedItem());
        if ("Thoát".equals(valueIn)) {
            JFrame dn = new fDangNhap();
            dn.setVisible(true);
            dispose();
        }
        if ("Thông tin".equals(valueIn)) {
            JFrame nv = new fViewNhanVien(id_nv, id_nv);
            nv.setVisible(true);
        }
        jComboBoxNhanVien.setSelectedIndex(0);
    }// GEN-LAST:event_jComboBoxNhanVienActionPerformed

    private void jButtonNhoMaxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonNhoMaxActionPerformed
        Trang = 1;
        ArrayList<PhieuTraKho> table = BUS.busTraNhaCungCap.getInstance().get20PhieuTraKho(DanhSachTraKho, Trang);
        ShowListTraKho(table);
        jLabelTrang.setText("1");
        jLabelSoTrang.setText("1/" + SoTrang);
    }// GEN-LAST:event_jButtonNhoMaxActionPerformed

    private void jButtonNhoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonNhoActionPerformed
        if (Trang > 1) {
            Trang--;
            ArrayList<PhieuTraKho> table = BUS.busTraNhaCungCap.getInstance().get20PhieuTraKho(DanhSachTraKho, Trang);
            ShowListTraKho(table);
            jLabelTrang.setText("" + Trang);
            jLabelSoTrang.setText(Trang + "/" + SoTrang);
        }
    }// GEN-LAST:event_jButtonNhoActionPerformed

    private void jButtonLonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonLonActionPerformed
        if (Trang < SoTrang) {
            Trang++;
            ArrayList<PhieuTraKho> table = BUS.busTraNhaCungCap.getInstance().get20PhieuTraKho(DanhSachTraKho, Trang);
            ShowListTraKho(table);
            jLabelTrang.setText("" + Trang);
            jLabelSoTrang.setText(Trang + "/" + SoTrang);
        }
    }// GEN-LAST:event_jButtonLonActionPerformed

    private void jButtonLonMaxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonLonMaxActionPerformed
        Trang = SoTrang;
        ArrayList<PhieuTraKho> table = BUS.busTraNhaCungCap.getInstance().get20PhieuTraKho(DanhSachTraKho, Trang);
        ShowListTraKho(table);
        jLabelTrang.setText("" + SoTrang);
        jLabelSoTrang.setText(SoTrang + "/" + SoTrang);
    }// GEN-LAST:event_jButtonLonMaxActionPerformed

    private void jButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonTimKiemActionPerformed
        DanhSachTraKho = BUS.busTraNhaCungCap.getInstance().getListTraKho();
        FindList();
        // TODO add your handling code here:
    }// GEN-LAST:event_jButtonTimKiemActionPerformed

    private void jTextFieldTimKiemKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextFieldTimKiemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            DanhSachTraKho = BUS.busTraNhaCungCap.getInstance().getListTraKho();
            FindList();
        }
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldTimKiemKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fTraHang_Ncc.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fTraHang_Ncc.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fTraHang_Ncc.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fTraHang_Ncc.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fTraHang_Ncc(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHuy;
    private javax.swing.JButton jButtonLon;
    private javax.swing.JButton jButtonLonMax;
    private javax.swing.JButton jButtonNho;
    private javax.swing.JButton jButtonNhoMax;
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonTaiLai;
    private javax.swing.JButton jButtonTaoMoi;
    private javax.swing.JButton jButtonTimKiem;
    private javax.swing.JComboBox<String> jComboBoxNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelKetQua;
    private javax.swing.JLabel jLabelSoTrang;
    private javax.swing.JLabel jLabelTrang;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableXuatKho;
    private javax.swing.JTextField jTextFieldTimKiem;
    // End of variables declaration//GEN-END:variables
}
