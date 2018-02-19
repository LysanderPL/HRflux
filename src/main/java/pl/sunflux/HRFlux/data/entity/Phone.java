package pl.sunflux.HRFlux.data.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.data.elasticsearch.annotations.Document;
import pl.sunflux.HRFlux.data.entity.types.CommunicationPrivacyLevel;

import java.util.List;

@Data
@NodeEntity
@Document(indexName = "neo4j-index-node", type = "Phone")
public class Phone extends AbstractValueEntity {

    private CommunicationPrivacyLevel communicationPrivacyLevel;

    @Relationship(type = "EMPLOYEE_PHONES")
    private List<Employee> employeePhones;
}
