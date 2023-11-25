import javax.swing.*;

public class Funcionalidades {
    //Metodo para saber si el valor ingresado es correcto o no
    public static boolean comprobacion(int n1,int mayor,int menor){
        if (n1<=mayor && n1>=menor){
            return true;
        }
        else {
            return false;
        }
    }
}
