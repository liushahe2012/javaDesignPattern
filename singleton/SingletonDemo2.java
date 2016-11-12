package singleton;

/**
 * 懒汉式，线程安全，调用效率低，能延时加载。
 * @author liushahe2012
 *
 */
public class SingletonDemo2 {
	
	private static SingletonDemo2 s2;
	
	private void SingletonDemo2(){
		
	}
	
	//方法有同步，调用效率低
	public static synchronized SingletonDemo2 getInstance(){
		if(s2 == null)
		{
			s2 = new SingletonDemo2();
		}
		return s2;
	}
}
