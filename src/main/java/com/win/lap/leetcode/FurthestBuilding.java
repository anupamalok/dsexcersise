package com.win.lap.leetcode;

import java.util.PriorityQueue;

public class FurthestBuilding {

	public static void main(String args[]) {
		// int[] h={4,12,2,7,3,18,20,3,19};
		// int[] h={4,2,7,6,9,14,12};
		// int[] h={14,3,19,3};
		//int[] h = { 17, 16, 5, 10, 10, 14, 7 };
		int[] h = {1,5,1,2,3,4,10000};
		System.out.println(furthestBuilding(h, 4, 1));
	}

	public static int furthestBuilding(int[] b, int brick, int ladder) {
				int steps = b.length - 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < steps; i++) {
            int diff = b[i+1] - b[i];
            if (diff > 0) {
                if (ladder > 0) {
                    pq.add(diff);
                    ladder--;
                } else if (pq.size() > 0 && diff > pq.peek()) {
                    pq.add(diff);
                    brick -= pq.poll();
                } else brick -= diff;
                if (brick < 0) return i;
            }
        }
		return steps;

	}

}
