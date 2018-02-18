package pl.sunflux.HRFlux.data.repository.neo4j;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import pl.sunflux.HRFlux.data.entity.Department;

@Repository
public interface DepartmentRepository extends Neo4jRepository<Department, Long> {
}
