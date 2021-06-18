import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static ArrayList<Integer> findArray(ArrayList<ArrayList<Integer>> arr, int x){
        return arr.get(x - 1);
    }
    public static int findElements(ArrayList<Integer> arr, int y){
        if (arr.size() >= y){
            return arr.get(y - 1);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lines = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(lines);
        
        for (int i = 0; i < lines; i++){
            
            int n = sc.nextInt();
            ArrayList<Integer> subarr = new ArrayList<Integer>(n);
            for (int j = 0; j < n; j++){
                subarr.add(sc.nextInt());
            }
            arr.add(subarr);
        }
        
        
        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++){
            
            int x =  sc.nextInt();
            int y = sc.nextInt();
            int ans = findElements(findArray(arr, x), y);    
        
            if (ans == -1)
                System.out.println("ERROR!");
            else
                System.out.println(ans);
        }
    }
}

