package com.win.com.prod;

import java.util.List;

import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer;

public class Comsumer implements Runnable{
	List<Integer> sharequ;
	int size;
	public Comsumer(List<Integer> qu, int size){
		sharequ = qu;
		this.size = size;
	}
	@Override
	public void run() {
		for(int i:sharequ){
			System.out.println(i);
		}
		
	}
}
