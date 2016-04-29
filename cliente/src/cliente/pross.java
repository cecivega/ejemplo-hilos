
package cliente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class pross {
    
    public void agregarUsuario(useri user) {
        Cliente conn = new Cliente();
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "INSERT INTO tablauser VALUES('" + user.Id + "', '" + user.Nombre+ "', '" + user.Apellidos+ user.dire+ "')";
            consulta.executeUpdate(sql);
            System.out.println("el CLIENTE se ha registrado");
            consulta.close();
            conn.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al registrar  "+e.getMessage());
        }
    }

    public ArrayList<useri> obtenUser() {
        ArrayList<useri> arrUser = new ArrayList<>();
        Cliente conn= new Cliente();
        String sql = "SELECT * FROM tablauser";
        try {
            PreparedStatement st = conn.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                useri user = new useri(rs.getInt("ID"),rs.getString("Nombre"), rs.getString("Apellidos"),rs.getString("direccion") );
                arrUser.add(user);
            }
            rs.close();
            st.close();
            conn.desconectar();

        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        return arrUser;
    }
    
}
