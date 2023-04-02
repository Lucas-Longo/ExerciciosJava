package sistemaCalculadora;

public class Exponenciacao extends Operacao {
	
	public float calcular(int prm1, int prm2) {
		int prm1inicial = prm1;
		for (int i = 1; i < prm2; i++) {
			prm1 = prm1 * prm1inicial;
		}
		return prm1;
	}
}
