package test;

import java.util.Scanner;

public class TestIf2 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("请输入年龄：");
	int age=scanner.nextInt();
	if(age>25){
		System.out.println("中年人");
	}else if(age<25&&age>10){//25岁以下
		System.out.println("青年人");
	}else{
		System.out.println("儿童");
	}
}
}
