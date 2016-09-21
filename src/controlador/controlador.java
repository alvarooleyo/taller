/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.modelo;
import vista.vista;

/**
 *
 * @author Usuario
 */
public class controlador implements ActionListener, MouseListener {

    //instancia a nuestra interfaz
    vista vista;
    
    //instancia al modelo que usaremos
    modelo modelo=new modelo();
    
    
public controlador (vista vista){
    this.vista=vista;
    
    System.out.println("Construyendo controlador");
    
}   

//declaramos los enum que utilizaremos en el switch case

public enum AccionMVC{
    
    btnAñadir,
    btnEliminar,
    btnModificar,
    btnValidar, 
    btnMotivo
    
    
}

public enum MouseMVC{
    tablaExistentes
}
    

public void iniciar(){
    
    System.out.println("Iniciando");
    
    this.vista.setVisible(true);
    
    this.vista.btnAgregar.setActionCommand("btnAñadir");
    this.vista.btnAgregar.addActionListener(this);
    
    this.vista.btnEliminar.setActionCommand("btnEliminar");
    this.vista.btnEliminar.addActionListener(this);
    
    this.vista.btnModificar.setActionCommand("btnEliminar");
    this.vista.btnModificar.addActionListener(this);
    
    this.vista.btnValidar1.setActionCommand("btnValidar");
    this.vista.btnValidar1.addActionListener(this);
    
    this.vista.btnMotivo.setActionCommand("btnMotivo");
    this.vista.btnMotivo.addActionListener(this);
    
    
    
    this.vista.tablaExistentes.addMouseListener(this);
    this.vista.tablaExistentes.setName("tablaExistentes");
}
    
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String dni = this.vista.txtDniNuevo.getText();
        String matricula = this.vista.txtMatriculaNuevo.getText();
        String id = this.vista.txtId.getText();
                        
                
        
        switch ( AccionMVC.valueOf(e.getActionCommand()) ){
            
            
            case btnAñadir:
                
                this.vista.dialogoRecepcion.setVisible(true);
                
                    break;
            
            case btnValidar:
                
                String marca = this.vista.txtMarcaNuevo.getText();
                String modelo1 = this.vista.txtModeloNuevo.getText();
                String matricula2 = this.vista.txtMatriculaNuevo.getText();
                
                String nombre = this.vista.txtNombreNuevo.getText();
                                           
                String dni1 = this.vista.txtDniNuevo.getText();
                
                String motivo = this.vista.txtAreaMotivoNuevo.getText();
                
                this.modelo.añadirExistentes(matricula2, marca, modelo1, nombre, dni1, motivo);
                this.modelo.añadirCoche(marca, modelo1, matricula);
                this.modelo.añadirCliente(dni1, nombre);
                
                this.vista.setVisible(true);
                
                this.modelo.rellenarTablaExistentes();
                
                    break;
                    
            case btnEliminar:
                
                this.modelo.eliminarCliente(dni);
                this.modelo.eliminarCoche(matricula);
                this.modelo.eliminarExistentes(id);
                
                    break;
                    
            case btnMotivo:
                
                
                this.vista.dialogoMotivo.setVisible(true);
                
                this.vista.txtAreaMotivo.setText(this.modelo.verMotivos(id));
                
                    break;
            
        }
            
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
