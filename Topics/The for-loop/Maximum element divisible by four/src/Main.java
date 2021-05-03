import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int iterations;
        int maxFourDivisible = 0;
        int prevNumber;

        do {
            iterations = scanner.nextInt();
        } while (iterations > 1_000);

        for (int i = 0; i < iterations; i++) {
            do {
                prevNumber = scanner.nextInt();
            } while (prevNumber > 3_000_000);
            if (prevNumber % 4 == 0 && prevNumber > maxFourDivisible) {
                maxFourDivisible = prevNumber;
            }
        }

        System.out.println(maxFourDivisible);

    }
}