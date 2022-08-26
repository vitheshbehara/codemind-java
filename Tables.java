import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,r;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        r=Sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            if(i%2==1)
              System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}