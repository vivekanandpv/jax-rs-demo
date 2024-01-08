package com.vivekanandpv.jaxrsdemo;

import com.vivekanandpv.jaxrsdemo.models.Book;
import jakarta.jws.WebService;
import jakarta.xml.ws.soap.Addressing;

@WebService(
        serviceName = "WebServiceDemo",
        endpointInterface = "com.vivekanandpv.jaxrsdemo.WebServiceDemo"
)
public class WebServiceDemoImplementation implements WebServiceDemo {
    @Override
    public String getMessage(String name) {
        return String.format("Hello, %s, this is from JAX-WS", name);
    }

    @Override
    public Book getBook() {
        return new Book(4, "Learning JAX-WS", 566, 800.50);
    }
}
