package com.java_elementary.testCalc;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import static com.java_elementary.testCalc.IsOperator.operators;


public class CalculatorDemo {

    private static String nums;

    public static void main(String[] args) throws IOException {

        char choice, ignore;

        IsOperator operatorStart = new IsOperator();
        Priority priorityStart = new Priority();
        Calculate calculate = new Calculate();
        ShowMenu showMenu = new ShowMenu();
        IsValid isValid = new IsValid();

        for (; ; ) {
            do {
                showMenu.showMenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n'); //для игнорирования остальных символов
            } while (!isValid.isValid(choice));
            if (choice == 'q' ) {
                System.out.println("q - quitting...Bye!");
                break;
            }

            System.out.println("Введите данные... :");
            Scanner in = new Scanner(System.in);
            nums = in.nextLine();
            List<String> expression = ParseList.parse(nums);
            operatorStart.isOperator(operators);
            priorityStart.priority(operators);
//            boolean flag = nums.flag;
            System.out.println(nums + " = " + Calculate.calc(expression));
            break;
        }
    }
}
