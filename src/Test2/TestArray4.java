package Test2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TestArray4 {
public static void main(String[] args) {
/*	String[] nameAry=new  String[5];
	int[] scoreArry =new int[5];
	Scanner scan=new Scanner(System.in);
	for(int i=0;i<5;i++){
	System.out.println("������������");
	nameAry[i]=scan.nextLine();
	System.out.println("�����������");
	scoreArry[i]=scan.nextInt();
	}*/
//	��������� 28��
	
	int num=5;
	String[] nameAry=new String[num];
	int[] scoreArry=new int[num];
	Scanner scan=new Scanner(System.in);
	for(int i=0;i<num;i++){
		System.out.println("��¼��������");
		nameAry[i]=scan.nextLine();
		System.out.println("��¼���Ӧ������");
		scoreArry[i]=scan.nextInt();
	}
	System.out.println(Arrays.toString(nameAry));
	System.out.println(Arrays.toString(scoreArry));
}
}
