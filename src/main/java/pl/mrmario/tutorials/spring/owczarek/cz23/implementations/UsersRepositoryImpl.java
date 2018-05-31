package pl.mrmario.tutorials.spring.owczarek.cz23.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pl.mrmario.tutorials.spring.owczarek.cz23.api.Logger;
import pl.mrmario.tutorials.spring.owczarek.cz23.api.UsersRepository;
import pl.mrmario.tutorials.spring.owczarek.cz23.domain.User;

@Service("usersRepositoryImpl")
public class UsersRepositoryImpl implements UsersRepository {
	@Autowired
	@Qualifier("counterLoggerXmlQualifier")
	private Logger logger;

	public User createUser(String name) {
		logger.log("Tworzenie u¿ytkownika " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
