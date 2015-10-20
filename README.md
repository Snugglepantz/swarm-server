# swarm-server
How to make this work if you are lucky
* Notes
  *  Must use java 8 and maven 3.2.x or later
  * wildfly-swarm
  * clone https://github.com/wildfly-swarm/wildfly-swarm
  * mvn clean install (probably dont want to run all the tests)
  * good luck with this step
* My swarm microservice
  * mvn clean install
  * mvn package
  * mvn wildfly-swarm:run
  * navigate to localhost:8080/test/person/list
  * GG
