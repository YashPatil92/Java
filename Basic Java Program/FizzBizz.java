/*class FizzBizz{
	public static void main(String[]args){
		for(int i=1;i<=100;i++){
			
		if(i%3==0 && i%5==0){
		System.out.print("FizzBizz");
		}

			if(i%3==0){
			
			System.out.print("Fizz");
			}
			else if(i%5==0){
			System.out.print("Bizz");			
			}
			
				System.out.print(i + " ");
		}		
	}
}
*/

class FizzBizz{
	public void FizzBizz(){
		for(int i=1;i<=100;i++){
			
		if(i%3==0 && i%5==0){
			System.out.print("FizzBizz");
		}
		if(i%3==0){
			System.out.print("Fizz");
		}
		else if(i%5==0){
			System.out.print("Bizz");			
		}
			System.out.print(i + " ");
		}
	}
		public static void main(String[]args){
			FizzBizz f=new FizzBizz();
			f.FizzBizz();
	} 
}