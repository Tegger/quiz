import java.util.Scanner;

public class quiz {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        String answerOne = "Kirby";
        String answerTwo = "Meta Knight";
        String answerThree = "King DeDeDe";
        String answerFour = "Bandana Dee";
        String answerFive = "Sakurai";
        int score = 0;
        int correct = 0;
        int incorrect = 0;

        System.out.println("Question 1:");
        System.out.println("What is the name of Nintendo's pink puffball?");
        userInput = scanner.nextLine();

        boolean test1 = userInput.equalsIgnoreCase(answerOne);

        if(test1){
            score++;
            correct++;
        }else{
            incorrect++;
        }

        System.out.println("Question 2:");
        System.out.println("Who is both mentor and rival to Kirby throughout his games?");
        userInput = scanner.nextLine();

        boolean test2 = userInput.equalsIgnoreCase(answerTwo);

        if(test2){
            score++;
            correct++;
        }else{
            incorrect++;
        }

        System.out.println("Question 3:");
        System.out.println("What is the name of the King of Dreamland?");
        userInput = scanner.nextLine();

        boolean test3 = userInput.equalsIgnoreCase(answerThree);

        if(test3){
            score++;
            correct++;
        }else{
            incorrect++;
        }

        System.out.println("Question 4:");
        System.out.println("What is the name of the spear wielding warrior?");
        userInput = scanner.nextLine();

        boolean test4 = userInput.equalsIgnoreCase(answerFour);

        if(test4){
            score++;
            correct++;
        }else{
            incorrect++;
        }

        System.out.println("Question 5:");
        System.out.println("Who created Kirby?");
        userInput = scanner.nextLine();

        boolean test5 = userInput.equalsIgnoreCase(answerFive);

        if(test5){
            score++;
            correct++;
        }else{
            incorrect++;
        }

        System.out.println("Your score is "+ score);
        System.out.println("Your correct guesses:" + correct);
        System.out.println("Your incorrect guesses" + incorrect);

    }
}
