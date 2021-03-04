package com.example.biblioem.dal;

import com.example.biblioem.domain.Emprunt;
import org.springframework.data.repository.CrudRepository;

public interface EmpruntDAO extends CrudRepository<Emprunt, Long> {

}
