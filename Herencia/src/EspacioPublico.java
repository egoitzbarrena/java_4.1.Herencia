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

	return this.calle;

}

	
public void setCalle(String ca){

	this.calle=ca;

}

public Integer getTelefono(){
	
	return this.telefono;
}

public void setTelefono(Integer  telf){

	this.telefono=telf;

}

public String  getNombre(){
	
	return this.nombre;
}

public void setNombre(String  nom){

	this.nombre=nom;

}

public String  getCiudad(){
	
	return this.ciudad;
}

public void setCiudad(String  ciu){

	this.ciudad=ciu;

}

}
