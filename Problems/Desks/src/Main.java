import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDigit = scanner.nextInt();
        int secondDigit = scanner.nextInt();
        int thirdDigit = scanner.nextInt();


        /*int n = (((firstDigit + secondDigit + thirdDigit) / 2) + ( (firstDigit + secondDigit + thirdDigit) % 2) );
        System.out.print(n);*/

        int sum = 0;
        if (firstDigit % 2 != 0) sum++;
        if (secondDigit % 2 != 0) sum++;
        if (thirdDigit % 2 != 0) sum++;
        sum = sum + 1 ;
        sum++;
        ++sum;

        sum = sum + (firstDigit / 2) + (secondDigit / 2) + (thirdDigit / 2);

        System.out.print(sum);
    }
}