package com.springcloud.cilent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//@EnableEurekaClient
//@RestController
@EnableAspectJAutoProxy
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
//    @Value("${server.port}")
//    String port;
//    @RequestMapping("/client")
//    public String home(@RequestParam(value = "name",defaultValue = "cloud") String name){
//        return "hi " + name + " ,i am from port:" + port;
//    }
}
