/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unimonito.Servlets;

import com.unimonito.Beans.vehiculoBean;
import com.unimonito.DAO.vehiculoDAO;
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
@WebServlet(name = "crearVehiculoServlet", urlPatterns = {"/crearVehiculoServlet"})
public class crearVehiculoServlet extends HttpServlet {
    private vehiculoBean vehiculo = new vehiculoBean();

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
           String mensaje = "se creo exitosamente el vehiculo";
        response.sendRedirect("vistas/crearVehiculo.jsp?respuesta=si&vehiculo=" + vehiculo.getMatricula()+ "&mensaje=" + mensaje);
        }finally{
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
        try {
          
            vehiculoDAO miVehiculo = new vehiculoDAO();
            //vehiculo.setIdvehiculos(Integer.parseInt(request.getParameter("idvehiculos")));
            vehiculo.setMatricula(request.getParameter("matricula"));
            vehiculo.setFechadeCompra(request.getParameter("fechadeCompra"));
            vehiculo.setNumeroPod(Integer.parseInt(request.getParameter("numeroPod")));
            vehiculo.setIdTipo(Integer.parseInt(request.getParameter("idTipo")));
            miVehiculo.guardar(vehiculo);
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(crearVehiculoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
