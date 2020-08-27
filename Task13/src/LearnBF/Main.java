package LearnBF;

import jdk.dynalink.Operation;

import java.util.Scanner;

public class Main {
    public enum Operations {
        NEW_SENTENCE,
        SUBSTRING,
        CONCATENATION,
        REPLACE,
        END_PROGRAM
    }
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Main Scenario = new Main();
        Scenario.run();
    }

    public void run() {
        System.out.println("Hi! Choose what you want to do!");
        for (int i = 0; i < Operations.values().length; i++) {
            System.out.println(i + ". " + Operations.values()[i]);
        }
        System.out.print("Type the number of the operation: ");
        Integer yourChoice = scanner.nextInt();
        System.out.println();


        Operations choice = Operations.values()[yourChoice];
        switch (choice) {
            case CONCATENATION: {
                funConcatenation();
                break;
            }
            case SUBSTRING: {
                funSubstring();
                break;
            }
            case NEW_SENTENCE: {
                funNewSentence();
                break;
            }
            case REPLACE: {
                funReplace();
                break;
            }
            case END_PROGRAM: {
                funEndProgram();
                break;

            }

        }
    }

}

