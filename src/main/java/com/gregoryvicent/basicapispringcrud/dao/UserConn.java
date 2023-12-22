package com.gregoryvicent.basicapispringcrud.dao;

import com.gregoryvicent.basicapispringcrud.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserConn extends CrudRepository<User, Integer> {
}
