/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Models.Khoa;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author hieak
 */
public interface IKhoaService {
    public List<Khoa> Load();
    public void Them(String makhoa,String tenkhoa,Date ngtlap,String trgkhoa);
    public void Xoa(String ma);
    public void CapNhat(String makhoa,String tenkhoa,Date ngtlap,String trgkhoa);
}
