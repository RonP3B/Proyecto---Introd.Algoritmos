//Función que hace una pausa hasta que el usuario presione una tecla y limpia la consola
Funcion pausa ()
	Esperar Tecla;
	Limpiar Pantalla;
Fin Funcion

//Función que genera un salto de linea
Funcion saltoDeLinea ()
	Escribir "";
Fin Funcion

//Función que muestra una tabla de multiplicar por consola del valor recibido como parámetro
Funcion ProcedimientoTablaMultiplicar (num)	
	Para i = 1 Hasta 12 Con Paso 1 Hacer
		Escribir ConvertirATexto(num)+ " x " + ConvertirATexto(i) + " = " + ConvertirATexto(num * i);
	Fin Para
	
	saltoDeLinea();
	Escribir "Presiona cualquier tecla para volver al menú principal.";
	
	pausa();
Fin Funcion

//Función que determina si el valor recibido por parámetro es primo o no
Funcion  ProcedimientoMostrarEvaluacionPrimo (num)
	//cración de las variables
	Definir esPrimo Como Logico;
	Definir raizCuadrada Como Entero;
	
	//Inicialización de las variables
	raizCuadrada = 0;
	esPrimo = Verdadero;
	
	//si el parámetro recibido es menor a 2, no es primo
	Si num < 2 Entonces
		esPrimo = Falso;
	SiNo
		//raiz cuadrada exacta del valor recibido como parámetro
		raizCuadrada = trunc(RC(num));
		
		//comprombación si el valor recibido por parámetro tiene divisibles aparte del 1 y el mismo
		Para i = raizCuadrada Hasta 2 Con paso -1  Hacer
			Si num mod i == 0 Entonces
				esPrimo = Falso;
				i = 2;
			Fin Si
		Fin Para
	Fin Si
	
	//Mostrar la respuesta por consola
	Si esPrimo Entonces
		Escribir "el numero " + ConvertirATexto(num)  +  " es primo";
	SiNo 
		Escribir "el numero " + ConvertirATexto(num)  +  " no es primo";
	Fin Si
	
	saltoDeLinea();
	Escribir "Presiona cualquier tecla para volver al menú principal.";
	pausa();
Fin Funcion

