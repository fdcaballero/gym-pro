package com.ghost.gympro.domain.gateways;

import java.io.Serializable;
import java.util.Optional;

public interface CrudGateway<T, I extends Serializable> {

    Optional<T> findById(I id);

    T save(T t);
}
