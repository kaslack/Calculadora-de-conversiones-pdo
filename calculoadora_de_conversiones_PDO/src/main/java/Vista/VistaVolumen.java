package Vista;

import javax.swing.JComboBox;
import javax.swing.border.LineBorder;

public class VistaVolumen extends VistaPorDefecto{

    public void vistaVolumen(){

        jButtonVolumen.setBorder(new LineBorder(verdePastel, 3));
        jButtonVolumen.setBackground(rojoPastel);
        
        setjLabelTituloGestión("Volumen");
                
        combosMagnitudesPregunta = new JComboBox();
        combosMagnitudesPregunta.addItem("Escoja");        
        combosMagnitudesPregunta.addItem("Kilómetro Cúbico");
        combosMagnitudesPregunta.addItem("Hectómetro Cúbico");
        combosMagnitudesPregunta.addItem("Decámetro Cúbico");
        combosMagnitudesPregunta.addItem("Metro Cúbico");
        combosMagnitudesPregunta.addItem("Decímetro Cúbico");
        combosMagnitudesPregunta.addItem("Centímetro Cúbico");
        combosMagnitudesPregunta.addItem("Milímetro Cúbico");         
        
        combosMagnitudesRespuesta = new JComboBox();
        combosMagnitudesRespuesta.addItem("Escoja");        
        combosMagnitudesRespuesta.addItem("Kilómetro Cúbico");
        combosMagnitudesRespuesta.addItem("Hectómetro Cúbico");
        combosMagnitudesRespuesta.addItem("Decámetro Cúbico");
        combosMagnitudesRespuesta.addItem("Metro Cúbico");
        combosMagnitudesRespuesta.addItem("Decímetro Cúbico");
        combosMagnitudesRespuesta.addItem("Centímetro Cúbico");
        combosMagnitudesRespuesta.addItem("Milímetro Cúbico");
        
    }
    
}
