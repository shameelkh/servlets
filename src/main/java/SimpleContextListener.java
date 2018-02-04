import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class SimpleContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext sc = servletContextEvent.getServletContext();
        sc.setAttribute("startUpAttribute", "Secret Code: 1122");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
