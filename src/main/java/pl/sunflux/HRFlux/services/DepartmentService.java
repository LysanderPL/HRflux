package pl.sunflux.HRFlux.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sunflux.HRFlux.data.entity.Department;
import pl.sunflux.HRFlux.data.repository.neo4j.DepartmentRepository;
import pl.sunflux.HRFlux.rest.dto.departments.CreateDepartmentDto;
import pl.sunflux.HRFlux.rest.dto.departments.UpdateDepartmentDto;

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
    public void updateDepartment(UpdateDepartmentDto updateDepartmentDto) {
        Department department = departmentRepository.findOne(updateDepartmentDto.getId());
        department.setName(updateDepartmentDto.getName().isEmpty() ? department.getName() : updateDepartmentDto.getName());
        department.setDescription(updateDepartmentDto.getDescription().isEmpty() ? department.getDescription() : updateDepartmentDto.getDescription());

        departmentRepository.save(department);
    }

    public void deleteDepartment(Long id) {
        departmentRepository.delete(id);
    }
}
