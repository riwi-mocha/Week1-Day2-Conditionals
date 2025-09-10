import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int number = scanner.nextInt();

        if(number>0){
            System.out.println("Es positivo");
        } else if (number < 0){
            System.out.println("Es negativo");
        } else {
            System.out.println("Es cero");
        }
    }
}