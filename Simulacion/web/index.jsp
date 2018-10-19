<%@page import= " MODEL.Banco " %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-3.3.1.min.js"></script>
<%-- 
    Document   : index
    Created on : 12-10-2018, 2:22:54
    Author     : Asus
--%>

<!DOCTYPE html>
<link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-3.3.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<html lang="en">
    <head> 
		<meta name="viewport" content="width=device-width, initial-scale=1">


		<!-- Website CSS style -->
		<link href="css/bootstrap.min.css" rel="stylesheet">

		<!-- Website Font style -->
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
		<!-- Google Fonts -->
		<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>

		<title>Admin</title>
	</head>
	<body>
            <!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content text-center">
      <div class="modal-header ">
        <h4 class="modal-title text-center">Simulación en curso</h4>
      </div>
      <div class="modal-body">
        <p>Tu simulacion está siendo procesada...</p>
      </div>
      <div class="modal-footer">
        <button onclick="limpiar();"  type="button" class="btn btn-default" data-dismiss="modal">Aceptar</button>
      </div>
    </div>

  </div>
</div>
		<div class="container">
			<div class="row main">
				<div class="main-login main-center">
				<h5>Simulador de Credito</h5>
					<form class="" method="POST" action="MyServlet">
						
						<div class="form-group">
							<label for="rut" class="cols-sm-2 control-label">Rut</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="name" id="rut"  placeholder="Ingrese Rut"/>
								</div>
							</div>
						</div>
                                            <div class="form-group">
							<label for="nombre" class="cols-sm-2 control-label">Nombre</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="name" id="nombre"  placeholder="Ingrese Nombre"/>
								</div>
							</div>
						</div>
                                            <div class="form-group">
							<label for="apellidoPaterno" class="cols-sm-2 control-label">Apellido Paterno</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="name" id="apellidoPaterno"  placeholder="Ingrese Apellido Paterno"/>
								</div>
							</div>
						</div>
                                            <div class="form-group">
							<label for="apellidoMaterno" class="cols-sm-2 control-label">Apellido Materno</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="name" id="apellidoMaterno"  placeholder="Ingrese Apellido Materno"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Email</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="email" id="email"  placeholder="Ingrese Email"/>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="telefono" class="cols-sm-2 control-label">Telefono</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="username" id="telefono"  placeholder="Ingrese Telefono"/>
								</div>
							</div>
						</div>
                                                    
                                                    <label for="sel1">Seleccione Región:</label>
                                                          <select class="form-control" id="sel1">
                                                            <option>Región</option>
                                                           
                                                            
                                                          </select>
                                                    <p></p>
                                                    <label for="sel1">Seleccione Comuna:</label>
                                                          <select class="form-control" id="sel1">
                                                            <option>Comuna</option>
                                                           
                                                            
                                                          </select>
                                            <div class="form-group">
    <label for="valorPropiedad" class="cols-sm-2 control-label">Valor Propiedad</label>
    <div class="cols-sm-10">
        <div class="input-group">
          <div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
            <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
            <input type="text" class="form-control" name="valorPropiedad" id="valorPropiedad"  placeholder="Ingrese Valor Propiedad"/>
          </div>
          <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
            <button  style="margin-bottom:20px;" type="submit" >Simular</button>
          </div>
        </div>
    </div>
