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
public class Insertar {

    Connection conex;
    Conexion c = new Conexion();
    Statement st;
    String sql;//variable para recibir las sentencias de insercion
    boolean respuesta;
    
    public Insertar(){
        conex = c.ConectarBD();
    }
    
    public boolean insertarProveedor(String Nombre,String Telefono,String rfc){//metodo para insertar un proveedor
        //se prepara la insercion del dato de proveedor
        sql="Insert into proveedor(nombre,telefono,rfc) values ('"+Nombre+"','"+Telefono+"','"+rfc+"')";
        respuesta=true;// nos devuelven el valor booleano despues de la insercion
        try{
            st=conex.createStatement();
            respuesta=st.execute(sql);
            System.out.println(respuesta);
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try{
                st.close();//cierra la conexion
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
       
        return !respuesta;//retorno de respuesta
        
    }
    
    public boolean insertarCompra(){//metodo para insertar una compra
        
         return !respuesta;//retorno de respuesta
    }
    
    public boolean insertarCategoria(String Nombre_c,String Descripcion){//metodo para insertar una categoria
        sql="Insert into Categoria (nombre_c,descripcion) values ('"+Nombre_c+"','"+Descripcion+"')";
        respuesta=true;// nos devuelven el valor booleano despues de la insercion
        try{
            st=conex.createStatement();
            respuesta=st.execute(sql);
            System.out.println(respuesta);
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try{
                st.close();//cierra la conexion
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
        
        return !respuesta;//retorno de respuesta
    }
 
   public boolean insertarMateriales(String codigo_barras,int id_categoria, String nombre, float precio_venta,String marca, int stock){
        sql="insert into materiales values('"+codigo_barras+"',"+id_categoria+",'"+nombre+"',"+precio_venta+",'"+marca+"',"+stock+");";
        respuesta = true;
        try{
            st=conex.createStatement();
            respuesta=st.execute(sql);
            System.out.println(respuesta);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage() );
        }finally{
            try{
                st.close();//cierra la conexion
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage() );
                System.out.println(ex.getMessage());
            }
        }
        return !respuesta;
    }
 
    public boolean insertarDetaCompra(){ //metodo para insertar
        
         return !respuesta;//retorno de respuesta
    }

    public boolean insertarVenta(){//metodo para insertar una venta
        
         return !respuesta;//retorno de respuesta
    }
    
    public boolean insertarDetalle_Venta(){//metodo para insertar 
        
         return !respuesta;//retorno de respuesta
    }
    
    /*
    De esta tabla no estoy seguro si se debe de hacer crud, pero lo dejo, por si las moscas
        public void insertarUsuarios(){
        
        }
    */
    
}
