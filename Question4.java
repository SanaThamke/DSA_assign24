package assignment24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Question4 {

	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupedAnagrams = groupAnagrams(strs);
        System.out.println(groupedAnagrams);

	}

	private static List<List<String>> groupAnagrams(String[] str) {
		
		HashMap<String,List> map=new HashMap<>();
		for(String s:str) {
			char[] strArr = s.toCharArray();
			Arrays.sort(strArr);
			String sorted=new String(strArr);
			
			if(map.containsKey(sorted)) {
				map.get(sorted).add(s);
			}else
			{
				List<String> list =new ArrayList<String>();
				list.add(s);
				map.put(sorted, list);
			}
		}
		return new ArrayList<>(map.values());
	}

}
