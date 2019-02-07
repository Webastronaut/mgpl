package mgpl

class Common {
	
/* 
 * ##### Vorgegebene statische Funktionen, bei Bedarf verwenden.
 */
	
	def static capitalize(String it) {
		if (it == null) return null
		if (length == 0) it else substring(0, 1).toUpperCase+substring(1)
		// if (it.length == 0) it else it.substring(0, 1).toUpperCase+it.substring(1)
		// 0 ist die Position des Teilstrings und 1 ist die Position hinter dem letzten Zeichen des Teilstrings
		// 2. substring-Parameter ist optional: Teilstring nimmt dann alle verbleibenden Zeichen oder (1, it.length)
	}
	def static uncapitalize(String it) {
		if (it == null) return null
		if (length == 0) it else substring(0, 1).toLowerCase+substring(1)
	}
	def static longAttributeName(String name) {
		switch(name) {case 'h': 'height' case 'r': 'radius' case 'w': 'width' default: name}
	}
	def static shortAttributeName(String name) {
		if (#['height', 'radius', 'width'].contains(name)) name.substring(0, 1)
		// in Java: new String[] {'height', 'radius', 'width'}
		// contains liefert wahr, wenn das Array den Wert des Parameters (name) beinhaltet
		else name
	}
	def static isShortAttributeName(String name) { 
		#['h', 'r', 'w'].contains(name)
	}
}