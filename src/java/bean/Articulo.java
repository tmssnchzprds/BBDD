/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author jose
 */
public class Articulo {
    private String nombre;
    private float pvp;
    private int Cod_articulo;
    private String descripcion;

    public int getCod_articulo() {
        return Cod_articulo;
    }

    public void setCod_articulo(int Cod_articulo) {
        this.Cod_articulo = Cod_articulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPvp() {
        return pvp;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }
    
}
