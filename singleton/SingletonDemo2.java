package singleton;

/**
 * ����ʽ���̰߳�ȫ������Ч�ʵͣ�����ʱ���ء�
 * @author liushahe2012
 *
 */
public class SingletonDemo2 {
	
	private static SingletonDemo2 s2;
	
	private void SingletonDemo2(){
		
	}
	
	//������ͬ��������Ч�ʵ�
	public static synchronized SingletonDemo2 getInstance(){
		if(s2 == null)
		{
			s2 = new SingletonDemo2();
		}
		return s2;
	}
}
