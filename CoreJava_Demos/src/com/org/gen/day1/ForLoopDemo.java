package com.org.gen.day1;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num =0;
int i , j ;
for(int x = 1 ; x<=20;x++) {
	num=num+x;
}
System.out.println(" Total = "+ num);

for( i = 1 ; i<=5;i++) {
	for(j=1 ; j<=i ; j++) {
		System.out.print(" *");
	}
	System.out.println();
}
	}

}
