package countPrimes;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();
        System.out.println(calculateNumberOfPrimes(input));
        scanner.close();
    }

    public static Integer calculateNumberOfPrimes(Integer number) {
        Integer count = 0;
        Integer primesCount = 0;
        for (int i = 2; i < number; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primesCount++;
            }
            count = 0;
        }
        return primesCount;
    }

}
