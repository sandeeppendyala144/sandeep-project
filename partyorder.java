import java.utill.Scanner;
class partyorder
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("please enter the the party type");
String s=sc.nextline();
System.out.println("please enter number of guests");
int g=sc.nextInt();
switch(s)
{
case"birthday":
System.out.println("for non veg contact office");
System.out.println("please enter number of  sweats to be serve ");
int f=sc.nextInt();
System.out.println("please enter number of  curries to be serve ");
int e=sc.nextInt();
break;
case"marriage":
System.out.println("for non veg contact office");
System.out.println("please enter number of  sweats to be serve ");
int d=sc.nextInt();
System.out.println("please enter number of  curries to be serve ");
int c=sc.nextInt();
break;
case"offical":
System.out.println("for non veg contact office");
System.out.println("please enter number of  sweats to be serve ");
int b=sc.nextInt();
System.out.println("please enter number of  curries to be serve ");
int a=sc.nextInt();
break;
}
}
}
