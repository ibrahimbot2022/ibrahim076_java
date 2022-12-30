import java.util.Scanner;
import java.lang.Math;
class Account
{
String name, acc_type;
int acc_no;
double bal,dep;
Scanner scan= new Scanner(System.in);
void setd()
{
System.out.println("Enter your Name:");
name=scan.next();
System.out.println("Enter your Account Number:");
acc_no=scan.nextInt();
System.out.println("Enter your Account type: (Savings/Current)");
acc_type=scan.next();
System.out.println("Enter the Bank Balance:");
bal=scan.nextInt();
}
void disp()
{
System.out.println("Name: "+name);
System.out.println("Account Number: "+acc_no);
System.out.println("Account Type: "+acc_type);
System.out.println("Current balance is: "+bal);
}
void deposit()
{
System.out.println("Enter the amount to be deposited:");
dep=scan.nextInt();
bal+=dep;
System.out.println("BALANCE AMOUNT: "+bal);
}
/*boolean acc(String acc_type)
{
if(acc_type.equals("Savings"))
return true;
else if(acc_type=="Current")
return false;
else
return true;
}*/
}
class Cur_acct extends Account
{
int penal()
{
double min, pen;
System.out.println("Enter Minimum balance & penalty amount if not followed:");
min=5000; pen=min*0.05;
if(bal<min)
{
bal-=pen;
System.out.println("Penalty imposed for having insufficient balance"); return 0;
}
else
    {System.out.println("No penalty");  
    return 1;}
}
void withdrawal()
{
double amt;
System.out.println("Enter amount to be withdrawn:");
amt=scan.nextInt();
            int a= penal();
if(a==1)
{
if(bal>=amt)
                { bal=bal-amt;
System.out.println("Account Balance after withdrawal is:" +bal);}
}
else
               System.out.println("The amount can't be withdrawn");
      }
}
class Sav_acct extends Account
{
void calc_interest()
{
System.out.println("Enter Time in years and Rate of interest");
double t=scan.nextDouble(); double r=scan.nextDouble();
double CI = bal*Math.pow((1 + r/ 100), t);
System.out.println("ACCOUNT BALANCE:" + bal);
System.out.println("Compounding interest:"+ CI);
}
void withdrawal()
{
double amt;
System.out.println("Enter amount to be withdrawn:");
amt=scan.nextInt();
if(bal>=amt)
                { bal=bal-amt;
System.out.println("Account Balance after withdrawal is:" +bal);}
else
               System.out.println("The amount can't be withdrawn");
      }
}
class Bank
{
  public static void main(String arg[])
  {
Scanner ss=new Scanner(System.in);
Account b1=new Account();
b1.setd();
if(b1.acc_type.equals("Savings"))
{
Sav_acct s1=new Sav_acct();
//s1=b1;
s1.name=b1.name; s1.acc_no=b1.acc_no; s1.acc_type=b1.acc_type; s1.bal=b1.bal;
while(true)
{
System.out.println("Enter your choice:\n1.Deposit\n2.Calculate interest\n3.Withdraw\n4.Display\n5.Exit");
int choice=ss.nextInt();
switch(choice)
{
case 1: s1.deposit(); break;
case 2: s1.calc_interest(); break;
case 3: s1.withdrawal(); break;
case 4: s1.disp(); break;
case 5: System.exit(0);
default: System.out.println("Invalid input");
}
}
}
else if(b1.acc_type.equals("Current"))
{
Cur_acct c1=new Cur_acct();
c1.name=b1.name; c1.acc_no=b1.acc_no; c1.acc_type=b1.acc_type; c1.bal=b1.bal;
while(true)
{
System.out.println("Enter your choice:\n1.Deposit\n2.Penalty Check\n3.Withdraw\n4.Display\n5.Exit");
int choice=ss.nextInt();
switch(choice)
{
case 1: c1.deposit(); break;
case 2: c1.penal(); break;
case 3: c1.withdrawal(); break;
case 4: c1.disp(); break;
case 5: System.exit(0);
default: System.out.println("Invalid input");
}
}
}
else
  System.out.println("Invalid Account type");
   }
}

