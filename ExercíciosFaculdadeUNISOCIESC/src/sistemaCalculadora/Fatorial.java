package sistemaCalculadora;

public class Fatorial extends Operacao {
	
	public float calcular(int prm1, int prm2) {
		if (prm1 == 0) {
			prm1++;
		} else {
			for (int c = prm1-1; c > 0; c--) {
				prm1 = prm1 * c;
			}
		}
		return prm1;
	}
}
