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
        } catch (Exception e) {
        }
    }
}
