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
public class HocVien {
    private String MaHV;
    private String Ho;
    private String Ten;
    private Date NgSinh;
    private String GioiTinh;
    private String NoiSinh;
    private String MaLop;
    
    public String getMa(){
        return MaHV;
    }
    public void setMa(String mahv){
        this.MaHV = mahv;
    }
    public String getHo(){
        return Ho;
    }
    public void SetHo(String ho){
        this.Ho = ho;
    }
    public String getTen(){
        return Ten;
    }
    public void setTen(String ten){
        this.Ten = ten;
    }
    public Date getNgSinh(){
        return NgSinh;
    }
    public void setngSinh(Date ngsinh){
        this.NgSinh = ngsinh;
    }
    public String getGTinh(){
        return GioiTinh;
    }
    public void setGTinh(String gioitinh){
        this.GioiTinh = gioitinh;
    }
    public String getNSinh(){
        return NoiSinh;
    }
    public void setNSinh(String noisinh){
        this.NoiSinh = noisinh;
    }
    public String getMLop(){
        return MaLop;
    }
    public void setMLop(String malop){
        this.MaLop = malop;
    }
    public String getNgaySinhToString() {
    	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
    	return formatter.format(NgSinh);
    }
}
