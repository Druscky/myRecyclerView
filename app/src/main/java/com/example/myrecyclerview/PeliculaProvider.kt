package com.example.myrecyclerview

class PeliculaProvider {
    companion object {
        val peliculasList = listOf<Pelicula>(
            Pelicula(
                R.drawable.c1,
                "Cazafantasmas",
                "Ivan Reitman",
                "1984",
                """Ghostbusters, en español Los cazafantasmas, es una película 
                    |estadounidense de 1984 del género comedia con algunos toques de ciencia ficción, 
                    |producida y dirigida por Ivan Reitman, protagonizada por Bill Murray, Dan Aykroyd, 
                    |Sigourney Weaver, Harold Ramis, Rick Moranis, Annie Potts, William Atherton y 
                    |Ernie Hudson.""".trimMargin()
            ),
            Pelicula(
                R.drawable.c2,
                "Cazafantasmas 2",
                "Ivan Reitman",
                "1989",
                """Cinco años después de los eventos ocurridos en la primera parte, los 
                    Cazafantasmas han pasado al olvido debido a que los fantasmas son inexistentes 
                    en la ciudad y ya nadie necesita sus servicios. Ray Stantz y Winston Zeddemore 
                    animan fiestas infantiles, mientras que Ray maneja una tienda sobre temas 
                    sobrenaturales, Egon Spengler trabaja en un instituto como investigador y Peter 
                    Venkman tiene un programa de TV llamado \"El Mundo Psíquico\".""".trimMargin()
            ),
            Pelicula(
                R.drawable.c3,
                "Cazafantasmas 3",
                "Jason Reitman",
                "2021",
                """Treinta y siete años después del "cruce de rayos protónicos de Manhattan 
                    |del 84", el miembro fundador de los Cazafantasmas, Egon Spengler, se mudó a 
                    |Summerville, Oklahoma, donde él sospechaba que estaban ubicadas las operaciones 
                    |mineras del cultista gozeriano «Ivo Shandor».. Egon captura una entidad espectral 
                    |en una de las minas, con el objetivo de usarlo para atraer a un fantasma más 
                    |grande hasta su granja, donde le ha tendido una trampa...""".trimMargin()
            ),
            Pelicula (
                R.drawable.rf1,
                "Regreso al Futuro",
                "Robert Zemeckis",
                "1985",
                """La historia comienza en 1985 con Marty McFly, un joven normal de 
                    |diecisiete años de edad que vive con su familia en la ficticia Hill Valley, 
                    |California. Su padre es un hombre fracasado, tímido y de poco carácter, con un 
                    |empleo mal pagado donde tiene que soportar los constantes abusos de su jefe, 
                    |Biff Tannen, quien desde el instituto le ha hecho la vida imposible...""".trimMargin()
                    ),
            Pelicula(
                R.drawable.rf2,
                "Regreso al Futuro II",
                "Robert Zemeckis",
                "1989",
                """La película comienza exactamente donde quedó la primera parte previamente, 
                    |donde Marty McFly (Michael J. Fox) y Jennifer Parker (Elisabeth Shue) que 
                    |vuelven a encontrarse después de lo ocurrido en su viaje al pasado, de lo cual 
                    |ella no sabe nada. Entonces y de forma repentina llega el doctor Emmett Brown 
                    |(Christopher Lloyd) con la máquina del tiempo (esta vez con una modificación 
                    |para funcionar con basura en lugar de plutonio que el Doc le robó a terroristas 
                    |libios en la película anterior), y le dice a Marty y a Jennifer que deben ir 
                    |con él...""".trimMargin()
            ),
            Pelicula(
                R.drawable.rf3,
                "Regreso al Futuro III",
                "Robert Zemeckis",
                "1990",
                """La película comienza exactamente en el clímax de la primera parte y el 
                    |final de la segunda parte donde el doctor Emmett Brown de 1955 envía de regreso 
                    |a Marty McFly a 1985 con el experimento del rayo de la torre del reloj, 
                    |pero justo cuando este celebraba su éxito con el experimento para el viaje en 
                    |el tiempo este se dispone a regresar a su casa, súbitamente el Marty de la 
                    |segunda entrega se le aparece frente y deja en estado de shock al Doc justo 
                    |cuando este lo acababa de enviar de regreso al futuro, pero Marty le responde 
                    |que es cierto que lo envió de devuelta la última vez, pero...""".trimMargin()
            ),
            Pelicula(
                R.drawable.et,
                "E.T. el Extraterrestre",
                "Steven Spielberg",
                "1982",
                """E. T., el extraterrestre es una película estadounidense de ciencia 
                    |ficción de 1982 dirigida por Steven Spielberg, escrita por Melissa Mathison, 
                    |protagonizada por Henry Thomas y distribuida por Universal Pictures. La cinta 
                    |está basada en un amigo imaginario del propio director, creado tras el divorcio 
                    |de sus padres.""".trimMargin()
            )
        )
    }
}