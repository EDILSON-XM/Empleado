package servlets;

public class UtilidadesServlets {

	
	public static String getCabecera(String titulo) {
		return "<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>"+titulo+"</title>\r\n"
				+ "    <link rel=\"stylesheet\" href=\"estilo.css\">\r\n"
				+ "    \r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>";
		       
		
	}
	
	public static String getPie() {
		return "</body>\r\n"
				+ "\r\n"
				+ "</html>";
	}
}
