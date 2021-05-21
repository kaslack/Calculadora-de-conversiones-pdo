package Vista;

import Controlador.*;
import modelo.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaPorDefecto extends JFrame implements ActionListener{

    private JPanel jPanelPrincipal, jPanelTitulo, jPanelDecidir, jPanelGestión;
    
    private JLabel jLabelTitulo, jLabelEscoger, jLabelTituloGestión, jLabelPregunta, jLabelRespuesta;
        
    public JButton jButtonLongitud, jButtonMasa, jButtonCapacidad, jButtonVolumen;
    public JButton jButtonAceptar, jButtonSalir;
    
    public JComboBox combosMagnitudesPregunta = null, combosMagnitudesRespuesta = null;   
    
    public JTextField jTextFieldPregunta, jTextFieldRespuesta;   
    
    public Color rojoPastel = new Color(255, 66, 66);
    public Color verdePastel = new Color(119, 221, 119);
    
    public int tipoDeConversión;
        
    private VistaPorDefecto objetoVista = null;
            
    public void setjLabelTituloGestión(String nombre){

        jLabelTituloGestión.setText(nombre);    
        
    }
     
    public VistaPorDefecto getObjetoVista(){
        
        return objetoVista;
        
    }

    public void setObjetoVista(VistaPorDefecto objetoVista){
        
        this.objetoVista = objetoVista;
        
    }
    
    public void vistaGeneral(){
        
        setBounds(0, 0, 800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculadora de conversiones COLOMBIA");
        this.setLocationRelativeTo(null);

        jPanelPrincipal = new JPanel();
        jPanelPrincipal.setLayout(null);
        jPanelPrincipal.setBackground(verdePastel);
        
        jPanelTitulo = new JPanel();
        jPanelTitulo.setBackground(rojoPastel);
        jPanelTitulo.setBounds(5, 5, 775, 55);
        
        jPanelDecidir = new JPanel();
        jPanelDecidir.setBackground(rojoPastel);
        jPanelDecidir.setBounds(5, 65, 250, 490);  
        jPanelDecidir.setLayout(null);
        
        jPanelGestión = new JPanel();
        jPanelGestión.setLayout(null);        
        jPanelGestión.setBackground(rojoPastel);
        jPanelGestión.setBounds(260, 65, 520, 490);
        
        jLabelTitulo = new JLabel("Calculadora de conversiones COLOMBIA");
        jLabelTitulo.setForeground(Color.black);
        jLabelTitulo.setFont(new Font("arial", Font.BOLD, 35));                        
        
        jLabelTituloGestión = new JLabel("<html> primero seleccione una conversión de unidad que desea realizar. </html>"); 
        jLabelTituloGestión.setForeground(Color.black);
        jLabelTituloGestión.setFont(new Font("arial", Font.PLAIN, 20));
        jLabelTituloGestión.setBounds(5, 5, 500, 60);
                
        jLabelEscoger = new JLabel("<html> -A continuación escoga que conversión quiere hacer: </html>");
        jLabelEscoger.setForeground(Color.black);
        jLabelEscoger.setFont(new Font("arial", Font.PLAIN, 20));
        jLabelEscoger.setBounds(5, 5, 240, 80);                                   
                        
        jButtonLongitud = new JButton("Longitud");                 
        jButtonLongitud.setForeground(Color.black);
        jButtonLongitud.setFont(new Font("arial", Font.PLAIN, 15)); 
        jButtonLongitud.setBounds(55, 100, 140, 25);
        jButtonLongitud.setFocusable(false);        
        jButtonLongitud.addActionListener(this);
        
        jButtonMasa = new JButton("Masa");                 
        jButtonMasa.setForeground(Color.black);
        jButtonMasa.setFont(new Font("arial", Font.PLAIN, 15));
        jButtonMasa.setBounds(55, 150, 140, 25);
        jButtonMasa.setFocusable(false);                
        jButtonMasa.addActionListener(this);
        
        jButtonCapacidad = new JButton("Capacidad");                 
        jButtonCapacidad.setForeground(Color.black);
        jButtonCapacidad.setFont(new Font("arial", Font.PLAIN, 15));
        jButtonCapacidad.setBounds(55, 200, 140, 25);
        jButtonCapacidad.setFocusable(false);
        jButtonCapacidad.addActionListener(this);        
        
        jButtonVolumen = new JButton("Volumen");                 
        jButtonVolumen.setForeground(Color.black);
        jButtonVolumen.setFont(new Font("arial", Font.PLAIN, 15));
        jButtonVolumen.setBounds(55, 250, 140, 25);
        jButtonVolumen.setFocusable(false);
        jButtonVolumen.addActionListener(this); 
        
        jButtonAceptar = new JButton("Aceptar");                 
        jButtonAceptar.setForeground(Color.black);
        jButtonAceptar.setFont(new Font("arial", Font.PLAIN, 15));
        jButtonAceptar.setBounds(360, 200, 140, 25);
        jButtonAceptar.setFocusable(false);
        jButtonAceptar.addActionListener(this); 
        
        jButtonSalir = new JButton("Salir");                 
        jButtonSalir.setForeground(Color.black);
        jButtonSalir.setFont(new Font("arial", Font.PLAIN, 15));
        jButtonSalir.setBounds(360, 250, 140, 25);
        jButtonSalir.setFocusable(false);
        jButtonSalir.addActionListener(this);               
        
        add(jPanelPrincipal);
        
        jPanelPrincipal.add(jPanelTitulo);
        jPanelPrincipal.add(jPanelDecidir);
        jPanelPrincipal.add(jPanelGestión);
        
        jPanelTitulo.add(jLabelTitulo);
        
        jPanelDecidir.add(jLabelEscoger);
        jPanelDecidir.add(jButtonLongitud);
        jPanelDecidir.add(jButtonMasa);
        jPanelDecidir.add(jButtonCapacidad);
        jPanelDecidir.add(jButtonVolumen);
        
        jPanelGestión.add(jLabelTituloGestión);
        jPanelGestión.add(jButtonAceptar);
        jPanelGestión.add(jButtonSalir);        
        
    }
    
    public void agregarJComboBox(String tamaño){
        
        int ancho;
        
        if(tamaño.equals("volumen")){
                       
            ancho = 160;            
        
        }
        else{
            
            if(tamaño.equals("capacidad")){
            
                ancho = 90;            
                
            }
            else{
            
                ancho = 110;

            }
        
        }
        
        combosMagnitudesPregunta.setForeground(Color.black);
        combosMagnitudesPregunta.setFont(new Font("arial", Font.PLAIN, 15));
        combosMagnitudesPregunta.setBounds(100, 100, ancho, 30);
        jPanelGestión.add(combosMagnitudesPregunta);
        
        combosMagnitudesRespuesta.setForeground(Color.black);
        combosMagnitudesRespuesta.setFont(new Font("arial", Font.PLAIN, 15));                
        combosMagnitudesRespuesta.setBounds(100, 300, ancho, 30);  
        jPanelGestión.add(combosMagnitudesRespuesta);        
    
    }

    public void agregarTextField(){
        
        jTextFieldPregunta = new JTextField();
        jTextFieldPregunta.setBounds(100, 150, 150, 30);
        jPanelGestión.add(jTextFieldPregunta);
        
        jTextFieldRespuesta = new JTextField();   
        jTextFieldRespuesta.setBounds(100, 350, 150, 30);        
        jPanelGestión.add(jTextFieldRespuesta);
        
    }
    
    public void agregarJLabelPreRes(){
    
        jLabelPregunta = new JLabel("Escoja la unidad inicial: ");
        jLabelPregunta.setForeground(Color.black);
        jLabelPregunta.setFont(new Font("arial", Font.PLAIN, 20));
        jLabelPregunta.setBounds(50, 40, 240, 80);
        jPanelGestión.add(jLabelPregunta);        
                
        jLabelRespuesta = new JLabel("<html>Escoja la unidad que quiere obtener: </html>");
        jLabelRespuesta.setForeground(Color.black);
        jLabelRespuesta.setFont(new Font("arial", Font.PLAIN, 20));
        jLabelRespuesta.setBounds(50, 230, 300, 80);  
        jPanelGestión.add(jLabelRespuesta);                
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){

        if(jButtonLongitud == e.getSource()){
                               
            VistaLongitud vistaLongitud = new VistaLongitud();
            vistaLongitud.vistaGeneral();            
            vistaLongitud.vistaLongitud();
            vistaLongitud.agregarJComboBox("");  
            vistaLongitud.agregarJLabelPreRes();
            vistaLongitud.agregarTextField();
            vistaLongitud.tipoDeConversión = 1;
            vistaLongitud.setTitle("Esta convirtiendo unidades de longitud");            
            vistaLongitud.setVisible(true);
            
            vistaLongitud.setObjetoVista(vistaLongitud);
            
            setVisible(false);
                              
        }
        
        if(jButtonMasa == e.getSource()){
        
            VistaMasa vistaMasa = new VistaMasa();             
            vistaMasa.vistaGeneral();
            vistaMasa.vistaMasa();
            vistaMasa.agregarJComboBox("");
            vistaMasa.agregarJLabelPreRes();
            vistaMasa.agregarTextField();
            vistaMasa.tipoDeConversión = 1;            
            vistaMasa.setTitle("Esta convirtiendo unidades de Masa");
            vistaMasa.setVisible(true);                       
        
            vistaMasa.setObjetoVista(vistaMasa);  
            
            setVisible(false);            
            
        }
        
        if(jButtonVolumen == e.getSource()){
                         
            VistaVolumen vistaVolumen = new VistaVolumen();
            vistaVolumen.vistaGeneral();
            vistaVolumen.vistaVolumen();
            vistaVolumen.agregarJComboBox("volumen");
            vistaVolumen.agregarJLabelPreRes();  
            vistaVolumen.agregarTextField();   
            vistaVolumen.tipoDeConversión = 2;            
            vistaVolumen.setTitle("Esta convirtiendo unidades de Capacidad");
            vistaVolumen.setVisible(true);
            
            vistaVolumen.setObjetoVista(vistaVolumen);
            
            setVisible(false);
                   
        }
        
        if(jButtonCapacidad == e.getSource()){
                    
            VistaCapacidad vistaCapacidad = new VistaCapacidad();                                      
            vistaCapacidad.vistaGeneral();
            vistaCapacidad.vistaCapacidad();
            vistaCapacidad.agregarJComboBox("capacidad"); 
            vistaCapacidad.agregarJLabelPreRes();
            vistaCapacidad.agregarTextField();
            vistaCapacidad.tipoDeConversión = 1;
            vistaCapacidad.setTitle("Esta convirtiendo unidades de Volumen");           
            vistaCapacidad.setVisible(true);                       
            
            vistaCapacidad.setObjetoVista(vistaCapacidad);            
            
            setVisible(false);
                   
        }
        
        if(jButtonAceptar == e.getSource()){       
            
            String operarPreguntaS;
            operarPreguntaS = getObjetoVista().jTextFieldPregunta.getText();                              
            
            int valorComboRespuesta = getObjetoVista().combosMagnitudesRespuesta.getSelectedIndex();            
            int valorComboPregunta = getObjetoVista().combosMagnitudesPregunta.getSelectedIndex();             
            
            if(operarPreguntaS.equals("") || operarPreguntaS.equals(null)){
                
                JOptionPane.showMessageDialog(null, "No deje vacio, digite una unidad validad.");
                
            }
            else{                        
            
                if(combosMagnitudesPregunta == null || combosMagnitudesRespuesta == null){

                    JOptionPane.showMessageDialog(null, "Seleccione una opción para continuar.");

                }
                else{ 
                    
                    double operarPregunta = 0;
                    operarPregunta = Double.parseDouble(operarPreguntaS);                        

                    if(getObjetoVista().tipoDeConversión == 1){                                                        

                        OperacionFundamental basico = new OperacionFundamental();
                        Controlador enviarDatos = new Controlador(basico);                

                        enviarDatos.tipoDeConversión = tipoDeConversión;                

                        getObjetoVista().jTextFieldRespuesta.setText(enviarDatos.operaciones(valorComboPregunta, valorComboRespuesta, operarPregunta) + "");

                    }
                    else{

                        if(getObjetoVista().tipoDeConversión == 2){

                            OperarNumerosMuyGrandes datosGrandes = new OperarNumerosMuyGrandes();
                            Controlador enviarDatos = new Controlador(datosGrandes);                

                            enviarDatos.tipoDeConversión = tipoDeConversión;                

                            getObjetoVista().jTextFieldRespuesta.setText(enviarDatos.operaciones(valorComboPregunta, valorComboRespuesta, operarPregunta) + "");  

                        }

                    }
                }
            }
        }
        
        if(jButtonSalir == e.getSource()){
        
            int respuestaSalir = JOptionPane.showConfirmDialog(null, "Esta a punto de salir ¿Seguro?", "¿Salir del programa?", JOptionPane.YES_NO_OPTION);
            
            if(respuestaSalir == 0){
                
                dispose();
            
            }
            else{
            
                JOptionPane.showMessageDialog(null, "Puede seguir usando el progrma.");
            
            }
        
        }

    }
    
}