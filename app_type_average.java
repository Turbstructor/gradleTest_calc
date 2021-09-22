import java.util.Scanner;

public class app_type_average {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = keyboard.nextInt();
        System.out.print("Divider: ");
        int div = keyboard.nextInt();

        int answer = num/div ; // Error : int -> float

        System.out.println(answer);
        keyboard.close();
    }
}
