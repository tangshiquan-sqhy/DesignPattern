package com.tsq.dp.sington;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class SingtonTest {
	public static void main(String[] args) {
		System.out.println("单例模式=====");
		Set<Sington> set = new CopyOnWriteArraySet<Sington>();
		for (int i = 0; i < 10000; i++) {
			new Thread(() -> {
				Sington instance = Sington.getInstance();
				set.add(instance);
			}, String.valueOf(i)).start();
		}
		System.out.println(set);
	}
}

class Sington {

	private volatile static Sington instance = null;

	private Sington() {
	}

	public static Sington getInstance() {
		if (instance == null) {
			synchronized (Sington.class) {
				if (instance == null) {
					instance = new Sington();
				}
			}
		}
		return instance;
	}
}
