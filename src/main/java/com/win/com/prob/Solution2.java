package com.win.com.prob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.win.com.prod.Comsumer;
import com.win.com.prod.Producer;

public class Solution2 {
public static void main(String args[]){
	BlockingQueue<Integer> bQueu= new ArrayBlockingQueue<>(50);
	for(int i=0; i<10;i++){
	Thread prod=new Thread(new Producer1(bQueu));
	Thread consum = new Thread(new Consumer1(bQueu));
	prod.start();
	consum.start();
	}
}
}
