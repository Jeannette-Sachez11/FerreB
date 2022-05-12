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
public class Eliminar {
    
    Connection conex;
    Conexion c = new Conexion();
    Statement stElim;
    String sqlElim;
    boolean respElim;
    
    public Eliminar(){
        conex = c.ConectarBD();
    }
    
    public boolean eliminarProveedor(int id_proveedor){
      
        //se prepara la eliminacion del dato de proveedor
        sqlElim="delete from proveedor where id_prpveedor = '"+id_proveedor+"';";
        respElim=true;// nos devuelven el valor booleano despues de la insercion
        try{
            stElim=conex.createStatement();
            respElim=stElim.execute(sqlElim);
            System.out.println(respElim);
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try{
                stElim.close();//cierra la conexion
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
       
        return !respElim;//retorno de respuesta
        
    }
    
    public void eliminarCompra(){
        
    }
    
    public void eliminarCategoria(){
        
    }
    
    public void eliminarMateriales(){
        
    }
    
    public void eliminarDetaCompra(){
        
    }
    
    public void eliminarVenta(){
        
    }

    public void eliminarDetaVenta(){
        
    }
    
    /*
    public void eliminarUsuarios(){
        
    }
    */
}
