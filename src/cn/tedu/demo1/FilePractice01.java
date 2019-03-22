package cn.tedu.demo1;

import java.io.File;

public class FilePractice01 {
	public static void main(String[] args) {
		//练习：删除目录中所有的目录和文件
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
