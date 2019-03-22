package cn.tedu.IO;
/*
 * FileWriter���쳣����
 * ��try  catch�����������󣬲�������Ϊnull
 * ��try������д������󣬲���д�����ݲ���ˢ������
 * ��finally���ж϶����Ƿ�Ϊnull��
 * ��ȥ�ر���������ͷ��ڴ档
 */
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExceptionDemo {
	public static void main(String[] args) {
		//����fwһ��Ҫ��try catch���棬��֤������
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:\\b.txt");
			fw.write("�����");
			//������ֹ���ݶ�ʧ
			//��Ϊ���ܹرղ��ɹ����ǾͲ����ˢ������
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//�ر���Դ
			//fw���ܴ���ʧ�ܣ�����ֿ�ָ���쳣
			if(fw != null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					//�ͷ��ڴ�
					fw = null;
				}
				
			}
			
		}
	}
}
