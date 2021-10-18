package entities;

public class Company extends taxPayer{
	
	private Integer numeroFunc;

	public Company(String name, Double rendaAnual, Integer numeroFunc) {
		super(name, rendaAnual);
		this.numeroFunc = numeroFunc;
	}

	public Integer getNumeroFunc() {
		return numeroFunc;
	}

	public void setNumeroFunc(Integer numeroFunc) {
		this.numeroFunc = numeroFunc;
	}

	@Override
	public Double tax() {
		double soma = 0;
		if(numeroFunc > 10) {
			return soma += getRendaAnual() * 0.14;
		}else {
			return soma += getRendaAnual() * 0.16;

		}
	}
	
}
