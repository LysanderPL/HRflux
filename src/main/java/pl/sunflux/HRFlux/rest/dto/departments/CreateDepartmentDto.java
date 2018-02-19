package pl.sunflux.HRFlux.rest.dto.departments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateDepartmentDto {

    private String name;
    private String description;
}
