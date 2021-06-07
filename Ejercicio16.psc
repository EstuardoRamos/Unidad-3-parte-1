Algoritmo Ejercicio16
	Definir num1, num2, num3 Como Real;
	EScribir "Ingrese numero";
	leer num1;
	EScribir "Ingrese numero";
	leer num2;
	EScribir "Ingrese numero";
	leer num3;
	Si num1>num2 & num1>num3 Entonces
		Escribir "El numero mayor es ",num1;
		Sino Si num2>num1 & num2>num3 Entonces
				Escribir "El numero mayor es ",num2;
			SiNo 
				Escribir "El numero mayor es ",num3;
			FinSi
			
	FinSi
	
FinAlgoritmo
