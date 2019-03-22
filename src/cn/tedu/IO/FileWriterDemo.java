package cn.tedu.IO;

import java.io.FileWriter;
import java.io.IOException;

/*
 * IO流：传输数据的一套机制
 * I:input 输入
 * O:output 输出
 * 数组，集合，变量数据都保存在内存中。
 * 持久化存储：将数据保存在磁盘中
 * 
 * 输入：从文件中读取到程序的内存中 读
 * 输出：从程序的内存中写入到文件中 写
 * 输入输出是相对于内存而言
 * 
 * java中分为输入流 和 输出流
 * java中根据文件类型，又分为字符流和字节流
 * 字符流：只能读取和字符相关的文件（.txt .java）
 * 字节流：能够操作所有类型的文件
 * 
 * FileWriter默认会覆盖掉原来的内容。
 * 可以使用追加模式，使用FileWriter（String path，boolean apend）
 */
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		//创建对象并且创建了对应的文件
		FileWriter fw = new FileWriter("D:\\a.txt",true);
		//向文件中写入内容（写入到的是缓冲区）
		//方法调用后会覆盖掉原来的内容
		fw.write("孤单北半球");
		//冲刷缓冲区
		fw.flush();
		//关闭资源
		//在关闭资源时，会自动冲刷一次缓冲区
		fw.close();
		//当调用关闭资源后再次使用字符输出流，那么会抛异常
		//IOException: Stream closed
//		fw.write("你是我的小呀小苹果");
		//fw不用的话 清空内存 
		fw = null;
		
		
		
	}
}
