FROM jetty:latest

ADD ./build/libs/jettytest.war /var/lib/jetty/webapps
