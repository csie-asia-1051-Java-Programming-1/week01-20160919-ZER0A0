package hw;
/*
 * Topic: 請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
 * Date: 2016/09/19
 * Author: 1050210XX 周永振老師
 */

import java.util.Scanner;

public class hw03_105021041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);	
		float a=scn.nextFloat();
		Math.round(a);
		float b=scn.nextFloat();
		Math.round(b);
		float ab=Math.min(a, b);
		float c=scn.nextFloat();
		Math.round(c);
		float bc=Math.min(ab, c);
		float d=scn.nextFloat();
		Math.round(d);
		float cd=Math.min(bc, d);
		float e=scn.nextFloat();
		Math.round(e);
		float de=Math.min(cd, e);
		float f=scn.nextFloat();
		Math.round(f);
		float ef=Math.min(de, c);
		System.out.println(ef);

	}

}
