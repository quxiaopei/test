package test;

import java.util.Scanner;

public class TestChatRoom {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("����һ�������ң���������������");
		
		for (;;) {
			String str = scan.nextLine();
			if ("bye".equals(str)) {
				System.out.println("��������");
				break;
			} else if ("5".equals(str)) {
				System.out.println("�벻Ҫ����5"+"\n"+"�����������������");
				continue;
			} else {
				System.out.println("����������ݣ�"+str+"\n"+"�����������������");
				continue;
			}
		}
	}

}
