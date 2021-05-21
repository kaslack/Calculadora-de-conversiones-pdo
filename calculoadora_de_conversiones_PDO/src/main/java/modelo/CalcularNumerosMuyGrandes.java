package modelo;

import java.math.BigDecimal;
import java.math.MathContext;

public class CalcularNumerosMuyGrandes{
    
    public CalcularNumerosMuyGrandes(){
    
    }
    
    public String Multiplicar(String Num1, String Num2) {
        
        BigDecimal guardarNum1 = new BigDecimal(Num1);
        BigDecimal guardarNum2 = new BigDecimal(Num2);
        
        return guardarNum1.multiply(guardarNum2).toString();
        
    }
    
    public String Dividir(String Num1, String Num2){
        
        BigDecimal guardarNum1 = new BigDecimal(Num1);
        BigDecimal guardarNum2 = new BigDecimal(Num2);
        
        return guardarNum1.divide(guardarNum2, MathContext.DECIMAL128).toString();

    }
    
}