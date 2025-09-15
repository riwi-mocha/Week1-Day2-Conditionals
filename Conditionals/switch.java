package Conditionals;

import java.util.Scanner;

public class switch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a day (1-7): ");
            int day = scanner.nextInt();
            String dayName;
            
            dayName = switch (day) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Invalid day";
            };
            
            System.out.println("Day " + day + " is " + dayName);
        }
    }
    
}
