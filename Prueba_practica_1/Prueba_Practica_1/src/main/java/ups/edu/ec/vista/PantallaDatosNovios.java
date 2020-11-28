package ups.edu.ec.vista;
import javax.swing.JOptionPane;
import ups.edu.ec.modelo.*;
import ups.edu.ec.controlador.*;
public class PantallaDatosNovios extends javax.swing.JInternalFrame {

    ControladorMatrimonio controladorMatrimonio;
    ControladorPersona controladorPersona;
        Persona Casante1;
        Persona Casante2;
        Persona Testigo1;
        Persona Testigo2;
        Persona juez;
    public PantallaDatosNovios(ControladorMatrimonio controladorMatrimonio, ControladorPersona controladorPersona) {
        initComponents();
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField6.setEnabled(false);
        jTextField7.setEnabled(false);
        jButton2.setEnabled(false);
        
        
        this.controladorMatrimonio= controladorMatrimonio;
        this.controladorPersona=controladorPersona;
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Cedula Casante");

        jLabel2.setText("Cedula Casante");

        jButton1.setText("Validar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("CedulaTestigo 1");

        jLabel4.setText("Cedula Testigo 2");

        jLabel5.setText("Cedula Juez");

        jLabel6.setText("Fecha matrimonio");

        jLabel7.setText("Lugar Matrimonio");

        jButton2.setText("Casarse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(21, 21, 21)
                                .addComponent(jTextField3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(24, 24, 24)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField5))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(jTextField7)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(134, 134, 134))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cedPar1=jTextField1.getText();
        String cedPar2=jTextField2.getText();
        
        String CedTes1=jTextField3.getText();
        String CedTes2=jTextField4.getText();
        
        String CedJuez=jTextField5.getText();
        
        
       Persona p= controladorPersona.validarCedula(cedPar1);
       
        if(p!=null&&p.getEstadoPersona().Estadop(p).equalsIgnoreCase("soltero")){
            Casante1=p;
             p= controladorPersona.validarCedula(cedPar2);
            if(p!=null&&p.getEstadoPersona().Estadop(p).equalsIgnoreCase("soltero")){
                Casante2=p;
                p= controladorPersona.validarCedula(CedTes1);
                if(p!=null){
                    Testigo1=p;
                    p= controladorPersona.validarCedula(CedTes2);
                    if(p!=null){
                        Testigo2=p;
                       p= controladorPersona.validarCedula(CedJuez);
                       if(p!=null&&p.getCargo().equalsIgnoreCase("juez")){
                           juez=p;
                           JOptionPane.showMessageDialog(this, "Valido");
                           
                           jTextField6.setEnabled(true);
                           jTextField7.setEnabled(true);
                           jButton2.setEnabled(true);
                           
                           
                           jTextField1.setEnabled(false);
                           jTextField2.setEnabled(false);
                           jTextField3.setEnabled(false);
                           jTextField4.setEnabled(false);
                           jTextField5.setEnabled(false);
                           jButton1.setEnabled(false);
                           
                       }else
            JOptionPane.showMessageDialog(this, "Error");
                    }else
            JOptionPane.showMessageDialog(this, "Error");
                    
                }else
            JOptionPane.showMessageDialog(this, "Error");
                
            }else
            JOptionPane.showMessageDialog(this, "Error");
            
        }else
            JOptionPane.showMessageDialog(this, "Error");
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String direccion=jTextField6.getText();
    String fecha=jTextField7.getText();
    
    
    if(direccion.equalsIgnoreCase("")&&fecha.equalsIgnoreCase("")){
        
    }else{
    Casante1.casado();
    Casante2.casado();
    
    Matrimonio m=new Matrimonio(fecha, direccion, Casante1, Casante2, Testigo1, Testigo2, juez);
    controladorMatrimonio.crear(m);
    
    
        JOptionPane.showMessageDialog(this, Casante1.getNombre()+" se caso con "+Casante2.getNombre());
                           jTextField1.setEnabled(true);
                           jTextField2.setEnabled(true);
                           jTextField3.setEnabled(true);
                           jTextField4.setEnabled(true);
                           jTextField5.setEnabled(true);
                           jButton1.setEnabled(true);
                           jTextField6.setEnabled(false);
                           jTextField7.setEnabled(false);
                           jButton2.setEnabled(false);
    
    
                           jTextField1.setText("");
                           jTextField2.setText("");
                           jTextField3.setText("");
                           jTextField4.setText("");
                           jTextField5.setText("");
                           jTextField6.setText("");
                           jTextField7.setText("");
    }
    
    
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
