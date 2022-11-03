package studio7;

public class Complex {
	private double real1;
	private double imaginary1;
	private double real2;
	private double imaginary2;
	
	public String add(double real1,double imaginary1,double real2, double imaginary2) {
		double real = real1 + real2;
		double imaginary = imaginary1 + imaginary2;
		return real +" + "+ imaginary+ "i";
	}
	public String product(double real1,double imaginary1,double real2, double imaginary2) {
		double real = real1*real2-imaginary1*imaginary2;
		double imaginary = real1*imaginary2+imaginary1*real2;
		return real+" + " + imaginary +"i";
	}
	public static void main(String[] args) {
		Complex complex1 = new Complex();
		System.out.println(complex1.add(4,5,6,7));
		System.out.println(complex1.product(4,5,6,7));
	}
}
