/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author hieak
 */
public class GiaoVien {
    private String MaGV;
    private String HoTen;
    private String HocVi;
    private String HocHam;
    private String GioiTinh;
    private Date NgSinh;
    private Date NgVL;
    private String HeSo;
    private String MucLuong;
    private String MaKhoa;
    
    public String getMaGV(){
        return MaGV;
    }
    public void setMaGV(String magv){
        this.MaGV = magv;
    }
    public String getHoTen(){
        return HoTen;
    }
    public void sethoTen(String hoten){
        this.HoTen = hoten;
    }
    public String getHV(){
        return HocVi;
    }
    public void setHV(String hocvi){
        this.HocVi = hocvi;
    }
    public String getHH(){
        return HocHam;
    }
    public void setHH(String hocham){
        this.HocHam = hocham;
    }
    public String getGT(){
        return GioiTinh;
    }
    public void setGT(String gioitinh){
        this.GioiTinh = gioitinh;
    }
    public Date getNgSinh(){
        return NgSinh;
    }
    public void setNgSinh(Date ngsinh){
        this.NgSinh = ngsinh;
    }
    public Date getNgVl(){
        return NgVL;
    }
    public void setNgVL(Date ngvl){
        this.NgVL = ngvl;
    }
    public String getHS(){
        return HeSo;
    }
    public void setHS(String heso){
        this.HeSo = heso;
    }
    public String getML(){
        return MucLuong;
    }
    public void setML(String mucluong){
        this.MucLuong = mucluong;
    }
    public String getMK(){
        return MaKhoa;
    }
    public void setMK(String makhoa){
        this.MaKhoa = makhoa;
    }
    public String getNgayNgSinhToString() {
    	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
    	return formatter.format(NgSinh);
    }
    public String getNgayNgVLToString() {
    	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
    	return formatter.format(NgVL);
    }
}
