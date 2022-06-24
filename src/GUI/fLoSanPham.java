/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.DateTimeNow;
import DAO.daoLoSanPham;
import java.awt.event.KeyEvent;
import DAO.daoNguonCungCap;
import DTO.LoSanPham;
import DTO.NguonCungCap;
import GROUP.ThongTinLo;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author Viet Thang
 */
public class fLoSanPham extends javax.swing.JFrame {

    public int id_nv;
    public ArrayList<ThongTinLo> DuLieuMau;
    public ArrayList<ThongTinLo> DanhSachXuatKho;
    public long count, SoTrang, Trang = 1;

    /**
     * Creates new form fLoSanPham
     */
    public fLoSanPham() {
        initComponents();
        setIcon();
    }

    public fLoSanPham(int id_nv) {
        this.id_nv = id_nv;
        initComponents();
        setIcon();
        DanhSachXuatKho = BUS.busLoSanPham.getInstance().getListThongTinLo();
        DuLieuMau = DanhSachXuatKho;
        build();
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Logo2.png")));
    }

    public void build() {
        DanhSachXuatKho = DuLieuMau;
        this.count = this.DanhSachXuatKho.size();
        jLabelKetQua.setText("Có tổng cộng " + count + " kết quả");
        if (count % 20 == 0) {
            SoTrang = count / 20;
        } else {
            SoTrang = count / 20 + 1;
        }
        jLabelSoTrang.setText("1/" + SoTrang);
        jLabelTrang.setText("1");
        ArrayList<ThongTinLo> table = BUS.busLoSanPham.getInstance().get20LoSanPham(DanhSachXuatKho, 1);
        listDanhSachThongTinLo(table);
    }

    public void FindList() {
        this.DanhSachXuatKho = BUS.busLoSanPham.getInstance().FindListThongTinLo(DuLieuMau,
                jTextFieldTimKiem.getText());
        if (DanhSachXuatKho.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Không có dữ liệu nhà cung cấp",
                    "Lỗi",
                    JOptionPane.ERROR_MESSAGE);
            build();
        } else {
            this.count = this.DanhSachXuatKho.size();
            jLabelKetQua.setText("Có tổng cộng " + count + " kết quả");
            if (count % 20 == 0) {
                SoTrang = count / 20;
            } else {
                SoTrang = count / 20 + 1;
            }
            jLabelSoTrang.setText("1/" + SoTrang);
            jLabelTrang.setText("1");
            ArrayList<ThongTinLo> table = BUS.busLoSanPham.getInstance().get20LoSanPham(DanhSachXuatKho, 1);
            listDanhSachThongTinLo(table);
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
        jPanel13 = new javax.swing.JPanel();
        jTextFieldTimKiem = new javax.swing.JTextField();
        jButtonTimKiem = new javax.swing.JButton();
        jButtonLamMoi = new javax.swing.JButton();
        jLabelKetQua = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableThongTinLo = new javax.swing.JTable();
        btnExcel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonNhoMax = new javax.swing.JButton();
        jButtonNho = new javax.swing.JButton();
        jLabelTrang = new javax.swing.JLabel();
        jButtonLon = new javax.swing.JButton();
        jButtonLonMax = new javax.swing.JButton();
        jLabelSoTrang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lô Sản Phẩm");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Phần mềm quản lý kho nhà hàng 5 sao");

        jPanel13.setBackground(new java.awt.Color(0, 153, 153));
        jPanel13.setAlignmentX(0.2F);

        jTextFieldTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTimKiemActionPerformed(evt);
            }
        });
        jTextFieldTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldTimKiemKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTimKiemKeyReleased(evt);
            }
        });

        jButtonTimKiem.setBackground(new java.awt.Color(255, 255, 255));
        jButtonTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ImageIcon imgTimKiem = new ImageIcon(getClass().getResource("/icon/icons8-search.png"));
        ImageIcon ImgTimKiem = new ImageIcon(imgTimKiem.getImage().getScaledInstance(19, 19, Image.SCALE_SMOOTH));
        jButtonTimKiem.setIcon(ImgTimKiem);
        jButtonTimKiem.setText("Tìm kiếm");
        jButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimKiemActionPerformed(evt);
            }
        });

        jButtonLamMoi.setBackground(new java.awt.Color(255, 255, 255));
        jButtonLamMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ImageIcon imgLamMoi = new ImageIcon(getClass().getResource("/icon/icons8-synchronize-30.png"));
        ImageIcon ImgLamMoi = new ImageIcon(imgLamMoi.getImage().getScaledInstance(19, 19, Image.SCALE_SMOOTH));
        jButtonLamMoi.setIcon(ImgLamMoi);
        jButtonLamMoi.setText("Tải lại");
        jButtonLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLamMoiActionPerformed(evt);
            }
        });

        jLabelKetQua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelKetQua.setForeground(new java.awt.Color(255, 255, 255));
        jLabelKetQua.setText("Có tổng cộng 000 kết quả");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DANH SÁCH LÔ SẢN PHẨM");

        jTableThongTinLo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Lô", "SL Lô Ban Đầu", "Tên sản phẩm", "Ngày nhập", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableThongTinLo.setRowHeight(30);
        jTableThongTinLo.setRowSelectionAllowed(true);
        jTableThongTinLo.setAutoCreateRowSorter(true);
        jTableThongTinLo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableThongTinLoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableThongTinLo);
        if (jTableThongTinLo.getColumnModel().getColumnCount() > 0) {
            jTableThongTinLo.getColumnModel().getColumn(0).setMinWidth(70);
            jTableThongTinLo.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTableThongTinLo.getColumnModel().getColumn(0).setMaxWidth(70);
            jTableThongTinLo.getColumnModel().getColumn(1).setMinWidth(150);
            jTableThongTinLo.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTableThongTinLo.getColumnModel().getColumn(1).setMaxWidth(150);
            jTableThongTinLo.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTableThongTinLo.getColumnModel().getColumn(3).setMinWidth(150);
            jTableThongTinLo.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTableThongTinLo.getColumnModel().getColumn(3).setMaxWidth(150);
            jTableThongTinLo.getColumnModel().getColumn(4).setMinWidth(100);
            jTableThongTinLo.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTableThongTinLo.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        btnExcel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcel.setText("Excel");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jButtonLamMoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTimKiem))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelKetQua))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonTimKiem)
                    .addComponent(btnExcel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelKetQua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(329, 329, 329)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(329, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(545, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        // TODO add your handling code here:
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Danh sách lô sản phẩm");
        int rownum = 0;
        Cell cell;
        Row row;

        row = sheet.createRow(rownum);

        cell = row.createCell(0);
        cell.setCellValue("ID lô");

        cell = row.createCell(1);
        cell.setCellValue("SL lô ban đầu");

        cell = row.createCell(2);
        cell.setCellValue("Tên sản phẩm");

        cell = row.createCell(3);
        cell.setCellValue("Ngày nhập");

        for (int i = 0; i < DuLieuMau.size(); i++) {
            rownum++;
            row = sheet.createRow(rownum);
            //
            cell = row.createCell(0);
            cell.setCellValue(DuLieuMau.get(i).id_lo_sp);
            //
            cell = row.createCell(1);
            cell.setCellValue(DuLieuMau.get(i).so_luong_lo);
            //
            cell = row.createCell(2);
            cell.setCellValue(DuLieuMau.get(i).ten_sp);
            //
            cell = row.createCell(3);
            cell.setCellValue(DuLieuMau.get(i).thoi_gian_nhap);

        }
        File file = new File("C:/demo/lo_san_pham.xls");
        file.getParentFile().mkdirs();

        FileOutputStream outFile;
        try {
            outFile = new FileOutputStream(file);
            workbook.write(outFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(fNhacungcap.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(fNhacungcap.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(rootPane,
                "Đã lưu file Excel lo_san_pham trong C:/demo.",
                "Thông báo",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnExcelActionPerformed

    private void jTextFieldTimKiemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldTimKiemActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldTimKiemActionPerformed

    private void jTextFieldTimKiemKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextFieldTimKiemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            DanhSachXuatKho = DuLieuMau;
            FindList();
        } // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldTimKiemKeyPressed

    private void jTextFieldTimKiemKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextFieldTimKiemKeyReleased
        if ("".equals(jTextFieldTimKiem.getText())) {
            build();
        }
    }// GEN-LAST:event_jTextFieldTimKiemKeyReleased

    private void jButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonTimKiemActionPerformed
        DanhSachXuatKho = DuLieuMau;
        FindList();
        // TODO add your handling code here:
    }// GEN-LAST:event_jButtonTimKiemActionPerformed

    private void jButtonLamMoiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonLamMoiActionPerformed
        // invalidate();
        // validate();
        // repaint();
        DuLieuMau = BUS.busLoSanPham.getInstance().getListThongTinLo();
        build();
        // TODO add your handling code here:
    }// GEN-LAST:event_jButtonLamMoiActionPerformed

    private void jButtonNhoMaxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonNhoMaxActionPerformed
        Trang = 1;
        ArrayList<ThongTinLo> table = BUS.busLoSanPham.getInstance().get20LoSanPham(DanhSachXuatKho, Trang);
        listDanhSachThongTinLo(table);
        jLabelTrang.setText("1");
        jLabelSoTrang.setText("1/" + SoTrang);
    }// GEN-LAST:event_jButtonNhoMaxActionPerformed

    private void jButtonNhoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonNhoActionPerformed
        if (Trang > 1) {
            Trang--;
            ArrayList<ThongTinLo> table = BUS.busLoSanPham.getInstance().get20LoSanPham(DanhSachXuatKho, Trang);
            listDanhSachThongTinLo(table);
            jLabelTrang.setText("" + Trang);
            jLabelSoTrang.setText(Trang + "/" + SoTrang);
        }
    }// GEN-LAST:event_jButtonNhoActionPerformed

    private void jButtonLonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonLonActionPerformed
        if (Trang < SoTrang) {
            Trang++;
            ArrayList<ThongTinLo> table = BUS.busLoSanPham.getInstance().get20LoSanPham(DanhSachXuatKho, Trang);
            listDanhSachThongTinLo(table);
            jLabelTrang.setText("" + Trang);
            jLabelSoTrang.setText(Trang + "/" + SoTrang);
        }
    }// GEN-LAST:event_jButtonLonActionPerformed

    private void jButtonLonMaxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonLonMaxActionPerformed
        Trang = SoTrang;
        ArrayList<ThongTinLo> table = BUS.busLoSanPham.getInstance().get20LoSanPham(DanhSachXuatKho, Trang);
        listDanhSachThongTinLo(table);
        jLabelTrang.setText("" + SoTrang);
        jLabelSoTrang.setText(SoTrang + "/" + SoTrang);
    }// GEN-LAST:event_jButtonLonMaxActionPerformed

    private void jTableThongTinLoMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTableThongTinLoMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int selectedRowIndex = jTableThongTinLo.getSelectedRow();
            int id = jTableThongTinLo.getValueAt(selectedRowIndex, 0).hashCode();
            JFrame Xem = new fViewLoSanPham(id_nv, id);
            Xem.setVisible(true);
            // System.out.print("Nhap dup chuot");
        }
        // TODO add your handling code here:
    }// GEN-LAST:event_jTableThongTinLoMouseClicked

    public void listDanhSachThongTinLo(ArrayList<ThongTinLo> arr) {
        DefaultTableModel model = (DefaultTableModel) jTableThongTinLo.getModel();
        while (jTableThongTinLo.getRowCount() > 0) {
            model.removeRow(0);
        }
        arr.stream().forEach((item) -> {
            // ImageIcon icon = new ImageIcon(item.hinh_anh);
            LoSanPham losp = daoLoSanPham.getInstance().getLoSanPham(item.id_lo_sp);
            String trangThai;
            if (losp.id_ton_kho == 1) {
                trangThai = "Còn";
            } else {
                trangThai = "Hết";
            }
            model.addRow(new Object[]{item.id_lo_sp, item.so_luong_lo, item.ten_sp,
                DateTimeNow.getIntance().FormatDateViewTable(item.thoi_gian_nhap), trangThai});
        });
    }

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
            java.util.logging.Logger.getLogger(fLoSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fLoSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fLoSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fLoSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fLoSanPham(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton jButtonLamMoi;
    private javax.swing.JButton jButtonLon;
    private javax.swing.JButton jButtonLonMax;
    private javax.swing.JButton jButtonNho;
    private javax.swing.JButton jButtonNhoMax;
    private javax.swing.JButton jButtonTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelKetQua;
    private javax.swing.JLabel jLabelSoTrang;
    private javax.swing.JLabel jLabelTrang;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableThongTinLo;
    private javax.swing.JTextField jTextFieldTimKiem;
    // End of variables declaration//GEN-END:variables

}
