import java.util.*;
public class li
{   public static void main(String args[])
    { 
    Scanner sc=new Scanner(System.in);
    float minbal[];
    int not[];
    int i;
    int accno[];
    String phno[];
    String name[];
    minbal=new float[10];
    not=new int[10];
    name=new String[10];
    accno=new int[10];
    phno=new String[10];
    System.out.println("WELCOME TO BANKING SYSTEM");
    System.out.println("Enter the Coustomer Details0587");
    System.out.println("Customer Details \n");
    li c[]=new li[100];

    for(i=0;i<5;i++)
    {
    System.out.print("\n Account Number :");
    accno[i]=sc.nextInt();
    System.out.print("\n Name :");
    name[i]=sc.next();
    System.out.print("\n Mobile Number to contact");
    phno[i]=sc.next();
    System.out.print("\n Minimum Balance :");
    minbal[i]=sc.nextFloat();
    System.out.print("\n Number Of Transaction :");
    not[i]=sc.nextInt();
    }
    do
    {
    for(i=0;i<5;i++)
    {
    System.out.print("\n Enter the choice to filter \n 1-Number of Transactions\n 2-Minimum Balance\n 3-Account number \n 4-Exit");
    int ch;
    System.out.print("\n Enter your Choice");
    ch=sc.nextInt();
    switch(ch)
    {
        case 1: for(i=0;i<5;i++)
                 { 
                 if(not[i]>1000)
                 {
                    if(minbal[i]>1000000)
          
                           System.out.println("Recomended Premium Rupay Debit Card for account holder -\t"+name[i]);
                 }
                 else if(not[i]>500)
                  System.out.println("Recommended Classic Rupay Debit Card \t"+name[i]);
                 else
                     System.out.println("Recomended Domestic Visa Debit Card \t"+name[i]);
                 }
                break;
        case 2:for(i=0;i<5;i++)
               {
                 if(not[i]>100)
                {
                 if(minbal[i]<100000)
             
                   System.out.println("\n Recommend the Customer with Credit Card for account holder-\t  "+name[i]);
                }

               }
                break;
        case 3: for(i=0;i<5;i++)
               {
                System.out.print("\n Enter the Account Number  for account holder \t"+name[i]);
                int acc=sc.nextInt();
                if(accno[i]==acc)
                 {
                System.out.print("Account Found Successfully\n ");
                System.out.print("Name : "+name[i]+"\tAccount Number :"+accno[i]+"\tMinimum Balance"+minbal[i]+"\tNumber of Transactions"+not[i]+"\n");
                 }
                else 
                    System.out.println("Unsuceesful search");
                }
                break;
        case 4: System.out.println("Meet You Soon in Bank");
                
                 System.exit(0);

        default: System.out.println("WRONG CHOICE");

    }
    }} while(i!=5);
    }
    }
