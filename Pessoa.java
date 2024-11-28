
abstract class Pessoa {
	
    private  int matricula;
    public  String nome; 
    protected  String contato;
    private  String cpf;
    protected  String dataNascimento; 
    public  String sexo;
    protected  String estadoCivil;
    public  String nacionalidade;
    public  String naturalidade;
    public  String etnia;
    
    
    
	public Pessoa(int matricula, String nome, String contato, String cpf, String dataNascimento, String sexo, String estadoCivil, String nacionalidade, String naturalidade, String etnia) {
		this.matricula = matricula;
		this.nome = nome;
		this.contato = contato;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.nacionalidade = nacionalidade;
		this.naturalidade = naturalidade;
		this.etnia = etnia;
	}




	public int getMatricula() {
		return matricula;
	}

	public void setMatrícula(int matricula) {
		this.matricula = matricula;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}




	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}




	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}




	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}




	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	
	
	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}




	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}




	public String getEtnia() {
		return etnia;
	}

	public void setEtnia(String etnia) {
		this.etnia = etnia;
	} 
	
	
    

    
}
