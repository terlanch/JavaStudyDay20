package cn.tedu.mapdemp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//����һ��Map
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i  = 0;i<str.length();i++){
			//��ȡÿһ���ַ�
			char c = str.charAt(i);
			//map�е�key���ַ��Ƚ�
			if(map.containsKey(c)){
				//�ҵ���ͬ���ַ�
				//�Ȼ�ȡkey��Ӧ��value
				Integer value = map.get(c);
				value++;
				map.put(c, value);
			}else{
				map.put(c, 1);
			}
			
		}
		for(Map.Entry<Character, Integer> en : map.entrySet()){
			System.out.println(en.getKey()+"���ֵĴ���"+en.getValue());
		}
	}
}	
