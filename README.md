# WebService_SOAP-ScolariteWS
# Collection :
Les collections sont des objets qui permettent de gérer des ensembles d'objets. Ces ensembles de données peuvent être définis avec plusieurs caractéristiques : la possibilité de gérer des doublons, de gérer un ordre de tri, etc. ...

# 1- List :
Une liste en Java est une séquence d'éléments selon un ordre. L'interface List du package java.util est celle qui implémente cette séquence d'objets classés d'une manière particulière appelée List.

![image info](https://github.com/MedMelek4848/WebService_SOAP-ScolariteWS/blob/master/List%20Collections.jpg)

# 2- Map :
Dans Java, Map est une interface qui représente un objet contenant des mappages entre des clés (key) et des valeurs (value). Chaque clé correspond à une valeur.

![image info](https://github.com/MedMelek4848/WebService_SOAP-ScolariteWS/blob/master/Map%20.jpg)

# 3-Queue et Deque :
collections qui stockent des éléments dans un certain ordre avant qu'ils ne soient extraits pour traitement

![image info](https://github.com/MedMelek4848/WebService_SOAP-ScolariteWS/blob/master/Deque-vs-Queue.jpg)

# 4-Set
A set in Java is an unordered collection of unique elements or objects. In other words, a set is a collection of elements that are not stored in a particular order.

![image info](https://github.com/MedMelek4848/WebService_SOAP-ScolariteWS/blob/master/realtime-example-of-java-set.jpg)

# Example Code List Java
* Clone this repository:
```
   package Test;
import java.util.ArrayList;
import java.util.List;

class Test{
	public static void main(String[] args) {
		List fail = new ArrayList();
		fail.add("Un");
		fail.add("Deux");
		fail.add("Trois");
		fail.add("Quarte");
		for (int i=0 ;i<fail.size();i++) {
			String elem=(String)fail.get(i);
			if (elem.startsWith("D")) {
				fail.remove(elem);
			}
		}
	}
}
```

