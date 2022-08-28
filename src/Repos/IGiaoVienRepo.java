/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repos;

import Models.GiaoVien;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author hieak
 */
public interface IGiaoVienRepo {
    public List<GiaoVien> Load();
    public void Them(String magv,String hoten,String hocvi,String hocham,String gioitinh,Date ngsinh,Date ngvl,String heso,String mucluong,String makhoa);
    public void Xoa(String ma);
    public void CapNhat(String magv,String hoten,String hocvi,String hocham,String gioitinh,Date ngsinh,Date ngvl,String heso,String mucluong,String makhoa);
}
