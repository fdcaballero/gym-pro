package com.ghost.gympro.mappers;

public interface MapperBasic<E,D> {

    E toEntity(D d);

    D toDomain(E e);
}
