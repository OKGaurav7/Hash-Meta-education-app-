import java.util.*;

public class movieMagic
{
	movieMagic(){
	   a=0;
	   b="";
	   c=0.0;
	}
	    
	 void accept(){   
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the year of movie");
	    int a=sc.nextInt();
	    
	    sc.nextLine();
	    
	    System.out.println("Enter ht Title of the movie");
	    String b=sc.nextLine();
	    
	    System.out.println("Enter the rating");
	    float c=sc.nextFloat();
	    
	 }  
	    
	void display(){    
	    System.out.print("The rating of the movie"+b);
	    if(c>=0.0 && c<=2.0){
	        System.out.println("Flop");
	    }
	    else if(c>=2.1 && c<=3.4){
	        System.out.println("Semi hit");
	    }
	    else if(c>=3.5 && c<=4.5){
	        System.out.println("Hit");
	    }
	    else if(c>=4.6 && c<=5.0){
	        System.out.println("Super hit");
	    }
	    else{
	        System.out.println("Galat value hai bhai");
	    }
	}
	public static void main(){
	    movieMagic obj =new movieMagic();
	    obj.accept();
	    obj.display();
	}
	
}
