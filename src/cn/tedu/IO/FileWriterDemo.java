package cn.tedu.IO;

import java.io.FileWriter;
import java.io.IOException;

/*
 * IO�����������ݵ�һ�׻���
 * I:input ����
 * O:output ���
 * ���飬���ϣ��������ݶ��������ڴ��С�
 * �־û��洢�������ݱ����ڴ�����
 * 
 * ���룺���ļ��ж�ȡ��������ڴ��� ��
 * ������ӳ�����ڴ���д�뵽�ļ��� д
 * ���������������ڴ����
 * 
 * java�з�Ϊ������ �� �����
 * java�и����ļ����ͣ��ַ�Ϊ�ַ������ֽ���
 * �ַ�����ֻ�ܶ�ȡ���ַ���ص��ļ���.txt .java��
 * �ֽ������ܹ������������͵��ļ�
 * 
 * FileWriterĬ�ϻḲ�ǵ�ԭ�������ݡ�
 * ����ʹ��׷��ģʽ��ʹ��FileWriter��String path��boolean apend��
 */
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		//���������Ҵ����˶�Ӧ���ļ�
		FileWriter fw = new FileWriter("D:\\a.txt",true);
		//���ļ���д�����ݣ�д�뵽���ǻ�������
		//�������ú�Ḳ�ǵ�ԭ��������
		fw.write("�µ�������");
		//��ˢ������
		fw.flush();
		//�ر���Դ
		//�ڹر���Դʱ�����Զ���ˢһ�λ�����
		fw.close();
		//�����ùر���Դ���ٴ�ʹ���ַ����������ô�����쳣
		//IOException: Stream closed
//		fw.write("�����ҵ�СѽСƻ��");
		//fw���õĻ� ����ڴ� 
		fw = null;
		
		
		
	}
}
