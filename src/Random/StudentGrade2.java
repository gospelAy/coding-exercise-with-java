package Random;

import java.util.Scanner;

public class StudentGrade2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.println("Enter grade or -1 to quit: ");
        int grade = input.nextInt();

        while (grade != -1) {
            total = total + grade;
            gradeCounter++;

            System.out.println("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }

            int average =  total / gradeCounter;

            System.out.println("Total of the " + gradeCounter +  " grades entered is " + total + " The class average is " + average);


        }
    }

