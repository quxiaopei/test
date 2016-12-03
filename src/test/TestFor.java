package test;
/**
 * 
 * @author Grace
 *ctrl+/：光标所在行添加或删除单行注释
 *ctrl+shift+/：对选中内容添加多行注释
 *ctrl+shift+\：对选中内容取消多行注释
 */
public class TestFor {
	public static void main(String[] args) {
        //1 循环条件初始化
		//2 循环条件
		//3 步进语句
		//4 循环条件满足时执行的内容
		// 执行顺序1 2 4 3 2 4 3 2... ...
		for (int i = 0/*1*/; i < 10/*2*/; i++/*3*/) {
			int count = i + 1;
			System.out.println(count + " hello");/*4*/
		}
/*		System.out.println(" hello");
		System.out.println(" hello");
		System.out.println(" hello");
		System.out.println(" hello");
		System.out.println(" hello");
		*/
	}
}
