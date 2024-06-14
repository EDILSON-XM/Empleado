package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class EmpleadoServlest
 */
@WebServlet("/RegistroEmpleado")
public class EmpleadoServlest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmpleadoServlest() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter salida= response.getWriter();
		salida.println(UtilidadesServlets.getCabecera("Empleado nuevo"));
		
		salida.println("<p>Debe rellenar el formulario</p>");
		salida.println("<a href='formularioEmpleado.html'>ir a alta de Empleado</a>");
		salida.println(UtilidadesServlets.getPie());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter salida= response.getWriter();
		String Nombre= request.getParameter("nombre");
		String Apellidos= request.getParameter("apellido");
		String Provincia= request.getParameter("provincia");
		String conocimiento[]= request.getParameterValues("conocimiento");
		String Fecha= request.getParameter("fecha");
		String Experiencia= request.getParameter("año");
		
		salida.println(UtilidadesServlets.getCabecera("resusltado del formulario"));
		
			salida.println("<h1>Resultado del formulario </h1>");
			
			salida.println("<p>Nombre:"+ Nombre + "</p>");
			salida.println("<p>Apellidos:"+ Apellidos + "</p>");
			salida.println("<p> Provincia:"+ Provincia + "</p>");
			
			salida.println("<p>Conocimiento:" );
		    if(conocimiento==null) {
				salida.println("no se ha selecinado ninguno");
			}else {
				for(int i=0; i< conocimiento.length; i++ ) {
					String cono=conocimiento[i];
					salida.println( "<p>"+cono +"</p> ");
				}
				
			}
		    salida.println("</p>");
			
			
			
			salida.println("<p>Fecha:"+  Fecha + "<p>");
			salida.println("<p>Experiencia:"+  Experiencia + "<p>");
			
			salida.println(UtilidadesServlets.getPie());
		
		
		
		
		
		
		
		
		
	}

}
