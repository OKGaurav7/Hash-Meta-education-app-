/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner obj = new Scanner(System.in);
		double a= obj.nextInt();
		double Disc;
		if(a<=2000){
		    Disc=0.05*a;
		    System.out.println("Discount value is"+Disc);
		}
		else if(a>=2001 && a<=5000){
		    Disc=0.25*a;
		    System.out.println(+Disc);
		}
		
		else if(a>=5001 && a<=10000){
		    Disc=0.35*a;
		    System.out.println(+Disc);
		}
		else{
		    Disc=0.50*a;
		    System.out.println(+Disc);
		}
		
		
	}
}
____________________________________________________________
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter number");
		int a=obj.nextInt();     
		
		for(int i=1;i<=a;i++)
		{
		    System.out.print(" ");
		    for(int j=i;j<=a;j++){
		        System.out.print("|");
		        
		    }
		   
		}
	}
}

_____________________________________________________
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int a=2;
		double x=0;
		for(int i=1;i<21;i++){
		    if(i%2==0){
		        x=x-Math.pow(a,i);
		    }
		    else{
		        x=x+Math.pow(a,i);
		        
		    }
		}
		
		System.out.println("The output is"+x);
	}
}

