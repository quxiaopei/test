package TestOO;
/**
 * �ȶ����࣬���ഴ������
 * @author Grace
 *���췽�����໥����
 *1.this(����)��ʾ�Ա����������췽���ĵ���
 *����Constructor call must be the first statement in a constructor
 *2.Ҫ������ѭ��
 *3.this.�����ñ�������� Ҳ�����ɫ����ʾ������
 *
 */
public class Person {
	String name;
	int age;
	//�޲ι���
	public Person(){
		System.out.println("�޲ι��췽��");
	}
	public Person(String name){
		this.name=name;
	}
	//ȫ�ι���
	//�������е���ʽ������ֲ�����������ͬ��ʱ��
	//ֱ��ʹ�õ�����ʽ����
	public Person(String name, int age) {
		//����δ����������thisָ���ö���
		this(name);
		this.age = age;
	}
	public void speak(){
		System.out.println("��˵��");
		//����һ�㷽�����ã���Ϊ�����Ѿ�����������ֱ��д���������ɡ�
		walk();
	}
	public void walk(){
		System.out.println("����·");
	}
	public void desc(){
		System.out.println(name+"����"+age);
	}
}
