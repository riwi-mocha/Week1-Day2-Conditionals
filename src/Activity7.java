import java.util.Scanner;

public class Activity7 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Selecciona un numero del 1 al 7: ");
        int option = scanner.nextInt();

        if(option >= 1 && option<=7){

            switch (option) {
                case 1 -> System.out.println("Lunes");            
                case 2 -> System.out.println("Martes");            
                case 3 -> System.out.println("Miercoles");            
                case 4 -> System.out.println("Jueves");            
                case 5 -> System.out.println("Viernes");            
                case 6 -> System.out.println("Sabado");            
                case 7 -> System.out.println("Domingo");            
            }

        }else{
            System.out.println("Error, el numero tiene que estar entre 1 y 7");
        }

        scanner.close();
    }

}
