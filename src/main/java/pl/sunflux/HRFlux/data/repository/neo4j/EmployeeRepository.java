package pl.sunflux.HRFlux.data.repository.neo4j;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import pl.sunflux.HRFlux.data.entity.Employee;

@Repository
public interface EmployeeRepository extends Neo4jRepository<Employee, Long> {
}
