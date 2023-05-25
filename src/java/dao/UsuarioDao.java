/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Usuario;
import java.sql.*;

/**
 *
 * @author jose
 */
public class UsuarioDao {
    public boolean loguear(String user, String pass){
     Boolean encontrado=false;
        try{
        Connection conexion=MysqlDao.conectar();
        String sql="SELECT * FROM usuarios WHERE login like '"+user+"' AND password like '"+pass+"'";
        ResultSet registro=MysqlDao.ejecutarSQL(sql, conexion);
        while (registro.next())
        {
            encontrado=true;
        }
       }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
     return encontrado;
    }
    
    public Usuario ver(String user,String pass){
    try{
        Connection conexion=MysqlDao.conectar();
        String sql="SELECT * FROM usuarios WHERE login like '"+user+"' AND password like '"+pass+"'";
        ResultSet registro=MysqlDao.ejecutarSQL(sql, conexion);
        while (registro.next())
        {
            Usuario u=new Usuario();
            u.setNombrecompleto(registro.getString("nombrecompleto"));
            u.setCod_usuario(registro.getInt("cod_usuario"));
            u.setCod_perfil(registro.getInt("cod_perfil"));
        }
       }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
     }
}
