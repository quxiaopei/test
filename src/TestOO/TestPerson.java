package TestOO;
/**
 * 测试类
 * @author Grace
 *1.如果一个类中没有写任何构造方法，则默认有无参构造方法。
 *2.如果提供了其他构造方法，则默认的无参构造方法不再提供。
 *构造方法是一种特殊非方法：
 *1.写法特殊：名称和类名必须一致，没有返回值类型。
 *2.作用特殊：用于创建对象
 */
public class TestPerson {
	public static void main(String[] args) {
		//new +构造方法（）创建对象
		Person person=new Person();
		//通过对象来调用
		person.name="张三";
		person.age=12;
		person.speak();
		person.walk();
		person.desc();
		Person person2=new Person();
		person2.desc();
	}
}
