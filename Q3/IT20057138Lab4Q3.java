import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String result = (number > 0) ? "Positive"
                       : (number < 0) ? "Negative"
                       : "Zero";

        System.out.println("Number is " + result);
    }
}
