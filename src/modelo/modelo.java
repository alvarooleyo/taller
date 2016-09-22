/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class modelo extends database{
    
    public modelo(){}
    
    public DefaultTableModel rellenarTablaExistentes() {
        
        System.out.println("Entra");
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0;
      //introducimos los nombres de las columnas
      String[] columNames = {"matricula","marca","modelo","nombre_prop", "dni_prop", "id", "motivo"};
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      String a;
        a = "SELECT count(*) as total FROM existentes";
        System.out.println("Despues del string a");
      try{
         PreparedStatement pstm = this.getConexion().prepareStatement(a);
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }
    //se crea una matriz con tantas filas y columnas que necesite
    Object[][] data = new String[registros][8];
        System.out.println("Sigue");
      try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
         PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM existentes");
         ResultSet res = pstm.executeQuery();
         //realizamos la consulta de todos los datos de la tabla sobre la BD
         int i=0;
         
            
         while(res.next()){
             //introducimos los datos en la tabla en orden, el primer parametro i 
             //se irá incrementando cada vez que se ejecute el método y asi irá
             //sumando numeros de filas.
                data[i][0] = res.getString( "matricula" );
                data[i][1] = res.getString( "marca" );
                data[i][2] = res.getString( "modelo" );
                data[i][3] = res.getString( "nombre_prop" );
                data[i][4] = res.getString("dni_prop" );
                data[i][5] = res.getString( "id" );
                data[i][6] = res.getString( "motivo" );
                
            i++;
             System.out.println(i);
         }
         res.close();
         //se añade la matriz de datos en el DefaultTableModel
         tablemodel.setDataVector(data, columNames );
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return tablemodel;
    }
    
    
    
    public void añadirCliente(String dni, String nombre){
         
           String q="insert into cliente (dni, nombre) values ('"+dni+"','"+nombre+"')";
           System.out.println(q);
         try{
             PreparedStatement pstm = this.getConexion().prepareStatement(q);
             pstm.execute();
             pstm.close();
             JOptionPane.showMessageDialog(null,"Operación Realizada");
             }catch(SQLException e){
                 JOptionPane.showMessageDialog(null,"Error: Los datos son incorrectos.\nReviselos y vuelva a intentarlo");
                 System.err.println( e.getMessage() );
                 }
        
    }
    
    public void añadirCoche(String marca, String modelo1, String matricula){
         
           String q="insert into coche (marca, modelo, matricula) values ('"+marca+"','"+modelo1+"','"+matricula+"')";
           System.out.println(q);
         try{
             PreparedStatement pstm = this.getConexion().prepareStatement(q);
             pstm.execute();
             pstm.close();
             JOptionPane.showMessageDialog(null,"Operación Realizada");
             }catch(SQLException e){
                 JOptionPane.showMessageDialog(null,"Error: Los datos son incorrectos.\nReviselos y vuelva a intentarlo");
                 System.err.println( e.getMessage() );
                 }
        
    }
    
    public void añadirExistentes(String matricula, String marca, String modelo1, String nombre_prop, String dni_prop, String motivo){
         
           String q="insert into existentes (matricula, marca, modelo, nombre_prop, dni_prop, motivo) values ('"+matricula+"','"+marca+"','"+modelo1+"','"+nombre_prop+"','"+dni_prop+"', '"+motivo+"');";
           System.out.println(q);
         try{
             PreparedStatement pstm = this.getConexion().prepareStatement(q);
             pstm.execute();
             pstm.close();
             JOptionPane.showMessageDialog(null,"Operación Realizada");
             }catch(SQLException e){
                 JOptionPane.showMessageDialog(null,"Error: Los datos son incorrectos.\nReviselos y vuelva a intentarlo");
                 System.err.println( e.getMessage() );
                 }
        
    }
    
    
     public void modificarExistentes(String matricula, String marca, String modelo1, String nombre_prop, String dni_prop, String id){
        String q="update existentes set matricula ='"+matricula+"', marca ='"+marca+"', modelo ='"+modelo1+"', nombre_prop ='"+nombre_prop+"', dni_prop ='"+dni_prop+"' where id='"+id+"';";
         try{
             PreparedStatement pstm = this.getConexion().prepareStatement(q);
             pstm.execute();
             pstm.close();
             JOptionPane.showMessageDialog(null,"Operación Realizada");
             }catch(SQLException e){
                 JOptionPane.showMessageDialog(null,"Error: Los datos son incorrectos.\nReviselos y vuelva a intentarlo");
                 System.err.println( e.getMessage() );
                 }
        
    }
    
     
     public void eliminarExistentes(String id){
        String q="delete from existentes where id='"+id+"'";
         try{
             PreparedStatement pstm = this.getConexion().prepareStatement(q);
             pstm.execute();
             pstm.close();
             JOptionPane.showMessageDialog(null,"Operación Realizada");
             }catch(SQLException e){
                 System.err.println( e.getMessage() );
                 JOptionPane.showMessageDialog(null,"No se puede realizar la operación:\nZona actualmente activa");
                 }
    }
     
      public void eliminarCoche(String matricula){
        String q="delete from coche where matricula='"+matricula+"'";
         try{
             PreparedStatement pstm = this.getConexion().prepareStatement(q);
             pstm.execute();
             pstm.close();
             JOptionPane.showMessageDialog(null,"Operación Realizada");
             }catch(SQLException e){
                 System.err.println( e.getMessage() );
                 JOptionPane.showMessageDialog(null,"No se puede realizar la operación:\nZona actualmente activa");
                 }
    }
    
    
      public void eliminarCliente(String dni){
        String q="delete from cliente where dni='"+dni+"'";
         try{
             PreparedStatement pstm = this.getConexion().prepareStatement(q);
             pstm.execute();
             pstm.close();
             JOptionPane.showMessageDialog(null,"Operación Realizada");
             }catch(SQLException e){
                 System.err.println( e.getMessage() );
                 JOptionPane.showMessageDialog(null,"No se puede realizar la operación:\nZona actualmente activa");
                 }
    }
      
       public String verMotivos(String id){
        String q="select motivo from existentes where id='"+id+"'";
         try{
             PreparedStatement pstm = this.getConexion().prepareStatement(q);
             pstm.execute();
             pstm.close();
             JOptionPane.showMessageDialog(null,"Operación Realizada");
             }catch(SQLException e){
                 System.err.println( e.getMessage() );
                 JOptionPane.showMessageDialog(null,"No se puede realizar la operación:\nZona actualmente activa");
                 }
       return q;
    }
      
}
