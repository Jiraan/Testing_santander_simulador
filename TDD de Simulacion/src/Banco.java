
public class Banco {
	int valor_Propiedad;
	int aporte_Contado_o_Pie;
	
	public int getValor_P() {
		return valor_Propiedad;
	}
	public void setValor_P(int valor_P) {
		this.valor_Propiedad = valor_P;
	}
	public int getAporte_C() {
		return aporte_Contado_o_Pie;
	}
	public void setAporte_C(int aporte_C) {
		this.aporte_Contado_o_Pie = aporte_C;
	}
	
	//Funciones prueba caja blanca 
public static int valorPropiedad( int valorPropiedad)
	{
		return valorPropiedad;
	}
public static int aporteContadooPie( int aporteContadooPie)
{
	return aporteContadooPie;
}
public static int montoFinanciamiento(int valorPropiedad, int aporte) {
	int montoFinanciamiento = valorPropiedad-aporte;
	
	return montoFinanciamiento;
}
public static int porcentaje(int valorPropiedad, int aporte) {
	//Calculo de Monto de Financiamiento
	int montoFinanciamiento = montoFinanciamiento(valorPropiedad,aporte);
	/*Calculo de porcentaje correspondiente 
	 a el valor total con el monto de 
	 Financiamiento
	 */
	int porcentaje = montoFinanciamiento/(valorPropiedad/100);
	return porcentaje;
}
	
	
	

}
