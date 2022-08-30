# Proyecto---Introd.Algoritmos
Menú Principal
------------------

1 - Capturar Valor 
2 - Generar Tabla de Multiplicar*
3 - Determinar Si es Primo o No Primo*
4 - Capturar una Matriz 4 x 4: Desplegar la Diagonal Principal* y Secundaria*
5 - Salir del Programa


La estructura de control para la evaluación de cada opción seleccionada y posterior ejecución de la lógica, se realizará con una Estructura Selectiva SWITCH.   Cada opción 1, 2, 3, 4 y 5 serán un segmento del SWITCH con el correspondiente código o lógica a realizar.


Opción 1.  Será utilizada para la captura de un valor numérico entero introducido por el teclado, y almacenado a una Variable Global.  Cuando muestre el resultado, hacer una pausa utilizando un temporizador o una tecla del teclado, para posteriormente limpiar la pantalla y volver al "Menú Principal".


Opción 2.  Con el valor introducido en la "Variable Global" de la "Opción 1", invocar un "Procedimiento" llamado "ProcedimientoTablaMultiplicar", en donde en dicho segmento se realizará la "Generación de la Tabla de Multiplicar de Dicho Número con multiplicaciones comprendidas del 1 al 12", es decir, si se introduce el Número 3 por el teclado en la "Opción 1", se generará la tabla de multiplicar del 3 con el siguiente formato vertical:

3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 =12
...
3 * 12 = 36

Cuando muestre el resultado, hacer una pausa utilizando un temporizador o una tecla del teclado, para posteriormente limpiar la pantalla y volver al "Menú Principal".


Opción 3.  Se representará como un resultado de mostrar un mensaje en pantalla, diciendo si el número "Es Primo" o "No Es Primo" basado en el valor del número capturado en la "Opción 1".  

La lógica para determinar dicho resultado, estará por igual en un procedimiento que se invocará en el segmento del SWITCH del Menú Principal de la opción correspondiente.  El nombre del procedimiento a invocar con la lógica para determinar si es primo o no, se llamará "ProcedimientoMostrarEvaluacionPrimo".  

Cuando muestre el resultado, hacer una pausa utilizando un temporizador o una tecla del teclado, para posteriormente limpiar la pantalla y volver al "Menú Principal".

Opción 4.  En base a cualquiera de las dos alternativas que desee para utilizar un "Arreglo Tipo Matriz", capturar por el teclado los números requeridos para una Matriz 4x4, o, generar los mismos de forma automática aleatoriamente, determinar y desplegar los elementos que pertenecen a la "Diagonal Principal y a la Diagonal Secundaria de dicha Matriz". 

La lógica para determinar dicho resultado, estará por igual en un procedimiento que se invocará en el segmento del SWITCH del Menú Principal de la opción correspondiente.  El nombre del procedimiento a invocar con la lógica a realizar se llamará "ProcedimientoDiagonalesMatriz". 

Cuando muestre el resultado, hacer una pausa utilizando un temporizador o una tecla del teclado, para posteriormente limpiar la pantalla y volver al "Menú Principal".


Opción 5.  Mientras no se pulse la opción No. 5, el programa estará ejecutando y mostrando la opción correspondiente que se seleccione.  

Tan pronto se pulse esta opción, limpiará la pantalla, desplegando posteriormente un mensaje que diga "Fin del Programa".  Al realizar esto, finalizar la ejecución misma del Programa.


# Resultado de la Solucion

## Estado inicial del programa 
![PA0](https://user-images.githubusercontent.com/71516416/187479982-99759c22-6a24-453b-9d8c-096c45707890.png)

## Estado luego de ingresar un valor
![PA1](https://user-images.githubusercontent.com/71516416/187480117-7de39591-3564-4fa1-b6da-086e138967e5.png)

## Al generar tabla de multiplicar
![PA2](https://user-images.githubusercontent.com/71516416/187480250-2a917914-6b68-4529-a54e-d24c6b124639.png)

Se genera una tabla con el valor actual en el menú principal

## Al comprobar si el valor es un numero primo
![PA3](https://user-images.githubusercontent.com/71516416/187480466-4818ec1d-54d9-4c23-bb22-e5f92ad7c384.png)

## Al generar una matriz 4x4
![PA4](https://user-images.githubusercontent.com/71516416/187480593-01ddb7b1-dc6f-4f76-a679-2a6a0681a6e3.png)

Se puede generar la matriz aleatoriamente o asignando los valores manualmente


