package EsercizioRemotoBiblioteca;

import java.util.HashMap;
import java.util.Map;

public class Scaffale {
	private String codScaffale;
	private genere genere;
	private Map <String,Libro> listaLibro;
	
	
	public Scaffale(genere genere, String codScaffale) {
		super();
		this.genere = genere;
		this.codScaffale = codScaffale;
		this.listaLibro = new HashMap<>();
			
		
	}
	
	public Map<String, Libro> getListaLibro() {
		return listaLibro;
	}
	public void setListaLibro(Map<String, Libro> listaLibro) {
		this.listaLibro = listaLibro;
	}
	public genere getGenere() {
		return genere;
	}
	public void setGenere(genere genere) {
		this.genere = genere;
	}
	public String getCodScaffale() {
		return codScaffale;
	}
	public void setCodScaffale(String codScaffale) {
		this.codScaffale = codScaffale;
	}
	
	
	
	
	public boolean aggiungiLibro(Libro libro) {
		if (this.getListaLibro().containsKey(libro.getNome())) {
			return false;
		}
		this.getListaLibro().put(libro.getNome(),libro);
		return true;
	}
	
	public boolean rimuoviLibro(Libro libro) {
		if (this.getListaLibro().containsKey(libro.getNome())) {
			this.getListaLibro().remove(libro.getNome());
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codScaffale == null) ? 0 : codScaffale.hashCode());
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
		Scaffale other = (Scaffale) obj;
		if (codScaffale == null) {
			if (other.codScaffale != null)
				return false;
		} else if (!codScaffale.equals(other.codScaffale))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Scaffale [codScaffale=" + codScaffale + ", genere=" + genere + ", listaLibro=" + listaLibro + "]";
	}
	
	
}
