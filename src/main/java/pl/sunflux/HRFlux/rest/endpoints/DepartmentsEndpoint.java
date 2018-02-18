package pl.sunflux.HRFlux.rest.endpoints;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.sunflux.HRFlux.rest.dto.departments.CreateDepartmentDto;
import pl.sunflux.HRFlux.rest.dto.departments.DepartmentDto;
import pl.sunflux.HRFlux.rest.dto.response.EndpointResponse;
import pl.sunflux.HRFlux.services.DepartmentService;

@RestController
@RequestMapping(value = "/departments", produces = "application/json")
@Api(value = "/departments", description = "Operations for company departments")
public class DepartmentsEndpoint {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentsEndpoint(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PutMapping
    @ApiOperation(value = "Create department", response = EndpointResponse.class)
    @ApiResponses(value = {@ApiResponse(code = 201, message = "Department created successfully")})
    @ResponseStatus(HttpStatus.CREATED)
    public EndpointResponse createDepartment(@RequestBody CreateDepartmentDto createDepartmentDto) {
        departmentService.createDepartment(createDepartmentDto);
        return new EndpointResponse("Department created successfully");
    }

    @PatchMapping
    @ApiOperation(value = "Update department", response = EndpointResponse.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Department updated successfully")})
    @ResponseStatus(HttpStatus.OK)
    public EndpointResponse updateDepartment(@RequestBody DepartmentDto departmentDto) {
        departmentService.updateDepartment(departmentDto);
        return new EndpointResponse("Department updated successfully");
    }

    @DeleteMapping
    @ApiOperation(value = "Delete department", response = EndpointResponse.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Department deleted successfully")})
    @ResponseStatus(HttpStatus.OK)
    public EndpointResponse deleteDepartment(@RequestBody Long id) {
        departmentService.deleteDepartment(id);
        return new EndpointResponse("Department deleted successfully");
    }
}
