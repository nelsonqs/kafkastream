En esta configuraci�n, nuestro servidor Zookeeper est� escuchando en el puerto = 2181 para el servicio kafka , que se define dentro de la misma configuraci�n de contenedor. Sin embargo, para cualquier cliente que se ejecute en el host, estar� expuesto en el puerto 22181 .

De manera similar, el servicio kafka se expone a las aplicaciones de host a trav�s del puerto 29092 , pero en realidad se anuncia en el puerto 9092 dentro del entorno de contenedor configurado por la propiedad KAFKA_ADVERTISED_LISTENERS .

docker-compose up -d