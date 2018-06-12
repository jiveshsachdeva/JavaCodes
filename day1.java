class day1
{
public static void main(String []ar)
 {
  java.io.Console ob=System.console();
  
  System.out.println("+-------+");
   System.out.println("|       |");
 System.out.println("|Welcome|");
 System.out.println("|       |");
 System.out.println("+-------+");
int x=Integer.parseInt(ob.readLine("Enter a number\n"));
for(int i=1;i<=x;i++)
{
if(i%2==0)
System.out.println(i+" is Even");
else
System.out.println(i+" is Odd");
}
}
}