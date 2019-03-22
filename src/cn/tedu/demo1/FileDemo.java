package cn.tedu.demo1;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		//创建对象
		//只是将路径和对象进行关联
		//并没有创建任何内容
		File file = new File("D:\\abc");
		//创建文件
		//file.createNewFile();
		//创建目录
		//file.mkdirs();
		//删除目录时，如果目录中有内容，那么删除不成功
//		file.delete();
		System.out.println(file);
		
//		//判断是否是一个目录
//		System.out.println(file.isDirectory());
//		
//		//判断是否是一个文件
//		System.out.println(file.isFile());
		
		//大概是文件内容的长度 ？？？
//		long position =  file.length();
//		System.out.println(position);
		
		//获取目录下所有的目录和文件
		File[] files =  file.listFiles();
		for (File file2 : files) {
			System.out.println(file2.getName());
		}
		
		
	}

}
