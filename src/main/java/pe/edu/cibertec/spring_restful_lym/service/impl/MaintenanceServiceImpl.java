package pe.edu.cibertec.spring_restful_lym.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.spring_restful_lym.dto.LanguageDto;
import pe.edu.cibertec.spring_restful_lym.entity.Language;
import pe.edu.cibertec.spring_restful_lym.repository.LanguageRepository;
import pe.edu.cibertec.spring_restful_lym.service.MaintenanceService;

import java.util.Optional;

@Service
public class MaintenanceServiceImpl implements MaintenanceService {

    @Autowired
    LanguageRepository languageRepository;

    @Override
    public Optional<String> getNameLanguage(Integer id) {
        Optional<Language> optional = languageRepository.findById(id);
        return optional.map(Language::getName);
    }

    @Override
    public Optional<LanguageDto> getLanguage(Integer id) {
        Optional<Language> optional = languageRepository.findById(id);
        return optional.map(language -> new LanguageDto(
                language.getLanguageId(),
                language.getName(),
                language.getLastUpdate()
        ));
    }

}
