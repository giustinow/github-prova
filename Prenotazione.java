package EsercizioRemotoBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Prenotazione {
	private String nome;
	private String cognome;
	private String numPrenotazione;
	private List<Libro> listaLibriPrenotati;
	
	
	public Prenotazione(String nome, String cognome, String numPrenotazione) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.numPrenotazione = numPrenotazione;
		this.listaLibriPrenotati = new ArrayList<>();
	}
	@Override
	public String toString() {
		return "Prenotazione [nome=" + nome + ", cognome=" + cognome + ", numPrenotazione=" + numPrenotazione
				+ ", listaLibriPrenotati=" + listaLibriPrenotati + "]";
	}
	public List<Libro> getListaLibriPrenotati() {
		return listaLibriPrenotati;
	}
	public void setListaLibriPrenotati(List<Libro> listaLibriPrenotati) {
		this.listaLibriPrenotati = listaLibriPrenotati;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNumPrenotazione() {
		return numPrenotazione;
	}
	public void setNumPrenotazione(String numPrenotazione) {
		this.numPrenotazione = numPrenotazione;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numPrenotazione == null) ? 0 : numPrenotazione.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prenotazione other = (Prenotazione) obj;
		if (numPrenotazione == null) {
			if (other.numPrenotazione != null)
				return false;
		} else if (!numPrenotazione.equals(other.numPrenotazione))
			return false;
		return true;
	}

	public boolean aggiungiPrenotazione(Libro libro) {
		if (this.getListaLibriPrenotati().contains(libro)) {
			return false;
		}
		this.getListaLibriPrenotati().add(libro);
		return true;
	}
	
	public boolean rimuoviPrenotazione (Libro libro) {
		if (this.getListaLibriPrenotati().contains(libro)) {
			this.getListaLibriPrenotati().remove(libro);
			return true;
		}
		return false;
	}
	
}
