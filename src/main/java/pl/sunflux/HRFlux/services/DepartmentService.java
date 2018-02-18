package pl.sunflux.HRFlux.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sunflux.HRFlux.data.entity.Department;
import pl.sunflux.HRFlux.data.repository.neo4j.DepartmentRepository;
import pl.sunflux.HRFlux.rest.dto.departments.CreateDepartmentDto;
import pl.sunflux.HRFlux.rest.dto.departments.DepartmentDto;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Transactional
    public void createDepartment(CreateDepartmentDto requestDto) {
        Department department = new Department();
        department.setName(requestDto.getName());
        department.setDescription(requestDto.getDescription());
        departmentRepository.save(department);
    }

    @Transactional
    public void updateDepartment(DepartmentDto departmentDto) {
        Department department = departmentRepository.findOne(departmentDto.getId());
        department.setName(departmentDto.getName().isEmpty() ? department.getName() : departmentDto.getName());
        department.setDescription(departmentDto.getDescription().isEmpty() ? department.getDescription() : departmentDto.getDescription());

        departmentRepository.save(department);
    }

    @Transactional
    public void deleteDepartment(Long id) {
        departmentRepository.delete(id);
    }
}
