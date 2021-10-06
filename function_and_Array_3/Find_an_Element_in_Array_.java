package function_and_Array_3;
import java.io.*;
import java.util.*;

public class Find_an_Element_in_Array_{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }
    int data = sc.nextInt();
    int idx = -1;
    for(int i = 0; i<arr.length; i++){
        if(arr[i] == data){
            //idx = i;
            //break;
            System.out.println(i);
            return;
        }
    }
    System.out.println(-1);
    // System.out.println(idx);

 }

}