package function_and_Array_3;
import java.io.*;
import java.util.*;

public class Span_Of_Array_{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }
    int min = Integer.MAX_VALUE;//arr[0]
    int max = Integer.MIN_VALUE;//arr[0]
    for(int i = 0; i<arr.length; i++){//i = 1
        if(arr[i] > max){
            max = arr[i];
        }else if(arr[i] < min){
            min = arr[i];
        }
    }
    int span = max - min;
    System.out.println(span);

 }

}