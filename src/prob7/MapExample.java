package prob7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("blue", 85);
		map.put("red", 96);
		map.put("black", 92);

		String name = null; // 최고 점수를 받은 아이디 저장
		int maxScore = 0; // 최고 점수
		int totalScore = 0; // 점수 합계

		/*
		 * 코드를 작성하세요 - set저장후 iterator 저장 이후 while문 사용 순회하면서 total값은 다 더하고 max값은
		 * if문으로 비교
		 */
		Set set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			totalScore += map.get(key);
			if (maxScore < map.get(key)) {
				maxScore = map.get(key);
				name=key;
			}
		}
		totalScore /= map.size();
		
		System.out.println("최고 점수 : " + maxScore + "\n점수 합계 : " + totalScore+"\n최고 점수받은 아이디 :"+name);
	}

}
