
public class Professor extends Pessoa implements Info { 
	protected String formacao;
	private float salario; 
	

	public Professor(String formacao, float salario,int matricula, String nome, String contato, String cpf, String dataNascimento, String sexo, String estadoCivil, String nacionalidade, String naturalidade, String etnia) {
		super(matricula, nome, contato, cpf, dataNascimento, sexo, estadoCivil, nacionalidade, naturalidade, etnia);
		this.formacao = formacao;
		this.salario = salario;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public void ImprimirInformacoes(){
		System.out.println("Formação : " + getFormacao());
		System.out.println("Nome : " + getNome());
		System.out.println("Salário : " + getSalario());
		System.out.println("Contato: " + getContato());
	};
	  
	  

}