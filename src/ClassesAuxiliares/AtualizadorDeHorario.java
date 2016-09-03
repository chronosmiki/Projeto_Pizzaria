/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesAuxiliares;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;



public class AtualizadorDeHorario extends Thread{
    
    private JLabel hr;
    private boolean mostrarData;
    
  
    public AtualizadorDeHorario(JLabel hora) {
        this.hr = hora;                        
        }
    
    
    @Override
     public void run(){
            try{
                    while(true){   
                    Date d = new Date();       
                    StringBuilder data = new StringBuilder();
                    SimpleDateFormat dia = new SimpleDateFormat("dd");
                    data.append("São Paulo, ");
                    data.append (dia.format(d));
                    data.append(" de ");
              
                            
                    SimpleDateFormat mes = new SimpleDateFormat("MM");
                    switch(mes.format(d)) {  
                        case "01" : data.append ("Janeiro");
                        break;   
                        case "02" : data.append ("Fevereiro");
                        break;   
                        case "03" : data.append ("Março");
                        break;    
                        case "04" : data.append ("Abril");
                        break;
                        case "05" : data.append ("Maio");
                        break;
                        case "06" : data.append ("Junho");
                        break;
                        case "07" : data.append ("Julho");
                        break;
                        case "08" : data.append ("Agosto");
                        break;
                        case "09" : data.append ("Setembro");
                        break;
                        case "10" : data.append ("Outubro");
                        break;
                        case "11" : data.append ("Novembro");
                        break;
                        case "12" : data.append ("Dezembro");
                        break;                        
                    }                   
                    data.append(" de ");
                    
                    SimpleDateFormat ano = new SimpleDateFormat("yyyy");
                    data.append (ano.format(d));     
                    data.append(" - ");
                    
                    SimpleDateFormat hora = new SimpleDateFormat ("HH:mm:ss");
                    data.append (hora.format(d));   
                    
                    this.hr.setText(data.toString());
                    Thread.sleep(1000);
                    this.hr.revalidate();
                    }
            }  catch(InterruptedException ex){
                System.out.println("Problema na atualização da data/hora");         
         }             
     }
}

