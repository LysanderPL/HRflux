package pl.sunflux.HRFlux.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sunflux.HRFlux.data.entity.Email;
import pl.sunflux.HRFlux.data.entity.Employee;
import pl.sunflux.HRFlux.data.entity.Phone;
import pl.sunflux.HRFlux.data.repository.neo4j.EmployeeRepository;
import pl.sunflux.HRFlux.rest.dto.employees.CreateEmployeeDto;
import pl.sunflux.HRFlux.rest.dto.employees.UpdateEmployeeDto;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Transactional
    public void createEmployee(CreateEmployeeDto createEmployeeDto) {
        List<Phone> phones = new ArrayList<>();
        List<Email> emails = new ArrayList<>();

        preparePhonesAndEmails(phones, emails, createEmployeeDto);


        Employee employee = new Employee();
        employee.setName(createEmployeeDto.getName());
        employee.setSecondName(createEmployeeDto.getSecondName());
        employee.setSurname(createEmployeeDto.getSurname());
        employee.setEmployeeEmails(emails);
        employee.setEmployeePhones(phones);

        employeeRepository.save(employee);
    }

    @Transactional
    public void updateEmployee(UpdateEmployeeDto updateEmployeeDto) {
        Employee employee = employeeRepository.findOne(updateEmployeeDto.getId());

        List<Phone> phones = new ArrayList<>();
        List<Email> emails = new ArrayList<>();
        preparePhonesAndEmails(phones, emails, updateEmployeeDto);


    }

    private void preparePhonesAndEmails(List<Phone> phones, List<Email> emails, CreateEmployeeDto createEmployeeDto) {
        createEmployeeDto.getEmployeeEmails().forEach((communicationPrivacyLevel, s) -> {
            Email email = new Email();
            email.setValue(s);
            email.setCommunicationPrivacyLevel(communicationPrivacyLevel);
            emails.add(email);
        });

        createEmployeeDto.getEmployeePhones().forEach((communicationPrivacyLevel, s) -> {
            Phone phone = new Phone();
            phone.setValue(s);
            phone.setCommunicationPrivacyLevel(communicationPrivacyLevel);
            phones.add(phone);
        });
    }

    public void deleteEmployee(Long id) {
        employeeRepository.delete(id);
    }
}

