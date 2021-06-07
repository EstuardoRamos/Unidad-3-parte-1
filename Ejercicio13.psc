Algoritmo Ejercicio13
	definir v, radio, altura Como Real;
	Escribir "Ingrese el radio del cilindro"
	Leer radio;
	Escribir "Ingrese la altura del cilindro"
	Leer altura;
	si radio>0 & altura>0 Entonces
		v=pi*(radio^2)*altura;
		Escribir "El volumen del cilindro es ", v;
		sino 
			Escribir "Error numero invalido";
	FinSi
FinAlgoritmo
