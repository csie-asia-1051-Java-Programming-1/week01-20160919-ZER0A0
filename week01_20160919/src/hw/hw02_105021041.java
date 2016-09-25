package hw;
/*
 * Topic: 請寫一個程式讓使用者輸入 n 並產生 6 個介於 1~n 之間的亂數 (輸出的亂數可重覆)
 * Date: 2016/09/19
 * Author: 1050210XX 周永振老師
 */

import java.util.Scanner;
import java.util.Random;

public class hw02_105021041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		int a =scn.nextInt();
			Random rnd=new Random() ;
			int b=rnd.nextInt(a)+1;
			System.out.println(b);
			int c=rnd.nextInt(a)+1;
			System.out.println(c);
			int d=rnd.nextInt(a)+1;
			System.out.println(d);
			int e=rnd.nextInt(a)+1;
			System.out.println(e);
			int f=rnd.nextInt(a)+1;
			System.out.println(f);
			int g=rnd.nextInt(a)+1;
			System.out.println(g);

	}

}
