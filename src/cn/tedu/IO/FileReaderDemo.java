package cn.tedu.IO;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//
		FileReader fr = new FileReader("D:\\a.txt");
		
		//��ȡ�ļ�����
		//ÿ�ζ�ȡһ���ַ������û�����ݣ�����-1��
//		int c = fr.read();
		//Ч�ʵ��µĶ�ȡ��ʽ
//		int c ;
//		while ((c = fr.read()) != -1){
//			
//			System.out.print((char)c);
//		}
		
//		System.out.println((char)c);		

		
		//�����ַ����� ����Ϊ5
		char[] chs = new char[5];
		//len��ÿ�ζ�ȡ����ʵ�ʳ���
		//read(char[]):��ȡ���ݴ�ŵ�char������
		int len;
		while((len = fr.read(chs)) != -1){
			System.out.println(len);
			System.out.print(new String(chs,0,len));
		}
		
		
		//�ر���Դ
		fr.close();
	}
}	
