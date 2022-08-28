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
public class Khoa {
    private String MaKhoa;
    private String TenKhoa;
    private Date NgTL;
    private String TrgKhoa;
    
    public String getMaKhoa(){
        return MaKhoa;
    }
    public void setMaKhoa(String makhoa){
        this.MaKhoa = makhoa;
    }
    public String getTenKhoa(){
        return TenKhoa;
    }
    public void setTenKhoa(String tenkhoa){
        this.TenKhoa = tenkhoa;
    }
    public Date getNgTL(){
        return NgTL;
    }
    public void setNgTL(Date ngtl){
        this.NgTL = ngtl;
    }
    public String getTrgKhoa(){
        return TrgKhoa;
    }
    public void setTrgKhoa(String trgkhoa){
        this.TrgKhoa = trgkhoa;
    }
    public String getNgayTLToString() {
    	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
    	return formatter.format(NgTL);
    }
}
