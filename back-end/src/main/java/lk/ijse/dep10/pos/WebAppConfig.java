package lk.ijse.dep10.pos;

import lk.ijse.dep10.pos.api.CustomerController;
import lk.ijse.dep10.pos.api.ItemController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
public class WebAppConfig {
    @Bean
    public CustomerController customerController(){
        return new CustomerController();
    }

    @Bean
    public ItemController itemController(){return new ItemController();}
}
