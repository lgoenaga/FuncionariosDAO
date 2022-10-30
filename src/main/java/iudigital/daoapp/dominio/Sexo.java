/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iudigital.daoapp.dominio;

/**
 *
 * @author SOPORTE
 */
public class Sexo {
    
    private int idsexo;
    private String sexo;

    public Sexo(int idsexo, String sexo) {
        this.idsexo = idsexo;
        this.sexo = sexo;
    }

    public Sexo() {
    }

    public int getIdsexo() {
        return idsexo;
    }

    public void setIdsexo(int idsexo) {
        this.idsexo = idsexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public String toString(){
        return idsexo + " " + sexo;
    }
}
