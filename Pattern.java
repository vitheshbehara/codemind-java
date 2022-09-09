import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int r;
        Scanner Sc=new Scanner(System.in);
        r=Sc.nextInt();
        
        
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=r;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}