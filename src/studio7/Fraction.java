package studio7;

public class Fraction {
	
	public String addition(int numer1, int denom1, int numer2, int denom2) {
		int denom = denom1 * denom2;
		int numer = (numer1 * denom2) + (numer2 * denom1);
		return numer + " / " + denom;
	}
	public String multiply(int numer1, int denom1, int numer2, int denom2) {
		int denom = denom1* denom2;
		int numer = numer1 * numer2;
		return numer + " / " + denom;
	}
	public String reciprocal(int num, int denomer) {
		int denom = num;
		int numer = denomer;
		return numer + " / " + denom;
	}
	public String simplify(int num, int denom) {
		int numi= num;
		int denomi= denom;
		for(int i = 2; i <= denom; i++) {
			if(denom % i == 0) {
				if(num % i == 0) {
					numi = num / i;
					denomi = denom / i;
				}
			}
		}
		return numi + " / " + denomi;
	}
	
	public static void main(String[] args) {
		Fraction frac1 = new Fraction();
		System.out.println(frac1.addition(1,2,3,4));
		System.out.println(frac1.multiply(1,2,3,4));
		System.out.println(frac1.reciprocal(1,2));
		System.out.println(frac1.simplify(9,15));
	}
	

}
