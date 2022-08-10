import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int x;
        x=Sc.nextInt();
        if(x%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}