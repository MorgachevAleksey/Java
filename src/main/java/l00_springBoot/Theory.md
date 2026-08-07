# Spring Boot
Java-фреймворк для создания веб-приложений

---
# Аннотации:

Spring Boot
1. @SpringBootApplication - главная аннотация spring boot
Разрешает регистрировать новые бины, сканирует все бины приложения, автоматически настраивает spring boot приложение

Spring Web (Spring MVC)
1. @RestController
2. @RequestMapping
3. @GetMapping
4. @PostMapping
5. @RequestBody
6. @RestControllerAdvice
7. @ExceptionHandler

Spring Context (IoC)
1. @Component
2. @Service
3. @Configuration
4. @Bean
5. @Qualifier

6. @Autowired - legacy, фактически позволяет инжектировать слои без конструктора, не должна использоваться кроме случая циклической зависимости:
фикса одновременной зависимости слоев A -> B и B -> A, конструкторная инжекция на нем ломается, но даже так правильнее через @Lazy

Jakarta Validation (Bean Validation)
1. @Valid
2. @NotNull
3. @NotBlank
4. @Positive
5. @Min
6. @DecimalMin

JPA / Hibernate
1. @Entity
2. @Table
3. @Id
4. @GeneratedValue
5. @Column

---
# Проекты на spring boot
- Vally
- Fall