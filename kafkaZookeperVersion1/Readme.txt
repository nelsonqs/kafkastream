En esta configuración, nuestro servidor Zookeeper está escuchando en el puerto = 2181 para el servicio kafka , que se define dentro de la misma configuración de contenedor. Sin embargo, para cualquier cliente que se ejecute en el host, estará expuesto en el puerto 22181 .

De manera similar, el servicio kafka se expone a las aplicaciones de host a través del puerto 29092 , pero en realidad se anuncia en el puerto 9092 dentro del entorno de contenedor configurado por la propiedad KAFKA_ADVERTISED_LISTENERS .

docker-compose up -d