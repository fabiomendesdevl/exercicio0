package entites;

public class PessoaFisica extends Pessoa{

	private Double gastoSaude;
	Pessoa pessoa;
	
	public PessoaFisica() {
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double totalValor() {
		double som = 0.0;
		if(getRendaAnual() < 20000) {
			som = som + getRendaAnual() * 0.15 - (gastoSaude * 0.5);
		}
		else{
			som = som + getRendaAnual() * 0.25 - (gastoSaude * 0.5);
		}
		return som;
	}

	@Override
	public String toString() {
		return "Nome: "
				+getNome()
				+" Valor Total: "
				+String.format("%.2f", totalValor());
	}

}
