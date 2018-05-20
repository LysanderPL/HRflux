package pl.sunflux.HRFlux.rest.endpoints.search;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/search/departments", produces = "application/json")
@Api(value = "/search/departments", description = "Searcher for company departments")
public class DepartmentEndpoint {
}
