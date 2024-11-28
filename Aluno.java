
public class Aluno extends Pessoa implements Info {
	public String curso; 
	

	public Aluno(String curso,int matricula, String nome, String contato, String cpf, String dataNascimento, String sexo, String estadoCivil, String nacionalidade, String naturalidade, String etnia) {
		super(matricula, nome, contato, cpf, dataNascimento, sexo, estadoCivil, nacionalidade, naturalidade, etnia);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}	
	
	@Override
	public void ImprimirInformacoes(){
		System.out.println("O curso: " + getCurso());
		System.out.println("A matricula: " + getMatricula());
		System.out.println("O nome: " + getNome());
	};
	
	//Oi

}