class ForDemo22222{
	public static void main(String[] args){
		int a=1,b=10,c=100;
		for(; ;){
		System.out.println(a+ " "+b+ " " +c);
		a++;
		b=b+100;
		c=c+1000;
		if(c>1000 && b>50)
			break;
		}
	}
}
