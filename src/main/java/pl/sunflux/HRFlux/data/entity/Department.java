package pl.sunflux.HRFlux.data.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@NodeEntity
public class Department {

    @Id
    private Long id;

    private String name;

    @Relationship(type = "EMPLOYEE_DEPARTMENTS")
    private List<Employee> departmentEmployees;

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

    public List<Employee> getDepartmentEmployees() {
        return departmentEmployees;
    }

    public void setDepartmentEmployees(List<Employee> departmentEmployees) {
        this.departmentEmployees = departmentEmployees;
    }
}
