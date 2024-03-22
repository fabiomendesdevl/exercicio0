package entites;

public class PessoaJuridica extends Pessoa{

	private Integer numeroFuncionarios;
	Pessoa pessoa;
	



	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}



	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}



	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}



	@Override
	public double totalValor() {
		double som = 0;
		if(numeroFuncionarios <= 10 ) {
			som = som + getRendaAnual() * 0.16;
		}
		else {
			som = som + getRendaAnual() * 0.14;
		}
		return som;
	}



	@Override
	public String toString() {
		return "Nome: "
				+getNome()
				+" Valor total: "
				+ String.format("%.2f", totalValor());
	}
}
