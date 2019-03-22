package cn.tedu.IO;
/*
 * FileWriter的异常处理：
 * 在try  catch外面声明对象，并且设置为null
 * 在try代码块中创建对象，并且写入数据并冲刷缓冲区
 * 在finally中判断对象是否为null。
 * 再去关闭流，最后释放内存。
 */
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExceptionDemo {
	public static void main(String[] args) {
		//声明fw一定要在try catch外面，保证作用域
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:\\b.txt");
			fw.write("稻香村");
			//尽量防止数据丢失
			//因为可能关闭不成功，那就不会冲刷缓冲区
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//关闭资源
			//fw可能创建失败，会出现空指针异常
			if(fw != null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					//释放内存
					fw = null;
				}
				
			}
			
		}
	}
}
