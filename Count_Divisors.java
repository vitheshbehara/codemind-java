import java.util.Scanner;
class Main
{
    public static int Finddivisors(int l,int r,int k)
    {
        int i,count=0;
        for(i=l;i<=r;i++)
        {
            if(i%k==0)
              count++;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int l,r,k,result;
        l=Sc.nextInt();
        r=Sc.nextInt();
        k=Sc.nextInt();
        result=Finddivisors(l,r,k);
        System.out.println(result);
    }
}