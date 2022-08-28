/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Models.HocVien;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author hieak
 */
public interface IHocVienService {
    public List<HocVien> Load();
    public void Them(String mahv,String ho,String ten,Date ngsinh,String gioitinh,String noisinh,String malop);
    public void Xoa(String ma);
    public void CapNhat(String mahv,String ho,String ten,Date ngsinh,String gioitinh,String noisinh,String malop);
}
