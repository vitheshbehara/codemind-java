import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        switch(n)
        {
            case 1:
            case 12:
                System.out.println("Winter");
                break;
            case 2:
            case 3:
                System.out.println("Spring");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Summer");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Rainy");
                break;
            default:
                System.out.println(-1);
        }
    }
}