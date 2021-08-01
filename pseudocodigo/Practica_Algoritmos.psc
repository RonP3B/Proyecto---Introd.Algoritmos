//Función que genera un salto de linea
Funcion saltoDeLinea ( )
	Escribir "";
Fin Funcion

//Función que muestra una tabla de multiplicar por consola del valor recibido como parametro
Funcion ProcedimientoTablaMultiplicar (num)
	Limpiar Pantalla
	
	Para i = 1 Hasta 12 Con Paso 1 Hacer
		Escribir ConvertirATexto(num)+ " x " + ConvertirATexto(i) + " = " + ConvertirATexto(num * i)
	Fin Para
	
	saltoDeLinea()
	Escribir "Presiona cualquier tecla para volver al menú."
	Esperar Tecla
	
	Limpiar Pantalla
Fin Funcion

//Función que determina si el valor recibido por parametro es primo o no
Funcion  ProcedimientoMostrarEvaluacionPrimo (num)
	Definir raizCuadrada Como Entero
	raizCuadrada = trunc(RC(num))
	
	Definir esPrimo Como Logico
	esPrimo = Verdadero
	
	Para i = raizCuadrada Hasta 2 Con paso -1  Hacer
		Si num mod i == 0 Entonces
			esPrimo = Falso;
			i = 2;
		Fin Si
	Fin Para
	
	Limpiar Pantalla;
	
	Si esPrimo Entonces
		Escribir "el numero " + ConvertirATexto(num)  +  " es primo"
	SiNo 
		Escribir "el numero " + ConvertirATexto(num)  +  " no es primo"
	Fin Si
	
	saltoDeLinea();
	Escribir "Presiona cualquier tecla para volver al menú."
	Esperar Tecla
	Limpiar Pantalla
Fin Funcion

Algoritmo Practica_Algoritmos
	Definir variableGlobal, opcionElegida Como Entero;
	variableGlobal = 0; opcionElegida = 0;
	
	Definir condicionMenu Como Logico; 
	condicionMenu = Verdadero;
	
	Mientras condicionMenu Hacer
		Escribir "         ___________________"
		Escribir "            Menú Principal"
		Escribir "         ___________________"
		saltoDeLinea();
		
		Escribir "1 - Capturar Valor"
		Escribir "2 - Generar Tabla de Multiplicar"
		Escribir "3 - Determinar Si es Primo o No Primo"
		Escribir "4 - Capturar una Matriz 4 x 4: Desplegar la Diagonal Principal y Secundaria"
		Escribir "5 - Salir del Programa"
		
		saltoDeLinea();
		Escribir Sin Saltar "Elige la opción que desea realizar: "
		Leer opcionElegida;
		
		Segun opcionElegida Hacer
			1:
				Limpiar Pantalla
				Escribir Sin Saltar "ingresar un numero entero: " 
				Leer variableGlobal
				
				saltoDeLinea();
				Escribir "Usted ha ingresado el numero: " ConvertirATexto(variableGlobal);
				saltoDeLinea();
				
				Escribir "Presiona cualquier tecla para volver al menú."
				Esperar Tecla
				Limpiar Pantalla
			2:
				ProcedimientoTablaMultiplicar(variableGlobal)
			3:
				ProcedimientoMostrarEvaluacionPrimo(variableGlobal)
			4:
				Escribir "Elegista la opcion 4"
			5:
				condicionMenu = falso
			De Otro Modo:
				saltoDeLinea()
				Escribir "La opción que elegiste no existe, presiona cualquier tecla para volver a intentar"
				Esperar Tecla
				Limpiar Pantalla
		Fin Segun
	Fin Mientras
	
	//Poner fin del programa 
	
FinAlgoritmo












