package Vista;

import javax.swing.JComboBox;
import javax.swing.border.LineBorder;

public class VistaCapacidad extends VistaPorDefecto{
 
    public void vistaCapacidad(){

        jButtonCapacidad.setBorder(new LineBorder(verdePastel, 3));
        jButtonCapacidad.setBackground(rojoPastel);

        setjLabelTituloGestión("Capacidad");
     
        combosMagnitudesPregunta = new JComboBox();
        combosMagnitudesPregunta.addItem("Escoja");        
        combosMagnitudesPregunta.addItem("Kilólitro");
        combosMagnitudesPregunta.addItem("Hectólitro");
        combosMagnitudesPregunta.addItem("Decálitro");
        combosMagnitudesPregunta.addItem("Litro");
        combosMagnitudesPregunta.addItem("Decílitro");
        combosMagnitudesPregunta.addItem("Centílitro");
        combosMagnitudesPregunta.addItem("Milílitro");
        
        combosMagnitudesRespuesta = new JComboBox();
        combosMagnitudesRespuesta.addItem("Escoja");        
        combosMagnitudesRespuesta.addItem("Kilólitro");
        combosMagnitudesRespuesta.addItem("Hectólitro");
        combosMagnitudesRespuesta.addItem("Decálitro");
        combosMagnitudesRespuesta.addItem("Litro");
        combosMagnitudesRespuesta.addItem("Decílitro");
        combosMagnitudesRespuesta.addItem("Centílitro");
        combosMagnitudesRespuesta.addItem("Milílitro");
        
    }

}