package br.ans.eventos;

import java.util.ArrayList;
import java.util.List;

public class EventoPessoaBean { 
	
	public List<EventoParticipante> participante;
	
	
	public List<EventoParticipante> getParticipante() {
		return participante;
	}


	public void setParticipante(List<EventoParticipante> participante) {
		this.participante = participante;
	}

	public void ListaParticipantes(){
		
		ArrayList<EventoParticipante> lista = new ArrayList<EventoParticipante>();
		
		lista.add(new EventoParticipante("PR1", "VIDA", "TESTE2", 3l));
		lista.add(new EventoParticipante("PR1", "VIDA", "TESTE2", 3l));
		lista.add(new EventoParticipante("PR1", "VIDA", "TESTE2", 3l));
		
		lista.add(new EventoParticipante("PR2", "VIDA", "TESTE3", 4l));
		lista.add(new EventoParticipante("PR2", "MORTE", "TESTE4", 4l));
		lista.add(new EventoParticipante("PR2", "VIDA", "TESTE5", 4l));
		lista.add(new EventoParticipante("PR2", "MORTE", "TESTE6", 4l));
		
		this.setParticipante(lista);
		
	}
	
}
