package org.example;

import com.codahale.metrics.servlets.PingServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PingEndpoint {

    @Bean
    public ServletRegistrationBean ping() {
        /*
        This servlet is registered and works if you execute:
        http://localhost:8080/ping
        -> pong
        But swagger did not register this endpoint anywhere
         */
        return new ServletRegistrationBean(new PingServlet(), "/ping");
    }
}
