/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyectoprogramacionavanzada.Controlador;

import com.mycompany.proyectoprogramacionavanzada.Modelo.Producto;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author drdav
 */
public interface IProductoDAO {
  public void add(Producto parProductor) throws SQLException;
  public void delete(int id) throws SQLException;
  public List<Producto> getDataWhere(int id) throws SQLException;
  public List<Producto> getData() throws SQLException;
  public void update(Producto parAlumno) throws SQLException;
}
