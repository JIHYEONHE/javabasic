package Chapter07;

public class HttpServletExample {
public static void main(String[] args) {
	method(new LoginServelt());
	method(new fileDownloadServlet());
}
public static void method(HttpServlet servlet) {
	servlet.service();
}
}
