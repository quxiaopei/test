package Test3;
/**
 * 
 * @author Grace
 *
 */
public class TestMethod {

public static void main(String[] args) {
	sayHello(5);//ʵ���˴���ĸ���
	System.out.println("**********");
	sayHello(2);//�����ĵ���
	System.out.println("**********");
	sayWord(3,"hello");
	sayWord(6, "good");
//ʵ�ʲ��� ʵ��
}

private static void sayWord(int i, String string) {
for(int j=0;j<i;j++)
	System.out.println(string);	
}

//�����Ķ���
private static void sayHello(int i) {//��ʽ����
    for (int j=0;j<i;j++){
    	System.out.println("hello");
    	return;//һ����춷����ĽY���l��F
    }
}
}
