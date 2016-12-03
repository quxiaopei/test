package Test2;

public class TestArray2 {
	public static void main(String[] args) {
		// 1静态初始化
		int[] arr = { 89, 89, 100 };
		String[] strArry = { "张三", "李四", "王五" };
		// 定义数组：长度表示该数组能存储多少个数据
		int[] scoreArry = new int[3];
		// 2动态初始化
		scoreArry[0] = 1;
		scoreArry[1] = 2;
		int[] arr1 = new int[2];
		// 3默认初始化
		String[] arr2 = new String[3];
		System.out.println(arr1[0] + "\n" + arr2[0]);
	}
}
