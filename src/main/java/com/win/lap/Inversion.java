package com.win.lap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.win.lap.problems.LinkedList;

public class Inversion {

	public static void main(String[] args) throws IOException {
		if( true && true && false){
			System.out.println("");
		}
		HashMap<String, Integer> details = new HashMap<String, Integer>();
		List<String> user= new ArrayList<>();
		int count = 0;
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		while ((line = in.readLine()) != null) {
			System.out.println(line);
			String[] input = line.split(":");
			String[] res = input[1].split(",");
			System.out.println(res.length);
			for (int i = 0; i < res.length; i++) {
				if (!details.containsKey(res[i])) {
					details.put(res[i], count++);
				}
			}
			System.out.println(details);
			int inv = getInvCount(res, details);
			if(inv>0){
				user.add(input[0]);
			}
		}
		System.out.println(user);

	}

	static int getInvCount(String[] arr, HashMap<String, Integer> details) {
		int inv_count = 0;
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = i + 1; j < arr.length; j++)
				if (details.get(arr[i]) > details.get(arr[j]))
					inv_count++;
		return inv_count;
	}
}
