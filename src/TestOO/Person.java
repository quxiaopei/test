package TestOO;
/**
 * 先定义类，由类创建对象
 * @author Grace
 *构造方法的相互调用
 *1.this(参数)表示对本类其他构造方法的调用
 *并且Constructor call must be the first statement in a constructor
 *2.要避免死循环
 *3.this.来调用本类的属性 也变成蓝色，显示是属性
 *
 */
public class Person {
	String name;
	int age;
	//无参构造
	public Person(){
		System.out.println("无参构造方法");
	}
	public Person(String name){
		this.name=name;
	}
	//全参构造
	//当方法中的形式参数或局部变量与属性同名时，
	//直接使用的是形式参数
	public Person(String name, int age) {
		//对象还未创建必须用this指代该对象
		this(name);
		this.age = age;
	}
	public void speak(){
		System.out.println("会说话");
		//其他一般方法调用，因为对象已经创建，所以直接写方法名即可。
		walk();
	}
	public void walk(){
		System.out.println("会走路");
	}
	public void desc(){
		System.out.println(name+"今年"+age);
	}
}
