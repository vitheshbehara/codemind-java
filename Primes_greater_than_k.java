import java.util.Scanner;
class Main
{
  public static boolean isprime(int n)
  {
    if(n<2)
      return false;
    int count=0;
    for(int i=2;i<=(int)Math.sqrt(n);i++)
    {
      if(n%i==0)
        count++;
    }
    if(count==0)
      return true;
    else
      return false;
  }
  public static void main(String args[])
  {
    Scanner Sc=new Scanner(System.in);
    int n,x[],i,count=0,k;
    n=Sc.nextInt();
    x=new int[n];
    for(i=0;i<n;i++)
      x[i]=Sc.nextInt();
    k=Sc.nextInt();
    for(i=0;i<n;i++)
    {
      if(isprime(x[i]))
      {
        if(x[i]>=k)
          count++;
      }
    }
    System.out.println(count);
  }
}