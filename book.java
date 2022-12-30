import java.util.*;
import java.lang.*;
class Book
{
      String name,author;
      int price, num_pages;  
     void getval()
     {
     
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter book name");
       name=sc.next();
       System.out.println("Enter author name");
       author=sc.next();
       System.out.println("Enter price ");
       price=sc.nextInt();
       System.out.println("Enter No. of pages");
       num_pages=sc.nextInt();
     }
    void display()
     {
         System.out.println("Details of the book");
         System.out.println("name of the book "+name);
         System.out.println("author of book "+author);
         System.out.println("book price "+price);
         System.out.println("number of pages "+num_pages);
     }
}
class Book1
{
  public static void main(String args[])
   {
     Book ob[]=new Book [3];
     for(int i=0;i<3;i++)
     {
        ob[i]=new Book();
     }
     for(int j=0;j<3;j++)
     {
        ob[j].getval();
     }
     for(int j=0;j<3;j++)
     {
        ob[j].display();
     }
   }
}
