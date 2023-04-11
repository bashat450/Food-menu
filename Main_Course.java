package javaProgram;
import java.util.Scanner;
public class Main_Course {
	 public void foodInfo() {       
	    Scanner input = new Scanner(System.in);
		String[] s ={"Egg Fried Rice Manchurian    ","Chicken Rezala         ","Kolhapuri Egg Curry     ","Mutton Yakhni Pulao      ","Mutter Paneer           ","Mushroom kadhai         ","Paneer Pudina Masala      ","Dal Makhni               ","Stuffed capsicum       ","Go to Payment            "};
		int[] rate ={30,35,40,30,25,30,25,10,15,0};
		int[] qt = new int[10];
	        int sum=0;
		boolean quit=true;     
	        do{
	            System.out.println("MAIN COURSE ITEMS"+"\t\t\tPrice");
			for(int i=0;i<10;i++)
	            System.out.println((i+1)+"."+s[i]+"\t\t"+rate[i]);
	            int ch=input.nextInt();
		    if(ch>0 && ch<10)
		    {
			System.out.println("Enter the no of quantites : "+s[ch-1]);
	                 int q=input.nextInt();
		         qt[ch-1]+=q;
		    }
		    else
		    {
	               quit=false;
	              
	            }
	        }while(quit);
	        System.out.println("Your Orders are:\n");
		    for(int i=0;i<10;i++)
		    {
	             if(qt[i]!=0)
		     {
		      sum+=qt[i]*rate[i];
	              System.out.println(s[i]+"*   "+qt[i]+"=="+qt[i]*rate[i]+"rs");
		     }
		    }
		    System.out.println("Your total bill = "+sum);
	        
	         System.out.println("Thank you");
	    }
}
