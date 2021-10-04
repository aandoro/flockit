# FlockIT
Desarrollar una API exponiendo 2 endpoints:
	
	*El primero tiene que simular un login (parametrizar un único usuario válido) y retornar en cualquier caos una estructura con el resultado.
	
	*El segundo tiene que retornar lat y long de una provincia por nombre, consumiendo la API pública

## instalación

importar el archivo *pom.xml* al IDE que utiliza, en mi caso use eclipse.

## Correr proyecto

Click derecho en *FlockitApplication.java* Run AS > Java Application, va a estar corriendo en [localhost:8080](http;//localhost:8080/)

El usuario valido para la prueba esta en el archivo *user.json*.

## Test

para correr el test ir a src/test/java, correr el archivo *FlockitApplicaionTests,java* haciendo click derecho Run As > JUnit Test

## Swagger

Para ver la documentacion de la API, se tiene que levantar el proyecto y entrar al siguiente link [pagina swagger](http://localhost:8080/swagger-ui.html)