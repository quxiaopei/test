package Test3;
/**
 * 对于java 来说，数据类型分为基本数据类型和引用数据类型
 * 基本数据类型：8种 int byte short long boolean char float double
 * 引用数据类型：类，接口，数组，枚举
 * @author Grace
 *方法的重载：
 *多个方法同名不同参，称为方法的重载；
 *方法的重载能降低学习的成本
 */
public class TestArryMethod {
public static void main(String[] args) {
	//編碼規範：變量名，方法名：第一個單詞的首字母小寫，其他字母首字母大寫，其他字母小寫
	int[] arr={1,2,3,4};
	String[] str={"張三","王五","劉備"};
	boolean[] boo={true,false};
	toArryString(arr);
	toArryString(str);
	toArryString(boo);
}

private static void toArryString(boolean[] boo) {
for(int i=0;i<boo.length;i++){
	System.out.println(boo[i]);
}
}

private static void toArryString(String[] str) {
for(int i=0;i<str.length;i++){	
	System.out.print(str[i]+" ");
}
}

private static void toArryString(int[] arr) {
for(int i=0;i<arr.length;i++)
	System.out.print(arr[i]+" ");	
}
}
