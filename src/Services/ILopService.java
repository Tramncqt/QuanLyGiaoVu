/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Models.Lop;
import java.util.List;

/**
 *
 * @author hieak
 */
public interface ILopService {
    public List<Lop> Load();
    public void Them(String malop,String tenlop,String trglop,String siso,String magvcn);
    public void Xoa(String ma);
    public void CapNhat(String malop,String tenlop,String trglop,String siso,String magvcn);
}
