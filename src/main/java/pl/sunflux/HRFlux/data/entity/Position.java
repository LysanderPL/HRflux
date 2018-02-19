package pl.sunflux.HRFlux.data.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

@Data
@NodeEntity
@Document(indexName = "neo4j-index-node", type = "Position")
public class Position {

    @Id
    private Long id;

    private String name;

    @Relationship(type = "EMPLOYEE_POSITIONS")
    private List<Employee> positionEmployees;


}
