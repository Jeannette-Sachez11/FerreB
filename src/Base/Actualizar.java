/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author JULIO
 */
public class Actualizar {
    
    
    Connection conex;
    Conexion c = new Conexion();
    Statement st;
    ResultSet rs;
    int respuesta;
    String sql;
    
    public Actualizar(){
        conex = c.ConectarBD();
    }
    
    
    public int actualizarProveedor(int id_proveedor,String Nombre, String Telefono, String RFC){
        sql="update Proveedor set Fecha nombre='"+Nombre+"', telefono='"+Telefono+"' , rfc='"+RFC+"' where id_proveedor="+id_proveedor+"";
        respuesta=0;
        
        try{
            st=conex.createStatement();
            respuesta=st.executeUpdate(sql);
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage() );
            }
        }
        return respuesta;
    }
    
    public void actualizarCompra(){
        
    }
    
    public void actualizarCategoria(){
        
    }
    
    public void actualizarMateriales(){
        
    }
    
    public void actualizarDetaCompra(){
        
    }
    
    public void actualizarVenta(){
        
    }
    
    public void actualizarDetaVenta(){
        
    }
    /*
    public void actualizarUsuarios(){
        
    }
    */
}
