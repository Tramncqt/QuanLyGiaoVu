/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Repos.ISystemRepo;
import Repos.SystemRepo;

/**
 *
 * @author hieak
 */
public class SystemService implements ISystemService{
    private ISystemRepo sr = new SystemRepo();
    @Override
    public boolean Login(String user, String pass) {
        return sr.Login(user, pass);
    }
    
}
