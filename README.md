# Sample Code Aplikasi dengan Spring Boot #

Contoh [REST Service](http://en.wikipedia.org/wiki/Representational_state_transfer) menggunakan [Spring Boot](http://projects.spring.io/spring-boot/). 

## Framework dan Library ##

* [Spring Framework](http://projects.spring.io/spring-framework/)
* [Spring Boot](http://projects.spring.io/spring-boot/)
* [Spring Data JPA](http://projects.spring.io/spring-data-jpa/)
* [Hibernate ORM](http://hibernate.org/orm/)

## Kebutuhan Software ##

* Java SDK versi 5
* Maven versi 3.2.1
* MySQL versi 5.5

## Cara Menjalankan ##

1. Buat database di MySQL dengan konfigurasi sebagai berikut:
    * nama database : `springbootdemo`
    * username : `root`
    * password : `admin`
2. Buka command prompt, masuk ke folder project
3. Jalankan aplikasi : `mvn spring-boot:run`
4. Browse ke `http://localhost:8080/api/product`. Seharusnya akan muncul data produk dalam format [JSON](http://en.wikipedia.org/wiki/JSON)
