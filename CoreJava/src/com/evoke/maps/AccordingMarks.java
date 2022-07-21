package com.evoke.maps;

import java.util.Comparator;

public class AccordingMarks implements Comparator<Student> {

	public int compare(Student s1, Student s2) {

		return s1.getMarks().compareTo(s2.getMarks());
	}

}
