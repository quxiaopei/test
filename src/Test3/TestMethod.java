package Test3;
/**
 * 
 * @author Grace
 *
 */
public class TestMethod {

public static void main(String[] args) {
	sayHello(5);//实现了代码的复用
	System.out.println("**********");
	sayHello(2);//方法的调用
	System.out.println("**********");
	sayWord(3,"hello");
	sayWord(6, "good");
//实际参数 实参
}

private static void sayWord(int i, String string) {
for(int j=0;j<i;j++)
	System.out.println(string);	
}

//方法的定义
private static void sayHello(int i) {//形式参数
    for (int j=0;j<i;j++){
    	System.out.println("hello");
    	return;//一般用於方法的結束條件F
    }
}
}
