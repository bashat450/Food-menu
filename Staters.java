package javaProgram;
import java.util.Scanner;
public class Staters {
	public void  foodInfo(){
		Scanner input = new Scanner(System.in);
		String[] s ={"Lemon Chicken    ","Grilled Chicken    ","Veg Manchurian    ","Veg Spring rolls     ","Mushroom 65        ","Paneer 65        ","Green Paper Chicken ","Chicken Crispy     ","Chicken 65      ","Go to Payment       "};
		int[] rate ={30,35,40,30,25,30,25,10,15,0};
		int[] qt = new int[10];
	        int sum=0;
		boolean quit=true;     
	        do{
	            System.out.println("STATERS ITEM"+"\t\t\tPrice");
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
	public static void main(String args[] ){
		Staters s = new Staters();
		s.foodInfo();
	}
}
