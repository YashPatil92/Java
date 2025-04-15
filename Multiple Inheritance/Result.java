

public class Result extends Exam implements Sports {
	int SportMark;
	int MusicMark;
	int DanceMark;
	int total;
	
	public void showresult() {
		total=mark1+mark2+SportMark+MusicMark+DanceMark;
		System.out.println("Total:"+ total);
		System.out.println("Average" + total/5);
	}
		
	@Override
	public void setSportMark(int SportMark) {
		this.SportMark=SportMark;
	}
	
	public void showSportsMark() {
		System.out.println("Sport Mark :"+ SportMark);
	}
	
	public void setMusicMark(int MusicMark) {
		this.MusicMark=MusicMark;
	}
	
	public void showMusicMark() {
		System.out.println("Music Mark :" + MusicMark);
	}
	
	public void setDanceMark(int DanceMark) {
		this.DanceMark=DanceMark;
	}
	
	public void showDanceMark() {
		System.out.println("Dance Mark :" + DanceMark);
		
	}
	
	
}
