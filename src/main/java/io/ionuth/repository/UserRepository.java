package io.ionuth.repository;

import org.springframework.data.repository.CrudRepository;

import io.ionuth.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
