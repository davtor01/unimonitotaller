/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unimonito.Servlets;

import com.unimonito.Beans.empleadoBean;
import com.unimonito.DAO.empleadoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DAVID
 */
@WebServlet(name = "crearEmpleadosServlet", urlPatterns = {"/crearEmpleadosServlet"})
public class crearEmpleadosServlet extends HttpServlet {
    
    private empleadoBean empleado = new empleadoBean();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    try{
        String mensaje = "se creo exitosamente el empleado";
        response.sendRedirect("vistas/crearEmpleados.jsp?respuesta=si&empleado=" + empleado.getNombres() + "&mensaje=" + mensaje);
        } finally {
            out.close();
        }
    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
        try{
            empleadoDAO miEmpleadodao = new empleadoDAO();
           // empleado.setCodEmpleado(Integer.parseInt(request.getParameter("codEmpleados")));
            empleado.setNombres(request.getParameter("nombres"));
            empleado.setApellidos(request.getParameter("apellidos"));
            empleado.setIdTipoDucomento(Integer.parseInt(request.getParameter("idTipoDocumento")));
            empleado.setNumeroIdentificacion(request.getParameter("numeroIdentificacion"));
            empleado.setPassword(request.getParameter("password"));
            empleado.setFechaInicioContrato(request.getParameter("fechaInicioContrato"));
            empleado.setSalario(request.getParameter("salario"));
            empleado.setEstado(Integer.parseInt(request.getParameter("estado")));
            empleado.setUltimaActualizacion(request.getParameter("ultimaActualizacion"));
            empleado.setCodigoTaller(Integer.parseInt(request.getParameter("codigoTaller")));
            empleado.setNumeroTelefono(Integer.parseInt(request.getParameter("numeroTelefono")));
            miEmpleadodao.guardar(empleado);
            processRequest(request, response);
             
        } catch (SQLException ex) {
            Logger.getLogger(crearEmpleadosServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
