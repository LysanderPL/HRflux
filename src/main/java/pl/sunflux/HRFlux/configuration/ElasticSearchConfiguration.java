package pl.sunflux.HRFlux.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = {"pl.sunflux.HRFlux.data.repository.elastic"})
public class ElasticSearchConfiguration {
}
