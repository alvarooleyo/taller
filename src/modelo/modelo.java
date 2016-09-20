/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
      String[] columNames = {"matricula","marca","modelo","nombre prop", "dni prop"};
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
    Object[][] data = new String[registros][7];
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
                
            i++;
            
         }
         res.close();
         //se añade la matriz de datos en el DefaultTableModel
         tablemodel.setDataVector(data, columNames );
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return tablemodel;
    }
    
}
