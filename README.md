# Encriptacion

Formula//Formula C=(P+key)%26
		//*C=Texto Cifrado/cipertext 
			//*P=Texto sin Cifrar/plaintext 
				//*KEY = a eleccion del usuario (no negative)

Cifrado 
Si quisiéramos enviar un mensaje a alguien, podríamos querer encriptar , o de alguna manera codificar ese mensaje para que sea difícil de leer para otros. 
El mensaje original, o entrada a nuestro algoritmo, se llama texto plano , y el mensaje cifrado, o salida, se llama texto cifrado . 
Un mensaje como HI!podría convertir a ASCII, 72 73 33. 
Pero cualquiera podría volver a convertir eso en letras. 
Un algoritmo de cifrado generalmente requiere otra entrada, además del texto sin formato.
 Se necesita una clave , y a veces es simplemente un número, que se mantiene en secreto. 
Con la clave, el texto sin formato se puede convertir, mediante algún algoritmo, a texto cifrado y viceversa. 
Por ejemplo, si queríamos enviar un mensaje como I L O V E Y O U, podemos convertirlo primero a ASCII: 73 76 79 86 69 89 79 85. 
Entonces, podemos cifrarlo con una clave de poco 1y un algoritmo sencillo, en el que sólo tiene que añadir la clave para cada valor: 74 77 80 87 70 90 80 86. 
Entonces, alguien que convierta ese ASCII de nuevo en texto verá J M P W F Z P V. Para descifrar esto, alguien necesitará saber la clave.
