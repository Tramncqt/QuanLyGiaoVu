/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repos;

import Models.Khoa;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author hieak
 */
public class KhoaRepo implements IKhoaRepo{
    private ISystemRepo sr = new SystemRepo();
    @Override
    public List<Khoa> Load() {
        try{
            Statement cstm = sr.getcon().createStatement();
            ResultSet rs = cstm.executeQuery("Select * from KHOA");
            Khoa k;
            List<Khoa> list = new ArrayList();
            while(rs.next()){
                k = new Khoa();
                k.setMaKhoa(rs.getString("MAKHOA"));
                k.setTenKhoa(rs.getString("TENKHOA"));
                k.setNgTL(rs.getDate("NGTLAP"));
                k.setTrgKhoa(rs.getString("TRGKHOA"));
                list.add(k);
            }
            return list;
        }catch(SQLException ex){
            return null;
        }
    }

    @Override
    public void Them(String makhoa, String tenkhoa, Date ngtlap, String trgkhoa) {
        try{
            PreparedStatement ps = sr.getcon().prepareStatement("Insert into KHOA (MAKHOA,TENKHOA,NGTLAP,TRGKHOA) VALUES (?,?,?,?)");
            ps.setString(1, makhoa);
            ps.setString(2, tenkhoa);
            ps.setDate(3, ngtlap);
            ps.setString(4, trgkhoa);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã thêm.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi" + ex);
        }
    }

    @Override
    public void Xoa(String ma) {
        try{
            PreparedStatement ps = sr.getcon().prepareStatement("Delete from KHOA where MAKHOA=?");
            ps.setString(1, ma);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã xóa");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi " + ex);
        }
    }

    @Override
    public void CapNhat(String makhoa, String tenkhoa, Date ngtlap, String trgkhoa) {
        try{
            PreparedStatement ps = sr.getcon().prepareStatement(
                    "UPDATE KHOA "
                    + "SET TENKHOA=?,NGTLAP=?,TRGKHOA=? "
                    + "WHERE (MAKHOA=?)");
            ps.setString(1, tenkhoa);
            ps.setDate(2, ngtlap);
            ps.setString(3, trgkhoa);
            ps.setString(4, makhoa);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã cập nhật.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi " + ex);
        }
    }
    
}
