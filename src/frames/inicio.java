/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author richi
 */
public class inicio extends javax.swing.JFrame {
    //esta linked list hace un contenedor donde se ponen trabajadores registrados
public static LinkedList contenedor= new LinkedList();
// esta lista es para los usuarios para hacer el log in
public static lista l = new lista();

    
    public inicio() {
        initComponents();
        
    //Este codigo es para que esta ventana y las siguientes de los demás frames y paneles esten centrados
        setResizable(true);
        setLocationRelativeTo(null);
        //l.push("anahi", "a");
        //l.push("alan", "a");
       
        
    }
    //este método es para validar el log in que quiera realizar un usuario, para esto se utilza el sequential search, para cotejar el input del usuario y la lista que contiene los diferentes nombres
    //de usuarios y contraseñas, aquí el suquential search se usa así: Si el número que regresa el método secSearch es mayor o igual a 0, entonces significa que el input de la persona si conincide con un
    //usuario y contraseña de la lista
  public void validar(lista l){
        l.quickSort(l.ini);
        String usuario = usuariotxt.getText();
        String contraseña = new String (contraseñatxt.getPassword());
        if(l.secSearch(l, usuario, contraseña) >= 0) {
            try {
                this.setVisible(false);
                Seleccion seleccion = new Seleccion();
                seleccion.setSize(800, 600);
                seleccion.setLocationRelativeTo(null);
                seleccion.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Usuario y/o contraseña incorrecta"+ "\n" + "intente de nuevo","ERROR"
                    ,JOptionPane.ERROR_MESSAGE);
        }
        
        //System.out.println(l.isEmpty());
        /*if(l.validarUsuario(l, usuario, contraseña) == 1){
            try {
                this.setVisible(false);
                Seleccion seleccion = new Seleccion();
                seleccion.setSize(800, 600);
                seleccion.setLocationRelativeTo(null);
                seleccion.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Usuario y/o contraseña incorrecta"+ "\n" + "intente de nuevo","ERROR"
                    ,JOptionPane.ERROR_MESSAGE);
        }*/
        /*nodo temp = l.ini;
        for(int i = 0; i < l.contarEl(); i++) {
            if (usuario.equals(l.) && contraseña.equals(con)) {
            try {
                this.setVisible(false);
                Seleccion seleccion = new Seleccion();
                seleccion.setSize(800, 600);
                seleccion.setLocationRelativeTo(null);
                seleccion.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
       }
        JOptionPane.showMessageDialog(null,"Usuario y/o contraseña incorrecta"+ "\n" + "intente de nuevo","ERROR"
                    ,JOptionPane.ERROR_MESSAGE);*/
    }
  
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        usuariotxt = new javax.swing.JTextField();
        contraseñatxt = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 51, 0));
        jLabel1.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("USUARIO:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-coche-2.png"))); // NOI18N

        usuariotxt.setForeground(new java.awt.Color(153, 153, 153));
        usuariotxt.setText("Ingrese usuario");
        usuariotxt.setBorder(null);
        usuariotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuariotxtMouseClicked(evt);
            }
        });
        usuariotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariotxtActionPerformed(evt);
            }
        });

        contraseñatxt.setForeground(new java.awt.Color(153, 153, 153));
        contraseñatxt.setBorder(null);

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/002-login.png"))); // NOI18N
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 51, 0));
        jLabel6.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setText("CONTRASEÑA: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(usuariotxt)
                            .addComponent(contraseñatxt)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel4)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(103, 103, 103))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jLabel6)
                    .addContainerGap(124, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(contraseñatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnLogin)
                .addContainerGap(181, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(254, 254, 254)
                    .addComponent(jLabel6)
                    .addContainerGap(299, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 575));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setToolTipText("");

        jLabel3.setBackground(new java.awt.Color(255, 51, 0));
        jLabel3.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("SI AUN NO ERES MIEMBRO REGISTRATE AQUI");

        jLabel7.setText("Usuario:");

        jLabel8.setText("Apellido");

        jLabel9.setText("N de empleado");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/001-signos_1.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 51, 0));
        jLabel2.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("Registrarse");

        jButton4.setText("Registros");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(302, 302, 302))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(307, 307, 307))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 530));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar (1).png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(718, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//este es el botón para salir
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
//este botón es para utilizar el método validar, que verificaría el input del usuario
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
     validar(l);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void usuariotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuariotxtActionPerformed
//este botón lleva a crear una clase, el cual contendría el registro de cualquier persona o trabajador. aquí se utiliza la linked list (la cual es de clases), que contendría la información
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      String Nombre =jTextField1.getText();
      String Apellido=jTextField2.getText();
      String nTrabajador=jTextField3.getText();
      
      Registro clase=new Registro (Nombre,Apellido,nTrabajador);
      contenedor.add(clase);
      
      jTextField1.setText("");jTextField2.setText("");jTextField3.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
    }//GEN-LAST:event_jButton4ActionPerformed
