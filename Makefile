all: build

build:
	mvn compile

run:
	mvn compile exec:java