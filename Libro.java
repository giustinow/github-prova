package EsercizioRemotoBiblioteca;

public class Libro {
	private String nome;
	private String autore;
	private String dataPubblicazione;
	private String casaEditrice;
	private String codice;
	
	
	
	public Libro(String nome, String autore, String datPubblicazione, String casaEditrice, String codice) {
		super();
		this.nome = nome;
		this.autore = autore;
		this.dataPubblicazione = datPubblicazione;
		this.casaEditrice = casaEditrice;
		this.codice = codice;
	}
	@Override
	public String toString() {
		return "Libro [nome=" + nome + ", autore=" + autore + ", datPubblicazione=" + dataPubblicazione
				+ ", casaEditrice=" + casaEditrice + ", codice=" + codice + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getDatPubblicazione() {
		return dataPubblicazione;
	}
	public void setDatPubblicazione(String datPubblicazione) {
		this.dataPubblicazione = datPubblicazione;
	}
	public String getCasaEditrice() {
		return casaEditrice;
	}
	public void setCasaEditrice(String casaEditrice) {
		this.casaEditrice = casaEditrice;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
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
		Libro other = (Libro) obj;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		return true;
	}
	
}
