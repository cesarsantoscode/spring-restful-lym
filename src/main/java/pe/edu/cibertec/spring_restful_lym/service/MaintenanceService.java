package pe.edu.cibertec.spring_restful_lym.service;

import pe.edu.cibertec.spring_restful_lym.dto.LanguageDto;

import java.util.Optional;

public interface MaintenanceService {

    Optional<String> getNameLanguage(Integer id);

    Optional<LanguageDto> getLanguage(Integer id);

}
