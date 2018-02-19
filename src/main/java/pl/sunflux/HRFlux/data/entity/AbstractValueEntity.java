package pl.sunflux.HRFlux.data.entity;

import org.springframework.data.annotation.Id;

abstract class AbstractValueEntity {
    @Id
    private Long id;

    private String value;
}
