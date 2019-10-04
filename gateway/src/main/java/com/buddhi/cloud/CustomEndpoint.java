package com.buddhi.cloud;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Endpoint(id="mypoint")
@Component
public class CustomEndpoint {
    @ReadOperation
    public String mypoint(){
        return "Hello" ;
    }
}