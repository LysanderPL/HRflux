package pl.sunflux.HRFlux.rest.dto.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import pl.sunflux.HRFlux.data.entity.Department;
import pl.sunflux.HRFlux.rest.dto.departments.DepartmentDto;
import pl.sunflux.HRFlux.rest.dto.departments.DepartmentsDto;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
public class DepartmentDtoFactory {

    private EmployeeDtoFactory employeeDtoFactory;

    public DepartmentsDto createDepartmentsDto(List<Department> departments) {
        return new DepartmentsDto(
                departments.stream()
                        .map(this::createDepartmentDto)
                        .collect(Collectors.toList()));
    }

    public DepartmentDto createDepartmentDto(Department department) {
        return new DepartmentDto(
                department.getId(),
                department.getName(),
                employeeDtoFactory.createEmployeesDto(department.getDepartmentEmployees())
        );
    }

}
