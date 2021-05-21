package modelo;

public class OperarNumerosMuyGrandes{
    
    CalcularNumerosMuyGrandes calcular = new CalcularNumerosMuyGrandes();    
    
    public String kiloKilo(String valor){
                
        return valor;
    
    }    
    public String kiloHecto(String valor){
        
        valor = calcular.Multiplicar(valor, "1000");
        return valor;
        
    }         
    public String kiloDeca(String valor){
        
        valor = calcular.Multiplicar(valor, "1000000");
        return valor;
    
    }         
    public String kiloCentral(String valor){
        
        valor = calcular.Multiplicar(valor, "1000000000");
        return valor;    
    
    }         
    public String kiloDeci(String valor){
        
        valor = calcular.Multiplicar(valor,"1000000000000");
        return valor;
        
    }         
    public String kiloCenti(String valor){
        
        valor = calcular.Multiplicar(valor,"1000000000000000");
        return valor;  
        
    }         
    public String kiloMili(String valor){
        
        valor = calcular.Multiplicar(valor,"1000000000000000000");
        return valor;
    
    }
    //hecto
    public String hectoKilo(String valor){
                
        valor = calcular.Dividir(valor, "1000");
        return valor;
    
    }    
    public String hectoHecto(String valor){
        
        return valor;
        
    }         
    public String hectoDeca(String valor){
        
        valor = calcular.Multiplicar(valor, "1000");    
        return valor;
    
    }         
    public String hectoCentral(String valor){
        
        valor = calcular.Multiplicar(valor, "1000000");  
        return valor;    
    
    }         
    public String hectoDeci(String valor){
        
        valor = calcular.Multiplicar(valor,"1000000000");
        return valor;
        
    }         
    public String hectoCenti(String valor){
        
        valor = calcular.Multiplicar(valor,"1000000000000");
        return valor;  
        
    }         
    public String hectoMili(String valor){
        
        valor = calcular.Multiplicar(valor,"1000000000000000");
        return valor;
    
    }  
    //deca
    public String decaKilo(String valor){
                
        valor = calcular.Dividir(valor, "1000000");
        return valor;
    
    }    
    public String decaHecto(String valor){
        
        valor = calcular.Dividir(valor, "1000");
        return valor;
        
    }         
    public String decaDeca(String valor){
        
        return valor;
    
    }         
    public String decaCentral(String valor){
        
        valor = calcular.Multiplicar(valor, "1000");
        return valor;    
    
    }         
    public String decaDeci(String valor){
        
        valor = calcular.Multiplicar(valor, "1000000");
        return valor;
        
    }         
    public String decaCenti(String valor){
        
        valor = calcular.Multiplicar(valor, "1000000000");     
        return valor;  
        
    }         
    public String decaMili(String valor){
        
        valor = calcular.Multiplicar(valor, "1000000000000");
        return valor;
    
    }        
    //central
    public String centralKilo(String valor){
                
        valor = calcular.Dividir(valor, "1000000000");
        return valor;
    
    }    
    public String centralHecto(String valor){
        
        valor = calcular.Dividir(valor, "1000000");
        return valor;
        
    }         
    public String centralDeca(String valor){
        
        valor = calcular.Dividir(valor, "1000");
        return valor;
    
    }         
    public String centralCentral(String valor){
        
        return valor;    
    
    }         
    public String centralDeci(String valor){
        
        valor = calcular.Multiplicar(valor, "1000");
        return valor;
        
    }         
    public String centralCenti(String valor){
        
        valor = calcular.Multiplicar(valor, "1000000");
        return valor;  
        
    }         
    public String centralMili(String valor){
        
        valor = calcular.Multiplicar(valor, "1000000000");
        return valor;
    
    }         
    //deci
    public String deciKilo(String valor){
                
        valor = calcular.Dividir(valor, "1000000000000");
        return valor;
    
    }    
    public String deciHecto(String valor){
        
        valor = calcular.Dividir(valor, "1000000000");
        return valor;
        
    }         
    public String deciDeca(String valor){
        
        valor = calcular.Dividir(valor, "1000000");
        return valor;
    
    }         
    public String deciCentral(String valor){
        
        valor = calcular.Dividir(valor, "1000");    
        return valor;    
    
    }         
    public String deciDeci(String valor){
        
        return valor;
        
    }         
    public String deciCenti(String valor){
        
        valor = calcular.Multiplicar(valor, "1000"); 
        return valor;  
        
    }         
    public String deciMili(String valor){
        
        valor = calcular.Multiplicar(valor, "1000000");
        return valor;
    
    }    
    //centi
    public String centiKilo(String valor){
                
        valor = calcular.Dividir(valor, "1000000000000000");
        return valor;
    
    }    
    public String centiHecto(String valor){
        
        valor = calcular.Dividir(valor, "1000000000000");
        return valor;
        
    }         
    public String centiDeca(String valor){
        
        valor = calcular.Dividir(valor, "1000000000");
        return valor;
    
    }         
    public String centiCentral(String valor){
        
        valor = calcular.Dividir(valor, "1000000");           
        return valor;    
    
    }         
    public String centiDeci(String valor){
        
        valor = calcular.Dividir(valor, "1000");  
        return valor;
        
    }         
    public String centiCenti(String valor){
        
        return valor;  
        
    }         
    public String centiMili(String valor){
        
        valor = calcular.Multiplicar(valor, "1000");
        return valor;
    
    }  
    //mili
        public String miliKilo(String valor){
                
        valor = calcular.Dividir(valor, "1000000000000000000");
        return valor;
    
    }    
    public String miliHecto(String valor){
        
        valor = calcular.Dividir(valor, "1000000000000000");
        return valor;
        
    }         
    public String miliDeca(String valor){
        
        valor = calcular.Dividir(valor, "1000000000000");
        return valor;
    
    }         
    public String miliCentral(String valor){
        
        valor = calcular.Dividir(valor, "1000000000");        
        return valor;    
    
    }         
    public String miliDeci(String valor){
        
        valor = calcular.Dividir(valor, "1000000");
        return valor;
        
    }         
    public String miliCenti(String valor){
        
        valor = calcular.Dividir(valor, "1000");;        
        return valor;  
        
    }         
    public String miliMili(String valor){
        
        return valor;
    
    }
    
}