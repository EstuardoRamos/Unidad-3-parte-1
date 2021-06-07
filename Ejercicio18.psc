Algoritmo Ejercicio18
	Escribir "Ingrse un numero de 4 digitos"
	Leer num
	si num <10 Entonces
		caden= convertiratexto(num);
		d1= "0";
		d2="0";
		d3="0";
		d4=Subcadena(caden,0,1);
		num1=ConvertirANumero(d1);
		num2=ConvertirANumero(d2);
		num3=ConvertirANumero(d3);
		num4=ConvertirANumero(d4);
		suma = num1+num2+num3+num4;
		Escribir "d1=",d1," d2=",d2," d3=",d3," d4=",d4," La suma es ",suma;
	sino si num<100 entonces
			caden= convertiratexto(num);
			d1= "0";
			d2="0";
			d3=Subcadena(caden,0,1);
			d4=Subcadena(caden,2,2);
			num1=ConvertirANumero(d1);
			num2=ConvertirANumero(d2);
			num3=ConvertirANumero(d3);
			num4=ConvertirANumero(d4);
			suma = num1+num2+num3+num4;
			Escribir "d1=",d1," d2=",d2," d3=",d3," d4=",d4," La suma es ",suma;
		SiNo
			si num<1000 entonces 
				caden= convertiratexto(num);
				d1= "0";
				d2=Subcadena(caden,0,1);
				d3=Subcadena(caden,2,2);
				d4=Subcadena(caden,3,3);
				num1=ConvertirANumero(d1);
				num2=ConvertirANumero(d2);
				num3=ConvertirANumero(d3);
				num4=ConvertirANumero(d4);
				suma = num1+num2+num3+num4;
				Escribir "d1=",d1," d2=",d2," d3=",d3," d4=",d4," La suma es ",suma;
			SiNo
				si num<10000 Entonces
					caden= convertiratexto(num);
					d1= Subcadena(caden,0,1);
					d2=Subcadena(caden,2,2);
					d3=Subcadena(caden,3,3);
					d4=Subcadena(caden,4,4);
					num1=ConvertirANumero(d1);
					num2=ConvertirANumero(d2);
					num3=ConvertirANumero(d3);
					num4=ConvertirANumero(d4);
					suma = num1+num2+num3+num4;
					Escribir "d1=",d1," d2=",d2," d3=",d3," d4=",d4," La suma es ",suma;
				SiNo 
					Escribir "Numero invalido";	
				FinSi
			FinSi
		FinSi
		
	
		
	FinSi
	

	
FinAlgoritmo
