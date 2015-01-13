
//superclase :espacioPublico subclase: Parque

public class Parque extends EspacioPublico {

	private Integer idParque;

	
	public Parque (String calle, String nombre,String ciudad, Integer telefono, Integer idparque){
		super (calle, nombre, ciudad, telefono);
		
		this.idParque = idparque;

	}
	
	public Integer getIdParque (){
		
		return idParque;
	}
	
	public void setIdParque(Integer id){
		
		this.idParque = id;
	}
	
	
}