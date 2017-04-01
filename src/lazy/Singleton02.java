package lazy;
/**
 * 懒汉设计模式二
 * 此模式使用双重检查锁定，只需同步一次即可，效率高
 * @author Mr.Yang
 *
 */
public class Singleton02 {
	private static Singleton02 singleton02 = null;
	
	private  Singleton02() {
		
	}
	
	public static Singleton02 getInstance(){
		if (singleton02 == null) {
			synchronized (Singleton02.class) {
				if (singleton02 == null) {
					singleton02 = new Singleton02();
				}
			}
		}
		return singleton02;
	}
	
	public static void main(String[] args) {
		System.out.println(getInstance());
	}
}
