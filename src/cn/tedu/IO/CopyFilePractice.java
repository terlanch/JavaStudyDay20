package cn.tedu.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFilePractice {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String sourcePath = sc.nextLine();
		File file1 = new File(sourcePath);
		
		if(!file1.exists()){
			System.out.println("请输入有效路径");
			return;
		}
		String destPath = sc.nextLine();
		
		copyDocument(sourcePath,destPath);
		File file2 = new File(destPath);
		if(file2.exists()){
			System.out.println("复制成功！");
		}
	}
	public static void copyDocument(String sourcePath,String destPath) throws IOException{
		FileReader fr = new FileReader(sourcePath);
		FileWriter fw = new FileWriter(destPath);
		char[] chs = new char[4];
		int len;
		while((len = fr.read(chs)) != -1){
			fw.write(chs,0,len);
			fw.flush();
		}
		fw.close();
		fr.close();
	}
}
