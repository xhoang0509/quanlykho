/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.NhanVien;
import DTO.TaiKhoan;
import GROUP.JPanelBaoCao;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.UIManager;
import java.lang.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author Xoan Tran
 */
public class fHome extends javax.swing.JFrame {

    /**
     * Creates new form fHome
     */
    JPanelBaoCao PanelBaoCaoMau;
    public int id_nv;
    public ScheduledThreadPoolExecutor exec = new ScheduledThreadPoolExecutor(1);
    public fThongBaoChuan ThongBao;
    public Thread running;
    public int TocDoLoading = 10;
    public Thread loading = new Thread() {
        public synchronized void run() {
            for (int i = 0; i <= 100; i++) {
                final int percent = i;
                SwingUtilities.invokeLater(new Runnable() {
                    public synchronized void run() {
                        //System.out.println(percent);
                        jProgressBar1.setValue(percent);
                    }
                });

                try {
                    Thread.sleep(TocDoLoading);
                } catch (InterruptedException e) {
                }
                if (jProgressBar1.getValue() == 100) {
                    //System.out.println("Dừng thread");
                    synchronized (running) {
                        running.notify();
                    }
                    Thread.interrupted();
                }
            }

        }
    };

    public fHome() {

    }

    public fHome(int id_nv) {
        this.id_nv = id_nv;
        //this.PanelBaoCaoMau = DataBaoCao;
        initComponents();
        setIcon();
        ThongBao = new fThongBaoChuan(id_nv);
        ThongBao.setVisible(false);
        exec.scheduleAtFixedRate(new Runnable() {
            public void run() {
                //System.out.println("5 giây đã trôi qua :))");
                checkThongBao();
                // code to execute repeatedly
            }
        }, 0, 5, TimeUnit.SECONDS);
        build();
        
        //System.out.println("xong");
//        new java.util.Timer().schedule( 
//            new java.util.TimerTask() {
//                @Override
//                public void run() {
//                    //PanelBaoCaoMau = new JPanelBaoCao();
//                    //PanelBaoCaoMau.Run();
//                    //System.out.println(".run()");
//                }
//            }, 
//        4000 
//        );
    }
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Logo2.png")));
    }
    
    public void checkThongBao() {
        ThongBao.build();
        if (ThongBao.DanhSachHSD.isEmpty() && ThongBao.DanhSachSoLuong.isEmpty()) {
        } else {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxNhanVien = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jButtonXuatKhoUp = new javax.swing.JButton();
        jButtonKiemKeUp = new javax.swing.JButton();
        jButtonThongTinLo = new javax.swing.JButton();
        jButtonNhapHang = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jComboBoxConTrolNhanVien = new javax.swing.JComboBox<>();
        jComboBoxTonKho = new javax.swing.JComboBox<>();
        jComboBoxDiaDiem = new javax.swing.JComboBox<>();
        jComboBoxSanPham = new javax.swing.JComboBox<>();
        jComboBoxConTrolNhaCungCap = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Màn hình chính");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Phần mềm quản lý kho nhà hàng 5 sao");

        jComboBoxNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNhanVienActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jButtonXuatKhoUp.setBackground(new java.awt.Color(255, 255, 255));
        jButtonXuatKhoUp.setForeground(new java.awt.Color(255, 255, 255));
        jButtonXuatKhoUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-checkout.png"))); // NOI18N
        jButtonXuatKhoUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonXuatKhoUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonXuatKhoUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonXuatKhoUpMouseExited(evt);
            }
        });
        jButtonXuatKhoUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXuatKhoUpActionPerformed(evt);
            }
        });

        jButtonKiemKeUp.setBackground(new java.awt.Color(255, 255, 255));
        jButtonKiemKeUp.setForeground(new java.awt.Color(255, 255, 255));
        jButtonKiemKeUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-pos-terminal.png"))); // NOI18N
        jButtonKiemKeUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonKiemKeUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonKiemKeUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonKiemKeUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonKiemKeUpMouseExited(evt);
            }
        });
        jButtonKiemKeUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKiemKeUpActionPerformed(evt);
            }
        });

        jButtonThongTinLo.setBackground(new java.awt.Color(255, 255, 255));
        jButtonThongTinLo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonThongTinLo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-transaction-list-100.png"))); // NOI18N
        jButtonThongTinLo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonThongTinLo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonThongTinLoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonThongTinLoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonThongTinLoMouseExited(evt);
            }
        });
        jButtonThongTinLo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThongTinLoActionPerformed(evt);
            }
        });

        jButtonNhapHang.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNhapHang.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-warehouse.png"))); // NOI18N
        jButtonNhapHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNhapHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonNhapHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonNhapHangMouseExited(evt);
            }
        });
        jButtonNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNhapHangActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Small", 3, 24)); // NOI18N
        jLabel3.setText("Thông tin lô");

        jLabel4.setFont(new java.awt.Font("Sitka Small", 3, 24)); // NOI18N
        jLabel4.setText("Nhập kho");

        jLabel5.setFont(new java.awt.Font("Sitka Small", 3, 24)); // NOI18N
        jLabel5.setText("Xuất kho");

        jLabel7.setFont(new java.awt.Font("Sitka Small", 3, 24)); // NOI18N
        jLabel7.setText("Kiểm kê");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jComboBoxConTrolNhanVien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxConTrolNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Nhân Viên --", "- Danh sách -", "- Thêm mới -" }));
        jComboBoxConTrolNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxConTrolNhanVienActionPerformed(evt);
            }
        });

        jComboBoxTonKho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxTonKho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Tồn Kho --", "- Kiểm tra tồn kho -" }));
        jComboBoxTonKho.setBorder(null);
        jComboBoxTonKho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBoxTonKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTonKhoActionPerformed(evt);
            }
        });

        jComboBoxDiaDiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxDiaDiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Địa Điểm --", "- Khu vực -", "- Thêm khu vực -" }));
        jComboBoxDiaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDiaDiemActionPerformed(evt);
            }
        });

        jComboBoxSanPham.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Sản Phẩm --", "- Danh Sách Sản Phẩm -" }));
        jComboBoxSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSanPhamActionPerformed(evt);
            }
        });

        jComboBoxConTrolNhaCungCap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxConTrolNhaCungCap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Nhà Cung Cấp --", "- Danh Sách -", "- Thêm Mới -" }));
        jComboBoxConTrolNhaCungCap.setToolTipText("");
        jComboBoxConTrolNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxConTrolNhaCungCapActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setText("Nhà hàng 5 sao");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxSanPham, 0, 200, Short.MAX_VALUE)
                            .addComponent(jComboBoxDiaDiem, 0, 200, Short.MAX_VALUE)
                            .addComponent(jComboBoxTonKho, 0, 200, Short.MAX_VALUE)
                            .addComponent(jComboBoxConTrolNhanVien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxConTrolNhaCungCap, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jComboBoxTonKho, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxDiaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxConTrolNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxConTrolNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jComboBoxTonKho.getAccessibleContext().setAccessibleName("");

        jProgressBar1.setToolTipText("");
        jProgressBar1.setOpaque(true);
        jProgressBar1.setValue(0);
        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel7))
                            .addComponent(jButtonKiemKeUp, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonThongTinLo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel3)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel5))
                            .addComponent(jButtonXuatKhoUp, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonKiemKeUp, jButtonNhapHang, jButtonThongTinLo, jButtonXuatKhoUp});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonXuatKhoUp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel3)))
                        .addGap(26, 26, 26)
                        .addComponent(jButtonKiemKeUp))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonThongTinLo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonKiemKeUp, jButtonNhapHang, jButtonThongTinLo, jButtonXuatKhoUp});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNhanVienActionPerformed
        String valueIn = String.valueOf(jComboBoxNhanVien.getSelectedItem());
        if ("Thoát".equals(valueIn)) {
            JFrame dn = new fDangNhap();
            dn.setVisible(true);
            dispose();
        }
        if ("Đổi mật khẩu".equals(valueIn)) {
            JFrame reset = new fResetPass(id_nv);
            reset.setVisible(true);
            //dispose();
        }
        if ("Thông tin".equals(valueIn)) {
            JFrame nv = new fViewNhanVien(id_nv,1);
            nv.setVisible(true);
            //dispose();
        }
    }//GEN-LAST:event_jComboBoxNhanVienActionPerformed

    private void jButtonNhapHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNhapHangMouseClicked
