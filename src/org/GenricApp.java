package org;

import java.util.*;

interface UserMap<K, V> {

	void isPut(K key, V value);
	V getVal(K key);
}
class MapOne implements UserMap<Integer,String>{

	String value;
	Integer key;
	@Override
	public void isPut(Integer key, String value) {
		// TODO Auto-generated method stub
		this.value=value;
		this.key=key;
	}

	@Override
	public String getVal(Integer key) {
		// TODO Auto-generated method stub
		if(this.key==key)
		{
			return this.value;
		}else {
			return null;
		}
	}
}
public class GenricApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			UserMap<Integer,String> mOne = new MapOne();
			mOne.isPut(101,"One");
			mOne.isPut(102,"Two");
			System.out.println("value:"+mOne.getVal(102));
	}
         
}
/*
 * 
 * 
 * interface AA<E> { void add(E e); }
 * 
 * class All implements AA<Integer> {
 * 
 * @Override public void add(Integer e) { // TODO Auto-generated method stub
 * 
 * System.out.println("Data Add:" + (e + e)); }
 * 
 * }
 */