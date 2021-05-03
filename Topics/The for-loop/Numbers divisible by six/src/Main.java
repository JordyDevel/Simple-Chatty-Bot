import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var size = scanner.nextInt();
        int item;
        var sum = 0;
        for (int i = 0; i < size; i++) {
            item = scanner.nextInt();

            if (item % 6 == 0) {
                sum += item;
            }
        }

        System.out.println(sum);
    }
}