//ya que el área de texto del usuario del login contiene texto, este es un evento para que cuando se le de click al área, se borre lo antes escrito
    private void usuariotxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariotxtMouseClicked
        usuariotxt.setText("");
    }//GEN-LAST:event_usuariotxtMouseClicked

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //AQUÍ SIMPLEMENTE SE AÑADIERON USUARIOS A LA LISTA PARA PODER HACER UN LOGIN
        l.push("anahi", "a");
        l.push("r", "r");
        l.push("alan", "j");
        l.push("zeta", "a");
        l.push("kanguro", "a");
        l.push("beto", "a");
        l.push("waldo", "a");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPasswordField contraseñatxt;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField usuariotxt;
    // End of variables declaration//GEN-END:variables
}
//ESTA ES LA CLASE DE LISTA PARA LOS USUARIOS Y CONTRASEÑAS
class lista {
    nodo ini;
    //ESTA ES LA CLASE NODO, LA CUAL SE HIZO DENTRO DE LA LISTA
    static class nodo {
        private String usuario;
        private String contra;
        private nodo sig;
        private nodo prev;
        //ESTE CONSTRUCTOR ES PARA AGREGAR UN NODO CON EL NOMBRE DE USUARIO Y CONTRASEÑA
        nodo(String us, String c) {
            usuario = us;
            contra = c;
            sig = null;
            prev = null;
        }
    }
    //ESTE ES UN METODO PARA ENCONTRAR EL ÚLTIMO NODO
    nodo fin(nodo n) {
        while(n.sig != null) {
            n = n.sig;
        }
        return n;
    }
    //AQUÍ COMIENZA EL MÉTODO QUICKSORT, ES LA PARTICIÓN DE LA LISTA PARA IR ORGANIZANDO LOS ELEMENTOS
    nodo partition(nodo low, nodo high) {
        String pivote = high.usuario;
        
        nodo i = low.prev;
        
        for(nodo j = low; j != high; j=j.sig){
            if(j.usuario.compareTo(pivote) <= 0) {
                i = (i==null) ? low : i.sig;
                
                String temp = i.usuario;
                i.usuario = j.usuario;
                j.usuario = temp;
                temp = i.contra;
                i.contra = j.contra;
                j.contra = temp;
            }
        }
        
        i = (i == null) ? low:i.sig;
        
        String temp = i.usuario;
        i.usuario = high.usuario;
        high.usuario = temp;
        
        temp = i.contra;
        i.contra = high.contra;
        high.contra = temp;
        return i;
    }
    //ESTA ES LA QUE HACE LAS LLAMADAS RECURSIVAS A PARTICIONES HASTA QUE YA NO QUEDEN LOS SUFICIENTES NODOS PARA HACER LA PARTICIÓN
    void quickSorting(nodo low, nodo high) {
        if(high!=null && low!=high && low!=high.sig){
            nodo temp = partition(low,high);
            quickSorting(low,temp.prev);
            quickSorting(temp.sig,high);
        }
    }
    //ES EL MÉTODO QUE LLAMA AL QUICKSORT
    public void quickSort(nodo n) {
        nodo c = fin(n);
        quickSorting(n, c);
    }
    //ESTE MÉTODO ES PARA AGREGAR UN USUARIO CON CONTRASEÑA A LA LISTA
    void push(String usu, String con) {
        nodo n = new nodo(usu, con);
        if(ini == null) { 
            ini = n;
            return;
        }
        
        n.sig = ini;
        ini.prev = n;
        n.prev = null;
        ini = n;
    }
    //ESTE MÉTODO ES PARA CONTAR LOS ELEMENTOS EN UNA LISTA
    public int contarEl() {
        nodo nTemp = ini;
        if(ini == null) {
            return 0;
        } else {
            int contador = 0;
            while(nTemp != null) {
                contador++;
                nTemp = nTemp.sig;
            }
            return contador;
        }
    }
    //ESTE MÉTODO ES PARA VER SI LA LISTA ESTÁ VACÍA, FUE USADA ÚNICAMENTE PARA COTEJAR QUE EL PROGRAMA ESTUVIERA COMPARANDO CORRECTAMENTE LA LISTA
    public boolean isEmpty() {
        if(ini == null) {
            return true;
        } else {
            return false;
        }
    }
    
    //ESTE ES EL MÉTODO DE SEQUENTIAL SEARCH, EL CUAL SIMPLEMENTE RETORNA EL NÚMERO DE LA POSICIÓN DONDE SE ENCONTRÓ EL ELEMENTO QUE SE BUSCABA, MÁS SI NO SE ENCONTRABA, SE ENVIABA UN MÁS UNO
    public static int secSearch(lista l, String usu, String contra) {
        nodo temp = l.ini;
        for(int i = 0; i < l.contarEl(); i++) {
            if(usu.compareTo(temp.usuario) == 0 && contra.compareTo(temp.contra) == 0) {
                return i;
            }
        }
        
        return -1;
    }
}

