package cn.tedu.demo1;

import java.io.File;

public class FilePractice01 {
	public static void main(String[] args) {
		//��ϰ��ɾ��Ŀ¼�����е�Ŀ¼���ļ�
			File file = new File("D:\\beishanzhe");
			deleteFiles(file);
	}
	public static void deleteFiles(File file){
			if(file.isDirectory()){		
				File[] files = file.listFiles();
				for (File file2 : files) {
					deleteFiles(file2);			
				}				
			}
			file.delete();
			
	}
				
}
