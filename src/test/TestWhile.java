package test;

public class TestWhile {
public static void main(String[] args) {
	int i=0;
	while(i<10){
		System.out.println(i);
		i++;
	}
	/**
	 * for循环和while循环可以互换，
	 * 为了代码的可读性，使用for循环
	 */
	for(int j=0;j<10;j++){
		System.out.println(j);
	}
}
}
