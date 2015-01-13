
//museo es la subclase de la superclase espacioPublico

public class Polideportivo extends EspacioPublico {
	
	private Integer idPolideportivo;
	
	public Polideportivo (String calle, String nombre,String ciudad, Integer telefono, Integer idpolideportivo){
		super (calle,nombre,ciudad,telefono);
		this.idPolideportivo = idpolideportivo;
		
	}

	public Integer getIdPolideportivo() {
		return this.idPolideportivo;
	}

	public void setIdPolideportivo(Integer idPolideportivo) {
		this.idPolideportivo = idPolideportivo;
	}

}
