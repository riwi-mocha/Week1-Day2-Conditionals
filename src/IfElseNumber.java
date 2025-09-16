import java.util.Scanner;

public class IfElseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Es positivo");
        } else if (number < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero");
        }

        sc.close();
    }
}
