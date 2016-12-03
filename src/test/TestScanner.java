package test;

import java.util.Scanner;

/**
 * 完成从控制台的输入工作
 * @author Grace
 *
 */
public class TestScanner {

	public static void main(String[] args) {
		//1.创建一个扫描器
		Scanner scanner=new Scanner(System.in);
		//2.接受用户输入的字符串内容
		//等待用户输入
		String str=scanner.nextLine();
		System.out.println(str+"是你输入的字符串");
	}

}
