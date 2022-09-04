import java.util.Scanner;
public class largest3
{
    public static void main(String[] args) 
    {
        int x, y, z;
        System.out.print("Enter the first number:");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();;
        y = s.nextInt();
        z = s.nextInt();
        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }
    }
}