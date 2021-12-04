package mx.com.example.web.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import mx.com.example.commons.to.OrderEventTO;
import mx.com.example.commons.to.OrderTO;
import mx.com.example.commons.to.PaymentEventTO;
import mx.com.example.commons.to.UserTO;
import mx.com.example.services.facade.IOrderFacade;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
@RequestMapping("order")
@Api(value="order")
public class HelloController {

    static final Logger LOG = LogManager.getLogger(HelloController.class);

    //@Autowired
    //RestTemplate restTemplate;

    @Autowired
    IOrderFacade IOrderFacade;

    @GetMapping(value = "/users", produces = "application/json")
    @ApiOperation(value = "Buscar Usuarios",
            notes = "Retorna todos los usuarios",
            response = UserTO.class,
            produces = "application/json")
    public ResponseEntity<List<UserTO>> getAllUsers() {
        List<UserTO> users = this.IOrderFacade.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping(value = "/ping", produces = "application/json")
    @ApiOperation(value = "Ping",
            notes = "Pong",
            produces = "application/json")
    public ResponseEntity test() {
        return new ResponseEntity<>("pong", HttpStatus.OK);
    }

    /* Esto es para usar un api rest en vez de kafka
    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody OrderTO order) {
        OrderEventTO event=IOrderFacade.createOrder(order);
        return new ResponseEntity(event,HttpStatus.CREATED);
    }

    @RequestMapping(value = "/orders/confirm", method = RequestMethod.POST)
    public ResponseEntity confirm(@RequestBody PaymentEventTO payment) {
        IOrderFacade.updateOrder(payment);
        return new ResponseEntity(HttpStatus.OK);
    }
    */
}
