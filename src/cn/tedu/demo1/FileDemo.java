package cn.tedu.demo1;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		//��������
		//ֻ�ǽ�·���Ͷ�����й���
		//��û�д����κ�����
		File file = new File("D:\\abc");
		//�����ļ�
		//file.createNewFile();
		//����Ŀ¼
		//file.mkdirs();
		//ɾ��Ŀ¼ʱ�����Ŀ¼�������ݣ���ôɾ�����ɹ�
//		file.delete();
		System.out.println(file);
		
//		//�ж��Ƿ���һ��Ŀ¼
//		System.out.println(file.isDirectory());
//		
//		//�ж��Ƿ���һ���ļ�
//		System.out.println(file.isFile());
		
		//������ļ����ݵĳ��� ������
//		long position =  file.length();
//		System.out.println(position);
		
		//��ȡĿ¼�����е�Ŀ¼���ļ�
		File[] files =  file.listFiles();
		for (File file2 : files) {
			System.out.println(file2.getName());
		}
		
		
	}

}
