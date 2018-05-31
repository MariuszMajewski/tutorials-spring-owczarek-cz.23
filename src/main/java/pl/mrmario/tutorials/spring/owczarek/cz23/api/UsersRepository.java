package pl.mrmario.tutorials.spring.owczarek.cz23.api;

import pl.mrmario.tutorials.spring.owczarek.cz23.domain.User;

public interface UsersRepository {
	User createUser(String name);
	void setLogger(Logger logger);
}
