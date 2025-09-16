import java.util.Scanner;

public class IfElseIfAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int age = sc.nextInt();

        if (age < 12) {
            System.out.println("Niño");
        } else if (age >= 12 && age <= 17) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }

        sc.close();
    }
}
