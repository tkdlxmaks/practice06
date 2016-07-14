package prob6;

public class Board {
	private String title;
	private String content;

	public Board(int title, int content) {
		this.title = "제목" + title;
		this.content = "내용" + content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
