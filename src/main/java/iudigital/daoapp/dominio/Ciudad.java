/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iudigital.daoapp.dominio;

/**
 *
 * @author SOPORTE
 */
public class Ciudad {
    
    private int idciudad;
    private String ciudad;

    public Ciudad() {
    }

    public Ciudad(int idciudad, String ciudad) {
        this.idciudad = idciudad;
        this.ciudad = ciudad;
    }

    public int getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(int idciudad) {
        this.idciudad = idciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
    public String toString(){
        return idciudad + " " + ciudad;
    }
    
}
