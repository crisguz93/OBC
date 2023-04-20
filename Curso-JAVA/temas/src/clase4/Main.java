package clase4;

public class Main{
    public static void main(String[] args) {
        // creacion de objeto smartwatch
        SmartWatch sw = new SmartWatch("Samsung", "Galaxy S4", 699.99, true, "Rojo");
        //creacion de objeto smartphone
        SmartPhone sp = new SmartPhone("Samsung", "Watch4", 899.99, 300, 5);
        

        //Imprimir valores de SmartPhone
        System.out.println("SmartPhone: ");
        System.out.println("Marca: "+ sp.getBrand());
        System.out.println("Modelo: "+ sp.getModel());
        System.out.println("Precio: $"+ sp.getPrice());
        System.out.println("Duracion de la bateria: "+ sp.getBatteryLife());
        System.out.println("Almacenamiento: "+ sp.getStorage()+" GB");

        //Imprimir valores de SmartWatch
        System.out.println("Marca: "+ sw.getBrand());
        System.out.println("Modelo: "+ sw.getModel());
        System.out.println("Precio"+ sw.getPrice());
        System.out.println("Tiene gps?: "+ sw.isHasGPS());
        System.out.println("Color: "+ sw.getColor());
    }
}