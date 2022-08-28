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
public class KetQuaThi {
    private String MaHV;
    private String MaMH;
    private String LanThi;
    private Date NgThi;
    private String Diem;
    private String KQua;
    
    public void setMa(String mahv){
        this.MaHV = mahv;
    }
    public String getMa(){
        
        return MaHV;
    }
    public void setMH(String mamh){
        this.MaMH = mamh;
    }
    public String getMH(){
        
        return MaMH;
    }
    public void setLThi(String lanthi){
        this.LanThi = lanthi;
    }
    public String getLThi(){
        
        return LanThi;
    }
    public void setNgThi(Date ngthi){
        this.NgThi = ngthi;
    }
    public Date getNgThi(){
        return NgThi;
    }
    public void setDiem(String diem){
        this.Diem = diem;
    }
    public String getDiem(){
        
        return Diem;
    }
    public void setKQ(String kqua){
        this.KQua = kqua;
    }
    public String getKQ(){
        
        return KQua;
    }
    public String getNgayThiToString() {
    	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
    	return formatter.format(NgThi);
    }
}
