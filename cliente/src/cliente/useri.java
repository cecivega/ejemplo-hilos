
package cliente;

public class useri {
    
    String Nombre, Apellidos,dire;
    int Id;

    public useri() {

    }

    public useri(int id, String Nombre, String Apellidos,String dire ) {
        this.Id = id;
        this.Nombre = Nombre;
        this.Apellidos =Apellidos;
        this.dire= dire;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public void setNombre(String name) {
        this.Nombre = name;
    }

    public void setApellidos(String correo) {
        this.Apellidos = Apellidos;
    }
    public void setdire(String correo) {
        this.dire = dire;
    }

    public int getid() {
        return this.Id;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getApellidos() {
        return this.Apellidos;
    }
    public String getdire() {
        return this.dire;
    }
    String[] getRow() {
        String [] row = new String[3];
        row[0] = String.valueOf(Id);
        row[1] = Nombre;
        row[2] = Apellidos;
        row[3] = dire;
        return row;
    }
    
}
