import java.util.Scanner;

/**
 * Created by mb977 on 10/27/16.
 */
public class Main {
    public static void main(String[] args) {
       /*int grades[] = {90,95,100,98};
        int average;
        int sum =0;
        for(int i =0; i<grades.length; i++){
             average = sum /grades.length;
            if (i==2)
                System.out.println(average);

        }*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grades or type -1 to stop");
        int grade = input.nextInt();
        int sum = 0;
        int average = 0;
        while (grade != -1) {
            if (grade == -1) {

                System.out.println(average);
                break;
            } else {
                int grades[] = new int[1000];
                for (int i = 0; i < grades.length; i++) {
                    sum = sum + grades[i];
                        average = sum / grades.length;


                }
            }


        }

    }

}

