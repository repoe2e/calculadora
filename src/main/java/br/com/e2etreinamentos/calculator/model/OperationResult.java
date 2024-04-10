package br.com.e2etreinamentos.calculator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OperationResult {

	private double resultado;

	public OperationResult(double resultado) {
		this.resultado = resultado;
	}

	  @JsonProperty("resultado")
	public double getResult() {
		return resultado;
	}

	  @JsonProperty("resultado")
	public void setResult(double resultado) {
		this.resultado = resultado;
	}

}
