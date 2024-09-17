import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Juego de Adivina el numero Secreto");
        Scanner datos = new Scanner(System.in);

        int numeroSecreto = new Random().nextInt(100);
        int limiteIntentos = 6;
        int numeroUsuario = 0;
        int contador = 1;
        int intentos = 5;

        while(numeroSecreto != numeroUsuario){
            System.out.println("Ingresa un numero del 1 al 100, tienes " + intentos-- + " intentos.");
            numeroUsuario = datos.nextInt();
            if (numeroSecreto==numeroUsuario){
                System.out.println("Acertaste, el numero es"+ numeroSecreto);
            }else {
                if (numeroSecreto>=numeroUsuario)
                    System.out.println("Lo siento," + contador + " intento"+ " no acertaste, el número es mayor");
                else {
                    System.out.println("Lo siento," + contador + " intento"+ " no acertaste, el número es menor");
                }
                contador++;

                if (contador >= limiteIntentos){
                    System.out.println("Lo lamento, llegaste al numero maximo de intentos");
                    break;
                }

            }
        }
    }
}