package com.davidgonzalez.system.repository;

import com.davidgonzalez.system.model.Users;
import java.sql.CallableStatement;
import com.davidgonzalez.system.config.ConexionDB;

public class UserRepository implements UserInterface {

    private CallableStatement callSP;
    private ConexionDB conexionDB = ConexionDB.getInstanciaConexionDB();

    @Override
    public void create(Users user) {
        try {
            callSP = conexionDB.getConnection().prepareCall("{call sp_create_users(?,?,?,?,?)}");
            callSP.setString(1, user.getName());
            callSP.setString(2, user.getLastName());
            callSP.setString(3, user.getEmail());
            callSP.setString(4, user.getUser());
            callSP.setString(5, user.getPassword());
            callSP.execute();
            callSP.close();
        } catch (Exception e) {
        }
    }
}
