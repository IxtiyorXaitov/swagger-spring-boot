package dev.ikhtiyor.demoswagger.controller;

import dev.ikhtiyor.demoswagger.payload.Payload;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController("/api")
@Api(tags = "Say Hello Swagger")
public class SwaggerController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello!";
    }

    @ApiOperation(value = "This method is used to get the clients name and say hello.")
    @GetMapping("/hello/{name}")
    public String helloWithName(
            @PathVariable String name
    ) {
        return "Hello! " + name;
    }

    @ApiOperation(value = "This method is used to calculate two numbers.")
    @GetMapping("/calculate")
    public Integer calculate(
            @ApiParam(
                    name = "numberA",
                    type = "Integer",
                    value = "A Number for calculate",
                    required = true)
            @RequestParam(name = "numberA") Integer numberA,

            @ApiParam(
                    name = "numberB",
                    type = "Integer",
                    value = "B Number for calculate",
                    required = true)
            @RequestParam(name = "numberB") Integer numberB
    ) {
        return numberA + numberB;
    }

    @ApiOperation(value = "This method is used to reply text.")
    @PostMapping("/request")
    public String replyRequest(
            @RequestBody Payload request
    ) {
        if (request.isCheck()) {
            return request.getSrc();
        } else {
            return "False";
        }
    }
}
