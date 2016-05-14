/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function f_LoadMenu() {
  var menu = "<!-- Brand and toggle get grouped for better mobile display -->" +
          "<div class='navbar-header'>" +
          "<button type='button' class='navbar-toggle' data-toggle='collapse' data-target='#bs-example-navbar-collapse-1'>" +
          "<span class='sr-only'>Toggle navigation</span>" +
          "<span class='icon-bar'></span>" +
          "<span class='icon-bar'></span>" +
          "<span class='icon-bar'></span>" +
          "</button>" +
          "<a class='navbar-brand' href='index.html'>Muebles Los Alpes</a>" +
          "</div>" +
          "<!-- Collect the nav links, forms, and other content for toggling -->" +
          "<div class='collapse navbar-collapse' id='bs-example-navbar-collapse-1'>" +
          "<ul class='nav navbar-nav navbar-right'>" +
          "<li class='active'><a href='http://localhost:8084/UNIMONITOTALLER/index.jsp'>Inicio</a></li>" +
          "<li class='dropdown'>" +
          "<a href='#' class='dropdown-toggle' data-toggle='dropdown'>Empleados <span class='caret'></span></a>" +
          "<ul class='dropdown-menu' role='menu'>" +
          "<li><a href='http://localhost:8084/UNIMONITOTALLER/vistas/crearEmpleados.jsp'>Registrar empleados</a></li>" +
          "<li><a href='http://localhost:8084/UNIMONITOTALLER/vistas/consultarEmpleados.jsp'>Buscar empleados</a></li>" +
          "<li><a href='http://localhost:8084/UNIMONITOTALLER/vistas/actualizarEmpleados.jsp'>Actualizar empleados</a></li>" +
          "</ul>" +
          "</li>" +
          "<li class='dropdown'>" +
          "<a href='#' class='dropdown-toggle' data-toggle='dropdown'>Clientes <span class='caret'></span></a>" +
          "<ul class='dropdown-menu' role='menu'>" +
          "<li><a href='http://localhost:8084/UNIMONITOTALLER/vistas/crearCliente.jsp'>Registrar clientes</a></li>" +
          "<li><a href='http://localhost:8084/UNIMONITOTALLER/vistas/consultarCliente.jsp'>Buscar clientes</a></li>" +
          "<li><a href='http://localhost:8084/UNIMONITOTALLER/vistas/actualizarCliente.jsp'>Actualizar clientes</a></li>" +
          "</ul>" +
          "</li>" +
          "<li class='dropdown'>" +
          "<a href='#' class='dropdown-toggle' data-toggle='dropdown'>Vehiculos <span class='caret'></span></a>" +
          "<ul class='dropdown-menu' role='menu'>" +
          "<li><a href='http://localhost:8084/UNIMONITOTALLER/vistas/crearVehiculo.jsp'>Registrar Vehiculo</a></li>" +
          "<li><a href='http://localhost:8084/UNIMONITOTALLER/vistas/buscarVehiculo.jsp'>Buscar Vehiculo</a></li>" +
          "<li><a href='http://localhost:8084/UNIMONITOTALLER/vistas/actualizarVehiculo.jsp'>Actualizar Vehiculo</a></li>" +
          "</ul>" +
          "</li>"+
          "<li><a href='vistas/reparaciones.jsp'>Reparaciones</a></li>"+
          "<li><a href='vistas/login.jsp'>Login</a></li>";
  if (f_usuario() === "") {
    menu += "<li><a href='http://localhost:8084/UNIMONITOTALLER/vistas/login.jsp'>Ingresar</a></li>";
  } else {
    menu += "<li><a href='http://localhost:8084/UNIMONITOTALLER/vistas/login.jsp'>"+f_usuario()+"</a></li>";
  }
  menu += "<li class='dropdown'>" +
          "<a href='#' class='dropdown-toggle' data-toggle='dropdown'><span class='glyphicon glyphicon-shopping-cart'></span></a>" +
          "<ul class='dropdown-menu' role='menu'>" +
          "<li><a href='http://localhost:8084/UNIMONITOTALLER/vistas/pagar.jsp'>Pagar</a></li>" +
          "</ul>" +
          "</li>" +
          "</ul>" +
          "</div>";
  document.getElementById("cabecera").innerHTML = menu;

}

function f_usuario() {
  var busqueda = document.cookie.split(";");
  var bandera = true;
  var correo = "";
  for (var i = 0; i < busqueda.length; i++) {
    var preId = busqueda[i].split("=");
    if (preId[0] === " usuario") {
      if (preId[1] != "") {
        correo = preId[1];
        break;
      }
    }
  }
  return correo !== "" ? correo : "";
}


