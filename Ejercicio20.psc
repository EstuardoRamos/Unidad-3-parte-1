Algoritmo Ejercicio20
	Escribir "Ingrse un numero de 4 digitos"
	Leer num
	si num<100000 y num>9999 Entonces
		caden= convertiratexto(num);
		d1= Subcadena(caden,0,1);
		d2=Subcadena(caden,2,2);
		d3=Subcadena(caden,3,3);
		d4=Subcadena(caden,4,4);
		d5=Subcadena(caden,5,5);
		num1=ConvertirANumero(d1);
		num2=ConvertirANumero(d2);
		num3=ConvertirANumero(d3);
		num4=ConvertirANumero(d4);
		num5=ConvertirANumero(d5);
		si num1=num5 y num2=num4 Entonces
			Escribir "ES capicua";
		SiNo
			Escribir "No es capicua";
		FinSi
	SiNo
		Escribir "numero Invalido"
		
	FinSi
		
FinAlgoritmo
