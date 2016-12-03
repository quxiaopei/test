package test;

import java.util.Scanner;

/**
 * ctrl+shift+o;自动匹配包（导入/删除）
 * @author Grace
 *java.lang包中的类可以直接使用；
 *其他包中的类，需要先引入，再使用。
 */
public class TestDesc {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的姓名：");
		String name = scanner.nextLine();// 用于接受控制台中用户输入的内容并赋值给name变量
		System.out.println("请输入您的年齡：");
		int age = scanner.nextInt();// 用于接受控制台中用户输入的内容并赋值给age变量
		System.out.println("您的姓名是 " + name + "\n" + "您的年龄是 " + age);
	}
}
