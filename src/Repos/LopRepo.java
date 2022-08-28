/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repos;

import Models.Lop;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author hieak
 */
public class LopRepo implements ILopRepo{
    private ISystemRepo sr = new SystemRepo();
    @Override
    public List<Lop> Load() {
        try{
            Statement cstm = sr.getcon().createStatement();
            ResultSet rs = cstm.executeQuery("Select * from LOP");
            Lop l;
            List<Lop> list = new ArrayList();
            while(rs.next()){
                l = new Lop();
                l.setMaLop(rs.getString("MALOP"));
                l.setTenLop(rs.getString("TENLOP"));
                l.setTrgLop(rs.getString("TRGLOP"));
                l.setSiSo(rs.getString("SISO"));
                l.setMaGVCN(rs.getString("MAGVCN"));
                list.add(l);
            }
            return list;
        }catch(SQLException ex){
            return null;
        }
    }

    @Override
    public void Them(String malop,String tenlop,String trglop,String siso,String magvcn) {
        try{
            PreparedStatement ps = sr.getcon().prepareStatement("Insert into LOP (MALOP,TENLOP,TRGLOP,SISO,MAGVCN) VALUES (?,?,?,?,?)");
            ps.setString(1, malop);
            ps.setString(2, tenlop);
            ps.setString(3, trglop);
            ps.setString(4, siso);
            ps.setString(5, magvcn);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã thêm.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi" + ex);
        }
    }

    @Override
    public void Xoa(String ma) {
        try{
            PreparedStatement ps = sr.getcon().prepareStatement("Delete from LOP where MALOP=?");
            ps.setString(1, ma);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã xóa");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi " + ex);
        }
    }

    @Override
    public void CapNhat(String malop,String tenlop,String trglop,String siso,String magvcn) {
        try{
            PreparedStatement ps = sr.getcon().prepareStatement(
                    "UPDATE LOP "
                    + "SET TENLOP=?,TRGLOP=?,SISO=?,MAGVCN=? "
                    + "WHERE (MALOP=?)");
            ps.setString(1, tenlop);
            ps.setString(2, trglop);
            ps.setString(3, siso);
            ps.setString(4, magvcn);
            ps.setString(5, malop);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã cập nhật.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi " + ex);
        }
    }
    
}
