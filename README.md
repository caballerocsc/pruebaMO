# Evaluación técnica API REST MO
## Prueba tecnica para ingreso a MO Technologies_
### Descripcion de la Prueba
Por favor escriba un programa que exponga un API REST con los siguientes endpoints:
1. Crear un arbol binario.
2. Dado un arbol binario y dos nodos retornar el ancestro común más cercano.



## Instalación 

Importe el proyecto en el IDE se su prefecrencia, para este caso en particular se utilizo Spring Tool Suite. Una vez finalizado el import, cree el un jar ejecutando un maven build.

Por favor tome el jar generado y ejecutelo con el comando en una terminal.

```sh
java -jar "nombredeljar" 
``` 
A continuacion por favor abra un navegador y digite la siguiente url:

```sh
http://localhost:8080/swagger-ui/index.html
``` 
### Probar la aplicación
La aplicacion cuenta con dos métodos:
- Get (/api/arbol/{nodos}): Permite crear un arbol binario balanceado con la catidad de nodos indicados en el parametro {nodos}. EL valor que contenga cada nodo se asigna de forma aleatoria. 
- POST (/api/arbol) : este método permite recibir un arbol y dos nodos cualquiera que existan dentro del arbol, para encontrar el ancestro común más cercano.

A través de la url http://localhost:8080/swagger-ui/index.html se puede validar las estructuras de datos que recibe el Api y también se puede lanzar pruebas.
