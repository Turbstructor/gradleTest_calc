import java.util.Scanner;

public class app_infiniteloop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = keyboard.nextInt();
        int total = 0;

        while(num > 0) // Error : num > 0
        {
            total += num;
        }

        System.out.println(total);

        keyboard.close();
    }
}