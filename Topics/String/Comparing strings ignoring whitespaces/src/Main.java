import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var scanner = new Scanner(System.in);
        String cadena01 = scanner.nextLine();
        String cadena02 = scanner.nextLine();
        System.out.println(cadena01.replaceAll(" ", "").equals(cadena02.replaceAll(" ", "")));
    }
}