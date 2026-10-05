import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input exam marks
        System.out.print("Enter exam marks (0 - 100): ");
        double examMarks = input.nextDouble();

        // Validate exam marks
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid exam marks.");
            return;
        }

        // Input lab marks
        System.out.print("Enter lab submission marks (0 - 100): ");
        double labMarks = input.nextDouble();

        // Validate lab marks
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid lab submission marks.");
            return;
        }

        // Input percentages
        System.out.print("Enter percentage for exam: ");
        double examPercentage = input.nextDouble();

        System.out.print("Enter percentage for lab: ");
        double labPercentage = input.nextDouble();

        // Validate percentages
        if (examPercentage < 0 || labPercentage < 0 ||
            examPercentage + labPercentage != 100) {
            System.out.println("Invalid percentages. They must add up to 100.");
            return;
        }

        // Calculate final mark
        double finalMark = (examMarks * examPercentage / 100)
                         + (labMarks * labPercentage / 100);

        System.out.printf("Final Mark = %.2f%n", finalMark);
    }
}
