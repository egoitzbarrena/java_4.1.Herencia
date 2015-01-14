
import java.util.Hashtable;


public class Main {

	public static void main(String[] args) {
		 
		String calle = null,nombre = null,ciudad = null;
		Integer telefono = null,idMuseo = null;
		Double precio = null;
		Museo mus = new Museo (calle,nombre,ciudad,telefono,idMuseo,precio);
		mus.setCalle("zarategi");
		mus.setNombre("santelmo");
		mus.setCiudad("donostia");
		mus.setTelefono(943568425);
		mus.setIdMuseo(001);
		mus.setPrecio(6.00);
		
		
		System.out.println("Datos del museo:");
		System.out.println("\nCalle:  " + mus.getCalle() + "  Nombre:  "  + mus.getNombre()+ "  Ciudad:  "+mus.getCiudad()+"  Telefono:  "+mus.getTelefono()+"  idmuseo::  "+mus.getIdMuseo()+ "  precio:  "+mus.getPrecio());
		
		Hashtable<String,String> listmuseos = new Hashtable<String,String>();
		
			listmuseos.put("001", "San Telmo");
			listmuseos.put("002", "Aquarium");
			listmuseos.put("003", "Museo de la ciencia");
			listmuseos.put("004", "Cristobal Balenciaga");
			listmuseos.put("005", "Museo Naval");
			
			System.out.println("Lista de museos:");
			System.out.println(listmuseos.get("001"));
			System.out.println(listmuseos.get("002"));
			System.out.println(listmuseos.get("003"));
			System.out.println(listmuseos.get("004"));
			System.out.println(listmuseos.get("005"));
			


		
		
	}

}
