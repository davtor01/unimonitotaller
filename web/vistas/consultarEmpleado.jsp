<%-- 
    Document   : consultarEmpleado
    Created on : 17/05/2016, 11:03:45 AM
    Author     : DAVID
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar empleado</title>
    </head>
      <body>
    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container" id="cabecera">
      </div>
      <!-- /.container -->
    </nav>
    <!-- Page Content -->
    <div class="container">

      <!-- Marketing Icons Section -->
      <div class="row">
          <form class="form-horizontal" role="form" action="crearEmpleados.jsp">
          <br>
          <fieldset>
            <legend>Consulta de Productos</legend>
            <div class="form-group">
              <div class="col-xs-6">
                <label for="numero_Identificacion" class="col-lg-5 control-label">N° documento</label>
                <div class="col-lg-7">
                  <input type="text" class="form-control" id="numero_Identificacion"  
                         placeholder="Codigo Producto" name="numeroIdentificacion">
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
          </fieldset>
        </form>
      </div>
      <!-- /.row -->

      <!-- Footer -->
      <footer>
        <div class="row">
          <div class="col-lg-12">
            <p>Copyright &copy; Your Website 2014</p>
          </div>
        </div>
      </footer>

    </div>
    <!-- /.container -->

  </body>
</html>
