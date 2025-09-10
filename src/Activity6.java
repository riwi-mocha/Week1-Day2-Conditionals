import java.util.Scanner;

public class Activity6 {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int age = scanner.nextInt();

        if(age<12){
            System.out.println("Niño");
        } else if(age>=12 && age<=17) {
            System.out.println("Adolescente");
        } else if(age>=18){
            System.out.println("Adulto");
        }


    }
    
}
