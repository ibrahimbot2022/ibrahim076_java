import java.util.*;
class student
{
String usn,name;
int credits[]=new int[50];
int marks[]=new int[50];
int gradepoint[]=new int[50];
int n,num=0,denum=0;
double sgpa;int i;
void accept()
{
Scanner in =new Scanner(System.in);
System.out.println("enter student name and usn");
name=in.next();
usn=in.next();
System.out.println("enter number of subjects\n");
n=in.nextInt();
for(i=0;i<n;i++)
{
System.out.println("enter subject "+(i+1)+" marks");
marks[i]=in.nextInt();
System.out.println("enter subject "+(i+1)+" credits");
credits[i]=in.nextInt();
}
}
void calculate()
{
for(i=0;i<n;i++)
{
if(marks[i]>=90)
gradepoint[i]=10;
else if((marks[i]>=80) && (marks[i]<90))
gradepoint[i]=9;
else if((marks[i]>=70) && (marks[i]<80))
gradepoint[i]=8;
else if((marks[i]>=60) && (marks[i]<70))
gradepoint[i]=7;
else if((marks[i]>=50) && (marks[i]<60))
gradepoint[i]=6;
else if((marks[i]>=40) && (marks[i]<50))
gradepoint[i]=4;
else
gradepoint[i]=0;
num+=credits[i]*gradepoint[i];
denum+=credits[i];
}
sgpa =num/denum;
}
void display()
{
System.out.println("student details");
System.out.println("name:"+name+"\n"+"usn:"+usn+"\n");
System.out.println("marks \t grade");
for(i=0;i<n;i++)
{
System.out.println(marks[i]+"\t"+credits[i]);
System.out.println("\n");
}
System.out.println("SGPA="+sgpa);
}
}
class studentdemo
{
public static void main(String args[])
{
student ob=new student();
ob.accept();
ob.calculate();
ob.display();
}
}

