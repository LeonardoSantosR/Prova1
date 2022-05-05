package exercicio1;

public class Lista {
	No inicio, fim;

	// insere um nó no final da lista. Esse método será chamado pelo método inserir
	private void inserirFim(No aux) {
		if (inicio == null) {
			inicio = aux;
		} else {
			fim.prox = aux;
		}
		fim = aux;
	}

	// esse método deverá ser implementado de acordo com o enunciado do exercício
    
private void inserirPrioridade(No aux) {

      No Antecessor = null;
	  No Primeiro = inicio;  


	
		if(inicio == null) {
			inicio = aux;
			fim = inicio;
		} else if (inicio.cor.equalsIgnoreCase("verde")) {
			aux.prox = inicio;
			inicio = aux;
		} else if (fim.cor.equalsIgnoreCase("amarelo")) {
			inserirFim(aux);
		} else {
			do {
				
				if(Primeiro .cor.equals("verde")) {
					aux.prox = Antecessor .prox;
					Antecessor.prox = aux;
					break;
				}
				Antecessor = Primeiro ;
				Primeiro  = Primeiro .prox;
				
			} while (Primeiro  != null);
		}
		
	}
	


	// método inserir. Esse método será chamado a partir da classe Main
	public void inserir(int numero, String cor) {
		No aux = new No(numero, cor);
		if (cor.equalsIgnoreCase("verde")) {
			inserirFim(aux);
		} else {
			inserirPrioridade(aux);
		}
	}

	// método utilizado para imprimir os dados da lista
	public void imprimir() {
		No aux = inicio;
		while (aux != null) {
			System.out.println(aux.numero);
			aux = aux.prox;
		}
	}
}
