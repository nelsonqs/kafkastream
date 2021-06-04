Una configuraci�n de cl�ster para Apache Kafka debe tener redundancia tanto para los servidores de Zookeeper como para los servidores de Kafka. Entonces, agreguemos la configuraci�n para un nodo m�s para cada uno de los servicios de Zookeeper y Kafka:

Debemos asegurarnos de que los nombres de los servicios y KAFKA_BROKER_ID sean �nicos en todos los servicios.

Adem�s, cada servicio debe exponer un puerto �nico a la m�quina host . Entonces, aunque zookeeper-1 y zookeeper-2 est�n escuchando en el puerto 2181 , lo est�n exponiendo al host a trav�s de los puertos 22181 y 32181 , respectivamente. La misma l�gica se aplica a los servicios kafka-1 y kafka-2 , donde estar�n escuchando en los puertos 29092 y 39092, respectivamente.


docker-compose up -d