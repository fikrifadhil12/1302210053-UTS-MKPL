import java.util.InputMismatchException;
import java.util.Scanner;

public class SmallIntegerTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmallIntegerException.resetTotalExceptions();
        while (true) {
            try {
                System.out.print("Masukkan integer: ");
                int input = scanner.nextInt();
                if (input == -99) {
                    break;
                }
                if (input < 0 || input > 9) {
                    throw new SmallIntegerException("Nilai harus antara 0 dan 9");
                }
                System.out.println("Nilai benar");
            } catch (InputMismatchException e) {
                System.out.println("Input harus integer");
                scanner.next();
            } catch (SmallIntegerException e) {
                e.print();
                System.out.println("Jumlah small int exception: " + SmallIntegerException.getTotalExceptions());
            }
        }
        scanner.close();
    }
}