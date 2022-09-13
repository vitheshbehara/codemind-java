import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int r;
        Scanner Sc=new Scanner(System.in);
        r=Sc.nextInt();
        for(int i=r;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}