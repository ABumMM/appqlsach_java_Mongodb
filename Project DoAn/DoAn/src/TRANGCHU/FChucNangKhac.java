/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TRANGCHU;

import DANGNHAP.TAIKHOAN;
import NCCForm.FormNCC;
import PHIEUNHAP.FPhieuNhap;
import QuanLyNhanVien.QuanLyNhanVien;
import TAIKHOAN.FTK;
import TLForm.TLForm;
import doan.QLKH;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import BaoCaoForm.BCForm;
import KMForm.KMForm;
import SachForm.SachForm;

/**
 *
 * @author hoang
 */
public class FChucNangKhac extends javax.swing.JPanel {

    /**
     * Creates new form FChucNangKhac1
     */
    TAIKHOAN tk;
    public FChucNangKhac() {
        initComponents();
    }
     public FChucNangKhac(TAIKHOAN in_tk) {
        initComponents();
        tk = in_tk;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnView = new PanelBoder.PanelBoderFrm();
        panelBoderFrm2 = new PanelBoder.PanelBoderFrm();
        jLabel4 = new javax.swing.JLabel();
        panelBoderCircle1 = new PanelBoder.PanelBoderCircle();
        panelBoderCircle2 = new PanelBoder.PanelBoderCircle();
        jpnmenu = new PanelBoder.PanelBoderFrm();
        jpnNCC = new javax.swing.JPanel();
        jlbNCC = new javax.swing.JLabel();
        jpnPN = new javax.swing.JPanel();
        jlbPN = new javax.swing.JLabel();
        jpnKH = new javax.swing.JPanel();
        jlbKH = new javax.swing.JLabel();
        jpnTK = new javax.swing.JPanel();
        jlbTK = new javax.swing.JLabel();
        jpnNV = new javax.swing.JPanel();
        jlbNV = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnTLS = new javax.swing.JPanel();
        jlbTLS = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpnBC = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelBoderFrm5 = new PanelBoder.PanelBoderFrm();
        panelBoderFrm6 = new PanelBoder.PanelBoderFrm();

        setBackground(new java.awt.Color(255, 255, 255));

        jpnView.setBackground(new java.awt.Color(0, 51, 102));

        panelBoderFrm2.setBackground(new java.awt.Color(253, 240, 205));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CHỨC NĂNG QUẢN LÝ");

        panelBoderCircle1.setBackground(new java.awt.Color(0, 51, 102));
        panelBoderCircle1.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout panelBoderCircle1Layout = new javax.swing.GroupLayout(panelBoderCircle1);
        panelBoderCircle1.setLayout(panelBoderCircle1Layout);
        panelBoderCircle1Layout.setHorizontalGroup(
            panelBoderCircle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        panelBoderCircle1Layout.setVerticalGroup(
            panelBoderCircle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        panelBoderCircle2.setBackground(new java.awt.Color(0, 51, 102));
        panelBoderCircle2.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout panelBoderCircle2Layout = new javax.swing.GroupLayout(panelBoderCircle2);
        panelBoderCircle2.setLayout(panelBoderCircle2Layout);
        panelBoderCircle2Layout.setHorizontalGroup(
            panelBoderCircle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        panelBoderCircle2Layout.setVerticalGroup(
            panelBoderCircle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBoderFrm2Layout = new javax.swing.GroupLayout(panelBoderFrm2);
        panelBoderFrm2.setLayout(panelBoderFrm2Layout);
        panelBoderFrm2Layout.setHorizontalGroup(
            panelBoderFrm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoderFrm2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(panelBoderCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBoderCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        panelBoderFrm2Layout.setVerticalGroup(
            panelBoderFrm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoderFrm2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelBoderCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBoderFrm2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBoderFrm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBoderFrm2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(panelBoderCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jpnmenu.setBackground(new java.awt.Color(253, 240, 205));

        jpnNCC.setBackground(new java.awt.Color(255, 255, 255));
        jpnNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnNCCMouseClicked(evt);
            }
        });

        jlbNCC.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jlbNCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NCC.png"))); // NOI18N
        jlbNCC.setText("Nhà cung cấp");

        javax.swing.GroupLayout jpnNCCLayout = new javax.swing.GroupLayout(jpnNCC);
        jpnNCC.setLayout(jpnNCCLayout);
        jpnNCCLayout.setHorizontalGroup(
            jpnNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNCCLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbNCC)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jpnNCCLayout.setVerticalGroup(
            jpnNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNCCLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbNCC)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpnPN.setBackground(new java.awt.Color(255, 255, 255));
        jpnPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnPNMouseClicked(evt);
            }
        });

        jlbPN.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jlbPN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PN.png"))); // NOI18N
        jlbPN.setText("Phiếu nhập sách");

        javax.swing.GroupLayout jpnPNLayout = new javax.swing.GroupLayout(jpnPN);
        jpnPN.setLayout(jpnPNLayout);
        jpnPNLayout.setHorizontalGroup(
            jpnPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbPN, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnPNLayout.setVerticalGroup(
            jpnPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPNLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbPN)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpnKH.setBackground(new java.awt.Color(255, 255, 255));
        jpnKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnKHMouseClicked(evt);
            }
        });

        jlbKH.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jlbKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/KH.png"))); // NOI18N
        jlbKH.setText("Khách hàng");

        javax.swing.GroupLayout jpnKHLayout = new javax.swing.GroupLayout(jpnKH);
        jpnKH.setLayout(jpnKHLayout);
        jpnKHLayout.setHorizontalGroup(
            jpnKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKHLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbKH, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnKHLayout.setVerticalGroup(
            jpnKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKHLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbKH)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpnTK.setBackground(new java.awt.Color(255, 255, 255));
        jpnTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnTKMouseClicked(evt);
            }
        });

        jlbTK.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jlbTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TK.png"))); // NOI18N
        jlbTK.setText("Tài khoản");

        javax.swing.GroupLayout jpnTKLayout = new javax.swing.GroupLayout(jpnTK);
        jpnTK.setLayout(jpnTKLayout);
        jpnTKLayout.setHorizontalGroup(
            jpnTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTK, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTKLayout.setVerticalGroup(
            jpnTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTKLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbTK)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpnNV.setBackground(new java.awt.Color(255, 255, 255));
        jpnNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnNVMouseClicked(evt);
            }
        });

        jlbNV.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jlbNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nv.png"))); // NOI18N
        jlbNV.setText("Nhân viên");

        javax.swing.GroupLayout jpnNVLayout = new javax.swing.GroupLayout(jpnNV);
        jpnNV.setLayout(jpnNVLayout);
        jpnNVLayout.setHorizontalGroup(
            jpnNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNVLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbNV, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jpnNVLayout.setVerticalGroup(
            jpnNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNVLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbNV)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QLSach.png"))); // NOI18N
        jLabel1.setText("Sách");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jpnTLS.setBackground(new java.awt.Color(255, 255, 255));
        jpnTLS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnTLSMouseClicked(evt);
            }
        });

        jlbTLS.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jlbTLS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TLoai.png"))); // NOI18N
        jlbTLS.setText("Thể loại sách");

        javax.swing.GroupLayout jpnTLSLayout = new javax.swing.GroupLayout(jpnTLS);
        jpnTLS.setLayout(jpnTLSLayout);
        jpnTLSLayout.setHorizontalGroup(
            jpnTLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTLSLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbTLS, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTLSLayout.setVerticalGroup(
            jpnTLSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTLSLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbTLS)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QLKM.png"))); // NOI18N
        jLabel3.setText("Khuyến mãi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jpnBC.setBackground(new java.awt.Color(255, 255, 255));
        jpnBC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnBCMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BaoCao.png"))); // NOI18N
        jLabel6.setText("Báo cáo, thống kê");

        javax.swing.GroupLayout jpnBCLayout = new javax.swing.GroupLayout(jpnBC);
        jpnBC.setLayout(jpnBCLayout);
        jpnBCLayout.setHorizontalGroup(
            jpnBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jpnBCLayout.setVerticalGroup(
            jpnBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBCLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(15, 15, 15))
        );

        panelBoderFrm5.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout panelBoderFrm5Layout = new javax.swing.GroupLayout(panelBoderFrm5);
        panelBoderFrm5.setLayout(panelBoderFrm5Layout);
        panelBoderFrm5Layout.setHorizontalGroup(
            panelBoderFrm5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelBoderFrm5Layout.setVerticalGroup(
            panelBoderFrm5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        panelBoderFrm6.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout panelBoderFrm6Layout = new javax.swing.GroupLayout(panelBoderFrm6);
        panelBoderFrm6.setLayout(panelBoderFrm6Layout);
        panelBoderFrm6Layout.setHorizontalGroup(
            panelBoderFrm6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelBoderFrm6Layout.setVerticalGroup(
            panelBoderFrm6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnmenuLayout = new javax.swing.GroupLayout(jpnmenu);
        jpnmenu.setLayout(jpnmenuLayout);
        jpnmenuLayout.setHorizontalGroup(
            jpnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnmenuLayout.createSequentialGroup()
                        .addGroup(jpnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelBoderFrm6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelBoderFrm5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnmenuLayout.createSequentialGroup()
                        .addGap(0, 143, Short.MAX_VALUE)
                        .addGroup(jpnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnmenuLayout.createSequentialGroup()
                                .addComponent(jpnKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jpnTLS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jpnTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnmenuLayout.createSequentialGroup()
                                .addComponent(jpnNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jpnNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnmenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpnBC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jpnPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jpnmenuLayout.setVerticalGroup(
            jpnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnmenuLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jpnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnTLS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(panelBoderFrm5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jpnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(panelBoderFrm6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnBC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBoderFrm2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBoderFrm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jpnKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnKHMouseClicked
        // TODO add your handling code here:
        jpnKH.setBackground(new Color(96, 100, 191));
        jlbKH.setBackground(new Color(96, 100, 191));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(new QLKH().getJPN());
        jpnView.validate();
        jpnView.repaint();
    }//GEN-LAST:event_jpnKHMouseClicked

    private void jpnNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnNVMouseClicked
        // TODO add your handling code here:
        if(tk.getLoaiTK().equals("Quản lý"));
        else{
            JOptionPane.showMessageDialog(this, "Bạn không có quyền sử dụng chức năng này.");
            return;
        }
        jpnNV.setBackground(new Color(96, 100, 191));
        jlbNV.setBackground(new Color(96, 100, 191));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(new QuanLyNhanVien().getJPN());
        jpnView.validate();
        jpnView.repaint();
    }//GEN-LAST:event_jpnNVMouseClicked

    private void jpnTLSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnTLSMouseClicked
        // TODO add your handling code here:
        jpnTLS.setBackground(new Color(96, 100, 191));
        jlbTLS.setBackground(new Color(96, 100, 191));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(new TLForm().getJPN());
        jpnView.validate();
        jpnView.repaint();
    }//GEN-LAST:event_jpnTLSMouseClicked

    private void jpnNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnNCCMouseClicked
        // TODO add your handling code here:
        jpnNCC.setBackground(new Color(96, 100, 191));
        jlbNCC.setBackground(new Color(96, 100, 191));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(new FormNCC().getJPN());
        jpnView.validate();
        jpnView.repaint();
    }//GEN-LAST:event_jpnNCCMouseClicked

    private void jpnPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnPNMouseClicked
        // TODO add your handling code here:
        jpnPN.setBackground(new Color(96, 100, 191));
        jlbPN.setBackground(new Color(96, 100, 191));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(new FPhieuNhap(tk).getJPN());
        jpnView.validate();
        jpnView.repaint();
    }//GEN-LAST:event_jpnPNMouseClicked

    private void jpnTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnTKMouseClicked
        // TODO add your handling code here:
        if(tk.getLoaiTK().equals("Quản lý"));
        else{
            JOptionPane.showMessageDialog(this, "Bạn không có quyền sử dụng chức năng này.");
            return;
        }
        jpnTK.setBackground(new Color(96, 100, 191));
        jlbTK.setBackground(new Color(96, 100, 191));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(new FTK().getJPN());
        jpnView.validate();
        jpnView.repaint();
    }//GEN-LAST:event_jpnTKMouseClicked

    private void jpnBCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnBCMouseClicked
        // TODO add your handling code here:
        if(tk.getLoaiTK().equals("Quản lý"));
        else{
            JOptionPane.showMessageDialog(this, "Bạn không có quyền sử dụng chức năng này.");
            return;
        }
        jpnTLS.setBackground(new Color(96, 100, 191));
        jlbTLS.setBackground(new Color(96, 100, 191));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(new BCForm().getJPN());
        jpnView.validate();
        jpnView.repaint();
    }//GEN-LAST:event_jpnBCMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        jpnTK.setBackground(new Color(96, 100, 191));
        jlbTK.setBackground(new Color(96, 100, 191));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(new SachForm().getJPN());
        jpnView.validate();
        jpnView.repaint();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        if(tk.getLoaiTK().equals("Quản lý"));
        else{
            JOptionPane.showMessageDialog(this, "Bạn không có quyền sử dụng chức năng này.");
            return;
        }
        jpnTLS.setBackground(new Color(96, 100, 191));
        jlbTLS.setBackground(new Color(96, 100, 191));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(new KMForm());
        jpnView.validate();
        jpnView.repaint();
    }//GEN-LAST:event_jPanel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlbKH;
    private javax.swing.JLabel jlbNCC;
    private javax.swing.JLabel jlbNV;
    private javax.swing.JLabel jlbPN;
    private javax.swing.JLabel jlbTK;
    private javax.swing.JLabel jlbTLS;
    private javax.swing.JPanel jpnBC;
    private javax.swing.JPanel jpnKH;
    private javax.swing.JPanel jpnNCC;
    private javax.swing.JPanel jpnNV;
    private javax.swing.JPanel jpnPN;
    private javax.swing.JPanel jpnTK;
    private javax.swing.JPanel jpnTLS;
    private PanelBoder.PanelBoderFrm jpnView;
    private PanelBoder.PanelBoderFrm jpnmenu;
    private PanelBoder.PanelBoderCircle panelBoderCircle1;
    private PanelBoder.PanelBoderCircle panelBoderCircle2;
    private PanelBoder.PanelBoderFrm panelBoderFrm2;
    private PanelBoder.PanelBoderFrm panelBoderFrm5;
    private PanelBoder.PanelBoderFrm panelBoderFrm6;
    // End of variables declaration//GEN-END:variables
}
