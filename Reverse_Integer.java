import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,r,rev=0;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        while(n>0 || n<0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println(rev);
    }
}