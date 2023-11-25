import javax.swing.*;

public class Productos {
    private String nombre;
    private String codigo;
    private String escritor;
    private String stock;
    private double precio;
    private int cantidadProducto ;

    public Productos(String nombre, String codigo, String escritor, String stock, double precio, int cantidadProducto) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.escritor = escritor;
        this.stock = stock;
        this.precio = precio;
        this.cantidadProducto = cantidadProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
    //Metodo para crear nuevos objetos(libros)
    public static Productos nuevosproductos(){
        double auxPrecio=0;
        int auxCantidad=0;
        String creadorProductoNombre= JOptionPane.showInputDialog(null,"Ingrese el nombre del libro que quiere añadir");
        String creadorProductoCodigo= JOptionPane.showInputDialog(null,"Ingrese el codigo del libro que quiere añadir");
        String creadorProductoEscritor= JOptionPane.showInputDialog(null,"Ingrese el nombre del escritor que creo el libro ");
        String creadorProductoStock= JOptionPane.showInputDialog(null,"El libro tiene stock Si o No");
        String creadorProductoPrecio= JOptionPane.showInputDialog(null,"Ingrese el precio del libro");
        String creadorProductoCantidad= JOptionPane.showInputDialog(null,"Ingrese la cantidad de libros que se añaden ");
        auxPrecio=Double.parseDouble(creadorProductoPrecio);
        auxCantidad=Integer.parseInt(creadorProductoCantidad);
        return new Productos(creadorProductoNombre,creadorProductoCodigo,creadorProductoEscritor,creadorProductoStock,auxPrecio,auxCantidad);

    }


    public String impresion(){

        return "El libro " + this.getNombre() + "codigo #" + this.getCodigo() + "escrito por " + this.getEscritor() + "actualmente " + this.getStock() +"se encuentra en stock y su precio es de" + this.getPrecio() + "actualmente solo contamos con " + this.getCantidadProducto() + "de este libro.";
    }
}
