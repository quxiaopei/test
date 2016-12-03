package test;
/**
 * 死循环
 * 死循环+break/continue:用于不定次数的循环
 */
public class TestFor3 {
public static void main(String[] args) {
	for(int i=0;;i++){
		if(i==1||i==97){
			continue;
		}
		System.out.println(i);
	    if(i==100){
	    	break;
	    }
	    	
	}
/*	for(;;){
		System.out.println("helloworld");
	}*/
}
}
