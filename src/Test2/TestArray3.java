package Test2;

import java.util.Arrays;
import java.util.Random;
/**
 * util�����߰���Arrays���ṩ�˺ܶ��������Ĺ��߷���
 * @author Grace
 *
 */
public class TestArray3 {
public static void main(String[] args) {
	//�ܴ洢10��int�������ݵ�����Ķ���
	int[] niArr=new int[10];
	//����һ���������
	Random ram=new Random();
	for(int i=0;i<10;i++){
		//����100��������� ȡֵ��Χ��0-100��
		int ri=ram.nextInt(100);
		System.out.println(ri);
		niArr[i]=ri;
	}
	System.out.print("[");
	for(int i=0;i<10;i++){
		if(i+1==niArr.length){
			System.out.print(niArr[i]);	
		}else
		System.out.print(niArr[i]+",");
	}
	System.out.println("]");
	System.out.println(Arrays.toString(niArr));
}
}
