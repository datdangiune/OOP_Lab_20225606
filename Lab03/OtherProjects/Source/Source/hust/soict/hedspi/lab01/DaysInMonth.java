package hust.soict.hedspi.lab01;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = -1;
        String monthInput;
        int month = -1;

        String[] months = { "January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December" };

        while (true) {
            System.out.print("Enter a year (non-negative number): ");
            year = scanner.nextInt();
            scanner.nextLine(); 

            if (year < 0) {
                System.out.println("Invalid year. Please enter a non-negative number.");
                continue;
            }

            System.out.print("Enter a month (name, abbreviation, or number): ");
            monthInput = scanner.nextLine().trim();

            month = getMonthFromInput(monthInput, months);
            
            if (month != -1) {
                break;
            } else {
                System.out.println("Invalid month. Please try again.");
            }
        }

        int days = getDaysInMonth(month, year);

        System.out.println("The number of days in " + months[month - 1] + " " + year + " is: " + days);

        scanner.close();
    }

    private static int getMonthFromInput(String input, String[] months) {
        input = input.toLowerCase();
        
        for (int i = 0; i < months.length; i++) {
            if (months[i].toLowerCase().startsWith(input)) {
                return i + 1; 
            }
        }

        try {
            int monthNumber = Integer.parseInt(input);
            if (monthNumber >= 1 && monthNumber <= 12) {
                return monthNumber;
            }
        } catch (NumberFormatException e) {

        }

        return -1; 
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            case 2: // February
                return (isLeapYear(year)) ? 29 : 28;
            default:
                return -1; // Invalid month
        }
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
