import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n,k;
        n=Sc.nextInt();
        k=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=k;j++)
            {
                System.out.print((char)(64+k)+" ");
            }
            k--;
            System.out.println();
        }
    }
}