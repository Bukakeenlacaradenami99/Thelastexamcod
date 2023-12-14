Plantilla para el readme

***Diagrama de clases***

1. Los podemos hacer en papel o en el programa de drawio
2. En el diagrama de clases establecemos todas las clases que van a ser utilizadas en el programa
3. Dentro de las clases ponemos sus nombres, atributos con sus modificadores de acceso y lo mismo para los metodos
4. Si hay clases que heredan, como hice en el ejercicio, las señalamos con sus flechas indicando de que clase hereda
5. Lo metemos en su paquete correspondiente y le ponemos un nombre. Los nombres tiene que ser por convenio para mejor entendimiento

**Diagrama de flujo**

1. Los podemos hacer en papel o en el programa de drawio
2. tenemos que establecer un inicio e indicar como va a ser el funcionamiento
3. mostrar los bucles y demás funciones que vamos a utilizar, todo en flechas hacia abajo
4. mostramos en pantalla lo que precisamos
5. Una vez hicimos todo lo anterior, lo exportamos como png

***Nos vamos al IDE***

**realizamos el jar**

1. Nos vamos a file y luego a project structure
2. Luego nos vamos a artifacts y le damos al signo + y modulos con dependencia, seleccionamos la main
3. Indicamos el directiorio donde vamos a meter el jar y después aplicamos y aceptar
4. Después nos vamos a build y luego build artifacts
5. le damos a build y el jar está creado en la carpeta out con la extensión .jar
6. etiquetamos el commit en el que hicimos el jar y hacemos push

***Creamos un repositorio en el que vamos a subir todo***

1. git add a la carpeta out
2. ahora etiquetamos el commit
3. utilizamos el comando git tag -a v1.0(lo de la version es opcional, podemos poner lo que queramos) -m "nombre del commit"
4. git remote add origin y ponemos la url del directorio
5. git push a lo que queremos subir más las etiquetas

**Nos vamos a GitHub**

1. Creamos la release
2. Nos vamos a release y la creamos seleccionando la etiqueta correcta
3. creamos la release
4. Volvemos a repetir todo el proceso con todo lo explicado anteriormente

Recordar meter el .jar en la release que es ahí donde se sube

***volvemos a hacer lo mismo y modificamos el jar***

1. hacemos una modificacion en el programa
2. build y rebuild para volver a hacer el jar
3. volvemos a hacer el add, y una etiqueta al commit que vamos a subir
4. pusheamos todo con las etiquetas
5. volvemos al github y creamos una nueva release con la segunda version de la etiqueta

***hacer el javadoc***

Lo primero será entrar en el IDE y seleccionar el programa en el cual queremos hacer el javadoc.
Una vez lo tengamos, podemos empezar con los pasos para realizar el javadoc

**Pasos para realizar el javadoc**

