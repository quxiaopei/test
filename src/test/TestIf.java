package test;

/**
 * �������֤���룬�ж��Ա�
 * 
 * @author Grace 1.ȡ�õ�17λ 2.�ж���ż��
 */
public class TestIf {

	public static void main(String[] args) {
		String id = "61040319930118303X";
		String str = id.substring(16, 17);// ����
		System.out.println(str);
		int intStr = Integer.parseInt(str);
		if (intStr % 2 == 0) {
			System.out.println("��Ů��");
		} else {
			System.out.println("���е�");
		}
	}

}
