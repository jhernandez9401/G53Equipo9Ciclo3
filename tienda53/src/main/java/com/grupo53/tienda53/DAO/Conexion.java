package com.grupo53.tienda53.DAO;

// le enseñamos a java como conectarse a la base de datos
public class Conexion {
	String nombre_base_de_datos = "sqiltienda";
	String usuario_base_de_datos="root";
	String password_base_de_datos="mintic53";
	String URL = "jdbc:mysql://127.0.0.1"+ nombre_base_de_datos; //mi propia ip

}
