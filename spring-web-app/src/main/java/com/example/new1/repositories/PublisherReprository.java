package com.example.new1.repositories;

import org.springframework.data.repository.CrudRepository;

import java.util.concurrent.Flow;

public interface PublisherReprository extends CrudRepository<Flow.Publisher,Long>    {
}
