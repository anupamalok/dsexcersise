package com.win.lap;

import java.io.IOException;
import java.io.*;
import java.util.*;

public class TestClass {
	public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr=new PrintWriter(System.out);
        int m=sc.nextInt();
        int y = sc.nextInt();
        long k= sc.nextLong();
        String s = sc.next();
        String output=find_num(y,k,s,m);
        System.out.println(output);
        br.close();
        pr.close();
    }
        static String find_num(int x, long k,String s, int n){
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            int i=0;
            while(i<s.length()){
            	List<Integer> arr = new ArrayList<Integer>();
                int l=i;
                for(int j=i;j<Math.min(s.length(),l+x);j++,i++){
                    int val = s.charAt(i)-'0';
                    if(!arr.contains(val)){
                        arr.add(val);
                    }
                }
                Collections.sort(arr);
                res.add(arr);
            }
            k--;
            ArrayList<Integer> result= new ArrayList<Integer>();
            for(int j=res.size()-1;j>=0;j--){
                int index=res.get(j).size();
                int e=res.get(j).get((int)(k%index));
                result.add(e);
                k=k/index;
            }
            Collections.reverse(result);
            StringBuilder str = new StringBuilder();
            for(int num:result){
                str.append(num);
            }
            return str.toString();
        }
        
        static int solve(int a[],int b[]){
        	int ele=0;
        	for(int i=0;i<a.length;i++){
        		for(int j=i;i<a.length;j++){
        			if(a[i]==a[j] && b[i] == a[i]){
        				
        				}
        			else
        				ele = ele + 1;
        		}
        	}
        	return 1;
        }
}