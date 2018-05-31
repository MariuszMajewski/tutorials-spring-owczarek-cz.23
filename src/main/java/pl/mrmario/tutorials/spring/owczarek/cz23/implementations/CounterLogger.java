package pl.mrmario.tutorials.spring.owczarek.cz23.implementations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pl.mrmario.tutorials.spring.owczarek.cz23.api.Logger;

@Service
@Qualifier("counterLoggerQualifier")
public class CounterLogger implements Logger{
	private int count = 0;
	
	public void log(String message) {
		System.out.println(count++ + " : " +message);
		
	}

}
