/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyectoprogramacionavanzada.Controlador;

import com.mycompany.proyectoprogramacionavanzada.Modelo.RegistroEmulación;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author drdav
 */
public interface IRegistroEmulaciónDAO {
  public void add(RegistroEmulación parProductor) throws SQLException;
  public void delete(int id) throws SQLException;
  public List<RegistroEmulación> getDataWhere(int id) throws SQLException;
  public List<RegistroEmulación> getData() throws SQLException;
  public void update(RegistroEmulación parAlumno) throws SQLException;
}
