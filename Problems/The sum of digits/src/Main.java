import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sotni = number/100;
        int desyatki = (number - sotni*100)/10;
        int edinici = number - sotni*100 - desyatki*10;

        System.out.println(sotni+desyatki+edinici);

        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int firstDigit = n / 100;
        int secondDigit = (n % 100) / 10;
        int thirdDigit = n % 10;

        int sum = firstDigit + secondDigit + thirdDigit;

        System.out.println(sum);*/
    }
}