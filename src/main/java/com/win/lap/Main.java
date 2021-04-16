package com.win.lap;

import java.util.*;

class Main {

	public static String StringChallenge(String str) {
		String[] partial = str.split("=");
		String result = "";
		for (String arg : partial) {

			if (arg.contains(" ")) {
				int par = arg.lastIndexOf(" ");
				String sub = arg.substring(0, par);
				String rem = arg.substring(par);

				result = result + "=" + String.valueOf(sub.length()) + " " + String.valueOf(rem.length() - 1);
			} else if (result.equals("")) {
				result = result + String.valueOf(arg.length());
			} else if (!result.endsWith("=")) {
				result = result + "=" + String.valueOf(arg.length());
			}

		}
		if (str.endsWith("=")) {
			result = result + "=" + "0";
		}
		return result;
	}

	public static void main(String[] args) {
		// keep this function call here
		// Scanner s = new Scanner(System.in);
		// System.out.print(StringChallenge(s.nextLine()));
		int[] arr = { 1, 2, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		// System.out.println(maxReach(arr));
		int[] a = { 1, 2, 3, 7, 5 };
		//minSub(a, 12);
		sumseq();

	}

	public static int ArrayChallenge(int[] arr) {
		int n = arr.length;
		int res = 0;
		for (int i = 1; i < n - 1; i++) {
			int left = arr[i];
			for (int j = 0; j < i; j++) {
				left = Math.max(left, arr[j]);
			}
			int right = arr[i];
			for (int j = i + 1; j < n; j++) {
				right = Math.max(right, arr[j]);
			}
			res += Math.min(left, right) - arr[i];
		}
		return res;
	}

	public static int maxWater(int[] arr, int n) {

		int res = 0;

		for (int i = 1; i < n - 1; i++) {
			int left = arr[i];
			for (int j = 0; j < i; j++) {
				left = Math.max(left, arr[j]);
			}
			int right = arr[i];
			for (int j = i + 1; j < n; j++) {
				right = Math.max(right, arr[j]);
			}

			// Update maximum water value
			res += Math.min(left, right) - arr[i];
		}
		return res;
	}

	public static int maxReach(int[] arr) {
		int maxreach = arr[0];
		int step = arr[0];
		int jump = 1;
		for (int i = 1; i < arr.length; i++) {
			if (i == arr.length - 1)
				return jump;
			maxreach = Math.max(maxreach, i + arr[i]);
			step--;
			if (step == 0) {
				jump++;
				if (i >= maxreach)
					return -1;

				step = maxreach - i;
			}
		}
		return -1;
	}

	static void minSub(int[] arr, int sum) {
		int curr_sum, i, j;
		ArrayList<Integer> lst = new ArrayList<Integer>();
		for (i = 0; i < arr.length; i++) {
			curr_sum = arr[i];

			for (j = i + 1; j <= arr.length; j++) {
				if (curr_sum == sum) {
					int p = j - 1;
					lst.add(i + 1);
					lst.add(p + 1);
					System.out.println(sum);
					break;
				}
				if (curr_sum > sum || j == arr.length)
					break;
				curr_sum = curr_sum + arr[j];
			}
			if (curr_sum == sum) {
				break;
			}
		}
		
		System.out.println(lst);
	}

	static void parenthesesChecker(String expr){
		Deque<Character> stack 
        = new ArrayDeque<Character>(); 
		for(int i = 0; i < expr.length(); i++){
			char x= expr.charAt(i);
			if (x == '(' || x == '[' || x == '{'){
			stack.push(x);
			}
		}
	}
	
	static void subArraywithProductless(int arr[]){
		int p=10;
		for(int i=0;i<arr.length;i++){
			
		}
	}
	
	static void sumseq(){
		int i=0,j=5,k=-1; 
		int m,n,sum1=0,sum2;
		   for(m=i;m<=j;m++)
		   {
		       sum1=sum1+m;
		   }
		   sum2=sum1;
		   for(n=j;n>k;n--)
		   {
		       sum2=sum2+(n-1);
		   }
		   System.out.println(sum2);
	}
	}