//Funcion que genera matriz 4x4 y muestra su diagonal principal y secundaria
Funcion ProcedimientoDiagonalesMatriz ()
	//Definición de variables
	Definir matriz, opcionElegida, fila, columna Como Entero;
	Definir diagonalPrincipal, diagonalSecundaria Como Caracter;
	
	//Inicializacion de variables
	diagonalPrincipal = "Valores de la diagonal principal: "; diagonalSecundaria = "Valores de la diagonal secundaria: ";
	opcionElegida = 0; fila = 1; columna = 1;
	Dimension matriz[4,4];
	
	//Peticion al usuario de como se generarán los valores de la matriz
	Mientras opcionElegida == 0 Hacer
		Escribir "Elige un como desea generar los valores de la matriz:";
		saltoDeLinea();
		Escribir "1.Generar valores aleatorios";
		Escribir "2.Ingresar valores manualmente";
		Leer opcionElegida;
		
		Segun opcionElegida Hacer
			1:
				opcionElegida = 1;
			2:
				opcionElegida = 2;
			De Otro Modo:
				opcionElegida = 0;
				Escribir "La opción que elegiste no existe, presiona cualquier tecla para volver a intentarlo.";
				pausa();
		Fin Segun
	Fin Mientras
	
	Limpiar Pantalla;
	
	//Generación de los valores de la matriz
	Si opcionElegida == 1 Entonces
		//Generación de valores aleatorios
		Para i = fila  Hasta 4 Con Paso 1 Hacer
			Para j = columna Hasta 4 Con Paso 1 Hacer
				matriz[i,j] = Aleatorio(1,10);
			Fin Para
		Fin Para
	SiNo
		//Generación de valores ingresados por el usuario
		Para i = fila Hasta 4 Con Paso 1 Hacer
			Para j = columna Hasta 4 Con Paso 1 Hacer
				Escribir Sin Saltar "Ingrese un valor para la fila #" + ConvertirATexto(i) + " en la columna #" + ConvertirATexto(j);
				Leer matriz[i,j];
				Limpiar Pantalla;
			Fin Para
		Fin Para
	Fin Si
	
	//Capturacion de los valores de la diagonal principal
	Mientras fila <= 4 Hacer
		diagonalPrincipal = diagonalPrincipal + "[" +ConvertirATexto(matriz[fila,columna]) + "]";
		
		fila = fila + 1;
		columna = columna + 1;
	Fin Mientras
	
	//reajuste de los apuntadores
	fila = 1;
	columna = 4;
	
	//Capturacion de los valores de la diagonal secundaria
	Mientras fila <= 4 Hacer
		diagonalSecundaria = diagonalSecundaria + "[" +ConvertirATexto(matriz[fila,columna]) + "]";
		fila = fila + 1;
		columna = columna - 1;
	Fin Mientras
	
	//reajuste de los apuntadores
	fila = 1;
	columna = 1;
	
	//Mostrar la matriz por consola
	Para i = fila Hasta 4 Con Paso 1 Hacer
		Para j = columna Hasta 4 Con Paso 1 Hacer
			Escribir Sin Saltar "[" + ConvertirATexto(matriz[i,j]) + "]";
		Fin Para
		saltoDeLinea();
	Fin Para
	
	//Mostrar las diagonlaes principal y secundaria de la matriz
	saltoDeLinea();
	Escribir diagonalPrincipal;
	Escribir diagonalSecundaria;
	
	saltoDeLinea();
	Escribir "Presione cualquier tecla para volver al menú principal.";
	pausa();
Fin Funcion

Algoritmo Practica_Algoritmos
	//Creación de variables
	Definir variableGlobal, opcionElegida Como Entero;
	Definir condicionMenu Como Logico;
	
	//Inicialización de las variables
	variableGlobal = 0; opcionElegida = 0;
	condicionMenu = Verdadero;
	
	//Lógica del menú
	Mientras condicionMenu Hacer
		Escribir "         ___________________";
		Escribir "            Menú Principal";
		Escribir "         ___________________";
		saltoDeLinea();
		
		Escribir "1 - Capturar Valor";
		Escribir "2 - Generar Tabla de Multiplicar";
		Escribir "3 - Determinar Si es Primo o No Primo";
		Escribir "4 - Capturar una Matriz 4 x 4: Desplegar la Diagonal Principal y Secundaria";
		Escribir "5 - Salir del Programa";
		
		saltoDeLinea();
		Escribir Sin Saltar "Elige la opción que desea realizar: ";
		Leer opcionElegida;
		
		Segun opcionElegida Hacer
			1:
				Limpiar Pantalla;
				Escribir Sin Saltar "ingresar un numero entero: " ;
				Leer variableGlobal;
				
				saltoDeLinea();
				Escribir "Usted ha ingresado el numero: " ConvertirATexto(variableGlobal);
				saltoDeLinea();
				
				Escribir "Presiona cualquier tecla para volver al menú.";
				pausa();
			2:
				Limpiar Pantalla;
				ProcedimientoTablaMultiplicar(variableGlobal);
			3:
				Limpiar Pantalla;
				ProcedimientoMostrarEvaluacionPrimo(variableGlobal);
			4:
				Limpiar Pantalla;
				ProcedimientoDiagonalesMatriz();
			5:
				Limpiar Pantalla;
				Escribir "Fin del Programa.";
				condicionMenu = falso;
			De Otro Modo:
				saltoDeLinea();
				Escribir "La opción que elegiste no existe, presiona cualquier tecla para volver a intentar";
				pausa();
		Fin Segun
	Fin Mientras
FinAlgoritmo