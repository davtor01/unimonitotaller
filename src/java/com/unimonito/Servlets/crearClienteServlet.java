/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unimonito.Servlets;

import com.unimonito.Beans.clienteBean;
import com.unimonito.DAO.clienteDAO;
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
@WebServlet(name = "crearClienteServlet", urlPatterns = {"/crearClienteServlet"})
public class crearClienteServlet extends HttpServlet {
    private clienteBean cliente = new clienteBean();

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
        response.sendRedirect("vistas/crearCliente.jsp?respuesta=si&cliente=" + cliente.getNombres()+ "&mensaje=" + mensaje);
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
            clienteDAO miCliente = new clienteDAO();
            //cliente.setIdCliente(Integer.parseInt(request.getParameter("idCliente")));
            cliente.setNombres(request.getParameter("nombres"));
            cliente.setApellidos(request.getParameter("apellidos"));
            cliente.setIdTipoDucomento(Integer.parseInt(request.getParameter("idTipoDocumento")));
            cliente.setNumeroIdentificacion(request.getParameter("numeroIdentificacion"));
            cliente.setPassword(request.getParameter("password"));
            cliente.setCiudadResidencia(request.getParameter("ciudadResidencia"));
            cliente.setUltimaActualizacion(request.getParameter("ultimaActualizacion"));
           
            
            miCliente.guardar(cliente);
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
