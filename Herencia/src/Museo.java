//museo es la subclase de la superclase espacioPublico

public class Museo extends EspacioPublico {
	
	private Integer idMuseo;
	private Double precio;
	
	
	public Museo (String calle, String nombre,String ciudad, Integer telefono, Integer idMuseo, Double precio){
		super (calle,nombre, ciudad, telefono);
		
		this.setIdMuseo(idMuseo);
		this.setPrecio(precio);
	}


	public Integer getIdMuseo() {
		return idMuseo;
	}


	public void setIdMuseo(Integer idMuseo) {
		this.idMuseo = idMuseo;
	}



	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	
}

