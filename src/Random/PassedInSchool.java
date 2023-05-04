package Random;

import java.util.Scanner;

public class PassedInSchool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passed = 0;
        int failed = 0;
        int counter = 1;

        while (counter <= 10) {
            System.out.println("Enter result (1 = pass, 2 = fail):");
            int result = input.nextInt();

            if (result == 1) {
                passed++;
            } else
                failed = failed + 1;

            counter = counter + 1;

        }
        System.out.println("passed: " + passed);
        System.out.println("Failed: " + failed);

        if (passed > 8)
            System.out.println("Bonus to instructor");
    }
}