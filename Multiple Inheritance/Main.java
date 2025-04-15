class Main {
	public static void main (String[]args) {
		Result r1 = new Result();
		r1.setdata(1, "Yash");
		r1.setMarks(90, 90);
		r1.setMusicMark(90);
		r1.setSportMark(80);
		r1.setDanceMark(85);
		
		r1.showdata();
		r1.showMarks();
		r1.showMusicMark();
		r1.showSportsMark();
		r1.showDanceMark();
		r1.showresult();
	}

}
