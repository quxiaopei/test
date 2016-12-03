package test;

/**
 * 根据身份证号码，判断性别
 * 
 * @author Grace 1.取得第17位 2.判断奇偶性
 */
public class TestIf {

	public static void main(String[] args) {
		String id = "61040319930118303X";
		String str = id.substring(16, 17);// 【）
		System.out.println(str);
		int intStr = Integer.parseInt(str);
		if (intStr % 2 == 0) {
			System.out.println("是女的");
		} else {
			System.out.println("是男的");
		}
	}

}
