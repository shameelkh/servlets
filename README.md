# Servlets

Repository of Servlet Examples.

## Main Files

### pom.xml

Defines dependency on servlet api. Note scope is set to `provided`.

```
    <dependencies>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>3.1.0</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>
```

Add `maven-war-plugin` to package project into war file: `mvn clean package`

```
     <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-war-plugin</artifactId>
        <version>2.3</version>
        <configuration>
            <warSourceDirectory>src/main/webapp</warSourceDirectory>
            <warName>SimpleServlet</warName>
        </configuration>
    </plugin>
```

### WEB-INF/web.xml

Defines your servlets (the url path, and which servlet class to execute).
Simple servlet example (can be run on `http://localhost:8080/SimpleServlet/welcome`):

```
    <servlet>
        <servlet-name>simpleServlet</servlet-name>
        <servlet-class>SimpleServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>

    <servlet-mapping>
        <servlet-name>simpleServlet</servlet-name>
        <url-pattern>/welcome</url-pattern>
    </servlet-mapping>
```

### Servlet Class 

A class that extends `HttpServlet` and overrides following methods:

```
public class SimpleServlet extends HttpServlet {

    @Override
    void doGet(HttpServletRequest request, HttpServletResponse response) { }
    
    @Override
    void doPost(HttpServletRequest request, HttpServletResponse response) { }
}
```
