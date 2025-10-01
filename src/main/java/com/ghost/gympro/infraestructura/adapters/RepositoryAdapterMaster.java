package com.ghost.gympro.infraestructura.adapters;

import com.ghost.gympro.mappers.MapperBasic;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public abstract class RepositoryAdapterMaster<E, D, I extends Serializable, R extends CrudRepository<E, I>, M extends MapperBasic<E, D>> {
    protected R repository;
    protected M mapper;

    public D save(D d) {
        E entity = mapper.toEntity(d);
        return mapper.toDomain(repository.save(entity));
    }

    abstract E update(E e);
}
