import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int x;
        Scanner Sc=new Scanner(System.in);
        x=Sc.nextInt();
        if(x>0)
        {
            System.out.println("Positive Number");
        }
        else
        {
            System.out.println("Negative Number");
        }
    }
}