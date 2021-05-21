package Controlador;

import Vista.*;
import javax.swing.JOptionPane;
import modelo.*;

public class Controlador{
    
    private VistaPorDefecto vista;
    private OperacionFundamental basico;
    private OperarNumerosMuyGrandes datosGrandes;
    
    public double valorAOperar, resultado;
    public int tipoDeConversión = 0;
    
    public  Controlador(){};
    
    public Controlador(VistaPorDefecto vista){
    
        this.vista = vista;
    
    }
    
    public Controlador(OperacionFundamental basico){
    
        this.basico = basico;       
    
    }

    public Controlador(OperarNumerosMuyGrandes datosGrandes) {

        this.datosGrandes = datosGrandes;
        
    }
    
    public void iniciarVista(){
    
        vista.vistaGeneral();
        vista.setVisible(true);    
        
    }
    
    public double operaciones(int pregunta, int resultado, double valor){        

        if(tipoDeConversión == 1){
        
            if(pregunta == 1 && resultado == 1){
                
                valor = basico.kiloKilo(valor);
                        
            }
            else if(pregunta == 1 && resultado == 2){
                                
                valor = basico.kiloHecto(valor);
            
            }            
            else if(pregunta == 1 && resultado == 3){
            
                valor = basico.kiloDeca(valor);
                
            }           
            else if(pregunta == 1 && resultado == 4){
            
                valor = basico.kiloCentral(valor);
            
            }            
            else if(pregunta == 1 && resultado == 5){
            
                valor = basico.kiloDeci(valor);
            
            }            
            else if(pregunta == 1 && resultado == 6){
            
                valor = basico.kiloCenti(valor);
            
            }            
            else if(pregunta == 1 && resultado == 7){
            
                valor = basico.kiloMili(valor);
                
            }
            else if(pregunta == 2 && resultado == 1){
                
                valor = basico.hectoKilo(valor);
                        
            }
            else if(pregunta == 2 && resultado == 2){
                                
                valor = basico.hectoHecto(valor);
            
            }            
            else if(pregunta == 2 && resultado == 3){
            
                valor = basico.hectoDeca(valor);
                
            }           
            else if(pregunta == 2 && resultado == 4){
            
                valor = basico.hectoCentral(valor);
            
            }            
            else if(pregunta == 2 && resultado == 5){
            
                valor = basico.hectoDeci(valor);
            
            }            
            else if(pregunta == 2 && resultado == 6){
            
                valor = basico.hectoCenti(valor);
            
            }            
            else if(pregunta == 2 && resultado == 7){
            
                valor = basico.hectoMili(valor);
                
            }            
            else if(pregunta == 3 && resultado == 1){
                
                valor = basico.decaKilo(valor);
                        
            }
            else if(pregunta == 3 && resultado == 2){
                                
                valor = basico.decaHecto(valor);
            
            }            
            else if(pregunta == 3 && resultado == 3){
            
                valor = basico.decaDeca(valor);
                
            }           
            else if(pregunta == 3 && resultado == 4){
            
                valor = basico.decaCentral(valor);
            
            }            
            else if(pregunta == 3 && resultado == 5){
            
                valor = basico.decaDeci(valor);
            
            }            
            else if(pregunta == 3 && resultado == 6){
            
                valor = basico.decaCenti(valor);
            
            }            
            else if(pregunta == 3 && resultado == 7){
            
                valor = basico.decaMili(valor);
                
            }
            else if(pregunta == 3 && resultado == 1){
                
                valor = basico.decaKilo(valor);
                        
            }
            else if(pregunta == 3 && resultado == 2){
                                
                valor = basico.decaHecto(valor);
            
            }            
            else if(pregunta == 3 && resultado == 3){
            
                valor = basico.decaDeca(valor);
                
            }           
            else if(pregunta == 3 && resultado == 4){
            
                valor = basico.decaCentral(valor);
            
            }            
            else if(pregunta == 3 && resultado == 5){
            
                valor = basico.decaDeci(valor);
            
            }            
            else if(pregunta == 3 && resultado == 6){
            
                valor = basico.decaCenti(valor);
            
            }            
            else if(pregunta == 3 && resultado == 7){
            
                valor = basico.decaMili(valor);
                
            }                                                
            else if(pregunta == 4 && resultado == 1){
                
                valor = basico.centralKilo(valor);
                        
            }
            else if(pregunta == 4 && resultado == 2){
                                
                valor = basico.centralHecto(valor);
            
            }            
            else if(pregunta == 4 && resultado == 3){
            
                valor = basico.centralDeca(valor);
                
            }           
            else if(pregunta == 4 && resultado == 4){
            
                valor = basico.centralCentral(valor);
            
            }            
            else if(pregunta == 4 && resultado == 5){
            
                valor = basico.centralDeci(valor);
            
            }            
            else if(pregunta == 4 && resultado == 6){
            
                valor = basico.centralCenti(valor);
            
            }            
            else if(pregunta == 4 && resultado == 7){
            
                valor = basico.centralMili(valor);
                
            }
            else if(pregunta == 5 && resultado == 1){
                
                valor = basico.centiKilo(valor);
                        
            }
            else if(pregunta == 5 && resultado == 2){
                                
                valor = basico.deciHecto(valor);
            
            }            
            else if(pregunta == 5 && resultado == 3){
            
                valor = basico.centiDeca(valor);
                
            }           
            else if(pregunta == 5 && resultado == 4){
            
                valor = basico.deciCentral(valor);
            
            }            
            else if(pregunta == 5 && resultado == 5){
            
                valor = basico.deciDeci(valor);
            
            }            
            else if(pregunta == 5 && resultado == 6){
            
                valor = basico.deciCenti(valor);
            
            }            
            else if(pregunta == 5 && resultado == 7){
            
                valor = basico.deciMili(valor);
                
            }
            else if(pregunta == 6 && resultado == 1){
                
                valor = basico.centiKilo(valor);
                        
            }
            else if(pregunta == 6 && resultado == 2){
                                
                valor = basico.centiHecto(valor);
            
            }            
            else if(pregunta == 6 && resultado == 3){
            
                valor = basico.centiDeca(valor);
                
            }           
            else if(pregunta == 6 && resultado == 4){
            
                valor = basico.centiCentral(valor);
            
            }            
            else if(pregunta == 6 && resultado == 5){
            
                valor = basico.centiDeci(valor);
            
            }            
            else if(pregunta == 6 && resultado == 6){
            
                valor = basico.centiCenti(valor);
            
            }            
            else if(pregunta == 6 && resultado == 7){
            
                valor = basico.centiMili(valor);
                
            }            
            else if(pregunta == 7 && resultado == 1){
                
                valor = basico.miliKilo(valor);
                        
            }
            else if(pregunta == 7 && resultado == 2){
                                
                valor = basico.miliHecto(valor);
            
            }            
            else if(pregunta == 7 && resultado == 3){
            
                valor = basico.miliDeca(valor);
                
            }           
            else if(pregunta == 7 && resultado == 4){
            
                valor = basico.miliCentral(valor);
            
            }            
            else if(pregunta == 7 && resultado == 5){
            
                valor = basico.miliDeci(valor);
            
            }            
            else if(pregunta == 7 && resultado == 6){
            
                valor = basico.miliCenti(valor);
            
            }            
            else if(pregunta == 7 && resultado == 7){
            
                valor = basico.miliMili(valor);
                
            }                         
            else{
            
                JOptionPane.showMessageDialog(null, "Seleccione una opción de conversión valida.");
            
            }
                     
        }
        
        if(tipoDeConversión == 2){
            
            String valor1 = valor+"";
        
            if(pregunta == 1 && resultado == 1){
                
                valor1 = datosGrandes.kiloKilo(valor1);
                        
            }
            else if(pregunta == 1 && resultado == 2){
                                
                valor1 = datosGrandes.kiloHecto(valor1);
            
            }            
            else if(pregunta == 1 && resultado == 3){
            
                valor1 = datosGrandes.kiloDeca(valor1);
                
            }           
            else if(pregunta == 1 && resultado == 4){
            
                valor1 = datosGrandes.kiloCentral(valor1);
            
            }            
            else if(pregunta == 1 && resultado == 5){
            
                valor1 = datosGrandes.kiloDeci(valor1);
            
            }            
            else if(pregunta == 1 && resultado == 6){
            
                valor1 = datosGrandes.kiloCenti(valor1);
            
            }            
            else if(pregunta == 1 && resultado == 7){
            
                valor1 = datosGrandes.kiloMili(valor1);
                
            }
            else if(pregunta == 2 && resultado == 1){
                
                valor1 = datosGrandes.hectoKilo(valor1);
                        
            }
            else if(pregunta == 2 && resultado == 2){
                                
                valor1 = datosGrandes.hectoHecto(valor1);
            
            }            
            else if(pregunta == 2 && resultado == 3){
            
                valor1 = datosGrandes.hectoDeca(valor1);
                
            }           
            else if(pregunta == 2 && resultado == 4){
            
                valor1 = datosGrandes.hectoCentral(valor1);
            
            }            
            else if(pregunta == 2 && resultado == 5){
            
                valor1 = datosGrandes.hectoDeci(valor1);
            
            }            
            else if(pregunta == 2 && resultado == 6){
            
                valor1 = datosGrandes.hectoCenti(valor1);
            
            }            
            else if(pregunta == 2 && resultado == 7){
            
                valor1 = datosGrandes.hectoMili(valor1);
                
            }            
            else if(pregunta == 3 && resultado == 1){
                
                valor1 = datosGrandes.decaKilo(valor1);
                        
            }
            else if(pregunta == 3 && resultado == 2){
                                
                valor1 = datosGrandes.decaHecto(valor1);
            
            }            
            else if(pregunta == 3 && resultado == 3){
            
                valor1 = datosGrandes.decaDeca(valor1);
                
            }           
            else if(pregunta == 3 && resultado == 4){
            
                valor1 = datosGrandes.decaCentral(valor1);
            
            }            
            else if(pregunta == 3 && resultado == 5){
            
                valor1 = datosGrandes.decaDeci(valor1);
            
            }            
            else if(pregunta == 3 && resultado == 6){
            
                valor1 = datosGrandes.decaCenti(valor1);
            
            }            
            else if(pregunta == 3 && resultado == 7){
            
                valor1 = datosGrandes.decaMili(valor1);
                
            }
            else if(pregunta == 3 && resultado == 1){
                
                valor1 = datosGrandes.decaKilo(valor1);
                        
            }
            else if(pregunta == 3 && resultado == 2){
                                
                valor1 = datosGrandes.decaHecto(valor1);
            
            }            
            else if(pregunta == 3 && resultado == 3){
            
                valor1 = datosGrandes.decaDeca(valor1);
                
            }           
            else if(pregunta == 3 && resultado == 4){
            
                valor1 = datosGrandes.decaCentral(valor1);
            
            }            
            else if(pregunta == 3 && resultado == 5){
            
                valor1 = datosGrandes.decaDeci(valor1);
            
            }            
            else if(pregunta == 3 && resultado == 6){
            
                valor1 = datosGrandes.decaCenti(valor1);
            
            }            
            else if(pregunta == 3 && resultado == 7){
            
                valor1 = datosGrandes.decaMili(valor1);
                
            }                                                
            else if(pregunta == 4 && resultado == 1){
                
                valor1 = datosGrandes.centralKilo(valor1);
                        
            }
            else if(pregunta == 4 && resultado == 2){
                                
                valor1 = datosGrandes.centralHecto(valor1);
            
            }            
            else if(pregunta == 4 && resultado == 3){
            
                valor1 = datosGrandes.centralDeca(valor1);
                
            }           
            else if(pregunta == 4 && resultado == 4){
            
                valor1 = datosGrandes.centralCentral(valor1);
            
            }            
            else if(pregunta == 4 && resultado == 5){
            
                valor1 = datosGrandes.centralDeci(valor1);
            
            }            
            else if(pregunta == 4 && resultado == 6){
            
                valor1 = datosGrandes.centralCenti(valor1);
            
            }            
            else if(pregunta == 4 && resultado == 7){
            
                valor1 = datosGrandes.centralMili(valor1);
                
            }
            else if(pregunta == 5 && resultado == 1){
                
                valor1 = datosGrandes.centiKilo(valor1);
                        
            }
            else if(pregunta == 5 && resultado == 2){
                                
                valor1 = datosGrandes.deciHecto(valor1);
            
            }            
            else if(pregunta == 5 && resultado == 3){
            
                valor1 = datosGrandes.centiDeca(valor1);
                
            }           
            else if(pregunta == 5 && resultado == 4){
            
                valor1 = datosGrandes.deciCentral(valor1);
            
            }            
            else if(pregunta == 5 && resultado == 5){
            
                valor1 = datosGrandes.deciDeci(valor1);
            
            }            
            else if(pregunta == 5 && resultado == 6){
            
                valor1 = datosGrandes.deciCenti(valor1);
            
            }            
            else if(pregunta == 5 && resultado == 7){
            
                valor1 = datosGrandes.deciMili(valor1);
                
            }
            else if(pregunta == 6 && resultado == 1){
                
                valor1 = datosGrandes.centiKilo(valor1);
                        
            }
            else if(pregunta == 6 && resultado == 2){
                                
                valor1 = datosGrandes.centiHecto(valor1);
            
            }            
            else if(pregunta == 6 && resultado == 3){
            
                valor1 = datosGrandes.centiDeca(valor1);
                
            }           
            else if(pregunta == 6 && resultado == 4){
            
                valor1 = datosGrandes.centiCentral(valor1);
            
            }            
            else if(pregunta == 6 && resultado == 5){
            
                valor1 = datosGrandes.centiDeci(valor1);
            
            }            
            else if(pregunta == 6 && resultado == 6){
            
                valor1 = datosGrandes.centiCenti(valor1);
            
            }            
            else if(pregunta == 6 && resultado == 7){
            
                valor1 = datosGrandes.centiMili(valor1);
                
            }            
            else if(pregunta == 7 && resultado == 1){
                
                valor1 = datosGrandes.miliKilo(valor1);
                        
            }
            else if(pregunta == 7 && resultado == 2){
                                
                valor1 = datosGrandes.miliHecto(valor1);
            
            }            
            else if(pregunta == 7 && resultado == 3){
            
                valor1 = datosGrandes.miliDeca(valor1);
                
            }           
            else if(pregunta == 7 && resultado == 4){
            
                valor1 = datosGrandes.miliCentral(valor1);
            
            }            
            else if(pregunta == 7 && resultado == 5){
            
                valor1 = datosGrandes.miliDeci(valor1);
            
            }            
            else if(pregunta == 7 && resultado == 6){
            
                valor1 = datosGrandes.miliCenti(valor1);
            
            }            
            else if(pregunta == 7 && resultado == 7){
            
                valor1 = datosGrandes.miliMili(valor1);
                
            }                         
            else{
            
                JOptionPane.showMessageDialog(null, "Seleccione una opción de conversión valida.");
            
            }
            
            valor = Double.parseDouble(valor1);
        
        }
        
        return valor;
      
    }

    public static void main(String[] args){

        VistaPorDefecto vista = new VistaPorDefecto();

        Controlador controlador = new Controlador(vista);
        controlador.iniciarVista();

    }

}