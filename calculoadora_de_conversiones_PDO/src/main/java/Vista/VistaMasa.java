package Vista;

import javax.swing.JComboBox;
import javax.swing.border.LineBorder;

public class VistaMasa extends VistaPorDefecto{

    public void vistaMasa(){
                
        jButtonMasa.setBorder(new LineBorder(verdePastel, 3));
        jButtonMasa.setBackground(rojoPastel);
        
        setjLabelTituloGestión("Masa");        

        combosMagnitudesPregunta = new JComboBox();
        combosMagnitudesPregunta.addItem("Escoja");
        combosMagnitudesPregunta.addItem("Kilógramo");
        combosMagnitudesPregunta.addItem("Hectógramo");
        combosMagnitudesPregunta.addItem("Decágramo");
        combosMagnitudesPregunta.addItem("Gramo");
        combosMagnitudesPregunta.addItem("Decígramo");
        combosMagnitudesPregunta.addItem("Centígramo");
        combosMagnitudesPregunta.addItem("Milígramo");         
        
        combosMagnitudesRespuesta = new JComboBox();
        combosMagnitudesRespuesta.addItem("Escoja");        
        combosMagnitudesRespuesta.addItem("Kilógramo");
        combosMagnitudesRespuesta.addItem("Hectógramo");
        combosMagnitudesRespuesta.addItem("Decágramo");
        combosMagnitudesRespuesta.addItem("Gramo");
        combosMagnitudesRespuesta.addItem("Decígramo");
        combosMagnitudesRespuesta.addItem("Centígramo");
        combosMagnitudesRespuesta.addItem("Milígramo");         
        
    }
    
}
