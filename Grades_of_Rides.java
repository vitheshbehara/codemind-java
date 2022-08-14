import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner Sc=new Scanner(System.in);
        a=Sc.nextInt();
        b=Sc.nextInt();
        c=Sc.nextInt();
        if(a>50 && (b>60 && c>100))
           System.out.println(10);
        else if(a>50 && (b>60 && c<100))
           System.out.println(9);
        else if(a<50 && (b>60 && c>100))
           System.out.println(8);
        else if(a>50 && (b<60 && c>100))
           System.out.println(7);
        else if(a>50 || (b>60 || c>100))
           System.out.println(6);
        else
           System.out.println(5);
    }
}