package test;

import java.util.Scanner;

public class TestIf2 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("���������䣺");
	int age=scanner.nextInt();
	if(age>25){
		System.out.println("������");
	}else if(age<25&&age>10){//25������
		System.out.println("������");
	}else{
		System.out.println("��ͯ");
	}
}
}
