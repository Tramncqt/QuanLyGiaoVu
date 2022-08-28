/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.Khoa;
import Repos.IKhoaRepo;
import Repos.KhoaRepo;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author hieak
 */
public class KhoaService implements IKhoaService{
    private IKhoaRepo kr = new KhoaRepo();
    @Override
    public List<Khoa> Load() {
        return kr.Load();
    }

    @Override
    public void Them(String makhoa, String tenkhoa, Date ngtlap, String trgkhoa) {
        kr.Them(makhoa, tenkhoa, ngtlap, trgkhoa);
    }

    @Override
    public void Xoa(String ma) {
        kr.Xoa(ma);
    }

    @Override
    public void CapNhat(String makhoa, String tenkhoa, Date ngtlap, String trgkhoa) {
        kr.CapNhat(makhoa, tenkhoa, ngtlap, trgkhoa);
    }
    
}
