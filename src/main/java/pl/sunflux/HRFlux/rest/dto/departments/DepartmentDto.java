package pl.sunflux.HRFlux.rest.dto.departments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sunflux.HRFlux.rest.dto.employees.EmployeesDto;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {

    private Long id;
    private String name;
    private EmployeesDto departmentEmployees;

}
