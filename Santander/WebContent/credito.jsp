<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "com.Modelo.clases.Banco" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simulación de Crédito</title>

</head>
<body >

<form method="POST" action="MyServlet">
<table>
<tr>
<td >Simula tu Crédito Hipotecario</td>
<tr><td>Datos de Contacto</td></tr>
<tr>
<td>Rut</td>
<td><input type="text" name="rut" id="rut"  placeholder="Ingrese Rut"/></td>
</tr>
<tr>
<td>Nombre</td>
<td><input type="text" name="nombre" id="nombre"  placeholder="Ingrese Nombre"/></td>
</tr>
<tr>
<td>Apellido Paterno</td>
<td><input type="text"  name="apellidopaterno" id="apellidopaterno"  placeholder="Ingrese Apellido Paterno"/></td>
</tr>
<tr>
<td>Apellido Materno</td>
<td><input type="text" name="apellidomaterno" id="apellidomaterno"  placeholder="Ingrese Apellido Materno"/></td>
</tr>
<tr>
<td>E-mail</td>
<td><input type="text" name="email" id="email"  placeholder="Ingrese E-mail"/></td>
</tr>
<tr>
<td>Teléfono</td>

<td>
<select name="codigoarea" id="codigoarea" style="float: left; height: 20px; width: 50px; margin-right:10px;" onChange="largo_fono(this,'telefono','7-11-2018')">
			<option value="">--</option>
				<option value="2" selected >02</option>
				<option value="05">05</option>
				<option value="06">06</option>			
				<option value="07">07</option>
				<option value="08">08</option>
				<option value="09">09</option>								
				<option value="32">32</option>
				<option value="33">33</option>
				<option value="34">34</option>
				<option value="35">35</option>
				<option value="41">41</option>
				<option value="42">42</option>
				<option value="43">43</option>
				<option value="45">45</option>
				<option value="51">51</option>
				<option value="52">52</option>
				<option value="53">53</option>
				<option value="55">55</option>
				<option value="57">57</option>
				<option value="58">58</option>
				<option value="61">61</option>
				<option value="63">63</option>
				<option value="64">64</option>
				<option value="65">65</option>
				<option value="67">67</option>
				<option value="71">71</option>
				<option value="72">72</option>
				<option value="73">73</option>
				<option value="75">75</option>
                </select> 
<input type="text" name="email" id="telefono"  placeholder="Ingrese Telefono"/>
</td>
</tr>

<td>Región</td>

<td>
<select name="region" id="region" style="float: left; height: 20px; width: 200px; margin-right:0px;" onChange="comunasPorRegion(null);" >
					<option value="" >Seleccione una Regi&oacute;n</option>
					<option value="I" >I Regi&oacute;n De Tarapaca</option>
					<option value="II">II Regi&oacute;n De Antofagasta</option>
					<option value="III">III Regi&oacute;n De Atacama</option>
					<option value="IV">IV Regi&oacute;n De Coquimbo</option>
					<option value="V">V Regi&oacute;n De Valparaiso</option>
					<option value="VI">VI Regi&oacute;n Del Lib. Bdo. O'Higgins</option>
					<option value="VII">VII Regi&oacute;n De Maule</option>
					<option value="VIII">VIII Regi&oacute;n Del Bio-Bio</option>
					<option value="IX">IX Regi&oacute;n De La Araucania</option>
					<option value="X">X Regi&oacute;n De Los Lagos </option>
					<option value="XI">XI Regi&oacute;n De Aisen</option>
					<option value="XII">XII Regi&oacute;n Magallanes Y Antartica</option>
					<option value="RM">Region Metropolitana</option>						
					<option value="XIV">XIV Regi&oacute;n De Los Rios</option>
					<option value="XV">XV Regi&oacute;n De Arica Y Parinacota</option>
				</select>
</td>
</tr>
<td>Comuna</td>

<td>
<select name="region" id="region" style="float: left; height: 20px; width: 200px; margin-right:0px;" onChange="comunasPorRegion(null);" >
					<option value="" >Seleccione una Comuna</option>
				</select>
</td>
</tr>

