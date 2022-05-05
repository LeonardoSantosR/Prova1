package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// método para inserir um elemento na lista.
	// a inserção deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {
		No Inserir = new No(dado);
		if(inicio == null) {
			inicio = Inserir;
			fim = Inserir;
		} else if (Inserir.dado < inicio.dado){
			Inserir.esq = inicio;
			inicio.dir = Inserir;
			inicio = Inserir;	
		} else if (Inserir.dado > fim.dado) {
			fim.esq = Inserir;
			Inserir.dir = fim;
			fim = Inserir;
		} else {
			No Inserir2 = inicio;
			do {
				if(Inserir.dado > Inserir2.dado && Inserir.dado < Inserir2.esq.dado) {
					Inserir.dir = Inserir2;
					Inserir.esq = Inserir2.esq;
					Inserir2.esq.dir = Inserir;
					Inserir2.esq = Inserir;
					break;
				}
				Inserir2 = Inserir2.esq;
			} while(Inserir2 != null);
			
		}
		
	}
	
	// método para imprimir os elementos da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}
}
