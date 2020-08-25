import java.util.Scanner;

public class Condebug {
public stattic void main(String[] arg){
        Scanner input=new Scanner(System.in);
        test score=65.nextInt();
        char grade;

        if (testscore > = 90) {
            grade = 'A';
        }
        if (testscore >= 80) {
            grade = 'B';
        }
        if (testscore >= 70) {
            grade = 'C';
        }
        if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

    }


}