import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        exercises questions = new exercises();

        System.out.println("Escolha um número: ");
        int userNum = scan.nextInt();

        switch (userNum){
            case 1: questions.question1();
                break;
            case 2: questions.question2();
                break;
            case 3: questions.question3();
                break;
            case 4: questions.question4();
                break;
            case 5: questions.question5();
                break;
            case 6: questions.question6();
                break;
            case 7: questions.question7();
                break;
            case 8: questions.question8();
                break;
            case 9: questions.question9();
                break;
            case 10: questions.question10();
                break;
            case 11: questions.question11();
                break;
            case 12: questions.question12();
                break;
            case 13: questions.question13();
                break;
            case 14: questions.question14();
                break;
            case 15: questions.question15();
                break;
            case 16: questions.question16();
                break;
        }

    }
}