/*
 ===============================================================================
 ARQUIVO............: Quarto.java
 DESCRICAO..........: Codigo-fonte correspondente a definicao da classe Quarto  
 					  que representa os tipos de quartos disponíveis no Hotel
 AUTOR..............: João Emmanuel e Irene Ginani
 ===============================================================================
*/

package servidor;

import java.io.Serializable;

public class Quarto implements Serializable {

	private boolean vago;
	private String tipo;
	private double preco_diaria;
	private String nome_cliente;
	
	public Quarto(String tipo, double preco_diaria) {
		this.vago = true;
		this.tipo = tipo;
		this.preco_diaria = preco_diaria;
		this.nome_cliente = "";
	}

	public boolean isVago() {
		return vago;
	}
	
	public void setVago(boolean vago) {
		this.vago = vago;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getPreco_diaria() {
		return preco_diaria;
	}

	public void setPreco_diaria(double preco_diaria) {
		this.preco_diaria = preco_diaria;
	}
	
	public String getNome_cliente() {
		return nome_cliente;
	}
	
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	
	public boolean reservarQuarto(String nomeCliente, Quarto quarto) {
		
		if (quarto != null) {
			
			quarto.setVago(false);
			quarto.setNome_cliente(nomeCliente);
			
			return true;
		}
		
		throw new IllegalArgumentException();
		
	}
	
	// M�todo para reservar o quarto
}
