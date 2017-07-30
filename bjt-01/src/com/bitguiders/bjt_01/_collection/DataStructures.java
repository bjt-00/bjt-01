package com.bitguiders.bjt_01._collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;


public class DataStructures {
	
	//neither null key, nor null values allowed, also its synchronized
	public static void hashtable(){
		System.out.println("\nHashtable\nkey,value");
		Hashtable<String,String> table = new Hashtable<String,String>();
		table.put("a","a1");
		table.put("a","a2");
		//table.put("b",null);
		//table.put(null,"b");
		//table.put("c",null);
		//table.put(null,"c");
		
		for(String key:table.keySet()){
			System.out.println(key+","+table.get(key));
		}
	}
	//both null key/values are allowed, also not synchronized
	public static void hashMap(){
		System.out.println("\nHashMap\nkey,value");
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("a","a1");
		map.put("a","a2");
		map.put("b",null);
		map.put(null,"b");
		map.put("c",null);
		map.put(null,"c");
		map.put("a","a3");
		
		for(String key:map.keySet()){
			System.out.println(key+","+map.get(key));
		}
	}
	public static void treeMap(){
		System.out.println("\nTreeMap\nkey,value");
		TreeMap<String,String> map = new TreeMap<String,String>();
		map.put("a","a1");
		map.put("a","a2");
		map.put("b",null);
		//map.put(null,"b");
		map.put("c",null);
		//map.put(null,"c");
		
		for(String key:map.keySet()){
			System.out.println(key+","+map.get(key));
		}
	}
	
	//maintains asc order
	public static void treeSet(){
		System.out.println("\nTreeSet\nkey,value");
		TreeSet<String> map = new TreeSet<String>();
		map.add("b");
		map.add("a");
		map.add("a");
		//map.add(null);
		map.add("c");
		//map.add(null);
		
		for(String key:map){
			System.out.println(key);
		}
	}
	public static void hashSet(){
		System.out.println("\nHashSet\nvalues");
		HashSet<String> map = new HashSet<String>();
		map.add("b");
		map.add("a");
		map.add("a");
		map.add(null);
		map.add("c");
		map.add(null);
		
		for(String key:map){
			System.out.println(key);
		}
	}
	
	public static void synchronizedList(){
		System.out.println("\nSynchronized List\nvalues");
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("a");
		list.add("b");
		//map.add(null);
		list.add("c");
		//map.add(null);
		
		//List<String> list2 =  (List) Collections.synchronizedCollection(list);
		for(String key:list){
			System.out.println(key);
		}
	}
	
	//FIFO: First in first out
	public static void queue(){
		Queue<String> q = new LinkedList<>();
		q.add("Waqas");
		q.add("Sohail");
		q.remove();//remove first item
		System.out.println(q.peek());//
		

	}
	public static void stack(){
		Stack<String> s = new Stack<String>();
		s.push("Waqas");
		s.push("Sohail");
		s.push("Wajid");
		System.out.println(s.pop());
	}
	public static void main(String arg[]){
		//synchronizedList();
		
		//hashtable();
		//hashMap();
		
		//treeMap();
		//treeSet();
		//hashSet();
		
		queue();
		//stack();
	}
}
