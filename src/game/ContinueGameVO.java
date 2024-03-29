package game;

public class ContinueGameVO {
	
	private int idx;
	private String name;
	private int score;
	private String sokdamfront;
	private String sokdambehind;
	private String lyricsfront;
	private String lyricsbehind;
	
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getSokdamfront() {
		return sokdamfront;
	}
	public void setSokdamfront(String sokdamfront) {
		this.sokdamfront = sokdamfront;
	}
	public String getSokdambehind() {
		return sokdambehind;
	}
	public void setSokdambehind(String sokdambehind) {
		this.sokdambehind = sokdambehind;
	}
	public String getLyricsfront() {
		return lyricsfront;
	}
	public void setLyricsfront(String lyricsfront) {
		this.lyricsfront = lyricsfront;
	}
	public String getLyricsbehind() {
		return lyricsbehind;
	}
	public void setLyricsbehind(String lyricsbehind) {
		this.lyricsbehind = lyricsbehind;
	}
	
	
	public String toString() {
		return "ContinueGameVO [idx=" + idx + ", name=" + name + ", score=" + score + ", sokdamfront=" + sokdamfront
				+ ", sokdambehind=" + sokdambehind + ", lyricsfront=" + lyricsfront + ", lyricsbehind=" + lyricsbehind + "]";
	}	
	
}
