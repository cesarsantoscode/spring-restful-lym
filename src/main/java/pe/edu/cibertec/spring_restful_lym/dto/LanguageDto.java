package pe.edu.cibertec.spring_restful_lym.dto;

import java.util.Date;

public record LanguageDto(Integer id,
                          String name,
                          Date lastUpdate) {
}
