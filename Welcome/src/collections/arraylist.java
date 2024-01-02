package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class arraylist {

	public static void main(String[] args) {
		
		ArrayList <String>ar = new ArrayList<String>();
		ar.add("sneha");
		ar.add("rama");
		ar.add("mahe");
		ar.add("gorge");
		ar.add("zebra");
		ar.add("africa");
		System.out.println(ar);

	
	LinkedList<String> al = new LinkedList<String>();
	al.add("sumo");
	//al.add(60);
	al.add("tata");
	al.add("car");
	al.add("bus");
	al.add("auto");
	//al.add(30);
	//al.remove("car");
	al.set(3, "new tiago");
	al.contains("mam");
	
	System.out.println(al);
	
	
	
	LinkedList<Integer> ap = new LinkedList<Integer>();
	ap.add(2);
	ap.add(10);
	ap.add(9);
	ap.add(7);
	ap.add(0);
	ap.add(2);
	System.out.println(ap);
	
	
	ArrayList <Integer>af = new ArrayList<Integer>();
	af.add(3);
	af.add(7);
	af.add(19);//removed`
	af.add(10);
	af.add(5);
	af.add(3);
	af.add(0);
	af.remove(2);
	boolean a=af.contains(3);
	System.out.println(a);
	
	System.out.println(af);
	
	Set<Integer>s=new HashSet<Integer>();
	s.add(2);
	s.add(4);
	s.add(9);
	s.add(5);
	s.add(3);
	s.add(2);
	System.out.println(s);
	List <Integer>l=new Vector<Integer>();
	l.add(1);
	l.add(10);
	l.add(5);
	l.add(4);
	l.add(15);
	l.add(1);
	System.out.println(l);
	List <String>ls=new Vector<String>();
	ls.add("move");
	ls.add("amur");
	ls.add("muo");
	ls.add("slsp");
	ls.add("repek");
	ls.add("zweef");
	System.out.println(ls);
	
	List <String>lc=new Stack<String>();
	lc.add("loli");
	lc.add("choki");
	lc.add("chamu");
	lc.add("merupu");
	lc.add("jami");
	lc.add("loli");
	System.out.println(lc);
	
	Set st=new LinkedHashSet();
	st.add("manage");
	st.add("apple");
	st.add("grape");
	st.add("banana");
	st.add(7);
	st.add("manage");
	System.out.println(st);
	

	}
}
