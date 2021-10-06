package codeChefContest;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class AS2S
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i = 0; i<n; i++){
		    int full = 0;
		    int partial = 0;
		    
		    for(int j = 0; j<m; j++){
		        char x = sc.next().charAt(0);
		        
		        if(x == 'F'){
		            full++;
		        }else if(x == 'P'){
		            partial++;
		        }
		        
//		        if((full >= x) || ((full = x - 1) && (partial >= y))){
//			        
//			        System.out.println("1");
//			    }else{
//			        System.out.println("0");
//			    }
		    }
		    
		    
		}
		System.out.println();

	}
}
