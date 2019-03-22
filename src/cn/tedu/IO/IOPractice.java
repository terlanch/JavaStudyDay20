package cn.tedu.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class IOPractice {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\qwe\\a.txt");
		byte[] arr = new byte[1024 * 8];
		int len;
		while((len = fis.read(arr)) != -1){
			System.out.print(new String(arr,0,len));
		}
		fis.close();
	}
	
}
