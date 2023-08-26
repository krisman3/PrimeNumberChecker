import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean cont = true;
        do {
            System.out.println("Provide a positive integer: ");

            int num = scanner.nextInt();
            scanner.nextLine();

            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
            System.out.println("Do you want to check another integer? (yes/no)");
            String choice = scanner.nextLine();
            if (!(choice.equalsIgnoreCase( "yes") || (choice.equalsIgnoreCase("yup"))))
            cont = false;
            ;

            } while(cont);
        }
    }
