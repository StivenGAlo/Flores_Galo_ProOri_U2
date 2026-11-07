# Contenido Audiovisual

Proyecto educativo de Programación Orientada a Objetos en Java. Sirve para practicar herencia, polimorfismo y las relaciones entre clases.

## Descripción

Modela distintos tipos de contenido audiovisual: películas, series, documentales, Netflix y TikTok. Todos heredan de la clase abstracta `ContenidoAudiovisual` y cada uno muestra sus detalles a su manera.

Además hay tres clases de apoyo con estas relaciones:

- **Actor** con `Pelicula` y `TikTok`: agregación.
- **Temporada** con `SerieDeTV`: composición.
- **Investigador** con `Documental`: asociación.
- `Netflix` guarda un catálogo de contenidos: agregación.

El diagrama de clases está en `diagrama_clases_uni1a.drawio` (se abre en app.diagrams.net).

## Instalación y uso

Necesitas Eclipse con un JDK de Java 8 o superior. No hay dependencias.

1. Clona el repositorio:

```bash
git clone https://github.com/<tu-usuario>/<tu-repositorio>.git
```

2. En Eclipse, crea un proyecto nuevo: **File → New → Java Project**.

3. Copia la carpeta `uni1a` del repositorio dentro de la carpeta `src` del proyecto (puedes arrastrarla en el Package Explorer).

4. Haz clic derecho sobre `Main.java` y elige **Run As → Java Application**.

Los detalles de cada contenido aparecen en la pestaña **Console**:

```
Detalles de la película:
ID: 0
Título: Inception
Duración en minutos: 148
Género: Ciencia ficción
Estudio: Warner Bros
Reparto:
  - Leonardo DiCaprio (50 años, Estadounidense)
  - Marion Cotillard (49 años, Francesa)
...
```