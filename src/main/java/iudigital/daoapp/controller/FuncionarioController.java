/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iudigital.daoapp.controller;

import iudigital.daoapp.dao.FuncionarioDao;
import iudigital.daoapp.dominio.Funcionario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author SOPORTE
 */
public class FuncionarioController {
    
    private final FuncionarioDao funcionariodao;

    /**
     *
     */
    public FuncionarioController() {
        
        funcionariodao = new FuncionarioDao();
    }
    
    /**
     *
     * @param funcionario
     * @throws SQLException
     */
    public void crearFuncionario(Funcionario funcionario) throws SQLException{
        funcionariodao.crearFuncionario(funcionario);
    }
    
    /**
     *
     * @return
     * @throws SQLException
     */
    public List<Funcionario> obtenerFuncionarios()throws SQLException{   
        return funcionariodao.obtenerFuncionarios();
    }
    
    /**
     *
     * @param idfuncionario
     * @return
     * @throws SQLException
     */
    public Funcionario obtenerFuncionario(String idfuncionario) throws SQLException{
    
        return funcionariodao.obtenerFuncionario(idfuncionario);
    }
    
    /**
     *
     * @param idfuncionario
     * @param funcionario
     * @throws SQLException
     */
    public void actualizarFuncionario(String idfuncionario, Funcionario funcionario) throws SQLException{
        
        funcionariodao.actualizarFuncionario(idfuncionario, funcionario);
    }
    
    /**
     *
     * @param idfuncionario
     * @throws SQLException
     */
    public void eliminarFuncionario(String idfuncionario) throws SQLException{
    
        funcionariodao.eliminarFuncionario(idfuncionario);
    }
}
