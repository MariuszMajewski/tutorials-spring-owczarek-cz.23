package pl.mrmario.tutorials.spring.owczarek.cz23.implementations;

import java.util.Date;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pl.mrmario.tutorials.spring.owczarek.cz23.api.Logger;

@Service
@Qualifier("WithDateLoggerQualifier")
public class WithDateLogger implements Logger {
	public void log(String message) {
		System.out.println(new Date() + " : " + message);
	}
}
