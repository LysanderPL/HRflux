package pl.sunflux.HRFlux.rest.endpoints;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.sunflux.HRFlux.data.entity.Department;
import pl.sunflux.HRFlux.data.repository.elastic.DepartmentElasticRepository;
import pl.sunflux.HRFlux.rest.dto.departments.DepartmentDto;
import pl.sunflux.HRFlux.rest.dto.departments.DepartmentsDto;
import pl.sunflux.HRFlux.rest.dto.response.EndpointResponse;
import pl.sunflux.HRFlux.services.DepartmentService;

import java.util.List;

@RestController
@RequestMapping(value = "/departments", produces = "application/json")
@Api(value = "/departments", description = "Operations for company departments")
public class DepartmentsEndpoint {

    private final DepartmentService departmentService;
    private final DepartmentElasticRepository departmentElasticRepository;

    @Autowired
    public DepartmentsEndpoint(DepartmentService departmentService, DepartmentElasticRepository departmentElasticRepository) {
        this.departmentService = departmentService;
        this.departmentElasticRepository = departmentElasticRepository;
    }


    @GetMapping
    @ApiOperation(value = "Get departments", response = DepartmentsDto.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Departments fetched successfully")})
    public List<Department> search(String name) {
        return departmentElasticRepository.findDepartmentsByNameIsStartingWith(name);
    }

    @PutMapping
    @ApiOperation(value = "Create department", response = EndpointResponse.class)
    @ApiResponses(value = {@ApiResponse(code = 201, message = "Departments created successfully")})
    @ResponseStatus(HttpStatus.CREATED)
    public EndpointResponse createDepartment(@RequestBody DepartmentDto departmentDto) {
        departmentService.createDepartment(departmentDto);
        return new EndpointResponse("Departments created successfully");
    }


}
