package com.win.com.prob;

import java.util.concurrent.BlockingQueue;

public class Producer1 implements Runnable {

	BlockingQueue<Integer> sharedQu;

	public Producer1(BlockingQueue<Integer> qu) {
		sharedQu = qu;
	}

	@Override
	public void run() {
		int i = 0;
		if (sharedQu.size() == 50) {
			System.out.println("The Queue is Full");
		} else {
			sharedQu.add(i);
		}
	}

}
