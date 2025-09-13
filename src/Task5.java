import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        if(number>0){
            System.out.println("The number is positive");
        } else if (number < 0){
            System.out.println("The number is negative");
        } else {
            System.out.println("is cero");
        }

        scanner.close();
    }
}