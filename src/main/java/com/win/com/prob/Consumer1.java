package com.win.com.prob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class Consumer1 implements Runnable {
	BlockingQueue<Integer> sharedQu;
	List<Integer> arr= new ArrayList<Integer>();
	public Consumer1(BlockingQueue<Integer> qu) {
		sharedQu = qu;
	}

	@Override
	public void run() {
		System.out.println(sharedQu.drainTo(arr));
	}

}
