/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.KetQuaThi;
import Repos.IKetQuaThiRepo;
import Repos.KetQuaThiRepo;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author hieak
 */
public class KetQuaThiService implements IKetQuaThiService{
    private IKetQuaThiRepo kr = new KetQuaThiRepo();
    @Override
    public List<KetQuaThi> Load() {
        return kr.Load();
    }

    @Override
    public void Them(String mahv, String mamh, String lanthi, Date ngthi, String diem, String kqua) {
        kr.Them(mahv, mamh, lanthi, ngthi, diem, kqua);
    }

    @Override
    public void Xoa(String ma) {
        kr.Xoa(ma);
    }

    @Override
    public void CapNhat(String mahv, String mamh, String lanthi, Date ngthi, String diem, String kqua) {
        kr.CapNhat(mahv, mamh, lanthi, ngthi, diem, kqua);
    }
    
}
