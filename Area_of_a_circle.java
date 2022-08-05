import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int r;
        float pi=3.14f,Area;
        Scanner Sc=new Scanner(System.in);
        r=Sc.nextInt();
        
        Area=pi*r*r;
        
        System.out.println(Area);
    }
}