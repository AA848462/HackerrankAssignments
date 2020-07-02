package Greedy;
//link: https://www.hackerrank.com/challenges/mark-and-toys/problem
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class MarksAndToys {
	
	static int maximumToys(int[] prices, int k) {
        int c=0;
        int t=k;
        Arrays.sort(prices);
        for(int i=0;i<prices.length;i++){
            if(t-prices[i]>=0){
                c++;
                t=t-prices[i];
            }
            else{
                break;
            }
        }
        return c;
    }
}
