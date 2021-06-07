Algoritmo Ejercicio17
	Definir lado1, lado2,lado3 Como Real;
	Escribir "Ingrese el lado del triangulo";
	leer lado1;
	Escribir "Ingrese el lado del triangulo";
	leer lado2;
	Escribir "Ingrese el lado del triangulo";
	leer lado3;
	Si lado1=lado2 y lado1=lado3 Entonces;
		Escribir "Es un triangulo equilatero";
		SiNo Si lado1<>lado2 y lado1<>lado3 y lado2<>lado3  Entonces;
				Escribir "Es un triangulo escaleno";
			SiNo
				Escribir "Es un triangulo isosceles";
			FinSi
			
	FinSi
	
FinAlgoritmo
