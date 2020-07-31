#Ontefetse Ditsele
#
#31 July 2020

JCC = javac

JFLAGS = -g

default: DamArrayApp.class

#
#By default it will call printAll Method
DamArrayApp.class: DamArrayApp.java
			$(JCC)	$(JFLAGS) DamArrayApp.java
#
#
#One of them should print dam not found
#Test:
#	$(JCC)	$(JFLAGS) DamArrayApp.java "Pella Dam"
#	$(JCC)	$(JFLAGS) DamArrayApp.java "Saulspoort Dam"
#	$(JCC)	$(JFLAGS) DamArrayApp.java "Corana Dam"
#	$(JCC)	$(JFLAGS) DamArrayApp.java "Covid19 Dam" 

clean:
		$(RM) *.class