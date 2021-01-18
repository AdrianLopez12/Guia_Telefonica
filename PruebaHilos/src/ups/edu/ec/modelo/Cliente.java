package ups.edu.ec.modelo;



import javax.swing.*;

public class Cliente implements Runnable{

    JLabel cliente;
    JTextArea textArea;
    int id;
    Thread t;  
    double dinero;
    
    JLabel cajero;
  
    int pax;
    int pay;
    
    
    public Cliente(JLabel cliente, double dinero,JTextArea texto, JLabel cajero,int id) {
        this.cliente = cliente;
     
        this.textArea=texto;
        this.dinero = dinero;
        this.cajero=cajero;
 
        this.id=id;
        t = new Thread(this);
        t.start();  
    }
    

public void  run(){ 
    pax=cliente.getX();
    pay=cliente.getY();
    for (int i = 0; i < 1; i++) {
      
        
      
        synchronized(this.cajero){
             textArea.append("cliente "+id+" Caminando al cajero 1\n");
             cliente.setLocation(531, 320);
         
                try{  
        Thread.sleep(5000);  
        
    }catch(InterruptedException e){  
    }
           cliente.setLocation(399, 510);      
            int op=numeroaleatorio(2);
            if(op==1){
                Ingreso_Dinero();
            }else{
                Egrese_Dinero();
            }
                cliente.setName("asd");
            synchronized(this.cajero){
                
                 textArea.append("cliente "+id+" Caminando al cajero 2\n");
                 cliente.setLocation(531, 320);
             
                    try{  
        Thread.sleep(5000);  
        
    }catch(InterruptedException e){  
    }
           cliente.setLocation(412, 350); 
                 op=numeroaleatorio(1);
            if(op==1){
                Ingreso_Dinero();
            }else{
                Egrese_Dinero();
            }
                synchronized(this.cajero){
                     textArea.append("cliente "+id+" Caminando al cajero 3\n");
                     cliente.setLocation(531, 320);
                   
                        try{  
        Thread.sleep(5000);  
        
    }catch(InterruptedException e){  
    }
           cliente.setLocation(412, 200); 
                     op=numeroaleatorio(1);
            if(op==1){
                Ingreso_Dinero();
            }else{
                Egrese_Dinero();
            }
                    
                }
                
            }
            
        }
     
        
    }
    
    
    
}

public void Ingreso_Dinero(){
    if(dinero==100){
        textArea.append("cliente"+id+" su cuenta tiene 100 o mas\n");
    }else{
        
    
    textArea.append("Ingresando dinero\n");
    int opcion=numeroaleatorio(3);
    
    if(opcion==0){
        textArea.append("Ingresado 100$\n");
        dinero=dinero+100;
        
         try{  
        Thread.sleep(5000);  
        
    }catch(InterruptedException e){  
    }
         cliente.setLocation(792, 787); 
    }if(opcion==1){
        textArea.append("Ingresando 50$\n");
        dinero=dinero+50;
          try{  
        Thread.sleep(5000);  
        
    }catch(InterruptedException e){  
    }
         cliente.setLocation(792, 787); 
    }
    if(opcion==2){
        textArea.append("Ingresando 20$\n");
        dinero=dinero+20;
          try{  
        Thread.sleep(5000);  
        
    }catch(InterruptedException e){  
    }
         cliente.setLocation(792, 787); 
    }
        }
    
}
public void Egrese_Dinero(){
   if(dinero==100){
        textArea.append("cliente"+id+" su cuenta tiene 100$\n");
    }else{
        
    
    textArea.append("Sacando dinero\n");
    int opcion=numeroaleatorio(3);
    
    if(opcion==0){
        textArea.append("Sacado 100$\n");
        dinero=dinero-100;
       
         try{  
        Thread.sleep(5000);  
        
    }catch(InterruptedException e){  
    }
         cliente.setLocation(792, 787); 
    }if(opcion==1){
        textArea.append("Sacado 50$\n");
        dinero=dinero-50;
       
         try{  
        Thread.sleep(5000);  
        
    }catch(InterruptedException e){  
    }
         cliente.setLocation(792, 787); 
    }
    if(opcion==2){
        textArea.append("Sacado 20$\n");
        dinero=dinero-20;
        
         try{  
        Thread.sleep(5000);  
        
    }catch(InterruptedException e){  
    }
         cliente.setLocation(792, 787); 
    }
        }
    try{  
        Thread.sleep(5000);  
        textArea.append("Cajero libre\n");
    }catch(InterruptedException e){  
    }
    cliente.setLocation(pax, pay); 
    
}
public int numeroaleatorio(int rango){
    int n=(int) (Math.random()*rango) ;
    return n;
}
    
    
    

}
