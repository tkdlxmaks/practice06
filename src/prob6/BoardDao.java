package prob6;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	

	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();

		/**
		 * 사실은 DB에서 데이터를 가져와 Board 객체를 만들고 리스트에 저장
		 */
		for(int count=1; count<=3; count++ ) {
			list.add(new Board(count, count));
		}

		return list;
	}

}
