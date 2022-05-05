package exercicio2;

public class Fila {

	No inicio, fim;
	
	// método para inserir um elemento no final da fila (enfileirar)
	public void enfileirar(Motorista motorista) {
		No aux = new No(motorista);
		if(inicio == null) {
			inicio = aux;
		} else {
			aux.esq = fim;
			fim.dir = aux;
		}
		fim = aux;
	}
	
	// método para desenfileirar um elemento da fila, ou seja, remover o primeiro elemento
	public void desenfileirar() {
		
		if(inicio ==null) {
			
			System.out.println("A fila de onibus está vazia");
		} else {
			
			if(inicio.esq != null) {
				
				inicio.dir = null;
				inicio = inicio.esq;
			} else {
				
				 inicio = null;
			}
		}
	}
	
	// método para exibir os dados (nome e placa) dos motoristas
	public void mostrarDados() {
		for(No l = inicio; l != null ; l = l.dir) {
			System.out.println("Motorista: " + l.motorista.getNome() + "Placa do carro: " + l.motorista.getPlaca() + "");
		}
	}
}
