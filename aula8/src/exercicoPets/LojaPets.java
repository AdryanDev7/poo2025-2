package exercicoPets;

public class LojaPets {

	private String nomeLoja;
	private Animal[] animais;
	private int quantidadeAnimais;

	public LojaPets(String nomeLoja, Animal[] animais, int quantidadeAnimais) {
		super();
		this.nomeLoja = nomeLoja;
		this.animais = animais;
		this.quantidadeAnimais = quantidadeAnimais;
	}

	public void adicionarAnimal(Animal animal) {
		if (quantidadeAnimais < 30) {
			animais[quantidadeAnimais] = animal;
			quantidadeAnimais++;
			System.out.println("Animal adicionado!");
		} else {
			System.out.println("Loja cheia, não é possivel adicionar mais animais.");
		}
	}

	public void listarAnimais() {
		if (quantidadeAnimais == 0) {
			System.out.println("Não há animais para adoção.");
		} else {
			System.out.println("\n--- Animais disponíveis ---");
			for (int i = 0; i < quantidadeAnimais; i++) {
				System.out.print("(" + i + ") "); 
				animais[i].imprimir();
				System.out.println("--------------------");
			}
		}
	}

	public void adotarAnimal(int index) throws AnimalException {
	        if (index < 0 || index >= quantidadeAnimais) {
	            throw new AnimalException("Animal não encontrado.");
	        }
	        
	        Animal adotado = animais[index];
	        
	        for (int i = index; i < quantidadeAnimais - 1; i++) {
	            animais[i] = animais[i + 1];
	        }

	        animais[quantidadeAnimais - 1] = null;
	        quantidadeAnimais--;

	        System.out.println("Você adotou:");
	        adotado.imprimir();
	}
}