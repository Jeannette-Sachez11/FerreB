/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Base.*;
import javax.swing.*;


/**
 *
 * @author jesanher
 */
public class Ingreso extends javax.swing.JFrame {
    Conexion c;
    Buscar Bu;
    /**
     * Creates new form Ingreso
     */
    public Ingreso() {
        c= new Conexion();
        Bu=new Buscar();
        initComponents();
        setTitle("Pantalla De Ingreso");
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public void limpiarLoggin(){
        Usuario_txt.setText("");
        contratxt.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnIngreso = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Usuario_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        contratxt = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(9, 33, 71));

        btnIngreso.setBackground(new java.awt.Color(26, 72, 142));
        btnIngreso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIngreso.setForeground(new java.awt.Color(255, 255, 255));
        btnIngreso.setText("Ingresar");
        btnIngreso.setBorder(null);
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Iniciar sesion");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        Usuario_txt.setBackground(new java.awt.Color(9, 33, 71));
        Usuario_txt.setForeground(new java.awt.Color(255, 255, 255));
        Usuario_txt.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        contratxt.setBackground(new java.awt.Color(9, 33, 71));
        contratxt.setForeground(new java.awt.Color(255, 255, 255));
        contratxt.setBorder(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/candado.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(contratxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(Usuario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Usuario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(contratxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed
        // TODO add your handling code here:
        String Nombre_Usu=null, Contra_Usu=null;
        Nombre_Usu=Usuario_txt.getText();
        Contra_Usu=contratxt.getText();
       try{
           if(!Nombre_Usu.equals(null)&&!Contra_Usu.equals(null)){
               if(!Nombre_Usu.equals("")&&!Contra_Usu.equals("")){
                   String datos[]=Bu.buscarCod(Nombre_Usu, Contra_Usu);
                   
                   Ventana_admin nf= new Ventana_admin();
                   Ventana_caj vc= new Ventana_caj();
                    if(Nombre_Usu.equals("jeannette_admin")&&Contra_Usu.equals("adminJeannette"))
                    {
                       nf.setVisible(true);
                       this.dispose();
                    }else if(Nombre_Usu.equals("noe_admin")&&Contra_Usu.equals("adminNoe"))
                    {
                       nf.setVisible(true);
                       this.dispose();
                    }else if(Nombre_Usu.equals("anahi_cajera")&&Contra_Usu.equals("cajeraAna"))
                    {
                       vc.setVisible(true);
                       this.dispose();
                    }else if(Nombre_Usu.equals("natalia_cajera")&&Contra_Usu.equals("cajeraNati"))
                    {
                       vc.setVisible(true);
                       this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrectos!!");
                        limpiarLoggin();
                    }
                    
                    
               }else{
                   JOptionPane.showMessageDialog(rootPane, "Ingrese el usuario y contraseña!!");
               }
           }else{
                JOptionPane.showMessageDialog(rootPane, "Ingrese el usuario y contraseña!!");
           }
       }catch(Exception n){
       }
        
        
      /*  if(!Nombre_Usu.equals("")&&!Contra_Usu.equals("")){
            if(!Nombre_Usu.equals(null)&&!Contra_Usu.equals(null)){
               
                }
            }else{
                 JOptionPane.showMessageDialog(rootPane, "Favor de ingresar el usario y contraseña validos!!");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Favor de ingresar el usario y contraseña!!");
        }*/
        
        
    }//GEN-LAST:event_btnIngresoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Usuario_txt;
    private javax.swing.JButton btnIngreso;
    private javax.swing.JPasswordField contratxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
