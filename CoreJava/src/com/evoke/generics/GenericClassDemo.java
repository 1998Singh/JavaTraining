package com.evoke.generics;

//A class that can refer to any type is known as a generic class. 
// we are using the T type parameter to create the generic class of specific type.

public class GenericClassDemo<T> // Type Parameter
{
	T obj;

	GenericClassDemo(T obj) {

		this.obj = obj;

	}

	public void show() {
		System.out.println("The type of obj is = " + obj.getClass().getName());
	}

	public T getobj() {

		return obj;

	}

}
