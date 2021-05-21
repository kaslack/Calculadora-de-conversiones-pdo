package Vista;

import javax.swing.JComboBox;
import javax.swing.border.LineBorder;

public class VistaLongitud extends VistaPorDefecto{
       
    public void vistaLongitud(){
        
        jButtonLongitud.setBorder(new LineBorder(verdePastel, 3));
        jButtonLongitud.setBackground(rojoPastel);
        
        setjLabelTituloGestión("Longitud");
        
        combosMagnitudesPregunta = new JComboBox();
        combosMagnitudesPregunta.addItem("Escoja");        
        combosMagnitudesPregunta.addItem("Kilómetro");
        combosMagnitudesPregunta.addItem("Hectómetro");
        combosMagnitudesPregunta.addItem("Decámetro");
        combosMagnitudesPregunta.addItem("Metro");
        combosMagnitudesPregunta.addItem("Decímetro");
        combosMagnitudesPregunta.addItem("Centímetro");
        combosMagnitudesPregunta.addItem("Milímetro");
        
        combosMagnitudesRespuesta = new JComboBox();
        combosMagnitudesRespuesta.addItem("Escoja");        
        combosMagnitudesRespuesta.addItem("Kilómetro");
        combosMagnitudesRespuesta.addItem("Hectómetro");
        combosMagnitudesRespuesta.addItem("Decámetro");
        combosMagnitudesRespuesta.addItem("Metro");
        combosMagnitudesRespuesta.addItem("Decímetro");
        combosMagnitudesRespuesta.addItem("Centímetro");
        combosMagnitudesRespuesta.addItem("Milímetro");        
        
    }
    
}
