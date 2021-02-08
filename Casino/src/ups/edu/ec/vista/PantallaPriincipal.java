package ups.edu.ec.vista;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import ups.edu.ec.controlador.*;
import ups.edu.ec.modelo.Cliente;

/**
 *
 * @author Casa
 */
public class PantallaPriincipal extends javax.swing.JFrame {

    ControladorCliente controladorCliente;
    ControladorJuegos controladorJuegos;
    ControladorHilos controladorHilos;
    Cliente cliente1;
    Cliente cliente2;
    Cliente cliente3;
    Cliente cliente4;
    Cliente crupier;
    
    PantallaRegistrarCliente pantallaRegistrarCliente;
    PantallaJuegosGanados pantallaJuegosGanados;
    
    public PantallaPriincipal() {
        initComponents();
        crupier=new Cliente();
        crupier.setNombre("crupier");
        crupier.setDinero(5000);
        crupier.setCedula("asdfg");
        
        
        
        jTextArea1.setEditable(false);
        
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
        jTextField4.setEnabled(false);
        jTextField5.setEnabled(false);
        
        this.setExtendedState(MAXIMIZED_BOTH);
        
        this.controladorCliente =new ControladorCliente();
        this.controladorJuegos=new ControladorJuegos();
        this.controladorHilos=new ControladorHilos();
        
        pantallaRegistrarCliente=new PantallaRegistrarCliente(controladorCliente);
        pantallaJuegosGanados=new PantallaJuegosGanados(controladorJuegos);
        
        Cliente n=controladorCliente.busccarPorCedula(crupier.getCedula());
        if(n==null){
            controladorCliente.crear(crupier);
        }
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        desktopPane = new javax.swing.JDesktopPane();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton1.setText("Numero concreto");
        desktopPane.add(jRadioButton1);
        jRadioButton1.setBounds(1390, 20, 120, 21);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton3.setText("Martingala");
        desktopPane.add(jRadioButton3);
        jRadioButton3.setBounds(1390, 80, 120, 21);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton2.setText("Par Impar");
        desktopPane.add(jRadioButton2);
        jRadioButton2.setBounds(1390, 50, 120, 21);

        jButton1.setText("Empezar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton1);
        jButton1.setBounds(360, 530, 80, 21);

        jButton2.setText("Agregar persona");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton2);
        jButton2.setBounds(530, 370, 120, 21);

        jButton4.setText("Agregar Persona");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton4);
        jButton4.setBounds(250, 370, 120, 21);

