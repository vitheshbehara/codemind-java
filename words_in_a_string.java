import java.util.Scanner;
class String13
{
  public static void main(String args[])
  {
    Scanner Sc=new Scanner(System.in);
    String s1=Sc.nextLine();

    String words[]=s1.split(" ");
      System.out.println(words.length);
  }
}