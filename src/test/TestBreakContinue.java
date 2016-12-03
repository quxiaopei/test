package test;
/**
 * 两个关键字的用法
 * 1.所有的关键字都是小写的
 * 2.命名的时候，不要使用关键字
 * 
 */
/**
 * 在类名处使用，选定后使用 ctrl+alt+r可以给类重命名
 * ctrl+shift+r是全盘搜索
 */
public class TestBreakContinue {
	public static void main(String[] args) {
	for(int i=0;i<5;i++){
		if(i==3){
			break;//结束for循环
		}
		System.out.println(i);
	}
	System.out.println("*********************");
	for(int j=0;j<5;j++){
		if(j==3){
			continue;//跳出当前循环
		}
		System.out.println(j);
	}
	}
}
