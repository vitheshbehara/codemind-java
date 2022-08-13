import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int x,y;
        Scanner Sc=new Scanner(System.in);
        x=Sc.nextInt();
        y=Sc.nextInt();
        if(x%2==0 && (x>0 || y%2==0))
          System.out.println("YES");
        else
          System.out.println("NO");
    }
}