package singleton;

/**
 * ��̬�ڲ��࣬�̰߳�ȫ������Ч�ʸߣ�����ʱ���ء�
 * @author liushahe2012
 *
 */
public class SingletonDemo3 {
	
	private static class SingletonInstance{
		private static final SingletonDemo3 s3  = new SingletonDemo3();
	}
	
	private void SingletonDemo3(){
		
	}
	
	//����û��ͬ��������Ч�ʸ�
	public static SingletonDemo3 getInstance(){
		return SingletonInstance.s3;
	}
}
