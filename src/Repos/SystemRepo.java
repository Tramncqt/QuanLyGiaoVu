/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repos;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author hieak
 */
public class SystemRepo implements ISystemRepo{
    protected SQLServerDataSource ds = new SQLServerDataSource();
    protected static Connection con;
    @Override
    public boolean Login(String user,String pass){
        try {
            ds.setUser(user);
            ds.setPassword(pass);
            ds.setServerName("localhost\\DVT");
            ds.setPortNumber(Integer.parseInt("1433"));
            ds.setDatabaseName("QLGV");
            con = ds.getConnection();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    @Override
    public SQLServerDataSource getds(){
        return ds;
    }
    @Override
    public Connection getcon(){
        return con;
    }
    }

