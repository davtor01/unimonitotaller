<%-- 
    Document   : asignarVehiculos
    Created on : 22/05/2016, 07:43:08 PM
    Author     : DAVID
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Asignar vehiculo</title>

        <!-- Bootstrap Core CSS -->
        <link href="../css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="../css/modern-business.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="../font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
        <!-- jQuery Version 1.11.0 -->
        <script src="../js/jquery-1.11.0.js"></script>
        <script src="../librerias/js/blockUI.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="../js/bootstrap.min.js"></script>
        <script type="text/javascript" src="../js/menu.js"></script>
        <style type="text/css">
            div.growlUI { background: url(../imagenes/check48.png) no-repeat 10px 10px}
            div.growlUI h1, div.growlUI h2 {
                color: white; 
                padding: 20px 5px 5px 75px; 
                text-align: left; 
                font: 200% sans-serif; 
            }
        </style>
    </head>


    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container" id="cabecera">
        </div>
        <!-- /.container -->
    </nav>
    <!-- Page Content -->
    <div class="container">
        <div class="row"> 
            <br>
            <fieldset> 
                <legend> Datos empleados</legend>

                <form class="form-horizontal" role="form" method="post" action="../vehiculosPorClientesServlet">
                    <div class="row">
                        
                       <div class="col-md-4">
                            <div class="form-group">
                                <label for="numero_Identificacion" class="col-lg-3 control-label">N° documento</label>
                                <div class="col-lg-9">
                                    <input type="text" class="form-control" id="numero_Identificacion"
                                           placeholder="1231231233" name="numeroIdentificacion">
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="form-group">
                                <label for="contrasena" class="col-lg-4 control-label">Pass</label>
                                <div class="col-lg-8">
                                    <input type="password" class="form-control" id="contrasena"
                                           placeholder="1234" name="password">
                                </div>
                            </div>      
                        </div>


                        <div class="form-group">
                            <div class="col-lg-offset-2 col-lg-10">
                                <button type="submit" class="btn btn-default" id="aceptar">Aceptar</button>
                            </div>
                        </div>
                    </div> 
                </form>
            </fieldset>
            <!-- <script type="text/javascript">
                 $(function () {
                     $('#datetimepicker1').datetimepicker();
                 });
             </script>-->
            <%
                if (id != "") {
                    empleadoDAO empleadodao = new empleadoDAO();
                    empleadoBean empleados = empleadodao.getEmpleadoPorDocumento(id);
                    if (empleados == null) {
            %>
            <script type="text/javascript">
                alert("no se encontro el empleado");
            </script>
            <%
                }
            %>
            <script type="text/javascript">
                document.getElementById("nombress").value = "<%=empleados.getNombres()%>";
                document.getElementById("apellidoss").value = "<%=empleados.getApellidos()%>";
                document.getElementById("numero_Identificacion").value = "<%=empleados.getNumeroIdentificacion()%>";
                document.getElementById("contrasena").value = "<%=empleados.getPassword()%>";
                document.getElementById("fecha_InicioContrato").value = "<%=empleados.getFechaInicioContrato()%>";
                document.getElementById("salarioo").value = "<%=empleados.getSalario()%>";
                document.getElementById("estado").value = "<%=empleados.getEstado()%>";
                document.getElementById("codigo_Taller").value = "<%=empleados.getCodigoTaller()%>";
                document.getElementById("numero_Telefono").value = "<%=empleados.getNumeroTelefono()%>";
                $("#aceptar").hide();
            </script>
            <%
                }
            %>
        </div>
    </div>

</html>


