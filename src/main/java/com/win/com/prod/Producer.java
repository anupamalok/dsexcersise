package com.win.com.prod;

import java.util.List;

public class Producer implements Runnable{
	List<Integer> sharedQu;
	int size;
	public Producer(List<Integer> qu,int size){
		sharedQu = qu;
		this.size =size;
	}
	@Override
	public void run() {
		synchronized (sharedQu) {
			for(int i=0;i<10;i++){
				sharedQu.add(i);
			}
		}
		
	}

}
