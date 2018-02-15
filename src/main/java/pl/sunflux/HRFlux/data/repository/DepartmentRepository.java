package pl.sunflux.HRFlux.data.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import pl.sunflux.HRFlux.data.entity.Department;

import java.util.UUID;

@Repository
interface DepartmentRepository extends Neo4jRepository<Department, UUID> {
}
