package com.ghost.gympro.domain.gateways;

public interface CrudGateway <T>{

    T save(T t);
}
