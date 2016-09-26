package modelo;

/**
 *
 * @author Usuario
 */
import java.sql.*;
/**
 * @version 1.0
 * @author Alvaro Marquez
 */
public class database {
 /* DATOS PARA LA CONEXION */
  /** base de datos por defecto es test*/
  private String db = "dam38_taller";
  /** usuario */
  private String user = "dam38";
  /** contraseÃ±a de MySql*/
  private String password = "nikiekany";
  /** Cadena de conexion */
  private String url = "jdbc:mysql://79.148.236.236/"+db;
  /** variable para trabajar con la conexion a la base de datos */
  private Connection conn = null;

   /** Constructor de clase */
   public database(){
        this.url = "jdbc:mysql://79.148.236.236/"+this.db;
       try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexiÃ³n
         conn = DriverManager.getConnection( this.url, this.user , this.password ); 
         System.out.println("Connection succeed!");
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }catch(ClassNotFoundException e){
         System.err.println( e.getMessage() );
      }
   }

    /**
     *
     * @return Connection
     */
    public Connection getConexion()
   {
    return this.conn;
   }

}
