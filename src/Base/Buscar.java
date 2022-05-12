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
public class Buscar {
    
    Connection conex;
    Conexion c = new Conexion();
    Statement st;
    ResultSet rs;
    String sql;//variable para recibir las sentencias de insercion
    boolean respuesta;
    
    public Buscar(){
        conex = c.ConectarBD();
    }
     public String[] buscarCod(String nombreUsu, String contraUsu){        
        String sql="select * from usuarios where nombreUsu='"+nombreUsu+"' and contraUsu='"+contraUsu+"';";
        String []x=new String[1];
        try{
           st=conex.createStatement();
           rs=st.executeQuery(sql);
           while(rs.next()){
               x[0]=rs.getString("nombreUsu");
               x[1]=rs.getString("contraUsu");
           }  
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage() );
           System.out.println(e.getMessage());
        }finally{
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage() );
            }
        }
        return x;
    }
    
     public String[] buscarProveedor(int id_prove){
 
        String sql="select * from proveedor where id_proveedor = "+id_prove+";";
        String []y=new String[3];
        try{
           st=conex.createStatement();
           rs=st.executeQuery(sql);
           while(rs.next()){
               y[0] = rs.getString("nombre");
               y[1] = rs.getString("telefono");
               y[2] = rs.getString("rfc");
           }  
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage() );
           System.out.println(e.getMessage());
        }finally{
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage() );
            }
        }
        return y;
        
    }
    
     
  
  
    public void buscarCompra(){
        
    }
    
    public String[] buscarCategoria(int id_categoria){
        
        String sql="select * from Categoria where id_categoria = "+id_categoria+";";
        String []y=new String[2];
        try{
           st=conex.createStatement();
           rs=st.executeQuery(sql);
           while(rs.next()){
               y[0] = rs.getString("nombre_c");
               y[1] = rs.getString("descripcion");
           }  
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage() );
           System.out.println(e.getMessage());
        }finally{
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage() );
            }
        }
        return y;
        
    }
    
    public String[] buscarMateriales(String codigo_barras)
    {   
        String sql="select * from  Materiales where codigo_barras = '"+codigo_barras+"';";
        String []y=new String[5];
        try{
           st=conex.createStatement();
           rs=st.executeQuery(sql);
           while(rs.next()){
               y[0] = rs.getString("id_categoria");
               y[1] = rs.getString("nombre");
               y[2] = rs.getString("precio_venta");
               y[3] = rs.getString("marca");
               y[4]=rs.getString("Stock");
           }  
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage() );
           System.out.println(e.getMessage());
        }finally{
            try {
                st.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage() );
            }
        }
        return y;
        
    }
    
    public void buscarDetaCompra(){
        
    }
    
    public void buscarVenta(){
        
    }
    
    public void buscarDetaVenta(){
        
    }
   
    /*
    public void buscarUsuarios(){
        
    }
    */
    
}
