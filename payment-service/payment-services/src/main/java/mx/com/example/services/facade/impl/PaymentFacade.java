package mx.com.example.services.facade.impl;

import mx.com.example.commons.to.UserTO;
import mx.com.example.services.facade.IPaymentFacade;
import mx.com.example.services.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class PaymentFacade implements IPaymentFacade {

    @Autowired
    private IPaymentService paymentService;

    public List<UserTO> getAllUsers() {
        return this.paymentService.getUsers();
    }
}
