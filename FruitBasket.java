// put package and the import to make the code work
package Paras_KarlChristopher;
import java.util.Stack;
import java.util.Scanner;
import java.util.Arrays;
// Create a public class
public class FruitBasket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Create a stack that will be named basket
        Stack<String> basket = new Stack<String>();
        // Ask the user to input a value
        System.out.println("Catch the fruits you like:(\'Apple\',\'Orange\',\'Mango\',\'Guava\')");
        System.out.print("How many fruits would you like to catch? ");
        int num = scan.nextInt();
        // Ask the user what fruits to eat
        System.out.println("Choose a fruit. Press any of the A, O, M, G.");
        // This is where we will pop the fruits if the user wants to
        for (int i = 0; i < num; i++) {
            System.out.print("Fruit " + (i + 1) + " of " + num + " : ");
            String fruit = scan.next();
            if (fruit.toUpperCase().equals("A"))
                basket.push("Apple");
            else if (fruit.toUpperCase().equals("O"))
                basket.push("Orange");
            else if (fruit.toUpperCase().equals("M"))
                basket.push("Mango");
            else if (fruit.toUpperCase().equals("G"))
                basket.push("Guava");
        }

        // In this section the user will eat the fruits
        System.out.println("Your basket now has: " + Arrays.toString(basket.toArray()));
        while (basket.empty() == false) {
            System.out.print("Press E or e to eat a fruit. ");
            String ch = scan.next();
            if (ch.toUpperCase().equals("E"))
                basket.pop();

            if (basket.empty() == true)
                System.out.println("No more fruits");
            else
                System.out.println("Fruits in the basket: " + Arrays.toString(basket.toArray()));
        }
    }
}
// End of Code