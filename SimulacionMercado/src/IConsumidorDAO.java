/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyectoprogramacionavanzada.Controlador;

import com.mycompany.proyectoprogramacionavanzada.Modelo.Consumidor;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author drdav
 */
public interface IConsumidorDAO {
  public void add(Consumidor parConsumidor) throws SQLException;
  public void delete(int id) throws SQLException;
  public List<Consumidor> getDataWhere(int id) throws SQLException;
  public List<Consumidor> getData() throws SQLException;
  public void update(Consumidor parAlumno) throws SQLException;
}
