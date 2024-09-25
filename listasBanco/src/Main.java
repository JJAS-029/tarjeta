
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el limite de la tarjeta: ");
        double limite = lectura.nextDouble();
        tarjeta_credito tarjetaCredito= new tarjeta_credito(limite);

        int salir =1;
        while(salir != 0){
            System.out.println("Escriba la descripcion de la compra: ");
            String descripcion = lectura.next();

            System.out.println("Escriba el valor de la compra:  ");
            double valor = Double.valueOf(lectura.next());

            Compra compra= new Compra(valor, descripcion);
            boolean compraRealizada = tarjetaCredito.lanzarcompra(compra);

            if (compraRealizada){
                System.out.println("Compra realizada! \n");
                System.out.println("Escriba 0 para salir o 1 para continuar");
                salir = lectura.nextInt();

            }else {
                System.out.println("saldo insuficiente!");
                salir = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("compra realizada:\n");

        for (Compra compra: tarjetaCredito.getListaDeCompra()){
            System.out.println(compra.getDescripcion() + "-"+ compra.getValor());
        }
        System.out.println("\n********");
        System.out.println("\nsaldo de la tarjeta: "+ tarjetaCredito.getsaldo());
    }

}