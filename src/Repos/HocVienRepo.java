/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repos;

import Models.HocVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author hieak
 */
public class HocVienRepo implements IHocVienRepo{
    private ISystemRepo sr = new SystemRepo();
    @Override
    public List<HocVien> Load() {
        try{
            Statement cstm = sr.getcon().createStatement();
            ResultSet rs = cstm.executeQuery("Select * from HOCVIEN");
            HocVien hv;
            List<HocVien> list = new ArrayList();
            while(rs.next()){
                hv = new HocVien();
                hv.setMa(rs.getString("MAHV"));
                hv.SetHo(rs.getString("HO"));
                hv.setTen(rs.getString("TEN"));
                hv.setngSinh(rs.getDate("NGSINH"));
                hv.setGTinh(rs.getString("GIOITINH"));
                hv.setNSinh(rs.getString("NOISINH"));
                hv.setMLop(rs.getString("MALOP"));
                list.add(hv);
            }
            return list;
        }catch(SQLException ex){
            return null;
        }
        
    }

    @Override
    public void Them(String mahv,String ho,String ten,Date ngsinh,String gioitinh,String noisinh,String malop) {
        try{
            PreparedStatement ps = sr.getcon().prepareStatement("Insert into HOCVIEN (MAHV,HO,TEN,NGSINH,GIOITINH,NOISINH,MALOP) VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, mahv);
            ps.setString(2, ho);
            ps.setString(3, ten);
            ps.setDate(4, ngsinh);
            ps.setString(5, gioitinh);
            ps.setString(6, noisinh);
            ps.setString(7, malop);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã thêm.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi" + ex);
        }
    }

    @Override
    public void Xoa(String ma) {
        try{
            PreparedStatement ps = sr.getcon().prepareStatement("Delete from HocVien where MAHV=?");
            ps.setString(1, ma);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã xóa");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi " + ex);
        }
    }
    @Override
    public void CapNhat(String mahv,String ho,String ten,Date ngsinh,String gioitinh,String noisinh,String malop) {
        try{
            PreparedStatement ps = sr.getcon().prepareStatement(
                    "UPDATE HOCVIEN "
                    + "SET HO=?, TEN=?, NGSINH=?, GIOITINH=?, NOISINH=?, MALOP=? "
                    + "WHERE (MAHV=?)");
            ps.setString(1, ho);
            ps.setString(2, ten);
            ps.setDate(3, ngsinh);
            ps.setString(4, gioitinh);
            ps.setString(5, noisinh);
            ps.setString(6, malop);
            ps.setString(7, mahv);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã cập nhật.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi " + ex);
        }
    }

}
