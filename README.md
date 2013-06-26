with Gradle:


##install:
	brew install gradle


##ready
Generate your Twitter-app credential file after build at least once,  
set it in **./build/classes/main** folder.


see [http://twitter4j.org/en/configuration.html](http://twitter4j.org/en/configuration.html) for more detail & latest info.


##usage
* build -> test
	
		gradle build
	
	
* make jar

		gradle jar
		
		
* make jar -> run jar

		gradle runJar
		
	-> quit with command + .