<tr><td>Datos de la Vivienda</td></tr>
<tr>
<td>Valor Propiedad (UF)</td>
<td><input type="text" name="valorpropiedad" id="valorpropiedad"/></td>
</tr>
<tr>
<td>Aporte Contado o Pie (UF)</td>
<td><input type="text" name="aportecontado" id="aportecontado"/></td>
</tr>
<tr>
<td>Monto de Financiamiento (UF)</td>
<%
Banco banco = new Banco();
banco = (Banco) request.getAttribute("Banco");
if(banco!=null)
{
	out.println("<td><input type=\"text\" name=\"montofinanciamiento\" id=\"montofinanciamiento\" placeholder=\""+banco.montoFinanciamiento()+"\"disabled/></td>");
}else
{
	out.println("<td><input type=\"text\" name=\"montofinanciamiento\" id=\"montofinanciamiento\" placeholder=\""+0+"\"disabled/></td>");
}
%>
<!--  
<td><input type="text"  name="montofinanciamiento" id="montofinanciamiento" placeholder="" disabled/></td>
-->
</tr>
<tr>
<td>Porcentaje Financiamiento (%)</td>
<%
banco = (Banco) request.getAttribute("Banco");
if(banco!=null)
{
	out.println("<td><input type=\"text\" name=\"porcentajefinanciamiento\" id=\"porcentajefinanciamiento\" placeholder=\""+banco.porcentaje()+"\"disabled/></td>");
}else
{
	out.println("<td><input type=\"text\" name=\"porcentajefinanciamiento\" id=\"porcentajefinanciamiento\" placeholder=\""+0+"\"disabled/></td>");
}
%>
<!--  
Label de porcentaje de Financiamiento
<td><input type="text" name="porcentajefinanciamiento" id="porcentajefinanciamiento" placeholder="" disabled/></td>
-->
</tr>

<tr>
<td>Plazo Crédito (Años)</td>
<td>
<select name="plazo" id="plazo" style="float: left;  width: 50px; margin-right:10px; margin-top:11px;">
                  						  
                  		<OPTION value="5" >5</OPTION>						  
                  							  
                  		<OPTION value="6" >6</OPTION>						  
                  							  
                  		<OPTION value="7" >7</OPTION>						  
                  							  
                  		<OPTION value="8" >8</OPTION>						  
                  							  
                  		<OPTION value="9" >9</OPTION>						  
                  							  
                  		<OPTION value="10" >10</OPTION>						  
                  							  
                  		<OPTION value="11" >11</OPTION>						  
                  							  
                  		<OPTION value="12" >12</OPTION>						  
                  							  
                  		<OPTION value="13" >13</OPTION>						  
                  							  
                  		<OPTION value="14" >14</OPTION>						  
                  							  
                  		<OPTION value="15" >15</OPTION>						  
                  							  
                  		<OPTION value="16" >16</OPTION>						  
                  							  
                  		<OPTION value="17" >17</OPTION>						  
                  							  
                  		<OPTION value="18" >18</OPTION>						  
                  							  
                  		<OPTION value="19" >19</OPTION>						  
                  							  
                  		<OPTION value="20" >20</OPTION>						  
                  							  
                  		<OPTION value="21" >21</OPTION>						  
                  							  
                  		<OPTION value="22" >22</OPTION>						  
                  							  
                  		<OPTION value="23" >23</OPTION>						  
                  							  
                  		<OPTION value="24" >24</OPTION>						  
                  							  
                  		<OPTION value="25" >25</OPTION>						  
                  							  
                  		<OPTION value="26" >26</OPTION>						  
                  							  
                  		<OPTION value="27" >27</OPTION>						  
                  							  
                  		<OPTION value="28" >28</OPTION>						  
                  							  
                  		<OPTION value="29" >29</OPTION>						  
                  							  
                  		<OPTION value="30" >30</OPTION>						  
                  	
                </select>
</td>
</tr>

<tr>
<td>Tasa</td>
<td>
<select name="tasa" id="tasa" style="float: left;  width: 150px; margin-right:10px; margin-top:0px;">
                  						  
                  		<OPTION value="fija" >Tasa Fija</OPTION>						  
                  							  
                  		<OPTION value="mixta" >Tasa Mixta</OPTION>						  
                  							  					  
                  	
                </select>
</td>
</tr>
<tr>
<td>Tipo de Propiedad</td>
<td>
 <select name="propiedad" id="Propiedad" style="float: left;  width: 150px; margin-right:10px; margin-top:0px;">
				<option value="Casa" >Casa</option>
				<option value="Departamento" >Departamento</option>

            </select>
</td>
</tr>

<td>Estado de la propiedad</td>
<td>
 <li class="radio">
            	<input type="radio" class="rad" name="tipo_propiedad" id="tipo_propiedad_nueva" value="Nueva" checked />
                	<label class="">Nueva</label>
               	<input type="radio" class="rad" name="tipo_propiedad" id="tipo_propiedad_usada" value="Usada" />
                	<label class="">Usada</label>
            </li>
</td>
</tr>

<td><input type="submit"  value="Finalizar simulación"></input></td>

</tr>

</table>

</form>




</body>
</html>