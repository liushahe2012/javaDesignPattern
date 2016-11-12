package singleton;

/**
 * 饿汉式，线程安全，调用效率高，不能延时加载，类加载的时候就初始化静态对象。
 * @author liushahe2012
 *
 */
public class SingletonDemo1 {
	
	private static SingletonDemo1 s1 = new SingletonDemo1();
	
	private void SingletonDemo1(){
		
	}
	
	//方法没有同步，调用效率高
	public static SingletonDemo1 getInstance(){
		return s1;
	}
}
