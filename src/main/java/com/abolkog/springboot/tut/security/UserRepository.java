package com.abolkog.springboot.tut.security;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @Created 08/10/2018 9:40 PM.
 */
@Repository
public interface UserRepository extends MongoRepository<AppUser, String> {
}
