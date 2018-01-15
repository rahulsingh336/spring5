package com.rs.springframework.spring5webapp.repositories;

import com.rs.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rs on 1/15/2018.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
