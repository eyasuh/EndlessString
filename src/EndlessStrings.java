import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";

        userInput = keyboard.next();

        while (userInput != "") {
            System.out.println(userInput);
            userInput = keyboard.next();

        }

    }
}

