# week3_mefunciona
You have to add your "mysql" passwords


Despliegue de servidor en produccion:

Configurar parametros del ambiente de produccion 

ssh -i llave-privada-ssh.key ubuntu@ip-publica-server

##LOS COMANDOS SIGUIENTES SON CONECTADOS AL SERVIDOR##

#instalar jdk de java
sudo apt-get install openjdk-17-jdk

#instalar mysql server
sudo apt install mysql-server

#entrar a interfaz de comandos de mysql
sudo mysql

#establecer contraseña del usuario root
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'prod1234';
flush privileges;
exit

después de que existe la contraseña, el command para entrar a mysql es:
sudo mysql -p

crear schema - tiene que ser con ese tipo de comillas
CREATE SCHEMA `nombre de la base de datos`;

abrir el puerto 8080 de connection en la máquina (servidor), decirle que acepte esta connection
sudo iptables -I INPUT 6 -m state --state NEW -p tcp --dport 8080 -j ACCEPT
sudo netfilter-persistent save
luego toca configurar las redes de la nube de oracle -abrir puerto en la red
networkin-virutal cloud networks-resources-default que existe-security list-add ingress rule
ip 0.0.0.0/2 puerto 8080

luego el proyecto netbeans se 'build with dependencies' y a través de cyberduck se arrastra el .jar que está
en target del proyecto netbeans al ubuntu
con ls en gitbash se puede comprobar si el archivo quedó en el vm


java -Dspring.profiles.active=prod -jar sbweek3-0.0.1-SNAPSHOT.jar

#si queremos que el servidor quede ejecutando, debemos agregar el simbolo & al final de la linea al finalizar &
java -Dspring.profiles.active=prod -jar sbweek3-0.0.1-SNAPSHOT.jar &

#parar un servidor que se dejo ejecutando usando el & al final de la linea
kill $(ps aux | grep 'archivo.jar' | grep -v grep | awk '{print $2}')
