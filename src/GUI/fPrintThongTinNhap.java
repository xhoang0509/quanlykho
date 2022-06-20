/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GROUP.ThongTinNhap;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.lang.*;

/**
 *
 * @author admin
 */
public class fPrintThongTinNhap extends javax.swing.JFrame {

    /**
     * Creates new form fPrintThongTinNhap
     */
    public ThongTinNhap nhap;
    public fPrintThongTinNhap() {
        initComponents();
        setIcon();
    }
    public fPrintThongTinNhap(ThongTinNhap nhap) {
        initComponents();
        setIcon();
        this.nhap = nhap;
        build();
    }
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Logo2.png")));
    }
    void build(){
        jLabelTenSP.setText(jLabelTenSP.getText() + " " + nhap.ten_sp);
        jLabelLoaiSP.setText(jLabelLoaiSP.getText() + " " + nhap.ten_loai_sp);
        jLabelDonVi.setText(jLabelDonVi.getText() + " " + nhap.dvt);
        jLabelsoluongsp.setText(jLabelsoluongsp.getText() + " " + nhap.so_luong_sp);
        jLabelgiatiensanpham.setText(jLabelgiatiensanpham.getText() + " " + nhap.so_tien_sp);
        //
        jLabelhansudung.setText(jLabelhansudung.getText() + " " + nhap.hsd);
        jLabelngaysanxuat.setText(jLabelngaysanxuat.getText() + " " + nhap.nsx);
        jLabelsoluonglo.setText(jLabelsoluonglo.getText() + " " + nhap.so_luong_lo);
        jLabelgiatienlo.setText(jLabelgiatienlo.getText() + " " + nhap.so_tien_lo);
        //
        jLabelnhacungcap.setText(jLabelnhacungcap.getText() + " " + nhap.ten_nha_cc);
        jLabelsodienthoai.setText(jLabelsodienthoai.getText() + " " + nhap.sdt_nguon_cc);
        jLabeldiachi.setText(jLabeldiachi.getText() + " " + nhap.dia_chi);
        jLabelemail.setText(jLabelemail.getText() + " " + nhap.email);
        //
        jLabelnhanvien.setText(jLabelnhanvien.getText() + " " + nhap.ten_nv);
        jLabelthoigian.setText(jLabelthoigian.getText() + " " + nhap.thoi_gian);
        jLabelsophieunhap.setText(jLabelsophieunhap.getText() + " " + nhap.id_phieu_nhap);
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelsophieunhap = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabelnhanvien = new javax.swing.JLabel();
        jLabelthoigian = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanelControl = new javax.swing.JPanel();
        jButtonPrint = new javax.swing.JButton();
        jButtonThoat = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabelTenSP = new javax.swing.JLabel();
        jLabelLoaiSP = new javax.swing.JLabel();
        jLabelDonVi = new javax.swing.JLabel();
        jLabelsoluongsp = new javax.swing.JLabel();
        jLabelgiatiensanpham = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabelhansudung = new javax.swing.JLabel();
        jLabelngaysanxuat = new javax.swing.JLabel();
        jLabelsoluonglo = new javax.swing.JLabel();
        jLabelgiatienlo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabelnhacungcap = new javax.swing.JLabel();
        jLabeldiachi = new javax.swing.JLabel();
        jLabelsodienthoai = new javax.swing.JLabel();
        jLabelemail = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("In Thông Tin Phiếu Nhập");
        setResizable(false);

        jPanelHeader.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("PHIẾU NHẬP KHO");

        jLabelsophieunhap.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelsophieunhap.setText("Số: ");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel9.setText("NHÀ HÀNG 5 SAO");

        jLabelnhanvien.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelnhanvien.setText("Nhân viên :");

        jLabelthoigian.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelthoigian.setText("Thời gian :");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(162, 162, 162)))
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelthoigian, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelsophieunhap, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelnhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addComponent(jLabelsophieunhap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelnhanvien)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelthoigian))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanelControl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonPrint.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonPrint.setText("In");
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });

        jButtonThoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonThoat.setText("Thoát");
        jButtonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelControlLayout = new javax.swing.GroupLayout(jPanelControl);
        jPanelControl.setLayout(jPanelControlLayout);
        jPanelControlLayout.setHorizontalGroup(
            jPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonThoat, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelControlLayout.setVerticalGroup(
            jPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelControlLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrint)
                    .addComponent(jButtonThoat))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Sản Phẩm");

        jLabelTenSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTenSP.setText("Tên :");

        jLabelLoaiSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelLoaiSP.setText("Loại :");

        jLabelDonVi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDonVi.setText("Đơn vị :");

        jLabelsoluongsp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelsoluongsp.setText("Số lượng trong một lô :");

        jLabelgiatiensanpham.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelgiatiensanpham.setText("Giá Thành theo đơn vị :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                .addGap(63, 63, 63)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelsoluongsp, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(196, 196, 196))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelgiatiensanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(301, 301, 301))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabelTenSP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelLoaiSP)
                        .addComponent(jLabelsoluongsp))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDonVi)
                    .addComponent(jLabelgiatiensanpham))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Lô SP");

        jLabelhansudung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelhansudung.setText("Hạn sử dụng :");

        jLabelngaysanxuat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelngaysanxuat.setText("Ngày sản xuất :");

        jLabelsoluonglo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelsoluonglo.setText("Số lượng lô hàng :");

        jLabelgiatienlo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelgiatienlo.setText("Giá thành theo lô :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelngaysanxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelhansudung, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelsoluonglo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelgiatienlo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabelhansudung)
                    .addComponent(jLabelsoluonglo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelngaysanxuat)
                        .addComponent(jLabelgiatienlo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Cung Cấp");

        jLabelnhacungcap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelnhacungcap.setText("Nhà cung cấp :");

        jLabeldiachi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabeldiachi.setText("Địa chỉ :");

        jLabelsodienthoai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelsodienthoai.setText("Số điện thoại :");

        jLabelemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelemail.setText("Email :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabelsodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelnhacungcap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabeldiachi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabelnhacungcap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeldiachi)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelemail)
                    .addComponent(jLabelsodienthoai))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jPanelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        jPanelControl.setVisible(false);

//        PrinterJob job = PrinterJob.getPrinterJob();
//        job.setJobName("Print Data");
//
//        job.setPrintable(new Printable(){
//            public int print(Graphics pg,PageFormat pf, int pageNum){
//                pf.setOrientation(PageFormat.LANDSCAPE);
//                if(pageNum>0){
//                    return Printable.NO_SUCH_PAGE;
//                }
//
//                Graphics2D g2 = (Graphics2D)pg;
//                g2.translate(pf.getImageableX(), pf.getImageableY());
//                g2.scale(0.86,0.86);
//                //jPanel1.paint(g2);
//                //
//
//                return Printable.PAGE_EXISTS;
//
//            }
//
//        });
//
//        boolean ok = job.printDialog();
//        if(ok){
//            try{
//
//                job.print();
//            }
//            catch (PrinterException ex){}
//        }
//        dispose();
        // TODO add your handling code here:
        
        JFrame frame = new JFrame("TheFrame");
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);

        try
        {
            BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics2D = image.createGraphics();
            frame.paint(graphics2D);
            ImageIO.write(image,"jpeg", new File("/home/deniz/Desktop/jmemPractice.jpeg"));
        }
        catch(Exception exception)
        {
            
        }
            //code
    }//GEN-LAST:event_jButtonPrintActionPerformed

    private void jButtonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThoatActionPerformed
        //dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonThoatActionPerformed

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
            java.util.logging.Logger.getLogger(fPrintThongTinNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fPrintThongTinNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fPrintThongTinNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fPrintThongTinNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fPrintThongTinNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDonVi;
    private javax.swing.JLabel jLabelLoaiSP;
    private javax.swing.JLabel jLabelTenSP;
    private javax.swing.JLabel jLabeldiachi;
    private javax.swing.JLabel jLabelemail;
    private javax.swing.JLabel jLabelgiatienlo;
    private javax.swing.JLabel jLabelgiatiensanpham;
    private javax.swing.JLabel jLabelhansudung;
    private javax.swing.JLabel jLabelngaysanxuat;
    private javax.swing.JLabel jLabelnhacungcap;
    private javax.swing.JLabel jLabelnhanvien;
    private javax.swing.JLabel jLabelsodienthoai;
    private javax.swing.JLabel jLabelsoluonglo;
    private javax.swing.JLabel jLabelsoluongsp;
    private javax.swing.JLabel jLabelsophieunhap;
    private javax.swing.JLabel jLabelthoigian;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelControl;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
