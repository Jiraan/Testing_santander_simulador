package MODEL;


public class Banco {
	int valor_Propiedad;
	int aporte_Contado_o_Pie;
	
        //Constructor
        public Banco()
        {
            
        }
        //Getters and Setters
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
public  int montoFinanciamiento() {
	int montoFinanciamiento = this.valor_Propiedad-this.aporte_Contado_o_Pie;
	
	return montoFinanciamiento;
}
public  int porcentaje() {
	//Calculo de Monto de Financiamiento
	int montoFinanciamiento = montoFinanciamiento();
	/*Calculo de porcentaje correspondiente 
	 a el valor total con el monto de 
	 Financiamiento
	 */
	int porcentaje = montoFinanciamiento/(this.valor_Propiedad/100);
	return porcentaje;
}
	
	
	

}
