package test;

import java.util.Scanner;

public class TestSwitch {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("请输入分数：");
	int score=scanner.nextInt();
/*	if(score==1){
		System.out.println(score);
	}else{
		System.out.println("其他"+score);
	}*/
	switch (score){
	default:
		System.out.println("其他"+score);
		break;
	case 1:
		System.out.println(score);
       break;
	case 2:
	    System.out.println("good");
	    break;//不写break会出现继续向下执行的情况

	/*	default一般放在所有分支的最后，故后面放不放break都是一样的。
		之所以在switch中要放break是因为对某个分支执行后如果后面没有
		break的话则程序会继续执行下一个分支而不会直接退出。*/
}}

}
