package com.ghost.gympro.infraestructura.adapters;

import com.ghost.gympro.mappers.MapperBasic;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.Optional;

@RequiredArgsConstructor
public abstract class RepositoryAdapterMaster<E, D, I extends Serializable, R extends CrudRepository<E, I>, M extends MapperBasic<E, D>> {
    protected final R repository;
    protected final M mapper;

    public D save(D d) {
        E entity = mapper.toEntity(d);
        return mapper.toDomain(repository.save(entity));
    }
    public Optional<D> findById(I id){
        return repository.findById(id).map(mapper::toDomain);
    }

}
