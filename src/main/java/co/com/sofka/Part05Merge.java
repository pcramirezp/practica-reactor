package co.com.sofka;


import co.com.sofka.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Learn how to merge flux.
 *
 */
public class Part05Merge {

	public Flux<User> mergeFluxWithInterleave(Flux<User> all, Flux<User> all1) {
		return null;
	}

	public Flux<User> mergeFluxWithNoInterleave(Flux<User> all, Flux<User> all1) {
		return null;
	}

	public Flux<User> createFluxFromMultipleMono(Mono<User> skylerMono, Mono<User> marieMono) {
		return null;
	}
}
