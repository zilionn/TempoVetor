
public class CalculaTempo {

	public static void main(String[] args) {

		int[] vet1 = new int[1000];
		int[] vet2 = new int[10000];
		int[] vet3 = new int[100000];
		
		double tempoInicial1 = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			vet1[i] = vet1[i] + 0;
		}
		double tempoFinal1 = System.nanoTime();
		double tempoTotal1 = tempoFinal1 - tempoInicial1;
		System.out.println("Tempo total: " +tempoTotal1+".s");
		
		double tempoInicial2 = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			vet2[i] = vet2[i] + 0;
		}
		double tempoFinal2 = System.nanoTime();
		double tempoTotal2 = tempoFinal2 - tempoInicial2;
		System.out.println("Tempo total: " +tempoTotal2+".s");
		
		double tempoInicial3 = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			vet3[i] = vet3[i] + 0;
		}
		double tempoFinal3 = System.nanoTime();
		double tempoTotal3 = tempoFinal3 - tempoInicial3;
		System.out.println("Tempo total: " +tempoTotal3+".s");
	}

}
