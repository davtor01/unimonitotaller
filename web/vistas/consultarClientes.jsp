<%-- 
    Document   : creacionClientes
    Created on : 26/08/2014, 02:51:33 PM
    Author     : Administrador
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

    <title>Consulta de Clientes</title>

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

    <!-- Bootstrap Core JavaScript -->
    <script src="../js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../js/menu.js"></script>
    <script type="text/javascript">
      $(document).ready(function() {
        f_LoadMenu();
      });
    </script>
  </head>

  <body>
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
          <legend>Consulta</legend>
          <label> Digite su documento de identificacion</label>
          <form class="form-horizontal" role="form" action="../ConsultarClienteServlet" method="post">
            <div class="form-group">
              <div class="col-xs-6">
                <label for="numero_id" class="col-lg-5 control-label">Numero ID</label>
                <div class="col-lg-7">
                  <input type="text" class="form-control" id="numero_id"
                         placeholder="numero id" name="numero_id">
                </div>
              </div>
              <div class="col-xs-6">
                <div class="col-lg-9">
                    <button type="submit" class="btn btn-default">
                    <span class="glyphicon glyphicon-search"> Buscar</span>
                  </button>
                </div>
              </div>
            </div>                    
          </form>
        </fieldset>

      </div>
    </div>
  </body>
</html>


