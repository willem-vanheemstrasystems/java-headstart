package bucky;

public class timecalculator {
	private int hour;
	private int minute;
	private int second;
	
	public void setTime(int h, int m, int s) {
		hour = ((h>=0 && h<24) ? h : 0); // If not a valid hour, set to zero
		minute = ((m>=0 && m<60) ? m : 0); // If not a valid minute, set to zero
		second = ((s>=0 && s<60) ? s : 0); // If not a valid second, set to zero
	}
	public String toMilitary(){
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
