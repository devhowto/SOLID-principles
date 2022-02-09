# SOLID Principles

- [SOLID Principles](#solid-principles)
  - [Licensing](#licensing)
  - [Java](#java)
    - [Running the Examples](#running-the-examples)

Some notes and examples on [SOLID principles](https://en.wikipedia.org/wiki/SOLID).

- SRP:  Single Responsibility
- OCP: Open–Closed
- LSP: Liskov Substitution
- ISP: Interface Segregation
- DIP: Dependency Inversion

**NOTE**: The [main repo is the one on Gitlab](https://gitlab.com/devhowto/solid-principles). The [Github repo](https://github.com/devhowto/SOLID-principles) is only a mirror. Discussion, issues, PRs, etc. should be happen on [Gitlab](https://gitlab.com/devhowto/solid-principles).

**NOTE**: Gitlab renders the PlantUML diagrams (Github does not). Therefore, we strongly recommend that this text be read on the Gitlab repo.

## Licensing

See [LICENSE.TXT](./LICENCE.txt).

## Java

* [Maven in 5 Minutes (official docs)](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)

The Java setup was achieve with this:

``` 
$ mvn archetype:generate \
    -DgroupId=dev.fernandobasso.solid \
    -DartifactId=java \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DarchetypeVersion=1.4 \
    -DinteractiveMode=false
```

And tested with the first time with:

```text

$ cd java

$ mvn package 

$ java \
    -cp target/java-1.0-SNAPSHOT.jar \
    dev.fernandobasso.solid.App
```

### Running the Examples

Check `java/Makefile`. Run the examples with something like:

```text
$ make hello
$ make lsp_productsdiscount_nok1
```



