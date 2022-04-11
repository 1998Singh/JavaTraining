package com.evoke.nonstaticmembers;

public class ObjectReferenceDemo {
	int x;

	ObjectReferenceDemo() {

	}

	public static void main(String[] args) {
		ObjectReferenceDemo obj = new ObjectReferenceDemo();
		System.out.println(obj.x);
	}

}
