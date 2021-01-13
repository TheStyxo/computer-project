import java.util.*;

public class MarkSheet
{ int x=0;
   int[] phy = new int[10];
   int[] maths=new int[10];
   int[] chem =new int[10];
   int[] eng = new int[10];
   int[] cs = new int[10];
   int[] total =new int[10];
   int[] rno =new int[10];
   float[] percent = new float[10];
   
   String[] stname = new String[10];
   String[] result = new String[10];
   String[] division = new String[10];
   
   void getValue()
   { char choice='y';
       Scanner sc=new Scanner(System.in);
       while (choice=='y' || choice=='Y')
      { 
      System.out.println("Enter Name :");
      stname[x]=sc.next();
      System.out.println("Roll Number :");
       rno[x]=sc.nextInt();
      System.out.println("Physics Marks :");
       phy[x]=sc.nextInt();
      System.out.println("Chem. Marks :");
       chem[x]=sc.nextInt();
      System.out.println("Maths Marks :");
       maths[x]=sc.nextInt();
      System.out.println("English Marks :");
       eng[x]=sc.nextInt();
      System.out.println("Computer Sceince Marks :");
       cs[x]=sc.nextInt();
       System.out.println("Want to add more data(y/n)");
       String s=sc.next();
       choice=s.charAt(0);
       x++;
    }
}
    void computeResult()
    { 
        for (int y=0; y<x;y++)
        {
        total[y]=phy[y]+chem[y]+maths[y]+eng[y]+cs[y];
        percent[y]=total[y]/5.0f;
        int count=0;
        if (phy[y]>=33) count++;
        if (chem[y]>=33) count++;
        if (maths[y]>=33) count++;
        if (eng[y]>=33) count++;
        if (cs[y]>=33) count++;
        
        if (count==5) result[y]="Pass";
        if (count==4) result[y]="AtKt";
        if (count<4) result[y]="Fail";
        
        if (percent[y]>=80) division[y]="Distiction";
        else if (percent[y]>=60) division[y]="First";
        else if (percent[y]>=45) division[y]="Second";
        else
        division[y]="Third";
    }
}
    
    String  repeat(int n,String s)
    { String sp="";
        for (int x=1;x<=n;x++)
        sp=sp+s;
        return sp;
    }
    
    
    void DisplayMarksheet()
    { 
       System.out.println(repeat(30," ")+"Ryan International School"); 
       System.out.println(repeat(37," ")+"Kharghar"); 
       System.out.println(); 
       System.out.println();
       System.out.println(repeat(95,"=")); 
       System.out.println("Student        Roll  Physics     Chem. Maths  English Computer Total Percent Result Division"); 
       System.out.println("Name          Number   100        100   100     100      100    500     %       -       -");
       System.out.println(repeat(95,"=")); 
       computeResult();
       for (int y=0; y<x;y++)
       {
       System.out.println(stname[y]+repeat(15-stname[y].length()," ")+rno[y]+repeat(5," ")+phy[y]+repeat(9," ")+chem[y]+repeat(4," ")+maths[y]+repeat(7," ")+eng[y]+repeat(6," ")+cs[y]+repeat(5," ")+total[y]+repeat(4," ")+percent[y]+repeat(3," ")+result[y]+repeat(2," ")+division[y]);
    }
       System.out.println(repeat(95,"="));
    
    }
       
   void DisplayMarkSheetIndivisual()
   {
       computeResult();
        for (int y=0; y<x;y++)
        {
       System.out.println(repeat(25," ")+"Ryan International School"); 
       System.out.println(repeat(32," ")+"Kharghar"); 
       System.out.println(); 
       System.out.println("Student Name : "+stname[y]);
       System.out.println("Roll Number  : "+rno[y]);
       System.out.println(repeat(50,"="));
       System.out.println("Subject          Maximum    Minimum    Marks  ");
       System.out.println("                  Marks       Mark    Obtained  ");
       System.out.println(repeat(50,"="));
       System.out.println("Physics            100         33       "+phy[y]);
       System.out.println("Chemistry          100         33       "+chem[y]);
       System.out.println("Maths              100         33       "+maths[y]);
       System.out.println("English            100         33       "+eng[y]);  
       System.out.println("Computer Sceince   100         33       "+cs[y]);
       System.out.println(repeat(50,"="));
       System.out.println("Percent : "+percent[y]+repeat(15," ")+"Total : "+total[y]);
       System.out.println("Result : "+result[y]+repeat(15," ")+"Division : "+division[y]);
       System.out.println(repeat(50,"="));
    }
}
    public static void  main(String[] args)
    {
      MarkSheet obj = new MarkSheet();
      char ch='y';
      int choice;
      Scanner sc = new Scanner(System.in);
      while (ch=='y')
      { 
          System.out.println("1. Enter Student Data");
          System.out.println("2. Display Mark Sheet(Register)");
          System.out.println("3. Display Mark Sheet(Indivisual)");
          System.out.println("4. Exit");
          System.out.println();
          System.out.print("Enter your choice ");
          choice=sc.nextInt();
          switch (choice)
          { 
              case 1 : obj.getValue();
              break;
              case 2 : obj.DisplayMarksheet();
              break;
              case 3 : obj.DisplayMarkSheetIndivisual();
              break;
              case 4 : ch='n';
              break;
              default : System.out.println("invalid Choice");
              break;
            }
        }
           
    }
}
