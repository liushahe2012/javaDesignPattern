package singleton;

/**
 * ����ʽ���̰߳�ȫ������Ч�ʸߣ�������ʱ���أ�����ص�ʱ��ͳ�ʼ����̬����
 * @author liushahe2012
 *
 */
public class SingletonDemo1 {
	
	private static SingletonDemo1 s1 = new SingletonDemo1();
	
	private void SingletonDemo1(){
		
	}
	
	//����û��ͬ��������Ч�ʸ�
	public static SingletonDemo1 getInstance(){
		return s1;
	}
}
