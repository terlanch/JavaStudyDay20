
package cn.tedu.pm;
/*
 * 绝对路径：从盘符开始直到最后的文件或者目录的路径
 * 相对路径：相对于某个目录的路径
 * 
 * separatorChar:目录分隔符  Windows“\\” Unix"/"
 * pathseparatorChar:路径分隔符  Windows “;” Unix":"
 */
import java.io.File;
import java.io.IOException;

public class FileDemo01 {
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\c.txt");
//		file.createNewFile();
//		//判断文件是否可以写入
//		System.out.println(file.canWrite());
//		//判断文件是否存在
//		System.out.println(file.exists());
		//获取绝对路径
//		System.out.println(file.getAbsolutePath());
		
		//获取剩余空间//202591903744
//		System.out.println(file.getFreeSpace());
		
		//获取总空间
//		System.out.println(file.getTotalSpace());
		
		//获取可用空间（一般和剩余空间相等）
//		System.out.println(file.getUsableSpace());
		
		//获取文件名称
//		System.out.println(file.getName());
		//获取文件所在的目录
//		System.out.println(file.getParentFile());
		//获取文件最后一次修改时间
//		System.out.println(file.lastModified());
		//设置文件修改时间
//		System.out.println(file.setLastModified(12345L));
		
		
		//获取目录中所有名称带数字的文件或者目录
//		File[] files = file.listFiles(new FileFilter() {
//			//pathname 文件
//			@Override
//			public boolean accept(File pathname) {
//				// TODO Auto-generated method stub
//				return pathname.getName().matches(".*\\d.*");
//			}
//		});
		
		
//		File[] files = file.listFiles(new FilenameFilter() {
//			
//			//dir 文件名
//			@Override
//			//返回值如果是true 那么就将文件返回到File[]数组中
//			//如果是false 那么直接舍弃
//			public boolean accept(File dir, String name) {
//				// TODO Auto-generated method stub
//				return name.matches(".*\\d.*");
//			}
//		});
//		for(File f :files){
//			System.out.println(f);
//		}
		
		//如果在同目录中，那么就是重命名
		//如果目录不相同，那么就是移动文件并重命名
		boolean b = file.renameTo(new File("D:\\abc\\cc.txt"));
		System.out.println(b);
	}
}
