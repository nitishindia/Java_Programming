package String_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice {

	private static final Object Name = null;

	public static void main(String[] args) throws InterruptedException {
		
/*		String s="Hi good morning everyone";
		s=s+" ";
		String s2="";
		String word="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch!=' ')
			{
				word+=ch;
			}
			else
			{
				String rev="";
				for(int j=word.length()-1;j>=0;j--)
				{
					char ch1=word.charAt(j);
					rev+=ch1;
				}
				s2=s2+rev+" ";
				word="";
			}
		}
	System.out.println(s2);
	
	*/
		
//		String s="Hi good morning everyone";
//		String[] s1=s.split(" ");
//		for(int i=0;i<s1.length;i++)
//		{
//			String word=s1[i];
//			
//		}

		
//		String  s = "JaVa";
//		String s1 = "";
//		
//		for(int i=0; i<s.length(); i++) {
//			char ch = s.charAt(i);
//			if(ch>='a' && ch<='z') {
//				int a = ch-32;
//				char ch1 = (char) a;
//				s1=s1+ch1;
//			}
//			else {
//				s1=s1+ch;
//			}
//		}
//		System.out.println(s1);
		
		
		
		
		//  To find the max length word present in String
//		String s = "My name is Nitish";
//		String[] s1=s.split(" ");
//		String max = s1[0];
//		for(int i=0; i<s1.length; i++) {
//			if(s1[i].length()>max.length()) {
//				max=s1[i];
//			}
//		}
//		System.out.println(max);
	
		
		
		// to find the occurence of character in string
		
//		String s = "apple";
//		String s1 ="";
//		
//		for(int i=0; i<s.length(); i++) {
//			char ch = s.charAt(i);
//			int count = 1;
//			if(s1.indexOf(ch)==-1) {
//				for(int j=i+1; j<s.length(); j++) {
//					char ch1 = s.charAt(j);
//					if(ch==ch1) {
//						count++;
//					}
//				}
//				System.out.println(ch+"-"+count);
//				s1=s1+ch;
//			}
//		}
		
		//Second method
		
//		String s = "Nitishsharma";
//		
//		char[] s1=s.toCharArray();
//		for(int i=0; i<s1.length; i++) {
//			int count = 1;
//			for(int j=i+1; j<s1.length; j++) {
//				if(s1[i]==s1[j]) {
//					count++;
//					s1[j]='@';
//				}
//			}
//			if(count>=1 && s1[i]!='@') {
//			System.out.println(s1[i]+"-"+count);
//			}
//		}
		
		
		// find the maximum word present in String
//		String s = "java is a programing language";
//		String[] s1 = s.split(" ");
//		String temp = s1[0];
//		
//		for(int i=0; i<s1.length; i++) {
//			String w = s1[i];
//			if(w.length()>temp.length()) {
//				temp=w;
//			}
//		}
//		System.out.println(temp);	
		
		
		
//		String s = "abbcccdddd";
//		String s1 = "";
//		
//		for(int i=0; i<s.length(); i++) {
//			char ch=s.charAt(i);
//			int count = 1;
//			
//			if(s1.indexOf(ch)==-1) {
//				for(int j=i+1; j<s.length(); j++) {
//					char ch1 = s.charAt(j);
//					if(ch==ch1) {
//						count++;
//					}
//				}
//				if(count==1) 		//distinct
//				//if(count>=1)		//remove duplicates
//				//if(count>1)		// find duplicate
//				{
//		 System.out.println(ch);
//				}	s1=s1+ch;
//			}
//		}

		
//		int a[] = {1,2,3,4,1,2,3,4};
//		
//		for(int i=0; i<a.length; i++) {
//			int count=1;
//			
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i]==a[j]) {
//					count++;
//					a[j]=-1;
//				}
//			}
//			if(count>=1 && a[i]!=-1) {
//				System.out.println(a[i]+"-"+count);
//			}
//		}
		
		
		
		// Anagram Program
//		String s = "pot";
//		String s1 = "tkp";
//		
//		if(s.length()!=s1.length()) {
//			System.out.println("Not anagarm string present");
//		}
//		else{
//		char[] ch = s.toCharArray();
//		char[] ch1 = s1.toCharArray();
//		Arrays.sort(ch);
//		Arrays.sort(ch1);
//		System.out.println(ch);
//		System.out.println(ch1);
//		
//		boolean flag = false;
//		for(int i=0; i<ch.length; i++) {
//			if(ch[i]==ch1[i]) {
//			flag=true;
//			}
//			else {
//				flag=false;	
//				//break;
//			}
//		}
//		if(flag==true) {
//			System.out.println("Anagram");
//		}
//		else {
//		System.out.println("not anagram");	
//		}
//	 }
		
		
		// find the max word in the String
//		String s = "Java Programing class";
//		
//		String[] s1 = s.split(" ");
//		String temp=s1[0];
//		
//		for(int i=0; i<s1.length; i++) {
//			if(s1[i].length()>temp.length()) {
//				temp=s1[i];
//			}
//		}
//		System.out.println(temp);
		
		
		
		//count character of the given string
//		String s = "nitishs942@gmail.com";
//		int c=0, n=0, sc=0;
//		for(int i=0; i<s.length(); i++) {
//			char ch = s.charAt(i);
//			
//			if(ch>='a' && ch<='z') {
//				c++;
//			}
//			else if(ch>='0' && ch<='9') {
//				n++;
//			}
//			else {
//				sc++;
//			}
//			
//		}
//		System.out.println(sc);
//		System.out.println(n);
//		System.out.println(c);
		
		
		
		//Star pattern
//		int n=4;
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=4; j++) {
//				if(i==4 || j==1 || i==j ) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
//		int n=4;
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=4; j++) {
//				if(i>=j) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
//			int n=4;
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n*2-1; j++) {
//				if(j+i>=n+1 && j-i<=n-1 ) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		// count the word in the string
//		String s = "JAva is a prog lang";
//		String[] s1= s.split(" ");
//		int count  =0;
//		for(int i=0; i<s1.length; i++) {
//			count++;
//		}
//		System.out.println(count);
		
		
		//fine the maximun number form the given number
//		String s = "08765943210";
//		char max = s.charAt(0);
//		char[] s1 = s.toCharArray();
//		
//		for(int i=0; i<s1.length; i++) {
//			if(s1[i]>='0'&& s1[i]<='9') {
//				if(s1[i]>max) {
//					max=s1[i];
//				}
//			}
//		}
//		System.out.println(max);
		
		
		//method=2
//		long l = 8765994320l;
//		long max = l%10;
//		while(l!=0) {
//			long d = l%10;
//			if(d>max) {
//				max=d;
//			}
//			l=l/10;
//		}
//		System.out.println(max);
		
//		String s ="my 1 car 2 have 3 four 44 type";
//		String s1 = "";
//		for(int i=0; i<s.length(); i++) {
//			char ch=s.charAt(i);
//			if(ch>='0' && ch<='9') {
//				s1=s1+ch;
//			}
//		}
//		System.out.println(s1);
		
		
		
/*		String s = "aaappllleeeee";    //out=a3p2l3e5
		String s1="";
	//	char[] s1 =s.toCharArray();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			int count=1;
			if(s1.indexOf(ch)==-1) {
			for(int j=i+1; j<s.length(); j++) {
				char ch1=s.charAt(j);
				if(ch==ch1) {
					count++;
				
				}
			}
	
			
		s1=s1+ch+count;
			}
			}
		System.out.println(s1);
		
		}
	*/	
		
		
		
	/*	String name="karnataka";       //output=KaRnAtAkA
		
		String s = "";
		
		for(int i=0; i<name.length(); i++) {
			char ch =name.charAt(i);
			if(i%2==0 && ch>='a' && ch<='z') {
				int a=ch;
				char ch1=(char)(a-32);
				s=s+ch1;
				
			
			}
//			else if(i%2!=0 && ch>='A' && ch<='Z') {
//			int	a=ch;
//			 char ch1=(char)(a+32);                        //i=2,ch=R
//			 s=s+ch1;
//			}
			else {
				s=s+ch;
			}
			}
		System.out.println(s);   */
		
		
		
	/*	String s="my name is pankaj";
		
		String s1[]=s.split(" ");
		String x=s1[0];
		
		for(int i=0;i<s1.length;i++) {
			
			if(s1[i].length()>x.length()) {
				x=s1[i];
			}
		}
		System.out.println(x);
		
		*/
		
//		long l=123456789l;
//         long max=l%10;
//         while(l!=0) {
//        	 long d=l%10;
//        	 if(d>max) {
//        		 max=d;
//        	 }
//        	 l=l/10;
//         }
//         System.out.println(max);
		
		
		
//		String s ="aaabbbcccccddddd";
//		String s1 ="";
//		for(int i=0; i<s.length(); i++) {
//			char ch = s.charAt(i);
//			int count =1;
//			if(s1.indexOf(ch)==-1) {
//				for(int j=i+1; j<s.length(); j++) {
//					char ch1=s.charAt(j);
//					if(ch==ch1) {
//						count++;
//						}
//				}
//				System.out.println(ch+"-"+count);
//				s1=s1+ch;
//			}	
//		}
		
		
		
		// max number Present in number
//		long l = 87654329219L;
//		long max = l%10;
//		while(l!=0) {
//			long d=l%10;
//			if(d>max) {
//				max=d;
//			}
//			l=l/10;
//		}
//		System.out.println(max);
		
		
//		String s = "NITISH";
//		String s1 = "";
//		for(int i=0; i<s.length(); i++) {
//			char ch = s.charAt(i);
//			if(i%2!=0 && ch>='A' && ch<='Z') {
//				int x = ch;
//				char ch1 = (char) (x+32);
//				s1=s1+ch1;
//			}
//			else if(i%2==0 && ch>='A' && ch<='Z') {
//				s1=s1+ch;
//			}
//		}
//		System.out.println(s1);
			
			
//		String s = "Nitish";
//		String s1 = "";
//		for(int i=s.length()-1; i>=0; i--) {
//			char ch =s.charAt(i);
//			s1=s1+ch;
//		}
//		System.out.println(s1);
		
			
//		String s = "java is programming language";
//		String[] s1 = s.split(" ");
//		String w = s1[0];
//		s1[0]=s1[s1.length-1];
//		s1[s1.length-1]=w;
//		String res = "";
//		for(int i=0; i<s1.length; i++) {
//			res = res+s1[i]+" ";
//		}
//		System.out.println(res);
		
		
		
//		String s = "java is programming language";
//		
//		String[] s1 = s.split(" ");
//		String w = s1[0];
//		for(int i=0; i<s1.length; i++) {
//			if(s1[i].length()>w.length()) {
//				w=s1[i];
//			}
//		}
//		System.out.println(w);
		
/*		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int[] a = new int[size];
		int b[] = new int [size];
		System.out.println("enter the element in array");
		for(int i=0; i<a.length; i++) {
			a[i] = s.nextInt();
		}
		int sum = 0;
		System.out.println("print the Array");
		for(int j=0; j<a.length; j++) {
		//	if(a[j]%2==0)
		//	System.out.print(a[j]);
		//	sum = sum + a[j];
		//	b[j]=a[j];
			System.out.print(b[j]);
		}
		//System.out.println(sum/a.length);
		*/
		
		
//		int a[] = {1,2,3};
//		int b[] = {4,5,6};
//		int c[] = new int[a.length+b.length];
//		
//		int temp=0;
//		int temp1=0;
//		
//		for(int i=0; i<c.length;) {
//			if(temp<a.length) {
//				c[i++]=a[temp++];	
//			}
//			if (temp1<a.length){
//				c[i++]=b[temp1++];
//			}
//		}
//		for(int i=0; i<c.length; i++) {
//			System.out.print(c[i]);
//		}
		
		
		
//		String s = "Be not afraid of greatness some are born great some achieve greatness";
//		
//		String[] words = s.split(" ");
//        String longestWord = "";
//
//        for (String word : words) {
//            if (word.length() % 2 == 0 && word.length() > longestWord.length()) {
//                longestWord = word;
//            }
//        }
//        System.out.println(longestWord);
				
		
//		int a[] = {1,2,3,5,6,8,7,6};
//		int prod = a[0];
//		
//		for(int i=0; i<a.length; i++) {
//			String d = "";
//			for(int j=i+1; j<=a.length; j++) {
//				if(a[i]*a[j]>prod) {
//					prod=a[i]*a[j];
//					
//				}
//				d = (a[i]+","+a[j]);
//				
//			}
//			System.out.println(d);
//		}
		
		
//		String s = "java";
//		String s1 = new String("java");
//		String s2 = "mava";
//		
//		System.out.println(s.equals(s1));
//		System.out.println(s.hashCode());
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s1.toString());
//		
//		if(s.hashCode()==s1.hashCode()) {
//			System.out.println(true);
//		}
//		else {
//			System.out.println(false);
//		}
		
		
		
