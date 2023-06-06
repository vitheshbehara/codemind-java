import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        float pi=3.14f,Area;
        n=sc.nextInt();
        
        Area=pi*n*n;
        System.out.format("%.2f",Area);
        sc.close();
    }
}