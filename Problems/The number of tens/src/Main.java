import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println((number / 10)% 10);
        //System.out.print(new Scanner(System.in).nextInt() % 100 / 10);
    }
}