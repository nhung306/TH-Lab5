package Manegement;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CategoryForm extends javax.swing.JFrame {
    public CategoryForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        txtGiaban = new javax.swing.JTextField();
        txtTenSP = new javax.swing.JTextField();
        cmbLoaiSP = new javax.swing.JComboBox<>();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabSanpham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý danh mục sản phẩm");
        setBackground(new java.awt.Color(153, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("QUẢN LÝ DANH MỤC SẢN PHẨM");

        jLabel2.setText("Mã sản phẩm:");

        jLabel3.setText("Giá bán:");

        jLabel4.setText("Tên sản phẩm:");

        jLabel5.setText("Loại sản phẩm:");

        cmbLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnInsert.setText("Thêm mới");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setText("Thoát");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jtabSanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Giá bán", "Tên loại", "Mã loại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtabSanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabSanphamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtabSanpham);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaSP)
                            .addComponent(txtGiaban)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsert)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(cmbLoaiSP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(177, 177, 177))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txtGiaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnCancel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            System.out.println("Window Opened Event");
            BinLoaiSP();
            BinJTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jtabSanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabSanphamMouseClicked
        try{
            DefaultTableModel model = (DefaultTableModel)jtabSanpham.getModel();
            
            int row = jtabSanpham.getSelectedRow();
            txtMaSP.setText(model.getValueAt(row,0).toString());
            txtTenSP.setText(model.getValueAt(row, 1).toString());
            txtGiaban.setText(model.getValueAt(row, 2).toString());
            
            LoaiSanPham temp = new LoaiSanPham(model.getValueAt(row, 4).toString(),model.getValueAt(row, 3).toString());
            ArrayList<LoaiSanPham> listLoaiSP = LoaiSanPham.GetListLoaiSanPham();
            for(int i= 0; i< listLoaiSP.size(); i++){
                if(listLoaiSP.get(i).MaLoai.equals(temp.MaLoai)){
                    cmbLoaiSP.setSelectedIndex(i);
                    break;
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jtabSanphamMouseClicked

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
       try{
           SanPham temp = GetSP();
           temp.Insert();
           BinJTable();
           JOptionPane.showMessageDialog(this, "Them moi thanh cong", "Thong bao", JOptionPane.INFORMATION_MESSAGE);
           
       }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try{
           SanPham temp = GetSP();
           temp.Update();
           BinJTable();
           JOptionPane.showMessageDialog(this, "Chinh sua thanh cong", "Thong bao", JOptionPane.INFORMATION_MESSAGE);
           
       }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
           int input = JOptionPane.showConfirmDialog(null, "ban co chac muon xoa?","Canh bao", JOptionPane.YES_NO_OPTION);
           if(input == 0){
               SanPham.Delete(txtMaSP.getText());
               BinJTable();
               JOptionPane.showMessageDialog(this, "Xoa thanh cong!","Thong bao" , JOptionPane.INFORMATION_MESSAGE);
           }
           JOptionPane.showMessageDialog(this, "Chinh sua thanh cong", "Thong bao", JOptionPane.INFORMATION_MESSAGE);
           
       }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed
    
    private SanPham GetSP() throws Exception{
        if("".equals(txtMaSP.getText()) || "".equals(txtTenSP.getText()) || "".equals(txtGiaban.getText())){
            throw  new Exception("Nhap Dy du thong tin!");
        }
        long gt = Long.parseLong(txtGiaban.getText());
        if(!(gt>1 && gt<99999999))
            throw  new Exception("Gia tien tu 1-99999999");
        
        return new SanPham(txtMaSP.getText(), txtTenSP.getText(),gt, ((LoaiSanPham)cmbLoaiSP.getSelectedItem()).MaLoai);
    }
    
    private void BinJTable() throws Exception
    {
        DefaultTableModel model = (DefaultTableModel)jtabSanpham.getModel();
        model.setRowCount(0); //remove all rows
        ArrayList<SanPham> listSP = SanPham.GetListSanPham();
        for(int i = 0; i < listSP.size() ; i++)
        {
            SanPham temp = listSP.get(i);
            model.addRow(new Object[] { temp.MaSP, temp.TenSP, temp.DonGia, temp.TenLoai, temp.MaLoai});
        }
    }
    
    private void BinLoaiSP() throws Exception
    {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        ArrayList<LoaiSanPham> listLoaiSP = LoaiSanPham.GetListLoaiSanPham();
        for(int i = 0; i < listLoaiSP.size(); i++)
        {
            model.addElement(listLoaiSP.get(i));
        }
        cmbLoaiSP.setModel(model);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoryForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbLoaiSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabSanpham;
    private javax.swing.JTextField txtGiaban;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables

    
}
