import java.util.Scanner;

public class calculadoraNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa la primera nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Ingresa la segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Ingresa la tercera nota: ");
        double nota3 = entrada.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("El promedio de las tres notas es: " + promedio);
    }
}
