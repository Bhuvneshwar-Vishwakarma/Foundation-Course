package recursion_and_Backtracking;
import java.io.*;
import java.util.*;

public class Get_SubSequences_12 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> list = gss(str);
        System.out.println(list);
    }

    public static ArrayList<String> gss(String str){
		
		if(str.length() == 0){
		    ArrayList<String> ba = new ArrayList<>();
		    ba.add("");
		    return ba;
		}
		char ch = str.charAt(0);//a
		String ros = str.substring(1);//bc
		
		ArrayList<String> rres = gss(ros);//[--, -c, b-, bc]
		
		ArrayList<String> mres = new ArrayList<>();
		
		for(String rstr : rres){
		    mres.add("" + rstr);
		}
		for(String rstr : rres){
			mres.add(ch + rstr);
		}


		return mres;
    }

}
