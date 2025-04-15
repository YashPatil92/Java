
public class Player {
	//getter setter  
	int Playerid;
	String Playername;
	String Game;
	String Country;
	
	public void setPlayerid(int p) {
		Playerid=p;
	}
	public int getPlayerid() {
		return Playerid;
	}
	
	public void setPlayername(String n) {
		Playername=n;
	}
	public String getPlayername() {
		return Playername;
	}
	
	public void setGame(String g) {
		Game=g;
	}
	public String getGame() {
		return Game;
	}
	
	public void setCountry(String c) {
		Country=c;
	}
	public String getCountry() {
		return Country;
	}
	
	public static void main(String[] args) {
		Player p1 = new Player();
		p1.setPlayerid(45);
		p1.setPlayername("Rohit Sharma");
		p1.setGame("Cricket");
		p1.setCountry("India");
		
		Player p2 = new Player();
		p2.setPlayerid(33);
		p2.setPlayername("Hardik Pandya");
		p2.setGame("Cricket");
		p2.setCountry("India");
		
		System.out.println(p1.getPlayerid());
		System.out.println(p1.getPlayername());
		System.out.println(p1.getGame());
		System.out.println(p1.getCountry());
		
		System.out.println(p2.getPlayerid());
		System.out.println(p2.getPlayername());
		System.out.println(p2.getGame());
		System.out.println(p2.getCountry());
	}

}
