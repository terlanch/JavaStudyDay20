
package cn.tedu.pm;
/*
 * ����·�������̷���ʼֱ�������ļ�����Ŀ¼��·��
 * ���·���������ĳ��Ŀ¼��·��
 * 
 * separatorChar:Ŀ¼�ָ���  Windows��\\�� Unix"/"
 * pathseparatorChar:·���ָ���  Windows ��;�� Unix":"
 */
import java.io.File;
import java.io.IOException;

public class FileDemo01 {
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\c.txt");
//		file.createNewFile();
//		//�ж��ļ��Ƿ����д��
//		System.out.println(file.canWrite());
//		//�ж��ļ��Ƿ����
//		System.out.println(file.exists());
		//��ȡ����·��
//		System.out.println(file.getAbsolutePath());
		
		//��ȡʣ��ռ�//202591903744
//		System.out.println(file.getFreeSpace());
		
		//��ȡ�ܿռ�
//		System.out.println(file.getTotalSpace());
		
		//��ȡ���ÿռ䣨һ���ʣ��ռ���ȣ�
//		System.out.println(file.getUsableSpace());
		
		//��ȡ�ļ�����
//		System.out.println(file.getName());
		//��ȡ�ļ����ڵ�Ŀ¼
//		System.out.println(file.getParentFile());
		//��ȡ�ļ����һ���޸�ʱ��
//		System.out.println(file.lastModified());
		//�����ļ��޸�ʱ��
//		System.out.println(file.setLastModified(12345L));
		
		
		//��ȡĿ¼���������ƴ����ֵ��ļ�����Ŀ¼
//		File[] files = file.listFiles(new FileFilter() {
//			//pathname �ļ�
//			@Override
//			public boolean accept(File pathname) {
//				// TODO Auto-generated method stub
//				return pathname.getName().matches(".*\\d.*");
//			}
//		});
		
		
//		File[] files = file.listFiles(new FilenameFilter() {
//			
//			//dir �ļ���
//			@Override
//			//����ֵ�����true ��ô�ͽ��ļ����ص�File[]������
//			//�����false ��ôֱ������
//			public boolean accept(File dir, String name) {
//				// TODO Auto-generated method stub
//				return name.matches(".*\\d.*");
//			}
//		});
//		for(File f :files){
//			System.out.println(f);
//		}
		
		//�����ͬĿ¼�У���ô����������
		//���Ŀ¼����ͬ����ô�����ƶ��ļ���������
		boolean b = file.renameTo(new File("D:\\abc\\cc.txt"));
		System.out.println(b);
	}
}
