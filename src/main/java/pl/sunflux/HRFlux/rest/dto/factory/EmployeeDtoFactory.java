package pl.sunflux.HRFlux.rest.dto.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import pl.sunflux.HRFlux.data.entity.Employee;
import pl.sunflux.HRFlux.rest.dto.employees.EmployeeDto;
import pl.sunflux.HRFlux.rest.dto.employees.EmployeesDto;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
public class EmployeeDtoFactory {

    public EmployeesDto createEmployeesDto(List<Employee> employees) {
        return new EmployeesDto(
                employees.stream()
                        .map(this::createEmployeeDto)
                        .collect(Collectors.toList()));
    }

    public EmployeeDto createEmployeeDto(Employee employee) {
        return new EmployeeDto();
    }
}
