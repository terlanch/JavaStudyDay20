package cn.tedu.demo1;

import java.io.File;

public class FilePractice02 {
	static int javaCount = 0;
	static int classCount = 0;
	public static void main(String[] args) {
		File file = new File("D:\\Users");
		chakan(file);
		System.out.println(".java��"+javaCount+".class��"+classCount);
	}
	public static void chakan(File file){
		
		if(file.isDirectory()){
			//��ȡĿ¼�����е���Ŀ¼�����ļ�
			File[] f = file.listFiles();
			for(File f1:f){
				chakan(f1);
			}
			
		}else if(file.getName().endsWith(".java")){
				javaCount++;
		}else if(file.getName().endsWith(".class")){
				classCount++;
		}
		
		
		}
	
}
