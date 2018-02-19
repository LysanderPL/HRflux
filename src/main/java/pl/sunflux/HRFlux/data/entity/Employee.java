package pl.sunflux.HRFlux.data.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

@Data
@NodeEntity
@Document(indexName = "neo4j-index-node", type = "Employee")
public class Employee {

    @Id
    private Long id;

    private String name;
    private String secondName;
    private String surname;

    @Relationship(type = "EMPLOYEE_PHONES", direction = Relationship.INCOMING)
    private List<Phone> employeePhones;

    @Relationship(type = "EMPLOYEE_EMAILS", direction = Relationship.INCOMING)
    private List<Email> employeeEmails;

    @Relationship(type = "EMPLOYEE_DEPARTMENTS", direction = Relationship.INCOMING)
    private List<Department> employeeDepartments;

    @Relationship(type = "EMPLOYEE_POSITIONS", direction = Relationship.INCOMING)
    private List<Position> employeePositions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Department> getEmployeeDepartments() {
        return employeeDepartments;
    }

    public void setEmployeeDepartments(List<Department> employeeDepartments) {
        this.employeeDepartments = employeeDepartments;
    }

    public List<Position> getEmployeePositions() {
        return employeePositions;
    }

    public void setEmployeePositions(List<Position> employeePositions) {
        this.employeePositions = employeePositions;
    }
}

