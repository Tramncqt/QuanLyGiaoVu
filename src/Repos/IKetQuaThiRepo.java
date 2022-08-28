/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repos;

import Models.KetQuaThi;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author hieak
 */
public interface IKetQuaThiRepo {
    public List<KetQuaThi> Load();
    public void Them(String mahv,String mamh,String lanthi,Date ngthi,String diem,String kqua);
    public void Xoa(String ma);
    public void CapNhat(String mahv,String mamh,String lanthi,Date ngthi,String diem,String kqua);
}
