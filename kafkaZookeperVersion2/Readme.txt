Una configuración de clúster para Apache Kafka debe tener redundancia tanto para los servidores de Zookeeper como para los servidores de Kafka. Entonces, agreguemos la configuración para un nodo más para cada uno de los servicios de Zookeeper y Kafka:

Debemos asegurarnos de que los nombres de los servicios y KAFKA_BROKER_ID sean únicos en todos los servicios.

Además, cada servicio debe exponer un puerto único a la máquina host . Entonces, aunque zookeeper-1 y zookeeper-2 están escuchando en el puerto 2181 , lo están exponiendo al host a través de los puertos 22181 y 32181 , respectivamente. La misma lógica se aplica a los servicios kafka-1 y kafka-2 , donde estarán escuchando en los puertos 29092 y 39092, respectivamente.


docker-compose up -d