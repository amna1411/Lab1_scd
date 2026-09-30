JAVAC = javac
JAVA = java
SRC_DIR = src
BIN_DIR = bin
LIB_JAR = lib/mysql-connector-j-9.3.0.jar

SRC = $(wildcard $(SRC_DIR)/*.java)
CLASS = $(shell grep -l 'public static void main' $(SRC_DIR)/*.java | head -n 1 | sed 's|.*/||; s|\.java$$||')

compile:
	@echo Compiling Java source files...
	$(JAVAC) -cp "$(LIB_JAR)" -d $(BIN_DIR) $(SRC)

run: compile
	@echo Running program...
	$(JAVA) -cp "$(BIN_DIR);$(LIB_JAR)" $(CLASS)

clean:
	@echo Cleaning up class files...
	del /Q $(BIN_DIR)\*.class 2>NUL
