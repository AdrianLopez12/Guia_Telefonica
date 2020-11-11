package ups.edu.ec.vista;
import ups.edu.ec.controlador.*;
public class PantallaPrincipal extends javax.swing.JFrame {
    ControladorPersona controladorPersona;
    ControladorTelefono controladorTelefono;
    
    PantallaListarTelefono pantallaListarTelefono;
    PantallaLoguearusuario pantallaLoguearusuario;
    PantallaBorrarUsuario pantallaBorrarUsuario;
    PantallaCrearUsuario pantallaCrearUsuario;
    PantallaListarUsuarios pantallaListarUsuarios;
    PantallaCrearTelefono pantallaCrearTelefono;
    PantallaActualizarTelefono pantallaActualizarTelefono;
    
    int idLogueo;
    
    
    public PantallaPrincipal() {
        initComponents();
        helpMenu.setVisible(false);
        jMenuItem3.setVisible(false);
        
        this.setExtendedState(PantallaPrincipal.MAXIMIZED_BOTH); 
        controladorPersona=new ControladorPersona();
        controladorTelefono=new ControladorTelefono();
        
      
        
        pantallaLoguearusuario=new PantallaLoguearusuario(controladorPersona,this);
        pantallaCrearUsuario=new PantallaCrearUsuario(controladorPersona);
        pantallaListarUsuarios=new PantallaListarUsuarios(controladorPersona);
        pantallaBorrarUsuario=new PantallaBorrarUsuario(controladorPersona);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Usuario");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Crear");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Listar");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Borrar");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        jMenuItem3.setText("Editar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem3);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Loguearse");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Loguear");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Salir");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Telefono");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Crear");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Listar");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        jMenuItem1.setText("Actualizar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem1);

        jMenuItem2.setText("Borrar");
        helpMenu.add(jMenuItem2);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        desktopPane.add(pantallaCrearUsuario);
        pantallaCrearUsuario.setVisible(true);
        
        
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        desktopPane.add(pantallaListarUsuarios);
        pantallaListarUsuarios.setVisible(true);
        
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        desktopPane.add(pantallaBorrarUsuario);
        pantallaBorrarUsuario.setVisible(true);
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        
        desktopPane.add(pantallaLoguearusuario);
        pantallaLoguearusuario.setVisible(true);
        
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        nomostrar();
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        PantallaEditarUsuario pantallaEditarUsuario=new PantallaEditarUsuario(controladorPersona, idLogueo);
        desktopPane.add(pantallaEditarUsuario);
        pantallaEditarUsuario.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
          pantallaCrearTelefono=new PantallaCrearTelefono(controladorTelefono, controladorPersona, idLogueo);
          desktopPane.add(pantallaCrearTelefono);
          pantallaCrearTelefono.setVisible(true);
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        pantallaListarTelefono =new PantallaListarTelefono(controladorTelefono, idLogueo);
        desktopPane.add(pantallaListarTelefono);
        pantallaListarTelefono.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        pantallaActualizarTelefono =new PantallaActualizarTelefono(controladorTelefono);
        desktopPane.add(pantallaActualizarTelefono);
        pantallaActualizarTelefono.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed
public void mostrar(int id){
    helpMenu.setVisible(true);
        jMenuItem3.setVisible(true);
        idLogueo=id;
        
       
}
public void nomostrar(){
    helpMenu.setVisible(false);
        jMenuItem3.setVisible(false);
        idLogueo=-1;
}
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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
