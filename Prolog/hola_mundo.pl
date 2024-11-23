% hola.pl
:- initialization(main). % Indica el punto de entrada

main :- 
    write('Hola, Prolog!'), % Escribe el mensaje en la consola
    nl, % Hace un salto de línea
    halt. % Termina la ejecución del programa