        jButton3.setText("Agregar persona");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton3);
        jButton3.setBounds(260, 270, 120, 21);

        jButton5.setText("Agregar persona");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton5);
        jButton5.setBounds(530, 270, 120, 21);
        desktopPane.add(jTextField1);
        jTextField1.setBounds(190, 270, 50, 30);

        jLabel1.setText("Numero apuesta");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(80, 280, 100, 13);
        desktopPane.add(jTextField2);
        jTextField2.setBounds(190, 360, 50, 30);

        jLabel2.setText("Numero apuesta");
        desktopPane.add(jLabel2);
        jLabel2.setBounds(90, 370, 90, 13);
        desktopPane.add(jTextField3);
        jTextField3.setBounds(660, 260, 50, 30);

        jLabel3.setText("Numero apuesta");
        desktopPane.add(jLabel3);
        jLabel3.setBounds(720, 270, 100, 13);
        desktopPane.add(jTextField4);
        jTextField4.setBounds(660, 370, 50, 30);

        jLabel4.setText("Numero apuesta");
        desktopPane.add(jLabel4);
        jLabel4.setBounds(720, 380, 100, 13);
        desktopPane.add(jTextField5);
        jTextField5.setBounds(410, 490, 70, 30);

        jLabel7.setText("Numero en juego");
        desktopPane.add(jLabel7);
        jLabel7.setBounds(400, 470, 90, 13);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        desktopPane.add(jScrollPane1);
        jScrollPane1.setBounds(990, 210, 430, 330);
        desktopPane.add(jLabel8);
        jLabel8.setBounds(540, 170, 90, 90);
        desktopPane.add(jLabel9);
        jLabel9.setBounds(260, 160, 90, 100);
        desktopPane.add(jLabel10);
        jLabel10.setBounds(260, 400, 90, 90);
        desktopPane.add(jLabel11);
        jLabel11.setBounds(550, 400, 90, 90);

        jButton6.setText("parar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton6);
        jButton6.setBounds(450, 530, 80, 21);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/mesaCasino_opt (1).jpg"))); // NOI18N
        desktopPane.add(jLabel6);
        jLabel6.setBounds(380, 260, 140, 200);

        jLabel5.setText("Tiempo milisegundos");
        desktopPane.add(jLabel5);
        jLabel5.setBounds(410, 20, 130, 20);
        desktopPane.add(jTextField6);
        jTextField6.setBounds(550, 9, 80, 30);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Cliente");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Administrar");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        jMenuItem1.setText("Juegos ganados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        String contrasena=JOptionPane.showInputDialog("Ingrese contrasena");
        if(contrasena.equalsIgnoreCase("3103")){
            desktopPane.add(pantallaRegistrarCliente);
            pantallaRegistrarCliente.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Contrasena incorrecta");
        }
        
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton1.setEnabled(false);
        String t=jTextField6.getText();
        int tiempo;
        if(t.equalsIgnoreCase("")){
            tiempo=2000;
        }else{
            tiempo=Integer.parseInt(t);
        }
        
        
        if(cliente1==null||cliente2==null||cliente3==null||cliente4==null){
            JOptionPane.showMessageDialog(this, "Elija todos los clientes");
        }else{
           if(jRadioButton1.isSelected()){
            JOptionPane.showMessageDialog(null, "Empezara numero concreto");
            jButton1.setEnabled(false);
            controladorHilos=new ControladorHilos(cliente1, cliente2, cliente3, cliente4, jTextArea1, jTextField1, jTextField2,
                    jTextField3, jTextField4, "1",crupier,jTextField5,controladorJuegos,controladorCliente, tiempo);
         
            
            controladorHilos.start();
            
            
            
            
            
        }else if(jRadioButton2.isSelected()){
            JOptionPane.showMessageDialog(null, "Empezara par impar");
            jButton1.setEnabled(false);
            
            controladorHilos=new ControladorHilos(cliente1, cliente2, cliente3, cliente4, jTextArea1, jTextField1, jTextField2,
                    jTextField3, jTextField4, "2",crupier,jTextField5,controladorJuegos,controladorCliente,tiempo);
            controladorHilos.start();
            
        }else if(jRadioButton3.isSelected()){
            JOptionPane.showMessageDialog(null, "Empezara martingala");
            jButton1.setEnabled(false);
            
            controladorHilos=new ControladorHilos(cliente1, cliente2, cliente3, cliente4, jTextArea1, jTextField1, jTextField2,
                    jTextField3, jTextField4, "3",crupier,jTextField5,controladorJuegos,controladorCliente,tiempo);
            controladorHilos.start();
            
        }else{
            JOptionPane.showMessageDialog(null, "Elija un juego");
        } 
        }
        

        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String c1=JOptionPane.showInputDialog(null, "Ingrese cedula del participante");
        if(c1.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese cedula");
        }else{
            cliente1=controladorCliente.busccarPorCedula(c1);
            if(cliente1==null){
                JOptionPane.showMessageDialog(this, "cedula invalida");
            }else{
                jButton3.setText(cliente1.getNombre()+" "+cliente1.getApellido());
                if(cliente1.getSexo().equalsIgnoreCase("mujer")){
                    jLabel9.setIcon(new ImageIcon("img/mujer.png"));
                    System.out.println("mujer");
                }else{
                    jLabel9.setIcon(new ImageIcon("img/hombre (1).png"));
                    System.out.println("hombre");
                }
                
            }
        }
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String c1=JOptionPane.showInputDialog(null, "Ingrese cedula del participante");
        if(c1.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese cedula");
        }else{
            cliente2=controladorCliente.busccarPorCedula(c1);
            if(cliente2==null){
                JOptionPane.showMessageDialog(this, "cedula invalida");
            }else{
                jButton4.setText(cliente2.getNombre()+" "+cliente2.getApellido());
                if(cliente2.getSexo().equalsIgnoreCase("mujer")){
                    jLabel10.setIcon(new ImageIcon("img/mujer.png"));
                    System.out.println("mujer");
                }else{
                    jLabel10.setIcon(new ImageIcon("img/hombre (1).png"));
                    System.out.println("hombre");
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String c1=JOptionPane.showInputDialog(null, "Ingrese cedula del participante");
        if(c1.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese cedula");
        }else{
            cliente3=controladorCliente.busccarPorCedula(c1);
            if(cliente3==null){
                JOptionPane.showMessageDialog(this, "cedula invalida");
            }else{
                jButton5.setText(cliente3.getNombre()+" "+cliente3.getApellido());
                if(cliente3.getSexo().equalsIgnoreCase("mujer")){
                    jLabel8.setIcon(new ImageIcon("img/mujer.png"));
                    System.out.println("mujer");
                }else{
                    jLabel8.setIcon(new ImageIcon("img/hombre (1).png"));
                    System.out.println("hombre");
                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String c1=JOptionPane.showInputDialog(null, "Ingrese cedula del participante");
        if(c1.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese cedula");
        }else{
            cliente4=controladorCliente.busccarPorCedula(c1);
            if(cliente4==null){
                JOptionPane.showMessageDialog(this, "cedula invalida");
            }else{
                jButton2.setText(cliente4.getNombre()+" "+cliente4.getApellido());
                if(cliente4.getSexo().equalsIgnoreCase("mujer")){
                    jLabel11.setIcon(new ImageIcon("img/mujer.png"));
                    System.out.println("mujer");
                }else{
                    jLabel11.setIcon(new ImageIcon("img/hombre (1).png"));
                    System.out.println("hombre");
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        controladorHilos.parar();
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    desktopPane.add(pantallaJuegosGanados);
    pantallaJuegosGanados.setVisible(true);
        
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPriincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPriincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPriincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPriincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPriincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    // End of variables declaration//GEN-END:variables

}
