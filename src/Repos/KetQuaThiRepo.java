/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repos;

import Models.KetQuaThi;
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
public class KetQuaThiRepo implements IKetQuaThiRepo{
    private ISystemRepo sr = new SystemRepo();
    @Override
    public List<KetQuaThi> Load() {
        try{
            Statement cstm = sr.getcon().createStatement();
            ResultSet rs = cstm.executeQuery("Select* from KETQUATHI");
            KetQuaThi kq;
            List<KetQuaThi> list = new ArrayList();
            while(rs.next()){
                kq = new KetQuaThi();
                kq.setMa(rs.getString("MAHV"));
                kq.setMH(rs.getString("MAMH"));
                kq.setLThi(rs.getString("LANTHI"));
                kq.setNgThi(rs.getDate("NGTHI"));
                kq.setDiem(rs.getString("DIEM"));
                kq.setKQ(rs.getString("KQUA"));
                list.add(kq);
            }
            return list;
        }catch(SQLException ex){
            return null;
        }
    }

    @Override
    public void Them(String mahv, String mamh, String lanthi, Date ngthi, String diem, String kqua) {
        try{
            PreparedStatement ps = sr.getcon().prepareStatement("Insert into KETQUATHI (MAHV,MAMH,LANTHI,NGTHI,DIEM,KQUA) VALUES (?,?,?,?,?,?)");
            ps.setString(1, mahv);
            ps.setString(2, mamh);
            ps.setString(3, lanthi);
            ps.setDate(4, ngthi);
            ps.setString(5, diem);
            ps.setString(6, kqua);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã thêm.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi" + ex);
        }
    }

    @Override
    public void Xoa(String ma) {
        try{
            PreparedStatement ps = sr.getcon().prepareStatement("Delete from KetQuaThi where MAHV=?");
            ps.setString(1, ma);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã xóa");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi " + ex);
        }
    }

    @Override
    public void CapNhat(String mahv, String mamh, String lanthi, Date ngthi, String diem, String kqua) {
        try{
            PreparedStatement ps = sr.getcon().prepareStatement(
                    "UPDATE KETQUATHI "
                    + "SET MAMH=?, LANTHI=?, NGTHI=?, DIEM=?, KQUA=? "
                    + "WHERE (MAHV=?)");
            ps.setString(1, mamh);
            ps.setString(2, lanthi);
            ps.setDate(3, ngthi);
            ps.setString(4, diem);
            ps.setString(5, kqua);
            ps.setString(6, mahv);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã cập nhật.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Lỗi " + ex);
    }
}
}

