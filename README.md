# KATA - PRACTICA DE REACTOR - REACTIVE PROGRAMING #

## Purpose ##

En esta serie de ejercicios vamos a realizar una practica donde debemos realizar los TODOs que estarian comentados. Aplicamos conceptos básicos y luego debemos reforzar los aspectos fundamentales del mismo.

Realizar todos los commits dentro del repositorio.

## Issues List ##

### 1) Crear la clase Part01Flux ###

~~~~~~~~~~
public class Part01Flux {
	
		// TODO Return  empty Flux
		Flux<String> emptyFlux() {
			return null;
		}
	

		//TODO Devuelve un Flux que contiene 2 valores "foo" y "bar" sin usar una matriz o una colección
		Flux<String> fooBarFluxFromValues() {
			return null;
		}
		

		// TODO Cree un flujo a partir de una lista que contenga 2 valores "foo" y "bar"
		Flux<String> fooBarFluxFromList() {
			return null;
		}
		

		// TODO Cree un flujo que emita una IllegalStateException
		Flux<String> errorFlux() {
			return null;
		}
		

		// TODO Cree un flujo que emita valores crecientes de 0 a 9 cada 100 ms
		Flux<Long> counter() {
			return null;
		}
	

	}
~~~~~~~~~~

### 2) Crear la clase Part02Mono ###

~~~~~~~~~~
public class Part02Mono {	

		// TODO Return  empty Mono
		Mono<String> emptyMono() {
			return null;
		}	

		// TODO Devuelve un Mono que nunca emite ninguna señal.
		Mono<String> monoWithNoSignal() {
			return null;
		}	

		// TODO Devuelve un Mono que contiene un valor "foo"
		Mono<String> fooMono() {
			return null;
		}	

		// TODO Crea un Mono que emita una IllegalStateException
		Mono<String> errorMono() {
			return null;
		}
	
}
~~~~~~~~~~

### 3) Crear la clase Part04Transform ###

~~~~~~~~~~
public class Part04Transform {	

		// TODO Escriba con mayúscula el nombre de usuario, el nombre y el apellido del usuario
		Mono<User> capitalizeOne(Mono<User> mono) {
			return null;
		}	

		// TODO Escriba con mayúscula el nombre de usuario, el nombre y el apellido de los usuarios
		Flux<User> capitalizeMany(Flux<User> flux) {
			return null;
		}	

		// TODO Escriba en mayúscula el nombre de usuario, el nombre y el apellido de los usuarios con #asyncCapitalizeUser
		Flux<User> asyncCapitalizeMany(Flux<User> flux) {
			return null;
		}
	

		Mono<User> asyncCapitalizeUser(User u) {
			return Mono.just(new User(u.getUsername().toUpperCase(), u.getFirstname().toUpperCase(), u.getLastname().toUpperCase()));
		}
}
~~~~~~~~~~

### 4) Crear la clase Part05Merge ###

~~~~~~~~~~
public class Part05Merge {	

		// TODO Fusionar valores de flux1 y flux2 con intercalación
		Flux<User> mergeFluxWithInterleave(Flux<User> flux1, Flux<User> flux2) {
			return null;
		}	

		// TODO Fusionar valores de flux1 y flux2 sin intercalación (valores de flujo1 y luego valores de flujo2)
		Flux<User> mergeFluxWithNoInterleave(Flux<User> flux1, Flux<User> flux2) {
			return null;
		}	

		// TODO Cree un flujo que contenga el valor de mono1 y luego el valor de mono2
		Flux<User> createFluxFromMultipleMono(Mono<User> mono1, Mono<User> mono2) {
			return null;
		}
}
~~~~~~~~~~

### 5) Crear la clase Part07Errors ###

~~~~~~~~~~
public class Part07Errors {
		

		// TODO Devuelva un <User> Mono que contenga User.SAUL cuando se produzca un error en la entrada Mono; de lo contrario, no cambie la entrada Mono.
		Mono<User> betterCallSaulForBogusMono(Mono<User> mono) {
			return null;
		}
		

		// TODO Devuelva un Flux <User> que contenga User.SAUL y User.JESSE cuando ocurra un error en el Flux de entrada; de lo contrario, no cambie el Flux de entrada.
		Flux<User> betterCallSaulAndJesseForBogusFlux(Flux<User> flux) {
			return null;
		}
	

		// TODO Implementar un método que capitalice a cada usuario del flujo entrante utilizando el
        // #capitalizeUser y emite un error que contiene un error GetOutOfHereException
		Flux<User> capitalizeMany(Flux<User> flux) {
			return null;
		}

		User capitalizeUser(User user) throws GetOutOfHereException {
			if (user.equals(User.SAUL)) {
				throw new GetOutOfHereException();
			}
			return new User(user.getUsername(), user.getFirstname(), user.getLastname());
		}

		protected final class GetOutOfHereException extends Exception {
		    private static final long serialVersionUID = 0L;
		}
}
~~~~~~~~~~