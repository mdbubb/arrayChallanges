package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int grades[] = new int[1000];
        String names[] = new String[1000];
        Scanner input = new Scanner(System.in);
        int grade;
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.println("Enter name");
            String nn = input.next();
            System.out.println("Enter grade or -1");
            grade = input.nextInt();
            if (grade == -1)

                break;
            grades[count] = grade;

            names[count] = nn;
            sum = sum + grades[count];
            count++;
            int average = sum / count;

            System.out.println("The members of the class are: ");
            for (int i = 0; i < count; i++) {

                System.out.println(names[i]);
            }
            System.out.println();
            System.out.println("The average of the class is " + average);
        }


    }
}
