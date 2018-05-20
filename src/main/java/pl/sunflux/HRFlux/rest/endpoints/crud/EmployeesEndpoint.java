package pl.sunflux.HRFlux.rest.endpoints.crud;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.sunflux.HRFlux.rest.dto.employees.CreateEmployeeDto;
import pl.sunflux.HRFlux.rest.dto.employees.UpdateEmployeeDto;
import pl.sunflux.HRFlux.rest.dto.response.EndpointResponse;
import pl.sunflux.HRFlux.services.EmployeeService;

@RestController
@RequestMapping(value = "/employees", produces = "application/json")
@Api(value = "/employees", description = "Operations for company employees")
public class EmployeesEndpoint {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeesEndpoint(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PutMapping
    @ApiOperation(value = "Create Employee", response = EndpointResponse.class)
    @ApiResponses(value = {@ApiResponse(code = 201, message = "Employee created successfully")})
    @ResponseStatus(HttpStatus.CREATED)
    public EndpointResponse createEmployee(@RequestBody CreateEmployeeDto createEmployeeDto) {
        employeeService.createEmployee(createEmployeeDto);
        return new EndpointResponse("Employee created successfully");
    }

    @PatchMapping
    @ApiOperation(value = "Update Employee", response = EndpointResponse.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Employee updated successfully")})
    @ResponseStatus(HttpStatus.OK)
    public EndpointResponse updateEmployee(@RequestBody UpdateEmployeeDto updateEmployeeDto) {
        employeeService.updateEmployee(updateEmployeeDto);
        return new EndpointResponse("Employee updated successfully");
    }

    @DeleteMapping
    @ApiOperation(value = "Delete Employee", response = EndpointResponse.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Employee deleted successfully")})
    @ResponseStatus(HttpStatus.OK)
    public EndpointResponse deleteEmployee(@RequestBody Long id) {
        employeeService.deleteEmployee(id);
        return new EndpointResponse("Employee deleted successfully");
    }
}
