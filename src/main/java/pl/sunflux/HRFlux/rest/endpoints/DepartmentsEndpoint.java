package pl.sunflux.HRFlux.rest.endpoints;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sunflux.HRFlux.rest.dto.departments.DepartmentsDto;

@RestController
@RequestMapping(value = "/departments", produces = "application/json")
@Api(value = "/departments", description = "Operations for company departments")
public class DepartmentsEndpoint {

    @GetMapping
    @ApiOperation(value = "Get departments", response = DepartmentsDto.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Departments fetched successfully")})
    public DepartmentsDto showAll() {
        return new DepartmentsDto();
    }

}