//		HashMap h = new HashMap();
//		h.put(5, "java");
//		h.put(4, 10);
//		h.put(2, "SQL");
//		h.put(6, "Selenium");
//		h.put(1, "Manual");
//		System.out.println(h);
//		
//		Set e = h.entrySet();
//		for(Object o : e) {
//			System.out.println(o);
//		}
		
//		LinkedHashMap l = new LinkedHashMap();
//		l.put("java", 1);
//		l.put("Manul", 2);
//		l.put("Selenium", 3);
//		l.put("java", 4);
//		System.out.println(l);
//		//System.out.println(l.get("java").hashCode());
//		System.out.println(l.hashCode());
//		
//		//Set k=l.keySet();
//		Collection k = l.values();
//		System.out.println(k.hashCode());
//		System.out.println(k.equals(l));
//		for(Object o : k) {
//		System.out.println(o);	
//		}
	
		
		
		
		// Using java Streams
		
		//List<Integer> l = Arrays.asList(10,25,30,45,50);
		//List al = new ArrayList();
		// without java Stream
//		for(int i : l) {
//			if(i%2==0) {
//			System.out.println(i);
//			}
//		}
		
		// using Streams concept
//		al=l.stream().filter(n-> n%2==0).collect(Collectors.toList());
//		System.out.println(al);
		
