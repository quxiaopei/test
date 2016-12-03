package Test3;

public class TestOverLoad {
public static void main(String[] args) {
	int ans1=add(1,2);
	String ans2=add("str1","str2");
	
}

private static String add(String string, String string2) {
	return string+string2;
}

private static int add(int i, int j) {
	return i+j;
}
}
