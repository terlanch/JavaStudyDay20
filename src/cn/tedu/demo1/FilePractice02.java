package cn.tedu.demo1;

import java.io.File;

public class FilePractice02 {
	static int javaCount = 0;
	static int classCount = 0;
	public static void main(String[] args) {
		File file = new File("D:\\Users");
		chakan(file);
		System.out.println(".java有"+javaCount+".class有"+classCount);
	}
	public static void chakan(File file){
		
		if(file.isDirectory()){
			//获取目录中所有的子目录和子文件
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
