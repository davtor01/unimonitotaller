<%-- 
    Document   : creacionClientes
    Created on : 26/08/2014, 02:51:33 PM
    Author     : Administrador

<%@page import="com.unimonito.Beans.ClienteBean"%>
<%@page import="com.unimonito.DAO.ClientesDAO"%>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>calendario
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>calendario
--%>
<%-- 
<%
  String respuesta = request.getParameter("respuesta") == null ? "" : request.getParameter("respuesta");
  String cliente = request.getParameter("cliente") == null ? "" : request.getParameter("cliente");
  String mensaje = request.getParameter("mensaje") == null ? "" : request.getParameter("mensaje");
  String id = request.getParameter("id") == null ? "" : request.getParameter("id");
%>
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
    
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"><%--calensaio--%>
    
    
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Creacion de Clientes</title>

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
    <script type="text/javascript">
      $(document).ready(function() {
        <script type="text/javascript">
      $(f_LoadMenu();
      });
    </script>
    <style type="text/css">
        div.growlUI { background: url(../imagenes/check48.png) no-repeat 10px 10px}
        div.growlUI h1, div.growlUI h2 {
            color: white; 
            padding: 20px 5px 5px 75px; 
            text-align: left; 
            font: 200% sans-serif; 
        }
    </style>
    <script type="text/javascript">
        $(document).ready(function () {
        });
    </script>
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

            <form class="form-horizontal" role="form" method="post" action="../crearClienteServlet">
                <div class="row">
                                      
                    <div class="col-md-4">
                        <div class="form-group">
                            <label for="nombress" class="col-lg-3 control-label">Nombres</label>
                            <div class="col-lg-9">
                                <input type="text" class="form-control" id="nombress"
                                       placeholder="juanito dav" name="nombres">
                            </div>
                        </div>
                    </div>
                    
                    <div class="col-md-4">
                        <div class="form-group">
                            <label for="apellidoss" class="col-lg-4 control-label">Apellidos</label>
                            <div class="col-lg-8">
                                <input type="text" class="form-control" id="apellidoss"
                                       placeholder="torres torres" name="apellidos">
                            </div>
                        </div>
                    </div>      
                    <div class="col-md-4">
                        <div class="form-group">
                            <label for="tipo_de_documento" class="col-lg-5 control-label">Tipo documento</label>
                            <div class="col-lg-7">
                                <select class="form-control" name="idTipoDocumento"> 
                                    <option value="1">cedula de ciudadania</option>
                                    <option value="2">cedula extranjera</option>
                                    <option value="3">pasaporte</option>                
                                </select>
                            </div>
                        </div>
                    </div>
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

                   <div class="col-md-4">
                        <div class="form-group">
                            <label for="ciudad_Residencia" class="col-lg-5 control-label">Ciudad de Residencia</label>
                            <div class="col-lg-7">
                                <select class="form-control" name="ciudadResidencia">
                                    <option value="Bogotá">Bogotá</option>
                                    <option value="Medellín">Medellín</option>
                                    <option value="Cali">Cali</option>
                                    <option value="Barranquilla">Barranquilla</option>
                                    <option value="Cartagena de Indias">Cartagena de Indias</option>
                                    <option value="Cúcuta">Cúcuta</option>
                                    <option value="Soledad">Soledad</option>
                                    <option value="Ibagué">Ibagué</option>
                                    <option value="Bucaramanga">Bucaramanga</option>
                                    <option value="Soacha">Soacha</option>
                                    <option value="Santa Marta">Santa Marta</option>
                                    <option value="Villavicencio">Villavicencio</option>
                                    <option value="Bello">Bello</option>
                                    <option value="Pereira">Pereira</option>
                                    <option value="Valledupar">Valledupar</option>
                                    <option value="Buenaventura">Buenaventura</option>
                                    <option value="Pasto">Pasto</option>
                                    <option value="Manizales">Manizales</option>
                                    <option value="Montería">Montería</option>
                                    <option value="Neiva">Neiva</option>
                                </select>
                            </div>
                        </div>
                    </div> 
                    
                    
                    <div class="col-md-4">
                        <div class="form-group">
                            <label for="ultima_Actualizacion" class="col-lg-5 control-label">Ultima Actualizacion</label>
                            <div class="col-lg-7">
                                <input type="text" class="form-control" id="ultima_Actualizacion"
                                       placeholder="aaaa-mm-dd" name="ultimaActualizacion">
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
        <script type="text/javascript">
            $(function () {
                $('#datetimepicker1').datetimepicker();
            });
        </script>
    </div>
</div>




