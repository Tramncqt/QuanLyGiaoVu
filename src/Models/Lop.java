/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author hieak
 */
public class Lop {
    private String MaLop;
    private String TenLop;
    private String TrgLop;
    private String SiSo;
    private String MaGVCN;
    
    public String getMaLop(){
        return MaLop;
    }
    public void setMaLop(String malop){
        this.MaLop = malop;
    }
    public String getTenLop(){
        return TenLop;
    }
    public void setTenLop(String tenlop){
        this.TenLop = tenlop;
    }
    public String getTrgLop(){
        return TrgLop;
    }
    public void setTrgLop(String trglop){
        this.TrgLop = trglop;
    }
    public String getSiSo(){
        return SiSo;
    }
    public void setSiSo(String siso){
        this.SiSo = siso;
    }
    public String getMaGVCN(){
        return MaGVCN;
    }
    public void setMaGVCN(String magvcn){
        this.MaGVCN = magvcn;
    }
}
