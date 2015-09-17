package org.skcorg.springsecurity.repositories;

import java.io.Serializable;

import org.skcorg.springsecurity.domain.TestingUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends
		JpaRepository<TestingUser, Serializable> {

}
