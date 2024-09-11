package mypack.com;

import java.util.ArrayList;

import java.util.Collections;
import java.util.*;


public class sychronizedApp {

		

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		Collections.synchronizedList(al);
		
		System.out.println(al);
		
		
	}

}
