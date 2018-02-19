package pl.sunflux.HRFlux.rest.dto.departments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateDepartmentDto {

    private Long id;
    private String name;
    private String description;

}
