package Test3;
/**
 * ����java ��˵���������ͷ�Ϊ�����������ͺ�������������
 * �����������ͣ�8�� int byte short long boolean char float double
 * �����������ͣ��࣬�ӿڣ����飬ö��
 * @author Grace
 *���������أ�
 *�������ͬ����ͬ�Σ���Ϊ���������أ�
 *�����������ܽ���ѧϰ�ĳɱ�
 */
public class TestArryMethod {
public static void main(String[] args) {
	//���aҎ����׃����������������һ�����~������ĸС����������ĸ����ĸ�󌑣�������ĸС��
	int[] arr={1,2,3,4};
	String[] str={"����","����","����"};
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
