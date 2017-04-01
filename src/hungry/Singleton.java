package hungry;

/**
 * ����ģʽ
 * ��ģʽ�����̰߳�ȫ�������ʱ�ͻᴴ��ʵ��
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
