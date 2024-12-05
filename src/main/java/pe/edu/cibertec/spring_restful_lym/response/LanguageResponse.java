package pe.edu.cibertec.spring_restful_lym.response;

import java.util.Date;

public record LanguageResponse(Boolean status,
                               Integer id,
                               String name,
                               Date lastUpdate) {
}
