package test;

import java.util.Scanner;

public class TestSwitch {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("�����������");
	int score=scanner.nextInt();
/*	if(score==1){
		System.out.println(score);
	}else{
		System.out.println("����"+score);
	}*/
	switch (score){
	default:
		System.out.println("����"+score);
		break;
	case 1:
		System.out.println(score);
       break;
	case 2:
	    System.out.println("good");
	    break;//��дbreak����ּ�������ִ�е����

	/*	defaultһ��������з�֧����󣬹ʺ���Ų���break����һ���ġ�
		֮������switch��Ҫ��break����Ϊ��ĳ����ִ֧�к��������û��
		break�Ļ����������ִ����һ����֧������ֱ���˳���*/
}}

}
