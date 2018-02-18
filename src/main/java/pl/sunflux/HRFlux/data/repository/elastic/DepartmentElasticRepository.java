package pl.sunflux.HRFlux.data.repository.elastic;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import pl.sunflux.HRFlux.data.entity.Department;

import java.util.List;

@Repository
public interface DepartmentElasticRepository extends ElasticsearchRepository<Department, Long> {

    public List<Department> findDepartmentsByNameIsStartingWith(String name);

}
