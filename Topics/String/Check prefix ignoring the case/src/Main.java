import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        var chain = scanner.next();
        System.out.println("J".equalsIgnoreCase(String.valueOf(chain.charAt(0))));
    }
}