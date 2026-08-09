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
6. @RestControllerAdvice - глобальный обработчик ошибок, на класс обработчика
7. @ExceptionHandler - методы глобального обработчика, передается класс ошибки, который нужно обработать методом

Spring Context (IoC)
1. @Component
2. @Service
3. @Configuration
4. @Bean
5. @Qualifier

6. @Autowired - legacy, фактически позволяет инжектировать слои без конструктора, не должна использоваться кроме случая циклической зависимости:
фикса одновременной зависимости слоев A -> B и B -> A, конструкторная инжекция на нем ломается, но даже так правильнее через @Lazy

Jakarta Validation (Bean Validation)
1. @Valid - подключается при первой передаче обьекта в цепочке для активации валидации
2. @NotNull - не пропускает null, для обьектов\коллекций
3. @NotBlank - не пропускает null, пустую строку и пробелы, для строк
4. @Positive - >0
5. @Min\Max - указывает минимальное\максимальное значение (стринг поле value, разделитель мантисы точка!)
6. @DecimalMin\DecimalMax - для BigDecimal
7. @Pattern - проверяет на соответсвие регулярному выражению
Все аннотации валидации имют поле message, для вывода сообщения при ошибке валидации

JPA / Hibernate
1. @Entity
2. @Table
3. @Id
4. @GeneratedValue
5. @Column

Cache
1. @EnableCaching - (над спрингбут апликейшен) подключение кэширования
2. @Cacheable

---
Обработка ошибок

- Глобальный обработчик ошибок
Ловит исключения у всех контроллеров
- Кастомные исключения
Необходимы для случаев исключений, не подходящих под стандартные, но требующие обработки
- Форма DTO ошибки
Необходима для унификации формы ошибки в пользовательском интерфейсе

Глобальному обработчику прописываются методы обработки каждого типа исключений, включая кастомные, которые возвращают актульный DTO ошибки
(Не забыть про "Безопасность через сокрытие")
Выброс прикручивается через .orElseThrow()

Обработка первой ошибки валидации
String firstError = ex.getBindingResult() 
.getFieldErrors()                     
.stream()                             
.map(FieldError::getDefaultMessage)   
.findFirst()                          
.orElse("Ошибка валидации");

---
Тестирование

JUnit 5

@Test - помечает тестируемый метод
@BeforeEach	- выполняется перед каждым @Test
@AfterEach - выполняется после каждого @Test

проверяется с помощью утверждений:
- assertThat(actual).isEqualTo(expected); 
- assertThat(list).hasSize(3);
- assertThat(list).extracting(RateDto::code).containsExactly("USD", "EUR");
- assertThat(result).isNull(); 
- assertThat(result).isNotNull();

Структура теста:
1) Что дано
2) Что делаем
3) Что проверяем

Mockito

---
# Проекты на spring boot
- Vally
- Fall