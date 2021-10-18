package entities;

public class Individual extends taxPayer {
	
	private Double gastosSaude;

	public Individual(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double tax() {
		double soma = 0;
		if(getRendaAnual() < 20000) {
			return soma = soma + getRendaAnual() * 0.15 - gastosSaude * 0.5;
		}
		else {
			return soma = soma + getRendaAnual() * 0.25 - gastosSaude * 0.5;
		}
	
	}
}
