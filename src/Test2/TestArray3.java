package Test2;

import java.util.Arrays;
import java.util.Random;
/**
 * util：工具包，Arrays类提供了很多操作数组的工具方法
 * @author Grace
 *
 */
public class TestArray3 {
public static void main(String[] args) {
	//能存储10个int类型数据的数组的定义
	int[] niArr=new int[10];
	//定义一个随机对象
	Random ram=new Random();
	for(int i=0;i<10;i++){
		//生成100以内随机数 取值范围【0-100）
		int ri=ram.nextInt(100);
		System.out.println(ri);
		niArr[i]=ri;
	}
	System.out.print("[");
	for(int i=0;i<10;i++){
		if(i+1==niArr.length){
			System.out.print(niArr[i]);	
		}else
		System.out.print(niArr[i]+",");
	}
	System.out.println("]");
	System.out.println(Arrays.toString(niArr));
}
}
