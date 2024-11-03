import java.util.Scanner;

class InputValidator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("ჩაწერე რიცხვი: ");

            try {
                int number = scanner.nextInt();
                System.out.println("შეყვანილი რიცხვი: " + number);
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }
}