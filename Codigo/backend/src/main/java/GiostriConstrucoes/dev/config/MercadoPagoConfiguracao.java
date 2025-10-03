package GiostriConstrucoes.dev.config;

import com.mercadopago.MercadoPagoConfig;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MercadoPagoConfiguracao {
//O token de acesso do Mercado Pago está hardcoded no código,
// e isso é uma prática que não é segura porque expõe informações sensíveis
//O ideal seria armazenar o token em um arquivo de configuração (application.properties)
//e acessá-lo via @Value ou Environment.
    @PostConstruct
    public void init(){
        MercadoPagoConfig.setAccessToken("APP_USR-963007695352846-051523-9b0c7f725046c3b54f559ee03eba5dd1-339266158");
    }
}


