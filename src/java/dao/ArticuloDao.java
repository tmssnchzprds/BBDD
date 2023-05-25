package dao;

import bean.Articulo;
import java.sql.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class ArticuloDao {
    
    public Articulo ver(int cod){
    Articulo a=new Articulo();
    try{
        Connection conexion=MysqlDao.conectar();
        String sql="SELECT * FROM articulos WHERE cod_articulo="+cod;
        ResultSet registro=MysqlDao.ejecutarSQL(sql, conexion);
        while (registro.next())
        {
            
            a.setNombre(registro.getString("nombre"));
            a.setPvp(registro.getFloat("pvp"));
            a.setCod_articulo(registro.getInt("cod_articulo"));
            a.setDescripcion(registro.getString("descripcion"));
        }
       }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
       return a;
    }
    
    public ArrayList<Articulo> getArticulos(){
        ArrayList<Articulo> articulos=new ArrayList<Articulo>();
       try{
        Connection conexion=MysqlDao.conectar();
        String sql="SELECT * FROM articulos";
        ResultSet registros=MysqlDao.ejecutarSQL(sql, conexion);
        while (registros.next())
        {
            Articulo a=new Articulo();
            a.setNombre(registros.getString("nombre"));
            a.setPvp(registros.getFloat("pvp"));
            a.setCod_articulo(registros.getInt("cod_articulo"));
            a.setDescripcion(registros.getString("descripcion"));
                    articulos.add(a);
                    a=null;
        }
       }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
       return articulos;
    }
}
