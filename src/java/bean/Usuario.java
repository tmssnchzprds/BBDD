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
public class Usuario {
    private int cod_usuario;
    private String Nombrecompleto;
    private int cod_perfil;

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getNombrecompleto() {
        return Nombrecompleto;
    }

    public void setNombrecompleto(String Nombrecompleto) {
        this.Nombrecompleto = Nombrecompleto;
    }

    public int getCod_perfil() {
        return cod_perfil;
    }

    public void setCod_perfil(int cod_perfil) {
        this.cod_perfil = cod_perfil;
    }
    
}
