package test;

import java.util.Scanner;

public class TestChatRoom {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("这是一个聊天室，请输入聊天内容");
		
		for (;;) {
			String str = scan.nextLine();
			if ("bye".equals(str)) {
				System.out.println("结束聊天");
				break;
			} else if ("5".equals(str)) {
				System.out.println("请不要输入5"+"\n"+"请继续输入聊天内容");
				continue;
			} else {
				System.out.println("您输入的内容："+str+"\n"+"请继续输入聊天内容");
				continue;
			}
		}
	}

}
