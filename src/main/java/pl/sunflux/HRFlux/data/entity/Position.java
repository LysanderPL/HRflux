package pl.sunflux.HRFlux.data.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@NodeEntity
public class Position {

    @Id
    private Long id;

    private String name;

    @Relationship(type = "EMPLOYEE_POSITIONS")
    private List<Employee> positionEmployees;


}
