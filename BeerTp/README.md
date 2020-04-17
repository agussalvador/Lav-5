# BeerTP

1) Cuantos consumidores se necesitan para que el stock llegue a 0?
2) Bloques synchronized porque deben serlos?
3) Explicar el recurso compartido.
4) Explicar las 3 formas de instanciar un thread.

2) El bloque synchronized evita que cualquier otro thread ejecute 
ningún otro método synchronized sobre ese mismo
    objeto
3) 



4) Formas de instanciar un thread:
    a. Extender la clase Thread.      
    b. implementar la interfaz Runnable
    c. Hacer un new de Thread
    Para correrlos debemos llamar al metodo start(). 
