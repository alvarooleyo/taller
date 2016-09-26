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
    this.vista.setLocationRelativeTo(null);
    
    System.out.println("Construyendo controlador");
    System.out.println("cargando tabla");
    this.vista.tablaExistentes.setModel(this.modelo.rellenarTablaExistentes());
    
}   

//declaramos los enum que utilizaremos en el switch case

public enum AccionMVC{
    
    btnAñadir,
    btnEliminar,
    btnModificar,
    btnValidar, 
    btnAveria,
    btnLimpiar
    
    
}

public enum MouseMVC{
    tablaExistentes
}
    

public void iniciar(){
    
    System.out.println("Iniciando");
    
    this.vista.setVisible(true);
    
    this.vista.panelInicio.setVisible(true);
    
    this.vista.panelPrograma.setVisible(false);
    
    this.vista.btnAgregar.setActionCommand("btnAñadir");
    this.vista.btnAgregar.addActionListener(this);
    
    this.vista.btnEliminar.setActionCommand("btnEliminar");
    this.vista.btnEliminar.addActionListener(this);
    
    this.vista.btnModificar.setActionCommand("btnModificar");
    this.vista.btnModificar.addActionListener(this);
    
    this.vista.btnValidar1.setActionCommand("btnValidar");
    this.vista.btnValidar1.addActionListener(this);
    
    this.vista.btnAveria.setActionCommand("btnAveria");
    this.vista.btnAveria.addActionListener(this);
    
    this.vista.btnLimpiar.setActionCommand("btnLimpiar");
    this.vista.btnLimpiar.addActionListener(this);
    
    
    
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
                this.vista.dialogoRecepcion.setLocationRelativeTo(vista);
                
                 this.vista.txtnombre.setText("");
                this.vista.txtMarca.setText("");
                this.vista.txtDni.setText("");
                this.vista.txtModelo.setText("");
                this.vista.txtMatricula.setText("");
                this.vista.txtId.setText("");
                
                
                
                    break;
            
            case btnValidar:
                
                String marca = this.vista.txtMarcaNuevo.getText();
                String modelo1 = this.vista.txtModeloNuevo.getText();
                String matricula2 = this.vista.txtMatriculaNuevo.getText();
                
                String nombre = this.vista.txtNombreNuevo.getText();
                                           
                String dni1 = this.vista.txtDniNuevo.getText();
                
                String averia = this.vista.txtAreaMotivoNuevo.getText();
                
                this.modelo.añadirExistentes(matricula2, marca, modelo1, nombre, dni1, averia);
                
                this.vista.txtNombreNuevo.setText("");
                this.vista.txtMarcaNuevo.setText("");
                this.vista.txtDniNuevo.setText("");
                this.vista.txtModeloNuevo.setText("");
                this.vista.txtMatriculaNuevo.setText("");
                this.vista.txtAreaMotivoNuevo.setText("");

                this.vista.setVisible(true);
                
               this.vista.tablaExistentes.setModel(this.modelo.rellenarTablaExistentes());
                
                    break;
                    
            case btnEliminar:
     
                this.modelo.eliminarExistentes(id);
                
                this.vista.tablaExistentes.setModel(this.modelo.rellenarTablaExistentes());
                
                this.vista.txtnombre.setText("");
                this.vista.txtMarca.setText("");
                this.vista.txtDni.setText("");
                this.vista.txtModelo.setText("");
                this.vista.txtMatricula.setText("");
                this.vista.txtId.setText("");
                
                    break;
                    
            case btnAveria:
                
                
                this.vista.dialogoMotivo.setVisible(true);
                
                this.vista.dialogoMotivo.setLocationRelativeTo(null);
                
                this.vista.dialogoMotivo.setSize(400, 250);
                
                this.vista.txtAreaMotivo.setText(this.modelo.verMotivos(id));
                
                
                
                    break;
                    
            case btnModificar:
                
                String matricula3 = this.vista.txtMatricula.getText();
                String modelo3 = this.vista.txtModelo.getText();
                String nombre3 = this.vista.txtnombre.getText();
                String dni3 = this.vista.txtDni.getText();
                String marca3 = this.vista.txtMarca.getText();
                String id3 = this.vista.txtId.getText();
                
                this.modelo.modificarExistentes(matricula3, marca3, modelo3, nombre3, dni3, id3);
                
                this.vista.tablaExistentes.setModel(this.modelo.rellenarTablaExistentes());
                
                this.vista.txtnombre.setText("");
                this.vista.txtMarca.setText("");
                this.vista.txtDni.setText("");
                this.vista.txtModelo.setText("");
                this.vista.txtMatricula.setText("");
                this.vista.txtId.setText("");
                
                
                    break;
                
            case btnLimpiar:
                
                this.vista.txtnombre.setText("");
                this.vista.txtMarca.setText("");
                this.vista.txtDni.setText("");
                this.vista.txtModelo.setText("");
                this.vista.txtMatricula.setText("");
                this.vista.txtId.setText("");
                
                
                    break;
            
        }
            
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        int fila;
        
        System.out.println("Entra en el case tabla");
             fila = this.vista.tablaExistentes.rowAtPoint(e.getPoint());
             
          
            if (fila > -1){            
                
                
                this.vista.txtMatricula.setText( String.valueOf( this.vista.tablaExistentes.getValueAt(fila, 0) ));
                this.vista.txtMarca.setText( String.valueOf( this.vista.tablaExistentes.getValueAt(fila, 1) ));
                this.vista.txtModelo.setText( String.valueOf( this.vista.tablaExistentes.getValueAt(fila, 2) ));
                this.vista.txtnombre.setText( String.valueOf( this.vista.tablaExistentes.getValueAt(fila, 3) ));
                this.vista.txtDni.setText(String.valueOf((this.vista.tablaExistentes.getValueAt(fila, 4))));
                this.vista.txtId.setText(String.valueOf((this.vista.tablaExistentes.getValueAt(fila, 5))));
                
                
                
                
            }
               
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
