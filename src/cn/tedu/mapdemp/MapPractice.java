package cn.tedu.mapdemp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//创建一个Map
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i  = 0;i<str.length();i++){
			//获取每一个字符
			char c = str.charAt(i);
			//map中的key和字符比较
			if(map.containsKey(c)){
				//找到相同的字符
				//先获取key对应的value
				Integer value = map.get(c);
				value++;
				map.put(c, value);
			}else{
				map.put(c, 1);
			}
			
		}
		for(Map.Entry<Character, Integer> en : map.entrySet()){
			System.out.println(en.getKey()+"出现的次数"+en.getValue());
		}
	}
}	
