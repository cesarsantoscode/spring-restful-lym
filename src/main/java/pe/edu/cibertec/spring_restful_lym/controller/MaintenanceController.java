package pe.edu.cibertec.spring_restful_lym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.spring_restful_lym.dto.LanguageDto;
import pe.edu.cibertec.spring_restful_lym.response.LanguageResponse;
import pe.edu.cibertec.spring_restful_lym.service.MaintenanceService;

import java.util.Optional;

@RestController
@RequestMapping("/maintenance")
public class MaintenanceController {

    @Autowired
    MaintenanceService maintenanceService;

    @GetMapping("/language")
    public String getLanguage() {
        Optional<String> optional = maintenanceService.getNameLanguage(1);
        return optional.orElse("");
    }

    @GetMapping("/language-id")
    public String getLanguageId(@RequestParam(value = "id", defaultValue = "1") String id) {
        Optional<String> optional = maintenanceService.getNameLanguage(Integer.parseInt(id));
        return optional.orElse("");
    }

    @GetMapping("/language-obj")
    public LanguageResponse getLanguageObj(@RequestParam(value = "id", defaultValue = "1") Integer id) {
        Optional<LanguageDto> optional = maintenanceService.getLanguage(id);
        return optional.map(
                lang -> new LanguageResponse(true,
                        lang.id(),
                        lang.name(),
                        lang.lastUpdate())
        ).orElse(
                new LanguageResponse(false,
                        null,
                        null,
                        null)
        );

    }

}
