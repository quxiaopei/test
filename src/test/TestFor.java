package test;
/**
 * 
 * @author Grace
 *ctrl+/�������������ӻ�ɾ������ע��
 *ctrl+shift+/����ѡ��������Ӷ���ע��
 *ctrl+shift+\����ѡ������ȡ������ע��
 */
public class TestFor {
	public static void main(String[] args) {
        //1 ѭ��������ʼ��
		//2 ѭ������
		//3 �������
		//4 ѭ����������ʱִ�е�����
		// ִ��˳��1 2 4 3 2 4 3 2... ...
		for (int i = 0/*1*/; i < 10/*2*/; i++/*3*/) {
			int count = i + 1;
			System.out.println(count + " hello");/*4*/
		}
/*		System.out.println(" hello");
		System.out.println(" hello");
		System.out.println(" hello");
		System.out.println(" hello");
		System.out.println(" hello");
		*/
	}
}
