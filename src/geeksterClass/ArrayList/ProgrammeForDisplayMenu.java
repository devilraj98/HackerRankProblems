
package geeksterClass.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgrammeForDisplayMenu {
  static  ArrayList<Integer> items = new ArrayList<>();
    public static void displayMenu()
    {
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
       // System.out.println("If you want to choose choose again otherwise press 4 to exit");
        System.out.println();

    }

    public static void Add()
    {
        System.out.println("Enter the element to Add");
        items.add(scn.nextInt());
        System.out.println("Item added.");
    }

    public static void Remove()
    {
        System.out.println("Enter the no the remove");

        int temp = scn.nextInt();
          if(items.contains(temp)) {
            items.remove(Integer.valueOf(temp));
            System.out.println("Items removed");
        }
        else
            System.out.println("Items not found");
    }

    public static void Display()
    {
        System.out.println(items);
    }

    public static void Exit()
    {
        System.out.println("Bye");

    }

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {




        while (true) {
            displayMenu();
            int input = scn.nextInt();

            if (input == 1)
                Add();
            else if (input == 2)
                Remove();
            else if (input == 3)
                Display();
            else if (input == 4)
            {
                Exit();
                break;
            }
        }


    }
}
