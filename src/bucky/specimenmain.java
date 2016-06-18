package bucky;

public class specimenMain {
	public static void main(String[] args){
		pointInTime birthday = new pointInTime(4,15,2016);
		specimen fish = new specimen("Dory", "fish", birthday);
		System.out.println(fish);
	}
}
