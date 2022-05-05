package exercicio2;

public class Main {
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		// inserção dos dados na fila
		fila.enfileirar(new Motorista("Selmini", "ABC-4546"));
		fila.enfileirar(new Motorista("Flávio", "BYZ-7576"));
		fila.enfileirar(new Motorista("Surjan", "BBB-1234"));
		fila.enfileirar(new Motorista("Surian", "DDD-7777"));
		
		// remoção de alguns motoristas da fila
		fila.desenfileirar();
		fila.desenfileirar();
		
		// impressão dos dados dos motoristas que ainda estão na fila
		fila.mostrarDados();		

	}
}
