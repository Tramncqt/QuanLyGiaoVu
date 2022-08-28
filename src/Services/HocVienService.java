/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.HocVien;
import Repos.HocVienRepo;
import Repos.IHocVienRepo;
import java.sql.Date;
import java.util.List;
/**
 *
 * @author hieak
 */
public class HocVienService implements IHocVienService{
    private IHocVienRepo hr = new HocVienRepo();
    @Override
    public List<HocVien> Load() {
        return hr.Load();
    }

    @Override
    public void Them(String mahv, String ho, String ten, Date ngsinh, String gioitinh, String noisinh, String malop) {
        hr.Them(mahv, ho, ten, ngsinh, gioitinh, noisinh, malop);
    }

    @Override
    public void Xoa(String ma) {
        hr.Xoa(ma);
    }

    @Override
    public void CapNhat(String mahv,String ho, String ten, Date ngsinh, String gioitinh, String noisinh, String malop) {
        hr.CapNhat(mahv,ho, ten, ngsinh, gioitinh, noisinh, malop);
    }
    
}
