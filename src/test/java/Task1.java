import java.util.Scanner;

class DivisionCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("შეიყვანე პირველი რიცხვი: ");
            int num1 = scanner.nextInt();

            System.out.print("შეიყვანე მეორე რიცხვი: ");
            int num2 = scanner.nextInt();

            try {
                int result = num1 / num2;
                System.out.println("შედეგი: " + result);
            } catch (ArithmeticException e) {
                System.out.println("ნულზე გაყოფა არ შეიძლება");
            }
        }
    }
}