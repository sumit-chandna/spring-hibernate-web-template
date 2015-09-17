package org.skcorg.springsecurity.service;

import org.skcorg.springsecurity.domain.TestingUser;
import org.skcorg.springsecurity.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	@Autowired
	private TestRepository testRepository;

	public TestRepository getTestRepository() {
		return testRepository;
	}

	public void setTestRepository(TestRepository testRepository) {
		this.testRepository = testRepository;
	}

	public String getData() {
		String data = "";
		for (TestingUser testingUser : testRepository.findAll()) {
			data = data + testingUser.getName();
		}
		return data;
	}
}
