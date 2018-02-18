package pl.sunflux.HRFlux.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@Configuration
@EnableNeo4jRepositories(basePackages = {"pl.sunflux.HRFlux.data.repository.neo4j"})
@EntityScan(basePackages = {"pl.sunflux.HRFlux.data.entity"})
public class Neo4jConfiguration {
}
