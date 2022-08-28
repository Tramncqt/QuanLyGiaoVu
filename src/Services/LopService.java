/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.Lop;
import Repos.ILopRepo;
import Repos.LopRepo;
import java.util.List;

/**
 *
 * @author hieak
 */
public class LopService implements ILopService{
    private ILopRepo lr = new LopRepo();
    @Override
    public List<Lop> Load() {
        return lr.Load();
    }

    @Override
    public void Them(String malop, String tenlop, String trglop, String siso, String magvcn) {
        lr.Them(malop, tenlop, trglop, siso, magvcn);
    }

    @Override
    public void Xoa(String ma) {
        lr.Xoa(ma);
    }

    @Override
    public void CapNhat(String malop, String tenlop, String trglop, String siso, String magvcn) {
        lr.CapNhat(malop, tenlop, trglop, siso, magvcn);
    }
    
}
