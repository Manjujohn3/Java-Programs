import java.util.Scanner;
public class swappingWithTemp
{
    public static void main(String args[])
    {
        int x,y,temp=0;
        System.out.println("enter the numbers:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("the number before swapping:"+x+"  "+y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("the number after swapping:"+x+" "+y);
    }
}