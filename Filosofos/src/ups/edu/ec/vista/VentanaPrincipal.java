package ups.edu.ec.vista;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JLabel;
import ups.edu.ec.controlador.ControladorFilosofo;
import ups.edu.ec.modelo.Filosofo;
public class VentanaPrincipal extends javax.swing.JFrame {
 Map<Integer, JButton> mapB = new HashMap<Integer, JButton>();
 Map<Integer, JLabel> mapT = new HashMap<Integer, JLabel>();
 Map<Integer, JLabel> mapR = new HashMap<Integer, JLabel>();
 ControladorFilosofo controladorFilosofo;
    public VentanaPrincipal() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH); 

       
        controladorFilosofo=new ControladorFilosofo();
       
            mapB.put(1, jButton19); mapR.put(1, r1); mapT.put(1, t1);
            mapB.put(2, jButton1); mapR.put(2, r2); mapT.put(2, t2);
            mapB.put(3, jButton2); mapR.put(3, r3); mapT.put(3, t3);
            mapB.put(4, jButton3); mapR.put(4, r4); mapT.put(4, t4);
            mapB.put(5, jButton4); mapR.put(5, r5); mapT.put(5, t5);
            mapB.put(6, jButton5); mapR.put(6, r6); mapT.put(6, t6);
            mapB.put(7, jButton6); mapR.put(7, r7); mapT.put(7, t7);
            mapB.put(8, jButton7); mapR.put(8, r8); mapT.put(8, t8);
            mapB.put(9, jButton8); mapR.put(9, r9); mapT.put(9, t9);
            mapB.put(10, jButton9); mapR.put(10, r10); mapT.put(10, t10);
            mapB.put(11, jButton10); mapR.put(11, r11); mapT.put(11, t11);
            mapB.put(12, jButton11); mapR.put(12, r12); mapT.put(12, t12);
            mapB.put(13, jButton12); mapR.put(13, r13); mapT.put(13, t13);
            mapB.put(14, jButton13); mapR.put(14, r14); mapT.put(14, t14);
            mapB.put(15, jButton14); mapR.put(15, r15); mapT.put(15, t15);
            mapB.put(16, jButton15); mapR.put(16, r16); mapT.put(16, t16);
            mapB.put(17, jButton16); mapR.put(17, r17); mapT.put(17, t17);
            mapB.put(18, jButton17); mapR.put(18, r18); mapT.put(18, t18);

            
        
        
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        r1 = new javax.swing.JLabel();
        r2 = new javax.swing.JLabel();
        r3 = new javax.swing.JLabel();
        r4 = new javax.swing.JLabel();
        r5 = new javax.swing.JLabel();
        r6 = new javax.swing.JLabel();
        r7 = new javax.swing.JLabel();
        r8 = new javax.swing.JLabel();
        r9 = new javax.swing.JLabel();
        r10 = new javax.swing.JLabel();
        r11 = new javax.swing.JLabel();
        r12 = new javax.swing.JLabel();
        r13 = new javax.swing.JLabel();
        r14 = new javax.swing.JLabel();
        r15 = new javax.swing.JLabel();
        r18 = new javax.swing.JLabel();
        r17 = new javax.swing.JLabel();
        r16 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        t6 = new javax.swing.JLabel();
        t7 = new javax.swing.JLabel();
        t8 = new javax.swing.JLabel();
        t9 = new javax.swing.JLabel();
        t10 = new javax.swing.JLabel();
        t11 = new javax.swing.JLabel();
        t12 = new javax.swing.JLabel();
        t13 = new javax.swing.JLabel();
        t14 = new javax.swing.JLabel();
        t15 = new javax.swing.JLabel();
        t16 = new javax.swing.JLabel();
        t17 = new javax.swing.JLabel();
        t18 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Ingrese numero de filosofos max(18)");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 17, 212, 16);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(5, 5, 18, 1));
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(231, 14, 45, 22);

        jButton1.setText("Filosofo 2");
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 140, 100, 25);

        jButton2.setText("Filosofo 3");
        getContentPane().add(jButton2);
        jButton2.setBounds(280, 140, 90, 25);

        jButton3.setText("Filosofo 4");
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 140, 100, 25);

        jButton4.setText("Filosofo 5");
        getContentPane().add(jButton4);
        jButton4.setBounds(600, 140, 100, 25);

        jButton5.setText("Filosofo 6");
        getContentPane().add(jButton5);
        jButton5.setBounds(780, 140, 100, 25);

        jButton6.setText("Filosofo 7");
        getContentPane().add(jButton6);
        jButton6.setBounds(960, 220, 87, 25);

        jButton7.setText("Filosofo 8");
        getContentPane().add(jButton7);
        jButton7.setBounds(970, 310, 87, 25);

        jButton8.setText("Filosofo 9");
        getContentPane().add(jButton8);
        jButton8.setBounds(960, 390, 87, 25);

        jButton9.setText("Filosofo 10");
        getContentPane().add(jButton9);
        jButton9.setBounds(960, 470, 95, 25);

        jButton10.setText("Filosofo 11");
        getContentPane().add(jButton10);
        jButton10.setBounds(790, 550, 95, 25);

        jButton11.setText("Filosofo 12");
        getContentPane().add(jButton11);
        jButton11.setBounds(610, 540, 95, 25);

        jButton12.setText("Filosofo 13");
        getContentPane().add(jButton12);
        jButton12.setBounds(450, 540, 95, 25);

        jButton13.setText("Filosofo 14");
        getContentPane().add(jButton13);
        jButton13.setBounds(270, 550, 95, 25);

        jButton14.setText("Filosofo 15");
        getContentPane().add(jButton14);
        jButton14.setBounds(100, 550, 95, 25);

        jButton15.setText("Filosofo 16");
        getContentPane().add(jButton15);
        jButton15.setBounds(33, 474, 100, 25);

        jButton16.setText("Filosofo 17");
        getContentPane().add(jButton16);
        jButton16.setBounds(33, 385, 100, 25);

        jButton17.setText("Filosofo 18");
        getContentPane().add(jButton17);
        jButton17.setBounds(33, 305, 100, 25);

        jButton18.setText("Iniciar");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18);
        jButton18.setBounds(330, 40, 80, 25);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(129, 589, 718, 322);

        r1.setText("0");
        getContentPane().add(r1);
        r1.setBounds(138, 226, 20, 16);

        r2.setText("0");
        getContentPane().add(r2);
        r2.setBounds(159, 169, 20, 16);

        r3.setText("0");
        getContentPane().add(r3);
        r3.setBounds(310, 170, 20, 16);

        r4.setText("0");
        getContentPane().add(r4);
        r4.setBounds(480, 170, 30, 16);

        r5.setText("0");
        getContentPane().add(r5);
        r5.setBounds(650, 170, 20, 16);

        r6.setText("0");
        getContentPane().add(r6);
        r6.setBounds(810, 170, 30, 16);

        r7.setText("0");
        getContentPane().add(r7);
        r7.setBounds(917, 230, 30, 16);

        r8.setText("0");
        getContentPane().add(r8);
        r8.setBounds(927, 310, 20, 16);

        r9.setText("0");
        getContentPane().add(r9);
        r9.setBounds(927, 390, 20, 16);

        r10.setText("0");
        getContentPane().add(r10);
        r10.setBounds(927, 480, 20, 16);

        r11.setText("0");
        getContentPane().add(r11);
        r11.setBounds(817, 520, 20, 16);

        r12.setText("0");
        getContentPane().add(r12);
        r12.setBounds(627, 510, 20, 16);

        r13.setText("0");
        getContentPane().add(r13);
        r13.setBounds(470, 510, 30, 16);

        r14.setText("0");
        getContentPane().add(r14);
        r14.setBounds(291, 512, 30, 16);

        r15.setText("0");
        getContentPane().add(r15);
        r15.setBounds(137, 520, 20, 16);

        r18.setText("0");
        getContentPane().add(r18);
        r18.setBounds(138, 309, 20, 16);

        r17.setText("0");
        getContentPane().add(r17);
        r17.setBounds(138, 389, 20, 16);

        r16.setText("0");
        getContentPane().add(r16);
        r16.setBounds(138, 483, 20, 16);

        t1.setText("Tenedor 1");
        getContentPane().add(t1);
        t1.setBounds(63, 199, 60, 16);

        t2.setText("Tenedor 2");
        getContentPane().add(t2);
        t2.setBounds(210, 140, 59, 16);

        t3.setText("Tenedor 3");
        getContentPane().add(t3);
        t3.setBounds(380, 140, 60, 16);

        t4.setText("Tenedor 4");
        getContentPane().add(t4);
        t4.setBounds(540, 140, 70, 16);

        t5.setText("Tenedor 5");
        getContentPane().add(t5);
        t5.setBounds(700, 140, 70, 16);

        t6.setText("Tenedor 6");
        getContentPane().add(t6);
        t6.setBounds(904, 141, 70, 16);

        t7.setText("Tenedor 7");
        getContentPane().add(t7);
        t7.setBounds(980, 270, 70, 16);

        t8.setText("Tenedor 8");
        getContentPane().add(t8);
        t8.setBounds(980, 350, 70, 16);

        t9.setText("Tenedpr 9");
        getContentPane().add(t9);
        t9.setBounds(980, 440, 60, 16);

        t10.setText("Tenedor 10");
        getContentPane().add(t10);
        t10.setBounds(897, 550, 80, 16);

        t11.setText("Tenedor 11");
        getContentPane().add(t11);
        t11.setBounds(710, 550, 70, 16);

        t12.setText("Tenedor 12");
        getContentPane().add(t12);
        t12.setBounds(540, 550, 70, 16);

        t13.setText("Tenedor 13");
        getContentPane().add(t13);
        t13.setBounds(370, 550, 80, 16);

        t14.setText("Tenedor 14");
        getContentPane().add(t14);
        t14.setBounds(200, 550, 70, 16);

        t15.setText("Tenedor 15");
        getContentPane().add(t15);
        t15.setBounds(30, 550, 70, 16);

        t16.setText("Tenedor 16");
        getContentPane().add(t16);
        t16.setBounds(60, 440, 70, 16);

        t17.setText("Tenedor 17");
        getContentPane().add(t17);
        t17.setBounds(55, 348, 70, 16);

        t18.setText("Tenedor 18");
        getContentPane().add(t18);
        t18.setBounds(55, 265, 70, 16);

        jButton19.setText("Filosofo 1");
        getContentPane().add(jButton19);
        jButton19.setBounds(43, 222, 90, 25);

        jLabel2.setText("Numero de procesos a hacer");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 50, 170, 16);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(4, 4, 100, 1));
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(190, 50, 50, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        Filosofo com;
        JButton filosofo[];
        JLabel tenedor[];
        JLabel resultado[];
        filosofo = new JButton[Integer.parseInt(jSpinner1.getValue().toString())];
        tenedor = new JLabel[Integer.parseInt(jSpinner1.getValue().toString())];
        resultado = new JLabel[Integer.parseInt(jSpinner1.getValue().toString())];
      
        for (int i = 1; i <= Integer.parseInt(jSpinner1.getValue().toString()); i++) {
            
            JButton boton=mapB.get(i);
            JLabel tene=mapT.get(i);
            JLabel resu=mapR.get(i);
            filosofo[i-1]=boton;
           
            tenedor[i-1]=tene;
        
            resultado[i-1]=resu;
        }
        
        int i, izq, der = 0;

        
        for (i = 0; i < Integer.parseInt(jSpinner1.getValue().toString()); i++) {
          
            izq = i - 1;
           
            if (izq < 0) {
                izq = Integer.parseInt(jSpinner1.getValue().toString())-1;
            }
            der = i;
         
           // com = new Filosofo(i, tenedor[izq], tenedor[der], filosofo[i],resultado[i], jTextArea1);
            controladorFilosofo.create(i, tenedor[izq], tenedor[der], filosofo[i], resultado[i], jTextArea1,Integer.parseInt(jSpinner1.getValue().toString()));
        }
        
        
        
    }//GEN-LAST:event_jButton18ActionPerformed


    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel r1;
    private javax.swing.JLabel r10;
    private javax.swing.JLabel r11;
    private javax.swing.JLabel r12;
    private javax.swing.JLabel r13;
    private javax.swing.JLabel r14;
    private javax.swing.JLabel r15;
    private javax.swing.JLabel r16;
    private javax.swing.JLabel r17;
    private javax.swing.JLabel r18;
    private javax.swing.JLabel r2;
    private javax.swing.JLabel r3;
    private javax.swing.JLabel r4;
    private javax.swing.JLabel r5;
    private javax.swing.JLabel r6;
    private javax.swing.JLabel r7;
    private javax.swing.JLabel r8;
    private javax.swing.JLabel r9;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t10;
    private javax.swing.JLabel t11;
    private javax.swing.JLabel t12;
    private javax.swing.JLabel t13;
    private javax.swing.JLabel t14;
    private javax.swing.JLabel t15;
    private javax.swing.JLabel t16;
    private javax.swing.JLabel t17;
    private javax.swing.JLabel t18;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    private javax.swing.JLabel t7;
    private javax.swing.JLabel t8;
    private javax.swing.JLabel t9;
    // End of variables declaration//GEN-END:variables
}
