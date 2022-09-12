import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,k=0,c;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        c=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=c;j++)
            {
                System.out.print((j+k)+" ");
            }
            k++;
            c--;
            System.out.println();
        }
    }
}
