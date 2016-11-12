package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;
/**
 * ����ʽ����ֹ����ͷ����л�©��
 * @author liushahe2012
 *
 */
public class SingletonDemo6 implements Serializable {
	//���ʼ��ʱ������ʼ�����������ʱ���أ������õ�ʱ���ٴ�������
	private static SingletonDemo6 instance;  
	
	private SingletonDemo6(){ //˽�л�������
		if(instance!=null){
			throw new RuntimeException();
		}
	}
	
	//����ͬ��������Ч�ʵͣ�
	public static  synchronized SingletonDemo6  getInstance(){
		if(instance==null){
			instance = new SingletonDemo6();
		}
		return instance;
	}
	
	//�����л�ʱ�����������readResolve()��ֱ�ӷ��ش˷���ָ���Ķ��󡣶�����Ҫ�����ٴ����¶���
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}
	
}
