//package com.zubiri.elecciones;

//espacio publico es la superclase o clase madre

public class EspacioPublico {

private String calle;
private String nombre;
private String ciudad;
private Integer telefono;




public EspacioPublico(String calle2, String nombre2, String ciudad2,
		Integer telefono2) {
	// TODO Auto-generated constructor stub
}


public String  getCalle(){

	return calle;

}

	
public void setCalle(String ca){

	calle=ca;

}

public Integer getTelefono(){
	
	return telefono;
}

public void setTelefono(Integer  telf){

	telefono=telf;

}

public String  getNombre(){
	
	return nombre;
}

public void setNombre(String  nom){

	nombre=nom;

}

public String  getCiudad(){
	
	return ciudad;
}

public void setCiudad(String  ciu){

	ciudad=ciu;

}

}
