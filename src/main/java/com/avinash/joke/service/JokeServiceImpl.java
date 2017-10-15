package com.avinash.joke.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {
private final ChuckNorrisQuotes chuckNorrisquotes; 
	
public JokeServiceImpl(){
	this.chuckNorrisquotes = new ChuckNorrisQuotes(); 
}

	@Override
	public String getJoke() {
		// TODO Auto-generated method stub
		return chuckNorrisquotes.getRandomQuote();
	}

}
