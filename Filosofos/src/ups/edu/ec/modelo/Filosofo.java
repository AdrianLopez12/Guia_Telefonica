/* 
 * To change this template, choose Tools | Templates 
 * and open the template in the editor. 
 */  
  
package ups.edu.ec.modelo;  
import java.awt.Color;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
/** 
 * 
 * @author 
 */  
public class Filosofo implements Runnable{  
int id,res;  
Thread t;  
JButton filosofo;
JLabel derecho;
JLabel izquierdo;
JLabel resultado;
String proceso;
JTextArea textArea;
int numeroveces;
public Filosofo(int id,JLabel izquierdo, JLabel derecho,JButton filosofo,JLabel resultado, JTextArea textArea,int numeroveces){  
    this.id = id;  
    this.derecho = derecho;  
    this.izquierdo = izquierdo;  
    this.filosofo=filosofo;
    this.resultado=resultado;
    this.textArea=textArea;
    t = new Thread(this);
    t.start();  
    this.numeroveces=numeroveces;
    
}  
@Override
public void  run(){ 
    for(int i =0;i<numeroveces;i++){ 
        System.out.println(i);
        synchronized(this.izquierdo){  
           synchronized(this.derecho){  
             comer();     
            } 
        }
        pensar();  
    } 
   
}  
void comer () {  
    derecho.setText("Ocupado");
    derecho.setForeground(Color.red);
  
    izquierdo.setText("Ocupado");
    izquierdo.setForeground(Color.red);
    
    filosofo.setText("Comiendo");
    filosofo.setBackground(Color.GREEN);

    res=Integer.parseInt(resultado.getText());
    res+=1;
    resultado.setText(String.valueOf(res));
    proceso= "Fil.= "+(id+1)+ " Comiendo usa sus tenedores\n";
    textArea.append(proceso);
    try{  
        Thread.sleep(5000);  
    }catch(InterruptedException e){  
    }
    derecho.setText("Libre");
    derecho.setForeground(Color.black);
    
    izquierdo.setText("Libre");
    izquierdo.setForeground(Color.black);
    
    filosofo.setText("Pensando");   
    filosofo.setBackground(Color.DARK_GRAY);
    proceso="Fil.= "+(id+1)+ " Deja de comer y queda pensando, libera sus tenedores\n";  
    textArea.append(proceso);
}  
void pensar(){  
    derecho.setText("Libre");
    derecho.setForeground(Color.black);
    
    izquierdo.setText("Libre");
    izquierdo.setForeground(Color.black);
    
    filosofo.setText("Pensando");   
    filosofo.setBackground(Color.DARK_GRAY);

    try{  

        Thread.sleep(5000);  
    }catch(InterruptedException e){  
    }          
}  

}  