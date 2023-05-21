/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyectoprogramacionavanzada.Controlador;

import com.mycompany.proyectoprogramacionavanzada.Modelo.Productor;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author drdav
 */
public interface IProductorDAO {
  public void add(Productor parProductor) throws SQLException;
  public void delete(int id) throws SQLException;
  public List<Productor> getDataWhere(int id) throws SQLException;
  public List<Productor> getData() throws SQLException;
  public void update(Productor parAlumno) throws SQLException;
}
