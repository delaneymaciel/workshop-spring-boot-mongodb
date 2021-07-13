package br.com.dmb.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.dmb.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
