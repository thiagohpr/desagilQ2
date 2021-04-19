package br.edu.insper.desagil.rededomesticos;

public class Testador {
	private Usuario user=new Usuario("teste");
	private Usuario usuario=new Usuario ("Pedro");
	private Produto produto=new Produto("teste",5);
	
	public int testeZero(){
		Video video1=user.postaVideo(1, produto);
		video1.adicionaAvaliacao(user, 3);
		video1.adicionaAvaliacao(usuario, 0);
		video1.adicionaAvaliacao(usuario, 10);
		int media=usuario.totalAvaliacoes();
		return media; 
	}
	public int testeUmaAvaliacao(){
		Video video2=user.postaVideo(1, produto);
		video2.adicionaAvaliacao(usuario, 3);
		int media=usuario.totalAvaliacoes();
		return media; 
	}
	public int testeDuasAvaliacoesArrenCima(){
		Video video3=user.postaVideo(1, produto);
		video3.adicionaAvaliacao(usuario, 3);
		video3.adicionaAvaliacao(usuario, 2);
		int media=usuario.totalAvaliacoes();
		return media; 
		
	}
	public int testeTresAvaliacoesArrenBaixo(){
		Video video4=user.postaVideo(1, produto);
		video4.adicionaAvaliacao(usuario, 3);
		video4.adicionaAvaliacao(usuario, 2);
		video4.adicionaAvaliacao(usuario, 2);
		int media=usuario.totalAvaliacoes();
		return media; 
	}
	public int testeDoisVideos(){
		Video video5=user.postaVideo(1, produto);
		Video video6=user.postaVideo(1, produto);
		
		video5.adicionaAvaliacao(usuario, 3);
		video5.adicionaAvaliacao(usuario, 2);
		video6.adicionaAvaliacao(usuario, 2);
		
		int media=usuario.totalAvaliacoes();
		return media; 
	}
}
