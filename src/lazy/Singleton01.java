package lazy;
/**
 * 懒汉模式一
 * 此模式每次都需同步，影响性能
 * @author Mr.Yang
 *
 */
public class Singleton01 {
	
	private static Singleton01 singleton01 = null;
	
	private  Singleton01() {
		
	}
	
	public synchronized static Singleton01 getInstance(){
		if (singleton01 == null) {
			singleton01 = new Singleton01();
		}
		return singleton01;
	}
	
	public static void main(String[] args) {
		System.out.println(getInstance());
	}
}