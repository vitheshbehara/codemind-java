import java.util.Scanner;
class Main
{
    public static void findwinner(int m,int n)
    {
        if(m%2==0 || n%2==0)
          System.out.println("Player 1");
        else
          System.out.println("Player 2");
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int m,n;
        m=Sc.nextInt();
        n=Sc.nextInt();
        findwinner(m,n);
    }
}