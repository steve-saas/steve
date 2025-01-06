package de.rwth.idsg.steve.web.api;

import de.rwth.idsg.steve.SteveException;
import de.rwth.idsg.steve.service.ChargePointHelperService;
import de.rwth.idsg.steve.web.api.ApiControllerAdvice.ApiErrorResponse;
import de.rwth.idsg.steve.web.dto.Statistics;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/home")
public class HomeRestController {

    @Autowired private ChargePointHelperService chargePointHelperService;

    @GetMapping("/stats")
    public Statistics getStats() {
        Statistics stats = chargePointHelperService.getStats();
        return stats;
    }
}
