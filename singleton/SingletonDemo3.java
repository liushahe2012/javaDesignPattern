package singleton;

/**
 * 静态内部类，线程安全，调用效率高，能延时加载。
 * @author liushahe2012
 *
 */
public class SingletonDemo3 {
	
	private static class SingletonInstance{
		private static final SingletonDemo3 s3  = new SingletonDemo3();
	}
	
	private void SingletonDemo3(){
		
	}
	
	//方法没有同步，调用效率高
	public static SingletonDemo3 getInstance(){
		return SingletonInstance.s3;
	}
}
