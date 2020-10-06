DEFAULT_TARGET=run

run:
	mvn compile javafx:run

build:
	mvn compile

clean-build:
	mvn clean 

clean-run:
	mvn clean javafx:run