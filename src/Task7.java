import java.util.Scanner;

public class Task7 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please select a number from 1 to 7: ");
        int option = scanner.nextInt();

        if(option >= 1 && option<=7){

            switch (option) {
                case 1 -> System.out.println("Monday");            
                case 2 -> System.out.println("Tuesday");            
                case 3 -> System.out.println("Wednesday");            
                case 4 -> System.out.println("Thursday");            
                case 5 -> System.out.println("Friday");            
                case 6 -> System.out.println("Saturday");            
                case 7 -> System.out.println("Sunday");            
            }

        }else{
            System.out.println("Error: Please enter a number between 1 and 7");
        }

        scanner.close();
    }

}