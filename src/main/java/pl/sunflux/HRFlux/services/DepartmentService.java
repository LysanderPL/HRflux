package pl.sunflux.HRFlux.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sunflux.HRFlux.data.entity.Department;
import pl.sunflux.HRFlux.data.repository.DepartmentRepository;
import pl.sunflux.HRFlux.rest.dto.departments.DepartmentDto;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Transactional
    public void createDepartment(DepartmentDto requestDto) {
        Department department = new Department();
        department.setName(requestDto.getName());
        departmentRepository.save(department);
    }
}
