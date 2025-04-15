
public class Result1 extends Exam implements Sports,Music {
	int SportMark;
	int MusicMark;
	int DanceMark;
	int total;
	
	public void showResult() {
		total=mark1+mark2+SportMark+MusicMark;
		System.out.println("Total:"+ total);
		System.out.println("Average" + total/5);
	}

	@Override
	public void setMusicMark(int Musicmark) {
		this.MusicMark=Musicmark;

		
	}
	public void showMusicMark() {
		System.out.println("Music Marks" + MusicMark);
	}

	@Override
	public void setSportMark(int SportMark) {
		this.SportMark=SportMark;
		
	}
	public void showSportMark() {
		System.out.println("Sport Mark :" + SportMark);
	}
	
	public void setDanceMark(int DanceMark) {
		this.DanceMark=DanceMark;
	}
		
	
	public void showDanceMark() {
		System.out.println("Dance MArk :" + DanceMark);
	}

	

}
