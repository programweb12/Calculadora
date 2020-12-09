<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<title>Calculadora online</title>

	<link href="css/calc.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="js/codigo.js"></script>
<!--
	<script type="text/javascript">
		function limpiar() {
			document.getElementById('numero').value='';
		}
	</script>
-->
</head>
<body>
	<%
		String cResultado=(String) request.getAttribute("result");
		String cNum1=(String) request.getAttribute("num1");
		String cNum2=(String) request.getAttribute("num2");

		String checked1="", checked2="", checked3="", checked4="", checked5="";
				
		if (cNum1==null){
			cNum1="";
		}
		if (cNum2==null){
			cNum2="";
		}
		if (cResultado==null){
			cResultado="";
		}
	
		String op=(String) request.getAttribute("opcion");
		if(op==null) {
			op = "";
		}
		
		if (op.equals("1")) {
			checked1="checked";
		}else if (op.equals("2")){
			checked2="checked";
		}else if (op.equals("3")){
			checked3="checked";
		}else if (op.equals("4")){
			checked4="checked";
			
		}else { 
			checked5="checked";
		}
		
	%>

	<div class="contenedor">
		<header>
			<h1>Cálculos Matemáticos</h1>
		</header>
		<div id="formulario">
			<form id="calculadora" action="<%=request.getContextPath()%>/controlador" method="post">	
		
				<!-- Número 1:--><br/> <input type="number" name="num1" id="numero" placeholder="Operando 1" step="any" accesskey="1" title="Introduce número" required value=<%=cNum1 %>> <br /><br/>
				
				<input type="radio" name="opcion" value="1" id="opcion0" required <%=checked1 %>><label for="suma">Suma</label> 
				<input type="radio" name="opcion" value="2" id="opcion1" <%=checked2 %>><label for="resta">Resta</label>
				<input type="radio" name="opcion" value="3" id="opcion2" <%=checked3 %>><label for="multiplica">Multiplicación</label>
				<input type="radio" name="opcion" value="4" id="opcion3" <%=checked4 %>><label for="divide">División</label>
				<input type="radio" name="opcion" value="5" id="opcion4" <%=checked5 %>><label for="modulo">Resto</label>		
				<br/>
				
				<!-- Número 2:--> <br/><input type="number" name="num2" id="numero" placeholder="Operando 2" step="any" accesskey="2" title="Introduce número" required value=<%=cNum2%>>
				<br/><br/>
		
				<input type="submit" name="calcular" value="Calcular" title="Calcula el resultado">
				<input type="button" onclick="limpiarForm()" value="Limpiar" title="Limpiar datos">
		<!-- 	<button type="button" name="limpiar" onclick="limpiar()" title="Borra todos los campos">Limpiar</button> -->
				
				<br/><br/>
				<input type="text" name="resultado" disabled="disabled" title="Resultado" value=<%= cResultado %>>
		
			</form>
		</div>
	</div>
</body>
</html>