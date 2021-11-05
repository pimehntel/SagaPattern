package mx.com.example.services.facade.impl;

import mx.com.example.commons.to.UserTO;
import mx.com.example.services.facade.IKitchenFacade;
import mx.com.example.services.service.IKitchenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class KitchenFacade implements IKitchenFacade {

    @Autowired
    private IKitchenService kitchenService;

    public List<UserTO> getAllUsers() {
        return this.kitchenService.getUsers();
    }
}
