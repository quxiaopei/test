package TestOO;
/**
 * ������
 * @author Grace
 *1.���һ������û��д�κι��췽������Ĭ�����޲ι��췽����
 *2.����ṩ���������췽������Ĭ�ϵ��޲ι��췽�������ṩ��
 *���췽����һ������Ƿ�����
 *1.д�����⣺���ƺ���������һ�£�û�з���ֵ���͡�
 *2.�������⣺���ڴ�������
 */
public class TestPerson {
	public static void main(String[] args) {
		//new +���췽��������������
		Person person=new Person();
		//ͨ������������
		person.name="����";
		person.age=12;
		person.speak();
		person.walk();
		person.desc();
		Person person2=new Person();
		person2.desc();
	}
}
