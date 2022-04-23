package SourceFiles;
import java.util.Scanner;

public class WatermelonDivider {
	
	public String Divide(int w) {
		String output="";
		if(w%2==0 && w>2){
	          output="YES";

	     }
	     else{
	          output="NO";
	     }
		return output;
	}
	

	public static void main(String[] args) {
		System.out.println("Enter Weight between 1 and 100: ");
		WatermelonDivider d = new WatermelonDivider();
		int w;
        Scanner input = new Scanner(System.in);
        while(true){
             w=input.nextInt();
             if(w>=1 && w<=100){
                 break;
             }
           System.out.println("Enter Number between 1 and 100");
	}
        System.out.println(d.Divide(w));
         
	}

}