//		l.stream().filter(n-> n%2==0).forEach(n->System.out.println(n));
//		l.stream().filter(n-> n%2==0).forEach(System.out::println);
		
		//al=l.stream().map(n-> n+5).collect(Collectors.toList());
		//System.out.println(al);
		
		
//		String  s = "APPLEAPPLE";
//		String s1 = "";
//		for(int i=0; i<s.length(); i++) {
//			char ch=s.charAt(i);
//			int count=1;
//			 if(s1.indexOf(ch)==-1) {
//				 for(int j=i+1; j<s.length(); j++) {
//					char ch1 = s.charAt(j);
//					if(ch==ch1) {
//						count++;	
//					}
//				 }
//			 
//			 System.out.println(ch+"-"+count);
//			 s1=s1+ch;
//			 }
//		}
		
		
		
//		int a [] = {3,2,4,6,9,7,5,11,12};
//		int max = a[0];
//		
//		for(int i=0; i<a.length; i++) {
//			if(a[i]>max) {
//				max=a[i];
//			}
//		}
//		int min = max;
//		int secmin = 0;
//		
//		for(int i=0; i<a.length; i++) {
//			if(a[i]<min) {
//				secmin=min;
//				min=a[i];
//			}
//			else if(secmin>a[i] && a[i]!=min) {
//				secmin=a[i];
//			}
//		}
//		System.out.println(secmin);	
		
		
//		String s = "my name is nitish";
//		String x[]=s.split(" ");
//		String result = "";
//		for(int i=0; i<x.length; i++) {
//			String word = x[i];
//			String res = "";
//			for(int j=0; j<word.length(); j++) {
//				char ch=word.charAt(j);
//				if(j==0 && ch>'a' && ch<'z') {
//					int y = ch;
//					char ch1 = (char) (y-32);
//					res = res + ch1;
//				}
//				else if(j!=0 && ch>'a' && ch<'z') {
//					res = res + ch;
//				}
//				else {
//					res = res + ch;
//				}
//			}
//			result = result + res+" ";
//		}
//		System.out.println(result);
		
		
//		int a[] = {7,3,2,8,6,4,1,5,9};
//		
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a.length-1; j++) {
//				
//				if(a[j]>a[j+1]) {
//					int temp = a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//			}
//		}
//		for(int i=0; i<a.length; i++) {
//			Thread.sleep(1000);
//			System.out.print(a[i]);
//		}
		
		
		
		}
	}

