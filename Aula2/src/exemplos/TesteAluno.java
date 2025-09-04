package exemplos;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.matricula = 123;
		aluno1.nome = "Adryan";
		aluno1.email = "adryan@gmail.com";
		System.out.println(aluno1.matricula + " - " + aluno1.nome);
		
		Aluno aluno2 = new Aluno();
		aluno2.matricula = 321;
		aluno2.nome = "Marcos";
		aluno2.email = "marcos@gmail.com";
		
	}

}
