//testing case: whether ConfixPlus can find the error of --/++;

import java.util.Scanner;

public class app_increment
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = keyboard.nextInt();
        int total = 0;

        if(num > 0)
        {
            while(num > 0)
            {
                total += num;
                num--;
            }
        }
        else
        {
            while(num > 0)
            {
                total += num;
                num--; // E
            }
        }

        System.out.println("total number is " + total);
    }
}