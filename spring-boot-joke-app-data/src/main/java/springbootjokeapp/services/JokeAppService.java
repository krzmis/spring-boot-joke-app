package springbootjokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public interface JokeAppService {

    ChuckNorrisQuotes getRandomJoke();

}