//           JFrame DanhSach = new fDanhSach_NhapHang(id_nv);
//           DanhSach.setVisible(true);
    }//GEN-LAST:event_jButtonNhapHangMouseClicked

    private void jButtonThongTinLoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonThongTinLoMouseEntered
        jButtonThongTinLo.setBackground(UIManager.getColor("control"));
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonThongTinLoMouseEntered

    private void jButtonThongTinLoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonThongTinLoMouseExited
        jButtonThongTinLo.setBackground(Color.WHITE);
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonThongTinLoMouseExited

    private void jButtonKiemKeUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonKiemKeUpMouseEntered
        jButtonKiemKeUp.setBackground(UIManager.getColor("control"));
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonKiemKeUpMouseEntered

    private void jButtonKiemKeUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonKiemKeUpMouseExited
        jButtonKiemKeUp.setBackground(Color.WHITE);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonKiemKeUpMouseExited

    private void jButtonNhapHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNhapHangMouseEntered
        jButtonNhapHang.setBackground(UIManager.getColor("control"));
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonNhapHangMouseEntered

    private void jButtonNhapHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNhapHangMouseExited
        jButtonNhapHang.setBackground(Color.WHITE);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNhapHangMouseExited

    private void jButtonXuatKhoUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonXuatKhoUpMouseEntered
        jButtonXuatKhoUp.setBackground(UIManager.getColor("control"));
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonXuatKhoUpMouseEntered

    private void jButtonXuatKhoUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonXuatKhoUpMouseExited
        jButtonXuatKhoUp.setBackground(Color.WHITE);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonXuatKhoUpMouseExited

    private void jButtonKiemKeUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonKiemKeUpMouseClicked
        TocDoLoading = 5;
        running = new Thread() {
            public synchronized void run() {
                JFrame kiemke = new fKiemKe(id_nv);
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(fHome.class.getName()).log(Level.SEVERE, null, ex);
                }
                kiemke.setVisible(true);
                jProgressBar1.setValue(0);
            }
        };
        Thread t = new Thread(loading);
        t.start();
        running.start();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonKiemKeUpMouseClicked

    private void jButtonThongTinLoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThongTinLoActionPerformed
        TocDoLoading = 5;
        running = new Thread() {
            public synchronized void run() {
                JFrame Lo = new fLoSanPham(id_nv);
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(fHome.class.getName()).log(Level.SEVERE, null, ex);
                }
                Lo.setVisible(true);
                jProgressBar1.setValue(0);
            }
        };
        Thread t = new Thread(loading);
        t.start();
        running.start();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonThongTinLoActionPerformed

    private void jButtonKiemKeUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKiemKeUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonKiemKeUpActionPerformed

    private void jButtonThongTinLoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonThongTinLoMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonThongTinLoMouseClicked

    private void jComboBoxConTrolNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxConTrolNhanVienActionPerformed
        String valueIn = String.valueOf(jComboBoxConTrolNhanVien.getSelectedItem());
        if ("- Danh sách -".equals(valueIn)) {
            JFrame nv = new fNhanVien(id_nv);
            nv.setVisible(true);
        }
    }//GEN-LAST:event_jComboBoxConTrolNhanVienActionPerformed

    private void jComboBoxTonKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTonKhoActionPerformed
        String valueIn = String.valueOf(jComboBoxTonKho.getSelectedItem());
        if ("- Kiểm tra tồn kho -".equals(valueIn)) {
            JFrame tk = new fTonKho(id_nv);
            tk.setVisible(true);
        }
    }//GEN-LAST:event_jComboBoxTonKhoActionPerformed

    private void jComboBoxDiaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDiaDiemActionPerformed
        String valueIn = String.valueOf(jComboBoxDiaDiem.getSelectedItem());
        if ("- Khu vực -".equals(valueIn)) {
            JFrame kv = new fKhuVuc(id_nv);
            kv.setVisible(true);
        }
    }//GEN-LAST:event_jComboBoxDiaDiemActionPerformed

    private void jComboBoxSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSanPhamActionPerformed
        String valueIn = String.valueOf(jComboBoxSanPham.getSelectedItem());
        if ("- Danh Sách Sản Phẩm -".equals(valueIn)) {
            JFrame sp = new fSanPham();
            sp.setVisible(true);
        }
    }//GEN-LAST:event_jComboBoxSanPhamActionPerformed

    private void jButtonNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNhapHangActionPerformed
        TocDoLoading = 5;
        running = new Thread() {
            public synchronized void run() {
                JFrame DanhSach = new fDanhSach_NhapHang(id_nv);
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(fHome.class.getName()).log(Level.SEVERE, null, ex);
                }
                DanhSach.setVisible(true);
                jProgressBar1.setValue(0);
            }
        };
        Thread t = new Thread(loading);
        t.start();
        running.start();


    }//GEN-LAST:event_jButtonNhapHangActionPerformed

    private void jButtonXuatKhoUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXuatKhoUpActionPerformed
        TocDoLoading = 5;
        running = new Thread() {
            public synchronized void run() {
                JFrame XuatKho = new fXuat_Kho(id_nv);
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(fHome.class.getName()).log(Level.SEVERE, null, ex);
                }
                XuatKho.setVisible(true);
                jProgressBar1.setValue(0);
            }
        };
        Thread t = new Thread(loading);
        t.start();
        running.start();


    }//GEN-LAST:event_jButtonXuatKhoUpActionPerformed

    private void jComboBoxConTrolNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxConTrolNhaCungCapActionPerformed
        String valueIn = String.valueOf(jComboBoxConTrolNhaCungCap.getSelectedItem());
        if ("- Danh Sách -".equals(valueIn)) {
            JFrame ncc = new fNhacungcap(id_nv);
            ncc.setVisible(true);
        }
        if ("- Thêm Mới -".equals(valueIn)) {
            JFrame Them = new fCreateNhaCungCap(id_nv);
            Them.setVisible(true);
        }
    }//GEN-LAST:event_jComboBoxConTrolNhaCungCapActionPerformed

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
            java.util.logging.Logger.getLogger(fHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fHome(1).setVisible(true);

            }
        });
    }

    void build() {
        //Timer();
        NhanVienDangNhap();

    }

    public void NhanVienDangNhap() {
        if (id_nv != 0) {
            TaiKhoan tk = DAO.daoTaiKhoan.getInstance().getTaiKhoan(id_nv);
            NhanVien nv = DAO.daoTaiKhoan.getInstance().getNhanVien(tk.id_nv);
            jComboBoxNhanVien.addItem(nv.ten_nv);
            jComboBoxNhanVien.addItem("Thông tin");
            jComboBoxNhanVien.addItem("Đổi mật khẩu");
            jComboBoxNhanVien.addItem("Thoát");
            
        } else {
            jComboBoxNhanVien.addItem("Chưa đăng nhập");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonKiemKeUp;
    private javax.swing.JButton jButtonNhapHang;
    private javax.swing.JButton jButtonThongTinLo;
    private javax.swing.JButton jButtonXuatKhoUp;
    private javax.swing.JComboBox<String> jComboBoxConTrolNhaCungCap;
    private javax.swing.JComboBox<String> jComboBoxConTrolNhanVien;
    private javax.swing.JComboBox<String> jComboBoxDiaDiem;
    private javax.swing.JComboBox<String> jComboBoxNhanVien;
    private javax.swing.JComboBox<String> jComboBoxSanPham;
    private javax.swing.JComboBox<String> jComboBoxTonKho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
