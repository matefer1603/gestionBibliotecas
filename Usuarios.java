import javax.swing.*;

public class Usuarios {
    private String nombre;
    private String cedula;
    private String correo;
    private float dinero;

    public Usuarios(String nombre, String cedula, String correo, float dinero) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public static Usuarios nuevosUsuarios(){
        float auxPlata=0;
        String creadorUsuarioNombre= JOptionPane.showInputDialog(null,"Ingrese el nombre del Usuario");
        String creadorUsuarioCedula= JOptionPane.showInputDialog(null,"Ingrese la cedula del Usuario");
        String creadorUsuarioCorreo= JOptionPane.showInputDialog(null,"Ingrese el correo del Usuario");
        String creadorUsuarioDinero= JOptionPane.showInputDialog(null,"Ingrese la plata con la que cuenta el usuario");
        auxPlata=Float.parseFloat(creadorUsuarioDinero);
        return new Usuarios(creadorUsuarioNombre,creadorUsuarioCedula,creadorUsuarioCorreo,auxPlata);

    }

}
