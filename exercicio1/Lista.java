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
    
private void inserirPrioridade(No Prioridade) {

      No Antecessor = null;
	  No Primeiro = inicio;  


	
		if(inicio == null) {
			inicio = Prioridade;
			fim = inicio;
		} else if (inicio.cor.equalsIgnoreCase("verde")) {
			Prioridade.prox = inicio;
			inicio = Prioridade;
		} else if (fim.cor.equalsIgnoreCase("amarelo")) {
			inserirFim(Prioridade);
		} else {
			do {
				
				if(Primeiro .cor.equals("verde")) {
					Prioridade.prox = Antecessor .prox;
					Antecessor.prox = Prioridade;
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
