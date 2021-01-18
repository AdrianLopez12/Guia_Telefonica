/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.vista;

import javax.swing.JLabel;
import ups.edu.ec.modelo.Cliente;
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
              this.setExtendedState(this.MAXIMIZED_BOTH); 
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        c9 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c10 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        c8 = new javax.swing.JLabel();
        cj3 = new javax.swing.JLabel();
        cj1 = new javax.swing.JLabel();
        cj2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        c3 = new javax.swing.JLabel();

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/mujer.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Banco");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(580, 0, 130, 50);

        c9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/hombre (1).png"))); // NOI18N
        getContentPane().add(c9);
        c9.setBounds(990, 330, 90, 90);

        c4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/mujer.png"))); // NOI18N
        getContentPane().add(c4);
        c4.setBounds(990, 550, 90, 100);

        c10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/mujer.png"))); // NOI18N
        getContentPane().add(c10);
        c10.setBounds(990, 440, 90, 100);

        c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/hombre (1).png"))); // NOI18N
        getContentPane().add(c2);
        c2.setBounds(880, 660, 90, 90);

        c6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/hombre (1).png"))); // NOI18N
        getContentPane().add(c6);
        c6.setBounds(880, 330, 90, 90);

        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/mujer.png"))); // NOI18N
        getContentPane().add(c1);
        c1.setBounds(880, 550, 90, 100);

        c5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/hombre (1).png"))); // NOI18N
        getContentPane().add(c5);
        c5.setBounds(990, 660, 90, 90);

        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/mujer.png"))); // NOI18N
        getContentPane().add(a);
        a.setBounds(880, 210, 90, 100);

        c8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/mujer.png"))); // NOI18N
        getContentPane().add(c8);
        c8.setBounds(990, 210, 90, 100);

        cj3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/CajeroF.png"))); // NOI18N
        getContentPane().add(cj3);
        cj3.setBounds(230, 440, 150, 160);

        cj1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/CajeroF.png"))); // NOI18N
        getContentPane().add(cj1);
        cj1.setBounds(230, 140, 150, 160);

        cj2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/CajeraF.png"))); // NOI18N
        getContentPane().add(cj2);
        cj2.setBounds(230, 290, 150, 160);

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(760, 30, 67, 25);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(1170, 210, 530, 470);

        c3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/edu/ec/imagenes/mujer.png"))); // NOI18N
        getContentPane().add(c3);
        c3.setBounds(880, 440, 90, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Cliente cli;
       JLabel cliente[]=new JLabel[10];
       JLabel cajero[]=new JLabel[3];
       
        cliente[0]=c1;  cajero[0]=cj1;
        cliente[1]=c2;  cajero[1]=cj2;
        cliente[2]=c3;  cajero[2]=cj3;
        cliente[3]=c4;
        cliente[4]=a;
        cliente[5]=c6;
        cliente[6]=c5;
        cliente[7]=c8;
        cliente[8]=c9;
        cliente[9]=c10;
        
        
        int i;
        for (i = 0; i < 10; i++) {
          
            
            cli=new Cliente(cliente[i], 90,jTextArea1, cajero[0],i);
            
         
          
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        System.out.println(c1.getLocation());
        System.out.println("x"+evt.getX()+" "+"y"+evt.getY());
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c10;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel c6;
    private javax.swing.JLabel c8;
    private javax.swing.JLabel c9;
    private javax.swing.JLabel cj1;
    private javax.swing.JLabel cj2;
    private javax.swing.JLabel cj3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
