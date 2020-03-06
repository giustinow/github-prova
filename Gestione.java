package EsercizioRemotoBiblioteca;

import java.util.HashMap;
import java.util.Map;

public class Gestione {
	private Map<String, Scaffale> listaScaffale;
	private Map<String, Prenotazione> listaPrenotazioni;
	
	public Gestione() {
		listaScaffale = new HashMap<>();
		listaPrenotazioni = new HashMap<>();
	}

	public Map<String, Scaffale> getListaScaffale() {
		return listaScaffale;
	}

	public void setListaScaffale(Map<String, Scaffale> listaScaffale) {
		this.listaScaffale = listaScaffale;
	}

	public Map<String, Prenotazione> getListaPrenotazioni() {
		return listaPrenotazioni;
	}

	public void setListaPrenotazioni(Map<String, Prenotazione> listaPrenotazioni) {
		this.listaPrenotazioni = listaPrenotazioni;
	}

	@Override
	public String toString() {
		return "Gestione [listaScaffale=" + listaScaffale + ", listaPrenotazioni=" + listaPrenotazioni + "]";
	}
	

	
	
	public boolean aggiungiScaffale(Scaffale scaffale){
		if (this.listaScaffale.containsKey(scaffale.getCodScaffale())) {
			return false;
		}
		this.getListaScaffale().put(scaffale.getCodScaffale(),scaffale);
		return true;
	}
	
	public boolean rimuoviScaffale( Scaffale scaffale) {
		if (this.getListaScaffale().containsKey(scaffale.getCodScaffale())) {
			this.getListaScaffale().remove(scaffale.getCodScaffale());
			return true;
		}
		return false;
	}
	
	public boolean aggiungiLibroInScaffale(Libro libro, Scaffale scaffale) {
		if (this.getListaScaffale().containsKey(scaffale.getCodScaffale())){
			this.getListaScaffale().get(scaffale.getCodScaffale()).aggiungiLibro(libro);
			return true;
		}return false;
		
	}
	
	public boolean rimuoviLibroScaffale (Libro libro, Scaffale scaffale) {
		if (this.getListaScaffale().containsKey(scaffale.getCodScaffale())) {
			this.getListaScaffale().get(scaffale.getCodScaffale()).rimuoviLibro(libro);
			return true;
		}return false;		
	}
	
	public boolean aggiungiPrenotazione (Libro libro, Prenotazione prenotazione) {
		if (this.getListaPrenotazioni().containsKey(prenotazione.getNumPrenotazione())) {
			this.getListaPrenotazioni().get(prenotazione.getNumPrenotazione()).aggiungiPrenotazione(libro);
			return true;
		}
		return false;
	}
	public boolean cancellaPrenotazione (Prenotazione prenotazione) {
		if (this.getListaScaffale().containsKey(prenotazione.getNumPrenotazione())) {
			this.getListaPrenotazioni().remove(prenotazione.getNumPrenotazione());
			return true;
		}return false;
	}
	
	public boolean aggiornaNomeScaffale (Scaffale scaffale, String nomeNuovo) {
		if (this.getListaScaffale().containsKey(scaffale.getCodScaffale())) {  
			this.getListaScaffale().get(scaffale.getCodScaffale()).setCodScaffale(nomeNuovo);
			return true;
		}
		return false;
	}
	
	public boolean aggiornaNomeLibro (Scaffale scaffale, Libro libro, String nomeNuvo) {
		if (this.getListaScaffale().containsKey(scaffale.getCodScaffale())) {
			Scaffale scaffale2 = this.getListaScaffale().get(scaffale.getCodScaffale());
			scaffale2.getListaLibro().get(libro.getNome()).setNome(nomeNuvo);
			return true;
		}return false;
	}
	
	
	public void stampaListaScaffale() {
		for (String x : listaScaffale.keySet()) {
			System.out.println(x + " " + listaScaffale.containsKey(x));
		}
	}
	public void stampaListaLibriScaffale(Scaffale scaffale) {
		Map<String, Libro> listaLibro = listaScaffale.get(scaffale.getCodScaffale()).getListaLibro();
		for (String libro : listaLibro.keySet()) {
			System.out.println(libro + " " + listaLibro.containsKey(libro));
		}
	}
	public void stampaPrenotazioni() {
		for (String x : listaPrenotazioni.keySet()) {
			System.out.println(x + " " + listaPrenotazioni.containsKey(x));
		}
	}
	
	
	
	
	
}
