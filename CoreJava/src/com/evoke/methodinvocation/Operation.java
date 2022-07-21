//package com.evoke.methodinvocation;
//
//public class Operation {
//
//	int data = 50;
//
//	void change(int data) {
//		data = data + 100;// changes will be in the local variable only
//	}
//
//	public static void main(String args[]) {
//		Operation op = new Operation();
//
//		System.out.println("before change " + op.data);
//		op.change(600);
//		System.out.println("after change " + op.data);
//
//	}
//}
//public class Operation1 {
//
//	int data = 50;
//
//	void change(Operation op) {
//		op.data = op.data + 100;// changes will be in the local variable only
//	}
//
//	public static void main(String args[]) {
//		Operation op = new Operation();
//
//		System.out.println("before change " + op.data); //50
//		op.change(op);
//		System.out.println("after change " + op.data);  //50+100=150
//
//	}
//}
