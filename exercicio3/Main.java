package exercicio3;

public class Main {
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		// inserção dos elementos na lista
		lista.inserir(1);
		lista.inserir(2);
		lista.inserir(3);
		lista.inserir(4);
		lista.inserir(5);
		
		// inverte os elementos da lista
		inverter(lista);
		
		// imprime os elementos da lista
		lista.imprimir();
	}
	
	public static void inverter(Lista lista) {
		No inversão = lista.fim;
		lista.inicio = lista.fim;
		do {
			inversão.dir = inversão.esq;
			inversão = inversão.esq;
		} while (inversão != null); 
	}
}
