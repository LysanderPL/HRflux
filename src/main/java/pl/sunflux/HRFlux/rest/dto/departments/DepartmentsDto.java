package pl.sunflux.HRFlux.rest.dto.departments;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@ApiModel
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DepartmentsDto {

    @ApiModelProperty
    private List<DepartmentDto> departments;
}