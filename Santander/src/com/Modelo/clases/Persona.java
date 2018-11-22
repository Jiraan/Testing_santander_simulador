package com.Modelo.clases;

public class Persona {
String rut;
String nombre;
String apellidoP;
String apellidoM;
String correo;
String telefono;
String region;
String comuna;

public String getRut() {
	return rut;
}
public void setRut(String rut) {
	this.rut = rut;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidoP() {
	return apellidoP;
}
public void setApellidoP(String apellidoP) {
	this.apellidoP = apellidoP;
}
public String getApellidoM() {
	return apellidoM;
}
public void setApellidoM(String apellidoM) {
	this.apellidoM = apellidoM;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}
public String getComuna() {
	return comuna;
}
public void setComuna(String comuna) {
	this.comuna = comuna;
}

//Funciones Caja Negra

public static String rut(String rut) {
	return (rut);
}
public static String nombre(String nombre) {
	return nombre;
}
public static String apellidoP(String apellidoP) {
	return apellidoP;
}
public static String apellidoM(String apellidoM) {
	return (apellidoM);
}
public static String correo(String correo) {
	return (correo);
}
public static int telefono(int telefono) {
	return (telefono);
}
public static String region(String region) {
	return (region);
}
public static String comuna(String comuna) {
	return (comuna);
}

 


}
