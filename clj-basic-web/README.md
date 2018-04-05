# clj-basic-web

a simple web-application that displays some (x, y) locations from a database, letting you add more locations as well.

Made using common Clojure libraries.

## Components

-   Ring - Clojure web application library
-   Compojure - routing library for Ring
-   Hiccup - represents HTML in Clojure
-   H2 - small and fast java SQL db that is embedded in this application

### Ring

[Ring](https://github.com/ring-clojure/ring) ([at
clojars](https://clojars.org/ring)) is a foundational Clojure web
application library. It:

-   sets things up such that an http request comes into your webapp
    as a regular Clojure hashmap, and likewise makes it so that you
    can return a response as a hashmap.
-   provides [a
    spec](https://github.com/ring-clojure/ring/blob/master/SPEC)
    describing exactly what those request and response maps should
    look like.
-   brings along a web server
    ([Jetty](http://www.eclipse.org/jetty/)) and connects your
    webapp to it.

### Compojure

  If we were using only Ring, we'd have to write one single function to
  take that incoming request map and then delegate to various functions
  depending upon which page was requested.
  [Compojure](https://github.com/weavejester/compojure) ([at
  clojars](https://clojars.org/compojure)) provides some handy features
  to take care of this for us such that we can associate url paths with
  corresponding functions, all in one place.

  For more info, see:

-   [the Compojure readme](https://github.com/weavejester/compojure#readme)
-   [its wiki docs](https://github.com/weavejester/compojure/wiki)
-   [its API docs](http://weavejester.github.com/compojure/)

### Hiccup

[Hiccup](https://github.com/weavejester/hiccup) ([at
clojars](https://clojars.org/hiccup)) provides a quick and easy way to
generate html. It converts regular Clojure data structures right into
html. For example,

```clojure
[:p "Hello, " [:i "doctor"] " Jones."]
```

becomes

```html
<p>Hello, <i>doctor</i> Jones.</p>
```

but it also does two extra handy bits of magic:

-   it provides some CSS-like shortcuts for specifying id and class,
    and

-   it automatically unpacks seqs for you, for example:

    ```clojure
    [:p '("a" "b" "c")]
    ;; expands to (and so, is the same as if you wrote)
    [:p "a" "b" "c"]
    ```

For more info, see:

-   [the Hiccup readme](https://github.com/weavejester/hiccup#readme)
-   [its wiki docs](https://github.com/weavejester/hiccup/wiki)
-   [its API docs](http://weavejester.github.com/hiccup/)

### H2

[H2](http://www.h2database.com/html/main.html) is a small and fast Java SQL
database that could be embedded in your application or run in server
mode. Uses single file for storage, but also could be run as in-memory DB.

> Another similar Java-based embedded DB that could be used in your
> application is [Apache Derby](http://db.apache.org/derby/).

## Options

Port e.g. -

    $ java -jar target/uberjar/clj-basic-web-0.1.0-standalone.jar 8080

## Usage

Using a stand-alone file that anyone with Java installed (which is basically everyone) can execute. Run from ./clojure-practice/clj-basic-web:

    $ java -jar target/uberjar/clj-basic-web-0.1.0-standalone.jar [args]
