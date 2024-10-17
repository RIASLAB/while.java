import java.util.Scanner;

public class naturales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroEntrada = 0;
        int resultado = 0;
        int control = 0;

        System.out.print("Ingrese el numero que desea calcular: ");
        numeroEntrada = scanner.nextInt();

        while (numeroEntrada >= control) {
            resultado = resultado + control;
            control = control + 1;
        }

        System.out.println("La suma de los primeros " + numeroEntrada + " naturales es igual a " + resultado);
        
        scanner.close();
    }
}
