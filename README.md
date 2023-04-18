Creazione di una semplice api rest senza l'utilizzo dei framework Spring e Angular.

Le tecnologie utilizzate sono le seguenti:

- Database, db relazionale con linquaggio sql
- Backend, Maven - Servlet -Server Tomcat per lancio dell'applicazione. 
Restituzione dei risultati forniti attraverso un Json
- Frontend, Js, html, css

Librerie utilizzate:

- maven repository 4.0.1
- Gson 2.10.1
- jdbc connector 8.0.27
- bootstap 5.3

Scopo del progetto e utilizzo

Il progetto primaREST-api è nato dall'esigenza di connettere un database relazionale ad una logica di backend scritta in linguaggio Java.

Attraverso una connesione al database, il backend è in grado di fornire una lista di utenti attraverso il metodo chiamato dalla Servlet.

Una volta lanciato il server Tomcat 9.0 l'api è in grado di rispondere alla porta desiderata con la lista degli utenti letti dal database
e trasformata opportunamente in Json.

Compito del frontend è quello di leggere i dati forniti dal server e restituirli nella Index sotto forma di lista.

