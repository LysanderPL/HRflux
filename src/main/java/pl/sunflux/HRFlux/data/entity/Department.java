package pl.sunflux.HRFlux.data.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@NodeEntity
@Data
public class Department {

    @Id
    private String id;
    private String name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
