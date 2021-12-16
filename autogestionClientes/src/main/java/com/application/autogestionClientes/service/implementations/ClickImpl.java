package com.application.autogestionClientes.service.implementations;

import com.application.autogestionClientes.repository.ClickRepository;
import com.application.autogestionClientes.service.interfaces.IClickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClickImpl implements IClickService {
    @Autowired
     private ClickRepository clickRepository;
}
