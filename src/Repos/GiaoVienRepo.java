/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repos;

import Models.GiaoVien;
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
public class GiaoVienRepo implements IGiaoVienRepo{
    private ISystemRepo sr = new SystemRepo();
    @Override
    public List<GiaoVien> Load() {
        try{
            Statement cstm = sr.getcon().createStatement();
            ResultSet rs = cstm.executeQuery("Select * from GIAOVIEN");
            GiaoVien gv;
            List<GiaoVien> list = new ArrayList();
            while(rs.next()){
                gv = new GiaoVien();
                gv.setMaGV(rs.getString("MAGV"));
                gv.sethoTen(rs.getString("HOTEN"));
                gv.setHV(rs.getString("HOCVI"));
                gv.setHH(rs.getString("HOCHAM"));
                gv.setGT(rs.getString("GIOITINH"));
                gv.setNgSinh(rs.getDate("NGSINH"));
                gv.setNgVL(rs.getDate("NGVL"));
                gv.setHS(rs.getString("HESO"));
                gv.setML(rs.getString("MUCLUONG"));
                gv.setMK(rs.getString("MAKHOA"));
                list.add(gv);
            }
            return list;
        }catch(SQLException ex){
            return null;
        }
    }

    @Override
    public void Them(String magv, String hoten, String hocvi, String hocham, String gioitinh, Date ngsinh, Date ngvl, String heso, String mucluong, String makhoa) {
        try{
            PreparedStatement ps = sr.getcon().prepareStatement("Insert into GIAOVIEN (MAGV,HOTEN,HOCVI,HOCHAM,GIOITINH,NGSINH,NGVL,HESO,MUCLUONG,MAKHOA) VALUES (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, magv);
            ps.setString(2, hoten);
            ps.setString(3, hocvi);
            ps.setString(4, hocham);
            ps.setString(5, gioitinh);
            ps.setDate(6, ngsinh);
            ps.setDate(7, ngvl);
            ps.setString(8, heso);
            ps.setString(9, mucluong);
            ps.setString(10, makhoa);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã thêm.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi" + ex);
        }
    }

    @Override
    public void Xoa(String ma) {
        try{
            PreparedStatement ps = sr.getcon().prepareStatement("Delete from GIAOVIEN where MAGV=?");
            ps.setString(1, ma);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã xóa");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi " + ex);
        }
    }

    @Override
    public void CapNhat(String magv, String hoten, String hocvi, String hocham, String gioitinh, Date ngsinh, Date ngvl, String heso, String mucluong, String makhoa) {
        try{
            PreparedStatement ps = sr.getcon().prepareStatement(
                    "UPDATE GIAOVIEN "
                    + "SET HOTEN=?,HOCVI=?,HOCHAM=?,GIOITINH=?,NGSINH=?,NGVL=?,HESO=?,MUCLUONG=?,MAKHOA=? "
                    + "WHERE (MAGV=?)");
            ps.setString(1, hoten);
            ps.setString(2, hocvi);
            ps.setString(3, hocham);
            ps.setString(4, gioitinh);
            ps.setDate(5, ngsinh);
            ps.setDate(6, ngvl);
            ps.setString(7, heso);
            ps.setString(8, mucluong);
            ps.setString(9, makhoa);
            ps.setString(10, magv);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã cập nhật.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi " + ex);
        }
    }
    
}
