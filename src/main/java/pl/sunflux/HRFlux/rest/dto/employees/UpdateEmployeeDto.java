package pl.sunflux.HRFlux.rest.dto.employees;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sunflux.HRFlux.data.entity.types.CommunicationPrivacyLevel;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateEmployeeDto extends EmployeeDto {

    @JsonProperty(required = true)
    private Long id;

    @JsonProperty
    private String name;
    @JsonProperty
    private String secondName;
    @JsonProperty
    private String surname;

    @JsonProperty
    private List<Map<CommunicationPrivacyLevel, String>> employeePhones;
    @JsonProperty
    private List<Map<CommunicationPrivacyLevel, String>> employeeEmails;
}
