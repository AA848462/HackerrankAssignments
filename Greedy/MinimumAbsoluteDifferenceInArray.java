package Greedy;

//link: https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class MinimumAbsoluteDifferenceInArray {
	
	static int minimumAbsoluteDifference(int[] arr) {
        List s=new ArrayList<Integer>();
        if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            s.add(Math.abs(arr[i]-arr[i+1]));
        }
        Collections.sort(s);
        return Integer.parseInt(Collections.min(s).toString());
    }
}
