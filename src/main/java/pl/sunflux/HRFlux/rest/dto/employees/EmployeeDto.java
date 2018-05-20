package pl.sunflux.HRFlux.rest.dto.employees;

import pl.sunflux.HRFlux.data.entity.types.CommunicationPrivacyLevel;

import java.util.List;
import java.util.Map;

public abstract class EmployeeDto {

    public abstract List<Map<CommunicationPrivacyLevel, String>> getEmployeePhones();

    public abstract List<Map<CommunicationPrivacyLevel, String>> getEmployeeEmails();
}
