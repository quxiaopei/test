package test;
/**
 * �����ؼ��ֵ��÷�
 * 1.���еĹؼ��ֶ���Сд��
 * 2.������ʱ�򣬲�Ҫʹ�ùؼ���
 * 
 */
/**
 * ��������ʹ�ã�ѡ����ʹ�� ctrl+alt+r���Ը���������
 * ctrl+shift+r��ȫ������
 */
public class TestBreakContinue {
	public static void main(String[] args) {
	for(int i=0;i<5;i++){
		if(i==3){
			break;//����forѭ��
		}
		System.out.println(i);
	}
	System.out.println("*********************");
	for(int j=0;j<5;j++){
		if(j==3){
			continue;//������ǰѭ��
		}
		System.out.println(j);
	}
	}
}