Utilizamos comentarios antes de las clase y de los métodos, pero estos tienen que ser de cierta manera:
1. Los comentarios empiezan con ‘/**’
2. Utilizamos etiquetas para identificar las partes de nuestro codigo:
2.1 Al autor -> @author
2.2 La versión de la clase -> @version
2.3 Los parámetros de los métodos -> @param
2.4 Lo que retorna el método -> @return
3. Una vez que escribimos todos los comentarios, para generar el HTML, desde el menú:
Tools -> Generate JavaDoc
4. Elegir el directorio destino donde se pondrá nuestro javadoc
5. Elegir para sacar todos los métodos (private, package, protected, public)
6. Ver el resultado en el navegador
Una vez hemos hecho todo lo mencionado anteriormente, tenemos que enviar nuestro javadoc a github
¿Como hacemos eso?
De la misma manera que enviamos codigo, add, commit y push, pero eso no es todo.

**Meter nuestro javadoc en gitHub**

Una vez está subido el javadoc (debemos llamarlo docs al subirlo) hacemos lo siguiente:
1. Nos vamos al repositorio donde tenemos el javadoc y todo nuestro codigo asociado a él
2. Nos vamos a setting y en settings le damos a pages
3. Hay una opcion que pone branch, le damos y seleccionamos modificacion
4. Hay otra opcion que se llama selec folder, le damos y seleccionamos docs y save despúes
5. esperamos unos minutos y tendría que salirnos un enlace en el que poder acceder para ver nuestro javadoc
6. si realizamos todo bien, ya tendríamos nuestro javadoc

***Crear etiqueta para el jar  y luego subir cosas***

Nos ponemos en el programa en el que vamos a trabajar y realizamos los siguientes pasos:

**modificamos lo que queramos y  hacemos el jar**

añadimos clases o escribimos el codigo que necesitemos para que nuestro programa funcione y luego hacemos lo siguiente:
1. Nos vamos a file y luego a project structure
2. Luego nos vamos a artifacts y le damos al signo + y modulos con dependencia, seleccionamos la main
3. Indicamos el directiorio donde vamos a meter el jar y después aplicamos y aceptar
4. Después nos vamos a build y luego build artifacts
5. le damos a build y el jar está creado en la carpeta out con la extensión .jar

Una vez tenemos el jar creado, vamos a subirlo y a etiquetar nuestro commit:

1. git add al archivo .jar y commit con el mensaje que queramos (tiene que ser descripctivo)
2. luego para etiquetar el commit, hacemos git tag -a (version de la etiqueta) -m (mensaje de la etiqueta)
3. luego push a todo, incluido a las etiquetas

Si lo hicimos todo bien, tendriamos que tener nuestra etiqueta en gitHub lista para la release

***Hice un commit pero se me olvidó etiquetarlo***

comando git tag -a (Nombre de la etiqueta) -m (mensaje de la etiqueta) (ID del commit)
El ID del commit lo encontramos en el id abajo de todo clickando en una flecha que se divide en 2 circulos y luego clickando en el ultimo commit
O lo encuentras en tu github, donde tu prefieras




***Pasos para hacer el Singleton***

El singleton es un metodo que nos permite instanciar un objeto de una clase, ese objeto es único y será siempre el mismo.
El singleton se utiliza principalmente cuando hay que completar tareas recurrentes en la rutina de un programa.
Los pasos para hacer el singleton son los siguientes:

1. Nos metemos en el programa en el que queremos hacer el singleton
2. ponemos atributos con sus modificadores de acceso, como siempre, y declaramos un atributo privado estatico
3. "private static (nombre de la clase) instance=null"
4. lo que hacemos con esto es instanciar un atributo estatico con el nombre de la clase, le llamamos instance y será null
5. Constructores en privado, super importante, para así no poder instanciar mas de 1 unico objeto
6. getters y setters de los atributos en publico
7. metodo para poder llamar al objeto instanciado, eso sería así:
public static (nombre de la clase) getInstance(){

if(instance==null){
instance=new (nombre de la clase)();
}

return instance;
}

Este metodo nos va a devolver el objeto que hemos creado dentro del metodo.

8. Tenemos un if en el que la condicion es que si instance es null, instance será igual al objeto creado
9. retornamos el objeto

Una vez hecho esto, nos vamos a la main y hacemos lo siguiente:

10. instanciamos un objeto de la clase del singleton.

(nombre de la clase)(nombre del objeto)=(nombre de la clase).getInstance

11. hemos creado el objeto y le hemos dicho que es igual al metodo estatico que nos va a devolver el objeto instanciado en el metodo
12. luego si queremos comprobarlo, podemos ir dando valores con los setters y comprobando en el debug el id del singleton para ver si es el mismo o no
13. si has seguido los pasos correctamente, debería de funcionar.


**añadir imagenes al readme**

pones tu readme con todas las cosas y dejas un hueco para las imagenes que subiras luego.

arrastrar imagen al readme, tienes que clickar en el lapiz editando desde el git.
arrasttramos la imagen y listo, guardar cambios con commit.

imagen del diagrama de clases:

![diagrama de clases png (2)](https://github.com/Bukakeenlacaradenami99/Thelastexamcod/assets/145834795/5678cae6-9ad0-415c-bf24-01d90180555f)


imagen del diagrama de flujo:


![diagrama de flujo png](https://github.com/Bukakeenlacaradenami99/Thelastexamcod/assets/145834795/9184a4ed-e083-4516-abde-ef2f07c7220b)