</div>


                                            <div class="form-group">
							<label for="pie" class="cols-sm-2 control-label">Aporte contado o pie</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="pie" id="telefono"  placeholder="Ingrese aporte contado o pie"/>
								</div>
							</div>
						</div>
                                                    
                                                     <%
                                                    Banco banco = new Banco();
                                                    banco= (Banco)request.getAttribute("Banco");
                                                    String div="";
                                                    if(banco!= null)
                                                    {
                                                        div =  "<input type=\"text\" class=\"form-control\" name=\"posentajeFinanciamiento\" id=\"PorsentajeFinanciamiento\"  placeholder=\"\" disabled value = \""+banco.montoFinanciamiento()+"\"/>";
                                                        out.println(" <label>Monto Financiamiento</label>" + div);
                                                        
                                                        
                                                        /*div =  "<input type=\"text\" class=\"form-control\" name=\"posentajeFinanciamiento\" id=\"PorsentajeFinanciamiento\"  placeholder=\"\" disabled value = \""+banco.porcentaje()+"%\"/>";
                                                        out.println(" <label>Porcentaje Financiamiento</label>" + div);*/
                                                    }else
                                                    {
                                                        div =  "<input type=\"text\" class=\"form-control\" name=\"posentajeFinanciamiento\" id=\"PorsentajeFinanciamiento\"  placeholder=\"\" disabled value = \""+0+"\"/>";
                                                        out.println(" <label>Monto Financiamiento</label>" + div);
                                                    }
                                                   
                                                    %>
                                               <!-- <div class="form-group">
							<label for="montoFinanciamiento" class="cols-sm-2 control-label">Monto de financiamiento</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                                                        <input type="text" class="form-control"  name="montoFinanciamiento" id="montoFinanciamenti"  placeholder="" disabled/>
								</div>
							</div>
						</div>-->
                                                    <%
                                                    
                                                    banco= (Banco)request.getAttribute("Banco");
                                                    
                                                    if(banco!= null)
                                                    {
                                                        div =  "<input type=\"text\" class=\"form-control\" name=\"posentajeFinanciamiento\" id=\"PorsentajeFinanciamiento\"  placeholder=\"\" disabled value = \""+banco.porcentaje()+"\"/>";
                                                        out.println(" <label>Porcentaje Financiamiento</label>" + div);
                                                        /*div =  "<input type=\"text\" class=\"form-control\" name=\"posentajeFinanciamiento\" id=\"PorsentajeFinanciamiento\"  placeholder=\"\" disabled value = \""+banco.porcentaje()+"%\"/>";
                                                        out.println(" <label>Porcentaje Financiamiento</label>" + div);*/
                                                    }else
                                                    {
                                                        div =  "<input type=\"text\" class=\"form-control\" name=\"posentajeFinanciamiento\" id=\"PorsentajeFinanciamiento\"  placeholder=\"\" disabled value = \""+0+"\"/>";
                                                        out.println(" <label>Porcentaje Financiamiento</label>" + div);
                                                    }
                                                   
                                                    %>
                                                
                                                <!--<div class="form-group">
							<label for="posentajeFinanciamiento" class="cols-sm-2 control-label">Porcentaje de Financiamiento</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="posentajeFinanciamiento" id="PorsentajeFinanciamiento"  placeholder="" disabled/>
								</div>
							</div>
						</div>-->
                                                    <label for="sel1">Seleccione plazo del credito(años):</label>
                                                          <select class="form-control" id="sel1">
                                                            <option>1</option>
                                                            <option>2</option>
                                                            <option>3</option>
                                                            <option>4</option>
                                                            <option>5</option>
                                                            <option>6</option>
                                                            <option>7</option>
                                                            <option>8</option>
                                                            <option>9</option>
                                                            <option>10</option>
                                                            <option>11</option>
                                                            <option>12</option>
                                                            <option>13</option>
                                                            <option>14</option>
                                                            <option>15</option>
                                                            <option>16</option>
                                                            <option>17</option>
                                                            <option>18</option>
                                                            <option>19</option>
                                                            <option>20</option>
                                                            <option>21</option>
                                                            <option>22</option>
                                                            <option>23</option>
                                                            <option>24</option>
                                                            <option>25</option>
                                                            
                                                           
                                                            
                                                          </select>
                                                    <p></p>
                                                    <label for="sel1">Seleccione tasa:</label>
                                                          <select class="form-control" id="sel1">
                                                            <option>Fija</option>
                                                            <option>Mixta</option>
                                                          </select>
                                                    <p></p>
                                                <div class="checkbox">
                                                     Estado de propiedad <label><input type="checkbox" value="">Nueva</label> <label><input type="checkbox" value="">Usada</label>
                                                </div>

						<div class="form-group ">
                                                    <input type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal" value="Finalizar simulación"></input>
						</div>
                                                    
                                                    
                                               
						
					</form>
				</div>
			</div>
		</div>

		 <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
	</body>
<script> function limpiar(){ location.reload(); } </script>
   <style>
       /*
/* Created by Filipe Pina
 * Specific styles of signin, register, component
 */
/*
 * General styles
 */
#playground-container {
    height: 500px;
    overflow: hidden !important;
    -webkit-overflow-scrolling: touch;
}
body, html{
     height: 100%;
 	background-repeat: no-repeat;
        background-attachment: fixed;
 	background:url(https://i.ytimg.com/vi/4kfXjatgeEU/maxresdefault.jpg);
 	font-family: 'Oxygen', sans-serif;
	    background-size: cover;
}

.main{
 	margin:50px 15px;
}

h1.title { 
	font-size: 50px;
	font-family: 'Passion One', cursive; 
	font-weight: 400; 
}

hr{
	width: 10%;
	color: #fff;
}

.form-group{
	margin-bottom: 15px;
}

label{
	margin-bottom: 15px;
}

input,
input::-webkit-input-placeholder {
    font-size: 11px;
    padding-top: 3px;
}

.main-login{
 	background-color: #fff;
    /* shadows and rounded borders */
    -moz-border-radius: 2px;
    -webkit-border-radius: 2px;
    border-radius: 2px;
    -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);

}
.form-control {
    height: auto!important;
padding: 8px 12px !important;
}
.input-group {
    -webkit-box-shadow: 0px 2px 5px 0px rgba(0,0,0,0.21)!important;
    -moz-box-shadow: 0px 2px 5px 0px rgba(0,0,0,0.21)!important;
    box-shadow: 0px 2px 5px 0px rgba(0,0,0,0.21)!important;
}
#button {
    border: 1px solid #ccc;
    margin-top: 28px;
    padding: 6px 12px;
    color: #666;
    text-shadow: 0 1px #fff;
    cursor: pointer;
    -moz-border-radius: 3px 3px;
    -webkit-border-radius: 3px 3px;
    border-radius: 3px 3px;
    -moz-box-shadow: 0 1px #fff inset, 0 1px #ddd;
    -webkit-box-shadow: 0 1px #fff inset, 0 1px #ddd;
    box-shadow: 0 1px #fff inset, 0 1px #ddd;
    background: #f5f5f5;
    background: -moz-linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);
    background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #f5f5f5), color-stop(100%, #eeeeee));
    background: -webkit-linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);
    background: -o-linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);
    background: -ms-linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);
    background: linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);
    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#f5f5f5', endColorstr='#eeeeee', GradientType=0);
}
.main-center{
 	margin-top: 30px;
            margin: 0 auto;
            max-width: 400px;
        padding: 10px 40px;
            background:#009edf;
                color: #FFF;
    text-shadow: none;
	-webkit-box-shadow: 0px 3px 5px 0px rgba(0,0,0,0.31);
-moz-box-shadow: 0px 3px 5px 0px rgba(0,0,0,0.31);
box-shadow: 0px 3px 5px 0px rgba(0,0,0,0.31);

}
span.input-group-addon i {
    color: #009edf;
    font-size: 17px;
}

.login-button{
	margin-top: 5px;
}

.login-register{
	font-size: 11px;
	text-align: center;
}

   </style>
</html>