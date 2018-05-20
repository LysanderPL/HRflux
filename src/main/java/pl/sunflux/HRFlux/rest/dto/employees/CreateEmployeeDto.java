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
public class CreateEmployeeDto extends EmployeeDto {

    @JsonProperty(required = true)
    private String name;
    @JsonProperty(required = false)
    private String secondName;
    @JsonProperty(required = true)
    private String surname;

    private List<Map<CommunicationPrivacyLevel, String>> employeePhones;
    private List<Map<CommunicationPrivacyLevel, String>> employeeEmails;
}
