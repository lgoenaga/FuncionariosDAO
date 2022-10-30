/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iudigital.daoapp.dominio;

/**
 *
 * @author SOPORTE
 */
public class EstadoCivil {
    
    private int idestadocivil;
    private String estadocivil;

    public EstadoCivil(int idestadocivil, String estadocivil) {
        this.idestadocivil = idestadocivil;
        this.estadocivil = estadocivil;
    }

    public EstadoCivil() {
    }

    public int getIdestadocivil() {
        return idestadocivil;
    }

    public void setIdestadocivil(int idestadocivil) {
        this.idestadocivil = idestadocivil;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return idestadocivil + " " + estadocivil;
    }
    
}
