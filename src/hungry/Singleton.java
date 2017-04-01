package hungry;

/**
 * 饿汉模式
 * 此模式天生线程安全，类加载时就会创建实例
 * @author Mr.Yang
 *
 */
public class Singleton {
	
	private  Singleton() {
		
	}
	
	private static Singleton singleton = new Singleton();
	
	public static Singleton getInstance(){
		return singleton;
	}
	
	public static void main(String[] args) {
		System.out.println(getInstance());
	}
}
