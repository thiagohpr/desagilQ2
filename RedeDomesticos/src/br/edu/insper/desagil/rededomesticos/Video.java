package br.edu.insper.desagil.rededomesticos;


import java.util.HashMap;
import java.util.Map;

public class Video {
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<String, Integer> avaliacoes;
	
	
	public Video(int id, Usuario usuario, Produto produto) {
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
	}

	public int getId() {
		return id;
	}

	public Produto getProduto() {
		return produto;
	}
	
	public void adicionaAvaliacao(Usuario usuario, int avaliacao) {
		String usuarioPostou=this.usuario.getNome();
		String usuarioAvaliou=usuario.getNome();
		if (usuarioPostou!=usuarioAvaliou && avaliacao>=1 && avaliacao<=5) {
			this.avaliacoes.put(usuarioAvaliou,avaliacao);
		}
	}
	
	public int mediaAvaliacoes() {
		double media=0;
		int soma=0;
		int n=this.avaliacoes.size();
		
		for (int avaliacao:this.avaliacoes.values()) {
			soma+=avaliacao;
		}
		media=soma/(double)n;
		
		return (int) Math.round(media);
	}

}
