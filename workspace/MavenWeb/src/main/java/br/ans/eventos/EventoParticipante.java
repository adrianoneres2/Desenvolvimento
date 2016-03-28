package br.ans.eventos;

public class EventoParticipante {
	
	
	private String siglaRelatorio;
	private String evento;
	private String descricaoEvento;
	private Long   totalRegistros;
	
	
	public EventoParticipante(String sigla, String eve, String desc, Long total){
		
		this.setSiglaRelatorio(sigla);
		this.setEvento(eve);
		this.setDescricaoEvento(desc);
		this.setTotalRegistros(total);
	}
	
	
	public String getSiglaRelatorio() {
		return siglaRelatorio;
	}
	public void setSiglaRelatorio(String siglaRelatorio) {
		this.siglaRelatorio = siglaRelatorio;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	public String getDescricaoEvento() {
		return descricaoEvento;
	}
	public void setDescricaoEvento(String descricaoEvento) {
		this.descricaoEvento = descricaoEvento;
	}
	public Long getTotalRegistros() {
		return totalRegistros;
	}
	public void setTotalRegistros(Long totalRegistros) {
		this.totalRegistros = totalRegistros;
	}

}
