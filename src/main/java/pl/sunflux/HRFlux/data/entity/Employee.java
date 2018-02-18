package pl.sunflux.HRFlux.data.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@NodeEntity
public class Employee {

    @Id
    private Long id;

    private String name;

    private String surname;

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

