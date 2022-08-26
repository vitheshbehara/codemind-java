import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,digit,rev=0;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        int t=n;
        while(n>0)
        {
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(rev==t)
          System.out.println("True");
        else
          System.out.println("False");
    }
}