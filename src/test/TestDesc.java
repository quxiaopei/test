package test;

import java.util.Scanner;

/**
 * ctrl+shift+o;�Զ�ƥ���������/ɾ����
 * @author Grace
 *java.lang���е������ֱ��ʹ�ã�
 *�������е��࣬��Ҫ�����룬��ʹ�á�
 */
public class TestDesc {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("����������������");
		String name = scanner.nextLine();// ���ڽ��ܿ���̨���û���������ݲ���ֵ��name����
		System.out.println("�������������g��");
		int age = scanner.nextInt();// ���ڽ��ܿ���̨���û���������ݲ���ֵ��age����
		System.out.println("���������� " + name + "\n" + "���������� " + age);
	}
}
