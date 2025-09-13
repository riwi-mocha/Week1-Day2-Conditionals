import java.util.Scanner;

public class Task6 {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        if(age<12){
            System.out.println("You are a child");
        } else if(age>=12 && age<=17) {
            System.out.println("You are a teenager");
        } else if(age>=18){
            System.out.println("You are an adult");
        }

        scanner.close();

    }
    
}