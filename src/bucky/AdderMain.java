package bucky;

public class AdderMain {
	public static void main(String[] args){
		Adder adder = new Adder(10);
		
		for(int i=0;i<5;i++){
			adder.add();
			System.out.printf("%s", adder);
		}
	}
}
