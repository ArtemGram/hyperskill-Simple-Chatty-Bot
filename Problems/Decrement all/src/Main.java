import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        number1--;
        int number2 = in.nextInt();
        number2--;
        int number3 = in.nextInt();
        number3--;
        int number4 = in.nextInt();
        number4--;
        System.out.print(number1 + " " + number2 + " " + number3 + " " + number4);
    }
}