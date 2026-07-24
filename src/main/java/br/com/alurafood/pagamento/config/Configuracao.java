package br.com.alurafood.pagamento.config;

import br.com.alurafood.pagamento.http.PedidoClient;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracao {

    @Bean
    public ModelMapper obtermodelMapper() {
        return new ModelMapper();
    }

}
