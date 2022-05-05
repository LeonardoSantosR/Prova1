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
			Inserir.dir = inicio;
			inicio.esq = Inserir;
			inicio = Inserir;	
		} else if (Inserir.dado > fim.dado) {
			fim.dir = Inserir;
			Inserir.esq = fim;
			fim = Inserir;
		} else {
			No Inserir2 = inicio;
			do {
				if(Inserir.dado > Inserir2.dado && Inserir.dado < Inserir2.dir.dado) {
					Inserir.esq = Inserir2;
					Inserir.dir = Inserir2.dir;
					Inserir2.dir.esq = Inserir;
					Inserir2.dir = Inserir;
					break;
				}
				Inserir2 = Inserir2.dir;
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
