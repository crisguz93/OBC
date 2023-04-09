package clase2;

import java.util.Scanner;

public class tarea2 {
    public static void main(String[] args) {
        //creacion del objeto para entrada de datos
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio= scan.nextDouble();
        System.out.println("Ingrese la cantidad del IVA (%)");
        double iva= scan.nextDouble();
        scan.close();
        System.out.println("El precio final es: $"+total(precio,iva)); 
    }

    //funcion para calcular el precio total con el iva
    static double total(double precio,double iva){
        iva= iva/100;
        double resultado= precio+(precio*iva);
        return resultado;
    }
}
