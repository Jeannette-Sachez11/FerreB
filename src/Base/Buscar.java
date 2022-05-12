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
    
    
  
    
    public void buscarProveedor(){
        
    }
    
    public void buscarCompra(){
        
    }
    
    public void buscarCategoria(){
        
    }
    
    public void buscarMateriales(){
        
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
