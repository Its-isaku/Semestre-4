%! Ejercicio 28

%? relacion y objeto
es_mascota(solovino).

%? hechos
masgrande(camello, caballo).
masgrande(caballo, perro).
masgrande(perro, cuyo).
masgrande(cuyo, raton).
masgrande(raton, hamster).
masgrande(hamster, arania, hormiga, cucaracha, mosquito, mosca).

%? reglas
muchomasgrande(A, C) :- masgrande(A, B), masgrande(B, C).