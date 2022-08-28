/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.GiaoVien;
import Repos.GiaoVienRepo;
import Repos.IGiaoVienRepo;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author hieak
 */
public class GiaoVienService implements IGiaoVienService{
    private IGiaoVienRepo gr = new GiaoVienRepo();
    @Override
    public List<GiaoVien> Load() {
        return gr.Load();
    }

    @Override
    public void Them(String magv, String hoten, String hocvi, String hocham, String gioitinh, Date ngsinh, Date ngvl, String heso, String mucluong, String makhoa) {
        gr.Them(magv, hoten, hocvi, hocham, gioitinh, ngsinh, ngvl, heso, mucluong, makhoa);
    }

    @Override
    public void Xoa(String ma) {
        gr.Xoa(ma);
    }

    @Override
    public void CapNhat(String magv, String hoten, String hocvi, String hocham, String gioitinh, Date ngsinh, Date ngvl, String heso, String mucluong, String makhoa) {
        gr.CapNhat(magv, hoten, hocvi, hocham, gioitinh, ngsinh, ngvl, heso, mucluong, makhoa);
    }
    
}
