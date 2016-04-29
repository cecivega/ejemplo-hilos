
package cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Cliente {
static String bd = "tareaDB";
    static String login = "root";
    static String password = "3439";
    static String url = "jdbc:mysql://localhost/" + bd;
    Connection coneccion = null;

    public Cliente() {
        try {
            //obtenemos el driver de para mysql
            Class.forName("com.mysql.jdbc.Driver");

            //obtenemos la conexión
            coneccion = DriverManager.getConnection(url, login, password);

            if (coneccion != null) {
                System.out.println("Coneccion con DB exitosa");
            }
        } catch (SQLException e) {
            System.out.println("Error "+e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }

    }

    // Método que devuelve la referencia a la conexión
    public Connection getConnection() {
        return coneccion;
    }

    public void desconectar() {
        coneccion = null;
    }

    public static void main(String[] args) {
       
    }
    
}
