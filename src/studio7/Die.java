package studio7;

public class Die {
	private int n;
	
	public int roll(int n) {
		return (int)(Math.random()*n+1);
	}
	public static void main(String[] args) {
		

		Die dieOne = new Die();
		System.out.print(dieOne.roll(10));
	}
}
