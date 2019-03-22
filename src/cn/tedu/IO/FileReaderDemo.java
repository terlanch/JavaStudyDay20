package cn.tedu.IO;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//
		FileReader fr = new FileReader("D:\\a.txt");
		
		//读取文件内容
		//每次读取一次字符，如果没有内容，返回-1。
//		int c = fr.read();
		//效率低下的读取方式
//		int c ;
//		while ((c = fr.read()) != -1){
//			
//			System.out.print((char)c);
//		}
		
//		System.out.println((char)c);		

		
		//定义字符数组 长度为5
		char[] chs = new char[5];
		//len：每次读取到的实际长度
		//read(char[]):读取内容存放到char数组中
		int len;
		while((len = fr.read(chs)) != -1){
			System.out.println(len);
			System.out.print(new String(chs,0,len));
		}
		
		
		//关闭资源
		fr.close();
	}
}	
