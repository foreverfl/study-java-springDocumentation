# Spring Documentation

- Spring 공식 문서를 한글로 번역한 자료입니다. 구성상 불필요하다고 생각하는 부분은 읽고 제외했습니다.
- 번역은 Claude Opus/ChatGPT4를 사용했고, 어색한 부분은 직접 손을 봤습니다.
- 오역이 있을 수 있기 때문에, 공식문서가 필요한 부분에서는 직접 영어로 참조해주세요.
- 예시 코드를 쓸 때는 아래의 `application.properties` 구성을 참조하세요.

```properties
spring.application.name=springDocumentation
spring.datasource.url=jdbc=jdbc:postgresql://127.0.0.1:5432/spring_documentation
spring.datasource.username=***
spring.datasource.password=***
```

## 목차

- Core Technologies

  > - [The IoC Container - Introduction to the Spring IoC Container and Beans](#the-ioc-container---introduction-to-the-spring-ioc-container-and-beans)
  > - [The IoC Container - Container Overview](#the-ioc-container---container-overview)
  > - [The IoC Container - Bean Overview](#the-ioc-container---bean-overview)
  > - [The IoC Container - Dependencies - Dependency Injection](#the-ioc-container---dependencies---dependency-injection)
  > - The IoC Container - Dependencies - Dependencies and Configuration in Detail
  > - The IoC Container - Dependencies - Using depends-on
  > - The IoC Container - Dependencies - Lazy-initialized Beans
  > - The IoC Container - Dependencies - Autowiring Collaborators
  > - The IoC Container - Dependencies - Method Injection
  > - The IoC Container - Bean Scopes
  > - The IoC Container - Customizing the Nature of a Bean
  > - The IoC Container - Bean Definition Inheritance
  > - The IoC Container - Container Extension Points
  > - The IoC Container - Annotation-based Container Configuration
  > - The IoC Container - Annotation-based Container Configuration - Using @Autowired
  > - The IoC Container - Annotation-based Container Configuration - Fine-tuning Annotation-based Autowiring with @Primary
  > - The IoC Container - Annotation-based Container Configuration - Fine-tuning Annotation-based Autowiring with Qualifiers
  > - The IoC Container - Annotation-based Container Configuration - Using Generics as Autowiring Qualifiers
  > - The IoC Container - Annotation-based Container Configuration - Using CustomAutowireConfigurer
  > - The IoC Container - Annotation-based Container Configuration - Injection with @Resource
  > - The IoC Container - Annotation-based Container Configuration - Using @Value
  > - The IoC Container - Annotation-based Container Configuration - Using @PostConstruct and @PreDestroy
  > - The IoC Container - Classpath Scanning and Managed Components
  > - The IoC Container - Using JSR 330 Standard Annotations
  > - The IoC Container - Java-based Container Configuration
  > - The IoC Container - Java-based Container Configuration - Basic Concepts: @Bean and @Configuration
  > - The IoC Container - Java-based Container Configuration - Instantiating the Spring Container by Using AnnotationConfigApplicationContext
  > - The IoC Container - Java-based Container Configuration - Using the @Bean Annotation
  > - The IoC Container - Java-based Container Configuration - Using the @Configuration annotation
  > - The IoC Container - Java-based Container Configuration - Composing Java-based Configurations
  > - The IoC Container - Environment Abstraction
  > - The IoC Container - Registering a LoadTimeWeaver
  > - The IoC Container - Additional Capabilities of the ApplicationContext
  > - The IoC Container - The BeanFactory API
  > - Resources
  > - Validation, Data Binding, and Type Conversion
  > - Validation, Data Binding, and Type Conversion - Validation by Using Spring’s Validator Interface
  > - Validation, Data Binding, and Type Conversion - Data Binding
  > - Validation, Data Binding, and Type Conversion - Resolving Codes to Error Messages
  > - Validation, Data Binding, and Type Conversion - Spring Type Conversion
  > - Validation, Data Binding, and Type Conversion - Spring Field Formatting
  > - Validation, Data Binding, and Type Conversion - Configuring a Global Date and Time Format
  > - Validation, Data Binding, and Type Conversion - Java Bean Validation
  > - [Spring Expression Language (SpEL)](#spring-expression-language-spel)
  > - [Spring Expression Language (SpEL) - Evaluation](#spring-expression-language-spel---evaluation)
  > - Spring Expression Language (SpEL) - Expressions in Bean Definitions
  > - Spring Expression Language (SpEL) - Language Reference
  > - Spring Expression Language (SpEL) - Language Reference - Literal Expressions
  > - Spring Expression Language (SpEL) - Language Reference - Properties, Arrays, Lists, Maps, and Indexers
  > - Spring Expression Language (SpEL) - Language Reference - Inline Lists
  > - Spring Expression Language (SpEL) - Language Reference - Inline Maps
  > - Spring Expression Language (SpEL) - Language Reference - Array Construction
  > - Spring Expression Language (SpEL) - Language Reference - Methods
  > - Spring Expression Language (SpEL) - Language Reference - Operators
  > - Spring Expression Language (SpEL) - Language Reference - Types
  > - Spring Expression Language (SpEL) - Language Reference - Constructors
  > - Spring Expression Language (SpEL) - Language Reference - Variables
  > - Spring Expression Language (SpEL) - Language Reference - Functions
  > - Spring Expression Language (SpEL) - Language Reference - Bean References
  > - Spring Expression Language (SpEL) - Language Reference - Ternary Operator (If-Then-Else)
  > - Spring Expression Language (SpEL) - Language Reference - The Elvis Operator
  > - Spring Expression Language (SpEL) - Language Reference - Safe Navigation Operator
  > - Spring Expression Language (SpEL) - Language Reference - Collection Selection
  > - Spring Expression Language (SpEL) - Language Reference - Collection Projection
  > - Spring Expression Language (SpEL) - Language Reference - Expression Templating
  > - Aspect Oriented Programming with Spring
  > - Aspect Oriented Programming with Spring - AOP Concepts
  > - Aspect Oriented Programming with Spring - Spring AOP Capabilities and Goals
  > - Aspect Oriented Programming with Spring - AOP Proxies
  > - Aspect Oriented Programming with Spring - @AspectJ support
  > - Aspect Oriented Programming with Spring - Enabling @AspectJ Support
  > - Aspect Oriented Programming with Spring - Enabling @AspectJ Support - Declaring an Aspect
  > - Aspect Oriented Programming with Spring - Enabling @AspectJ Support - Declaring a Pointcut
  > - Aspect Oriented Programming with Spring - Enabling @AspectJ Support - Declaring Advice
  > - Aspect Oriented Programming with Spring - Enabling @AspectJ Support - Introductions
  > - Aspect Oriented Programming with Spring - Enabling @AspectJ Support - Aspect Instantiation Models
  > - Aspect Oriented Programming with Spring - Enabling @AspectJ Support - An AOP Example
  > - Aspect Oriented Programming with Spring - Schema-based AOP Support
  > - Aspect Oriented Programming with Spring - Choosing which AOP Declaration Style to Use
  > - Aspect Oriented Programming with Spring - Mixing Aspect Types
  > - Aspect Oriented Programming with Spring - Proxying Mechanisms
  > - Aspect Oriented Programming with Spring - Programmatic Creation of @AspectJ Proxies
  > - Aspect Oriented Programming with Spring - Using AspectJ with Spring Applications
  > - Aspect Oriented Programming with Spring - Further Resources
  > - Spring AOP APIs
  > - Spring AOP APIs - Pointcut API in Spring
  > - Spring AOP APIs - Advice API in Spring
  > - Spring AOP APIs - The Advisor API in Spring
  > - Spring AOP APIs - Using the ProxyFactoryBean to Create AOP Proxies
  > - Spring AOP APIs - Concise Proxy Definitions
  > - Spring AOP APIs - Creating AOP Proxies Programmatically with the ProxyFactory
  > - Spring AOP APIs - Manipulating Advised Objects
  > - Spring AOP APIs - Using the "auto-proxy" facility
  > - Spring AOP APIs - Using TargetSource Implementations
  > - Spring AOP APIs - Defining New Advice Types
  > - Null-safety
  > - Data Buffers and Codecs
  > - Logging
  > - Ahead of Time Optimizations
  > - Appendix
  > - Appendix - XML Schemas
  > - Appendix - XML Schema Authoring
  > - Appendix - Application Startup Steps

- Testing

  > - Introduction to Spring Testing
  > - Unit Testing
  > - Integration Testing
  > - JDBC Testing Support
  > - Spring TestContext Framework
  > - Spring TestContext Framework - Key Abstractions
  > - Spring TestContext Framework - Bootstrapping the TestContext Framework
  > - Spring TestContext Framework - TestExecutionListener Configuration
  > - Spring TestContext Framework - Application Events
  > - Spring TestContext Framework - Test Execution Events
  > - Spring TestContext Framework - Context Management
  > - Spring TestContext Framework - Context Management - Context Configuration with XML resources
  > - Spring TestContext Framework - Context Management - Context Configuration with Groovy Scripts
  > - Spring TestContext Framework - Context Management - Context Configuration with Component Classes
  > - Spring TestContext Framework - Context Management - Mixing XML, Groovy Scripts, and Component Classes
  > - Spring TestContext Framework - Context Management - Configuration Configuration with Context Customizers
  > - Spring TestContext Framework - Context Management - Context Configuration with Context Initializers
  > - Spring TestContext Framework - Context Management - Context Configuration Inheritance
  > - Spring TestContext Framework - Context Management - Context Configuration with Environment Profiles
  > - Spring TestContext Framework - Context Management - Context Configuration with Test Property Sources
  > - Spring TestContext Framework - Context Management - Context Configuration with Dynamic Property Sources
  > - Spring TestContext Framework - Context Management - Loading a WebApplicationContext
  > - Spring TestContext Framework - Context Management - Working with Web Mocks
  > - Spring TestContext Framework - Context Management - Context Caching
  > - Spring TestContext Framework - Context Management - Context Failure Threshold
  > - Spring TestContext Framework - Context Management - Context Hierarchies
  > - Spring TestContext Framework - Dependency Injection of Test Fixtures
  > - Spring TestContext Framework - Testing Request- and Session-scoped Beans
  > - Spring TestContext Framework - Transaction Management
  > - Spring TestContext Framework - Executing SQL Scripts
  > - Spring TestContext Framework - Parallel Test Execution
  > - Spring TestContext Framework - TestContext Framework Support Classes
  > - Spring TestContext Framework - Ahead of Time Support for Tests
  > - WebTestClient
  > - MockMvc
  > - MockMvc - Overview
  > - MockMvc - Static Imports
  > - MockMvc - Setup Choices
  > - MockMvc - Setup Features
  > - MockMvc - Performing Requests
  > - MockMvc - Defining Expectations
  > - MockMvc - Async Requests
  > - MockMvc - Streaming Responses
  > - MockMvc - Filter Registrations
  > - MockMvc - MockMvc vs End-to-End Tests
  > - MockMvc - Further Examples
  > - MockMvc - HtmlUnit Integration
  > - MockMvc - HtmlUnit Integration - Why HtmlUnit Integration?
  > - MockMvc - HtmlUnit Integration - MockMvc and HtmlUnit
  > - MockMvc - HtmlUnit Integration - MockMvc and WebDriver
  > - MockMvc - HtmlUnit Integration - MockMvc and Geb
  > - Testing Client Applications
  > - Appendix
  > - Appendix - Annotations
  > - Appendix - Annotations - Standard Annotation Support
  > - Appendix - Annotations - Spring Testing Annotations
  > - Appendix - Annotations - Spring Testing Annotations - @BootstrapWith
  > - Appendix - Annotations - Spring Testing Annotations - @ContextConfiguration
  > - Appendix - Annotations - Spring Testing Annotations - @WebAppConfiguration
  > - Appendix - Annotations - Spring Testing Annotations - @ContextHierarchy
  > - Appendix - Annotations - Spring Testing Annotations - @ContextCustomizerFactories
  > - Appendix - Annotations - Spring Testing Annotations - @ActiveProfiles
  > - Appendix - Annotations - Spring Testing Annotations - @TestPropertySource
  > - Appendix - Annotations - Spring Testing Annotations - @DynamicPropertySource
  > - Appendix - Annotations - Spring Testing Annotations - @DirtiesContext
  > - Appendix - Annotations - Spring Testing Annotations - @TestExecutionListeners
  > - Appendix - Annotations - Spring Testing Annotations - @RecordApplicationEvents
  > - Appendix - Annotations - Spring Testing Annotations - @Commit
  > - Appendix - Annotations - Spring Testing Annotations - @Rollback
  > - Appendix - Annotations - Spring Testing Annotations - @BeforeTransaction
  > - Appendix - Annotations - Spring Testing Annotations - @AfterTransaction
  > - Appendix - Annotations - Spring Testing Annotations - @Sql
  > - Appendix - Annotations - Spring Testing Annotations - @SqlConfig
  > - Appendix - Annotations - Spring Testing Annotations - @SqlMergeMode
  > - Appendix - Annotations - Spring Testing Annotations - @SqlGroup
  > - Appendix - Annotations - Spring Testing Annotations - @DisabledInAotMode
  > - Appendix - Annotations - Spring JUnit 4 Testing Annotations
  > - Appendix - Annotations - Spring JUnit Jupiter Testing Annotations
  > - Appendix - Annotations - Meta-Annotation Support for Testing
  > - Appendix - Further Resources

- Data Access

  > - Transaction Management
  > - Transaction Management - Advantages of the Spring Framework’s Transaction Support Model
  > - Transaction Management - Understanding the Spring Framework Transaction Abstraction
  > - Transaction Management - Synchronizing Resources with Transactions
  > - Transaction Management - Declarative Transaction Management
  > - Transaction Management - Declarative Transaction Management - Understanding the Spring Framework’s Declarative Transaction Implementation
  > - Transaction Management - Declarative Transaction Management - Example of Declarative Transaction Implementation
  > - Transaction Management - Declarative Transaction Management - Rolling Back a Declarative Transaction
  > - Transaction Management - Declarative Transaction Management - Configuring Different Transactional Semantics for Different Beans
  > - Transaction Management - Declarative Transaction Management - <tx:advice/> Settings
  > - Transaction Management - Declarative Transaction Management - Using @Transactional
  > - Transaction Management - Declarative Transaction Management - Transaction Propagation
  > - Transaction Management - Declarative Transaction Management - Advising Transactional Operations
  > - Transaction Management - Declarative Transaction Management - Using @Transactional with AspectJ
  > - Transaction Management - Programmatic Transaction Management
  > - Transaction Management - Choosing Between Programmatic and Declarative Transaction Management
  > - Transaction Management - Transaction-bound Events
  > - Transaction Management - Application server-specific integration
  > - Transaction Management - Solutions to Common Problems
  > - Transaction Management - Further Resources
  > - DAO Support
  > - Data Access with JDBC
  > - Data Access with JDBC - Choosing an Approach for JDBC Database Access
  > - Data Access with JDBC - Package Hierarchy
  > - Data Access with JDBC - Using the JDBC Core Classes to Control Basic JDBC Processing and Error Handling
  > - Data Access with JDBC - Controlling Database Connections
  > - Data Access with JDBC - JDBC Batch Operations
  > - Data Access with JDBC - Simplifying JDBC Operations with the SimpleJdbc Classes
  > - Data Access with JDBC - Modeling JDBC Operations as Java Objects
  > - Data Access with JDBC - Common Problems with Parameter and Data Value Handling
  > - Data Access with JDBC - Embedded Database Support
  > - Data Access with JDBC - Initializing a DataSource
  > - Data Access with R2DBC
  > - Object Relational Mapping (ORM) Data Access
  > - Object Relational Mapping (ORM) Data Access - Introduction to ORM with Spring
  > - Object Relational Mapping (ORM) Data Access - General ORM Integration Considerations
  > - Object Relational Mapping (ORM) Data Access - Hibernate
  > - Object Relational Mapping (ORM) Data Access - JPA
  > - Marshalling XML by Using Object-XML Mappers
  > - Appendix

- Web on Servlet Stack

  > - [Spring Web MVC - DispatcherServlet](#spring-web-mvc---dispatcherservlet)
  > - [Spring Web MVC - DispatcherServlet - Context Hierarchy](#spring-web-mvc---dispatcherservlet---context-hierarchy)
  > - [Spring Web MVC - DispatcherServlet - Special Bean Types](#spring-web-mvc---dispatcherservlet---special-bean-types)
  > - [Spring Web MVC - DispatcherServlet - Web MVC Config](#spring-web-mvc---dispatcherservlet---web-mvc-config)
  > - Spring Web MVC - DispatcherServlet - Servlet Config
  > - Spring Web MVC - DispatcherServlet - Processing
  > - Spring Web MVC - DispatcherServlet - Path Matching
  > - Spring Web MVC - DispatcherServlet - Interception
  > - Spring Web MVC - DispatcherServlet - Exceptions
  > - Spring Web MVC - DispatcherServlet - View Resolution
  > - Spring Web MVC - DispatcherServlet - Locale
  > - Spring Web MVC - DispatcherServlet - Themes
  > - Spring Web MVC - DispatcherServlet - Multipart Resolver
  > - Spring Web MVC - DispatcherServlet - Logging
  > - Spring Web MVC - Filters
  > - [Spring Web MVC - Annotated Controllers](#spring-web-mvc---annotated-controllers)
  > - Spring Web MVC - Annotated Controllers - Declaration
  > - [Spring Web MVC - Annotated Controllers - Mapping Requests](#spring-web-mvc---annotated-controllers---mapping-requests)
  > - Spring Web MVC - Annotated Controllers - Handler Methods
  > - Spring Web MVC - Annotated Controllers - Handler Methods - Method Arguments
  > - Spring Web MVC - Annotated Controllers - Handler Methods - Return Values
  > - Spring Web MVC - Annotated Controllers - Handler Methods - Type Conversion
  > - Spring Web MVC - Annotated Controllers - Handler Methods - Matrix Variables
  > - Spring Web MVC - Annotated Controllers - Handler Methods - @RequestParam
  > - Spring Web MVC - Annotated Controllers - Handler Methods - @RequestHeader
  > - Spring Web MVC - Annotated Controllers - Handler Methods - @CookieValue
  > - Spring Web MVC - Annotated Controllers - Handler Methods - @ModelAttribute
  > - Spring Web MVC - Annotated Controllers - Handler Methods - @SessionAttributes
  > - Spring Web MVC - Annotated Controllers - Handler Methods - @SessionAttribute
  > - Spring Web MVC - Annotated Controllers - Handler Methods - @RequestAttribute
  > - Spring Web MVC - Annotated Controllers - Handler Methods - Redirect Attributes
  > - Spring Web MVC - Annotated Controllers - Handler Methods - Flash Attributes
  > - Spring Web MVC - Annotated Controllers - Handler Methods - Multipart
  > - Spring Web MVC - Annotated Controllers - Handler Methods - @RequestBody
  > - Spring Web MVC - Annotated Controllers - Handler Methods - HttpEntity
  > - Spring Web MVC - Annotated Controllers - Handler Methods - @ResponseBody
  > - Spring Web MVC - Annotated Controllers - Handler Methods - ResponseEntity
  > - Spring Web MVC - Annotated Controllers - Handler Methods - Jackson JSON
  > - Spring Web MVC - Annotated Controllers - Model
  > - Spring Web MVC - Annotated Controllers - @InitBinder
  > - Spring Web MVC - Annotated Controllers - Validation
  > - Spring Web MVC - Annotated Controllers - Exceptions
  > - Spring Web MVC - Annotated Controllers - Controller Advice
  > - Spring Web MVC - Functional Endpoints
  > - Spring Web MVC - URI Links
  > - Spring Web MVC - Asynchronous Requests
  > - Spring Web MVC - CORS
  > - Spring Web MVC - Error Responses
  > - Spring Web MVC - Web Security
  > - Spring Web MVC - HTTP Caching
  > - Spring Web MVC - View Technologies
  > - Spring Web MVC - View Technologies - Thymeleaf
  > - Spring Web MVC - View Technologies - FreeMarker
  > - Spring Web MVC - View Technologies - Groovy Markup
  > - Spring Web MVC - View Technologies - Script Views
  > - Spring Web MVC - View Technologies - JSP and JSTL
  > - Spring Web MVC - View Technologies - RSS and Atom
  > - Spring Web MVC - View Technologies - PDF and Excel
  > - Spring Web MVC - View Technologies - Jackson
  > - Spring Web MVC - View Technologies - XML Marshalling
  > - Spring Web MVC - View Technologies - XSLT Views
  > - Spring Web MVC - MVC Config
  > - Spring Web MVC - MVC Config - Enable MVC Configuration
  > - Spring Web MVC - MVC Config - MVC Config API
  > - Spring Web MVC - MVC Config - Type Conversion
  > - Spring Web MVC - MVC Config - Validation
  > - Spring Web MVC - MVC Config - Interceptors
  > - Spring Web MVC - MVC Config - Content Types
  > - Spring Web MVC - MVC Config - Message Converters
  > - Spring Web MVC - MVC Config - View Controllers
  > - Spring Web MVC - MVC Config - View Resolvers
  > - Spring Web MVC - MVC Config - Static Resources
  > - Spring Web MVC - MVC Config - Default Servlet
  > - Spring Web MVC - MVC Config - Path Matching
  > - Spring Web MVC - MVC Config - Advanced Java Config
  > - Spring Web MVC - MVC Config - Advanced XML Config
  > - Spring Web MVC - HTTP/2
  > - REST Clients
  > - Testing
  > - WebSockets
  > - WebSockets - WebSocket API
  > - WebSockets - SockJS Fallback
  > - WebSockets - STOMP
  > - WebSockets - STOMP - Overview
  > - WebSockets - STOMP - Benefits
  > - WebSockets - STOMP - Enable STOMP
  > - WebSockets - STOMP - WebSocket Transport
  > - WebSockets - STOMP - Flow of Messages
  > - WebSockets - STOMP - Annotated Controllers
  > - WebSockets - STOMP - Sending Messages
  > - WebSockets - STOMP - Simple Broker
  > - WebSockets - STOMP - External Broker
  > - WebSockets - STOMP - Connecting to a Broker
  > - WebSockets - STOMP - Dots as Separators
  > - WebSockets - STOMP - Authentication
  > - WebSockets - STOMP - Token Authentication
  > - WebSockets - STOMP - Authorization
  > - WebSockets - STOMP - User Destinations
  > - WebSockets - STOMP - Order of Messages
  > - WebSockets - STOMP - Events
  > - WebSockets - STOMP - Interception
  > - WebSockets - STOMP - WebSocket Scope
  > - WebSockets - STOMP - STOMP Client
  > - WebSockets - STOMP - WebSocket Scope
  > - WebSockets - STOMP - Performance
  > - WebSockets - STOMP - Monitoring
  > - WebSockets - STOMP - Testing
  > - Other Web Frameworks

- Web on Reactive Stack

  > - Spring WebFlux
  > - Spring WebFlux - Overview
  > - Spring WebFlux - Reactive Core
  > - Spring WebFlux - DispatcherHandler
  > - Spring WebFlux - Annotated Controllers
  > - Spring WebFlux - Annotated Controllers - @Controller
  > - Spring WebFlux - Annotated Controllers - Mapping Requests
  > - Spring WebFlux - Annotated Controllers - Handler Methods
  > - Spring WebFlux - Annotated Controllers - Handler Methods - Method Arguments
  > - Spring WebFlux - Annotated Controllers - Handler Methods - Return Values
  > - Spring WebFlux - Annotated Controllers - Handler Methods - Type Conversion
  > - Spring WebFlux - Annotated Controllers - Handler Methods - Matrix Variables
  > - Spring WebFlux - Annotated Controllers - Handler Methods - @RequestParam
  > - Spring WebFlux - Annotated Controllers - Handler Methods - @RequestHeader
  > - Spring WebFlux - Annotated Controllers - Handler Methods - @CookieValue
  > - Spring WebFlux - Annotated Controllers - Handler Methods - @ModelAttribute
  > - Spring WebFlux - Annotated Controllers - Handler Methods - @SessionAttributes
  > - Spring WebFlux - Annotated Controllers - Handler Methods - @SessionAttribute
  > - Spring WebFlux - Annotated Controllers - Handler Methods - @RequestAttribute
  > - Spring WebFlux - Annotated Controllers - Handler Methods - Multipart Content
  > - Spring WebFlux - Annotated Controllers - Handler Methods - @RequestBody
  > - Spring WebFlux - Annotated Controllers - Handler Methods - HttpEntity
  > - Spring WebFlux - Annotated Controllers - Handler Methods - @ResponseBody
  > - Spring WebFlux - Annotated Controllers - Handler Methods - ResponseEntity
  > - Spring WebFlux - Annotated Controllers - Handler Methods - Jackson JSON
  > - Spring WebFlux - Annotated Controllers - Model
  > - Spring WebFlux - Annotated Controllers - DataBinder
  > - Spring WebFlux - Annotated Controllers - Validation
  > - Spring WebFlux - Annotated Controllers - Exceptions
  > - Spring WebFlux - Annotated Controllers - Controller Advice
  > - Spring WebFlux - Functional Endpoints
  > - Spring WebFlux - URI Links
  > - Spring WebFlux - CORS
  > - Spring WebFlux - Error Responses
  > - Spring WebFlux - Web Security
  > - Spring WebFlux - HTTP Caching
  > - Spring WebFlux - View Technologies
  > - Spring WebFlux - WebFlux Config
  > - Spring WebFlux - HTTP/2
  > - WebClient
  > - WebClient - Configuration
  > - WebClient - retrieve()
  > - WebClient - Exchange
  > - WebClient - Request Body
  > - WebClient - Filters
  > - WebClient - Attributes
  > - WebClient - Context
  > - WebClient - Synchronous Use
  > - WebClient - Testing
  > - HTTP Interface Client
  > - WebSockets
  > - Testing
  > - RSocket
  > - Reactive Libraries

- Integration

  > - REST Clients
  > - JMS (Java Message Service)
  > - JMS (Java Message Service) - Using Spring JMS
  > - JMS (Java Message Service) - Sending a Message
  > - JMS (Java Message Service) - Receiving a Message
  > - JMS (Java Message Service) - Support for JCA Message Endpoints
  > - JMS (Java Message Service) - Annotation-driven Listener Endpoints
  > - JMS (Java Message Service) - JMS Namespace Support
  > - JMX
  > - JMX - Exporting Your Beans to JMX
  > - JMX - Controlling the Management Interface of Your Beans
  > - JMX - Controlling ObjectName Instances for Your Beans
  > - JMX - Using JSR-160 Connectors
  > - JMX - Accessing MBeans through Proxies
  > - JMX - Notifications
  > - JMX - Further Resources
  > - Email
  > - Task Execution and Scheduling
  > - Cache Abstraction
  > - Cache Abstraction - Understanding the Cache Abstraction
  > - Declarative Annotation-based Caching
  > - Cache Abstraction - JCache (JSR-107) Annotations
  > - Cache Abstraction - Declarative XML-based Caching
  > - Cache Abstraction - Configuring the Cache Storage
  > - Cache Abstraction - Plugging-in Different Back-end Caches
  > - Cache Abstraction - How can I Set the TTL/TTI/Eviction policy/XXX feature?
  > - Observability Support
  > - JVM Checkpoint Restore
  > - CDS
  > - Appendix

## The IoC Container - Introduction to the Spring IoC Container and Beans

### 개요

- Spring IoC 컨테이너와 빈(Bean)은 스프링 프레임워크의 핵심 개념 중 하나. IoC는 Inversion of Control의 약자로, 제어의 역전을 의미함. 스프링 IoC 컨테이너는 애플리케이션의 객체 생성, 의존성 관리, 생명주기 관리 등을 담당함.

### 빈(Bean)

- 빈은 스프링 IoC 컨테이너에 의해 관리되는 객체를 말함.
- 스프링에서는 POJO(Plain Old Java Object)를 빈으로 사용할 수 있음.
- 빈은 일반적으로 싱글톤 스코프로 생성되며, 애플리케이션 전체에서 공유됨.

### 빈 설정

- 빈은 XML 설정 파일, 자바 어노테이션, 자바 설정 클래스 등을 통해 정의할 수 있음.
- XML 설정 파일에서는 `<bean>` 태그를 사용하여 빈을 정의함.
- 자바 어노테이션을 사용할 경우, `@Component`, `@Service`, `@Repository`, `@Controller` 등의 어노테이션을 클래스에 적용하여 빈으로 등록할 수 있음.
- 자바 설정 클래스에서는 `@Configuration` 어노테이션을 사용하고, 빈을 정의하는 메서드에 `@Bean` 어노테이션을 적용함.

### 기본적으로 등록되어 있는 Bean

- `org.springframework.context.annotation.internalConfigurationAnnotationProcessor`: `@Configuration` 어노테이션 처리를 위한 빈
- `org.springframework.context.annotation.internalAutowiredAnnotationProcessor`: `@Autowired` 어노테이션 처리를 위한 빈
- `org.springframework.context.annotation.internalCommonAnnotationProcessor`: `@PostConstruct`, `@PreDestroy` 등의 어노테이션 처리를 위한 빈
- `org.springframework.context.event.internalEventListenerProcessor`: 이벤트 리스너 처리를 위한 빈
- `org.springframework.context.event.internalEventListenerFactory`: 이벤트 리스너 팩토리 빈

### 의존성 주입(Dependency Injection)

- 스프링 IoC 컨테이너는 의존성 주입을 통해 빈 간의 의존 관계를 관리함.
- 의존성 주입은 생성자 주입, 세터 주입, 필드 주입 등의 방식으로 이루어짐.
- 생성자 주입은 생성자의 매개변수를 통해 의존성을 주입받음.
- 세터 주입은 세터 메서드를 통해 의존성을 주입받음.
- 필드 주입은 필드에 `@Autowired` 어노테이션을 사용하여 의존성을 주입받음.

### IoC 컨테이너 초기화

- 스프링 IoC 컨테이너는 ApplicationContext 인터페이스를 구현한 클래스로 표현됨.
- ClassPathXmlApplicationContext, AnnotationConfigApplicationContext 등의 구현체를 사용하여 IoC 컨테이너를 초기화할 수 있음.
- IoC 컨테이너 초기화 시점에 빈이 생성되고, 의존성 주입이 이루어짐.

## BeanFactory와 ApplicationContext의 관계

- BeanFactory는 스프링 IoC 컨테이너의 최상위 인터페이스.
- ApplicationContext는 BeanFactory를 확장한 인터페이스로, BeanFactory의 모든 기능을 포함하며 추가적인 기능을 제공함.
- ApplicationContext는 BeanFactory에 비해 더 많은 기능과 편의성을 제공하는 고급 컨테이너.
- 일반적으로 스프링 애플리케이션에서는 ApplicationContext를 사용하며, BeanFactory는 저수준의 기능을 필요로 할 때 직접 사용됨.

### 빈 생명주기

- 스프링 IoC 컨테이너는 빈의 생명주기를 관리함.
- 빈 생성 → 의존성 주입 → 초기화 → 사용 → 소멸의 과정을 거침.
- `@PostConstruct`, `@PreDestroy` 어노테이션을 사용하여 빈의 초기화와 소멸 시점에 커스텀 로직을 실행할 수 있음.

### [예제 코드](https://github.com/foreverfl/study-java-springDocumentation/blob/main/src/main/java/com/example/springDocumentation/BeanCountApplication.java)

1. `bean` 패키지에 `MyBean1.java`, `MyBean2.java`를 생성.
2. `config` 패키지에 `AppConfig.java`를 생성하고 `MyBean1.java`와 `MyBean2.java`를 각각 Bean으로 등록함.
3. `BeanCountApplication.java`에서 등록된 Bean이 기본 Bean 5개, Configuration Bean 1개, 등록한 Bean 2개로 총 8개임을 알 수 있음.

## The IoC Container - Container Overview

### 개요

![The_Spring_IoC_Container](description_img/The_Spring_IoC_Container.png)

- 스프링 IoC 컨테이너는 애플리케이션의 중심으로, 객체의 생성, 설정, 관리를 담당함.
- 컨테이너는 설정 메타데이터(Configuration Metadata)를 읽어들여 애플리케이션을 구성하고 빈(Bean) 객체를 생성함.
- 설정 메타데이터는 XML, 자바 어노테이션, 자바 코드 등의 형태로 제공될 수 있음.
- `ApplicationContext`는 스프링 IoC 컨테이너의 핵심 인터페이스 중 하나. `ApplicationContext`는 `BeanFactory` 인터페이스를 상속받아 확장한 인터페이스로, 스프링 컨테이너의 기능을 제공함.
- 스프링에서 제공하는 ApplicationContext의 주요 구현체로는 다음과 같은 것들이 있음.
  > - `ClassPathXmlApplicationContext`: 클래스패스에 있는 XML 설정 파일을 사용하여 컨테이너를 생성함.
  > - `FileSystemXmlApplicationContext`: 파일 시스템에 있는 XML 설정 파일을 사용하여 컨테이너를 생성함.
  > - `AnnotationConfigApplicationContext`: 자바 어노테이션 기반의 설정 클래스를 사용하여 컨테이너를 생성함.

### 설정 메타데이터 (Configuration Metadata)

- 설정 메타데이터는 애플리케이션의 객체와 객체 간의 의존 관계를 정의함.
- XML 기반의 설정, 자바 어노테이션 기반의 설정, 자바 코드 기반의 설정 등 다양한 형식으로 작성할 수 있음.
- 전통적으로는 XML 기반의 설정이 사용되었지만, 최근에는 자바 코드 기반의 설정이 주로 사용됨.
- 설정 메타데이터는 컨테이너가 애플리케이션을 구성하고 객체를 생성하는 데 사용됨. 설정을 위해서 `@Configuration`, `@Bean`, `@Import`, 그리고 `@DependsOn`의 어노테이션이 사용됨.

### 컨테이너 인스턴스화 (Instantiating a Container)

- 스프링 IoC 컨테이너는 ApplicationContext 인터페이스의 구현체로 제공됨.
- ClassPathXmlApplicationContext나 AnnotationConfigApplicationContext 등의 구현체를 사용하여 컨테이너를 생성할 수 있음.
- 컨테이너 인스턴스화 시점에 설정 메타데이터를 로드하고 빈 객체를 생성함.
- ClassPathXmlApplicationContext를 사용할 때 XML 파일의 경로를 지정하면 클래스패스를 기준으로 파일을 찾음. 일반적으로 XML 설정 파일은 src/main/resources 디렉토리에 위치시키는 것이 관례. 이 디렉토리는 빌드 시 클래스패스에 포함되므로 스프링 컨테이너가 해당 파일을 찾을 수 있음.

### XML 기반 설정 메타데이터 작성 (Composing XML-based Configuration Metadata)

- XML 파일을 사용하여 빈 객체와 객체 간의 의존 관계를 정의할 수 있음.
- <bean> 태그를 사용하여 빈 객체를 정의하고, <property> 태그나 <constructor-arg> 태그를 사용하여 의존 관계를 설정함.
- XML 설정 파일은 모듈화와 재사용성을 높이기 위해 여러 개로 분할할 수 있음.

### Groovy Bean Definition DSL

- Groovy 언어의 DSL(Domain-Specific Language)을 사용하여 빈 객체를 정의할 수 있음.
- Groovy DSL은 XML 설정과 유사한 구조를 가지며, 좀 더 간결하고 유연한 방식으로 빈을 정의할 수 있음.
- Groovy DSL은 스프링 설정을 동적으로 생성하거나 수정할 때 유용함.

### 컨테이너 사용 (Using the Container)

- 스프링 IoC 컨테이너는 빈 객체의 생성, 의존 관계 주입, 생명주기 관리 등을 담당함.
- 애플리케이션 코드에서는 컨테이너에 의해 관리되는 빈 객체를 사용하여 로직을 구현함.
- 컨테이너를 사용하면 객체 생성과 의존 관계 관리를 애플리케이션 코드에서 분리할 수 있어 모듈화와 유지보수성이 향상됨.

### [예제 코드](https://github.com/foreverfl/study-java-springDocumentation/blob/main/src/main/java/com/example/springDocumentation/BeanCountApplicationInXML.java)

1. `bean` 패키지에 `MyBean1.java`, `MyBean2.java`를 생성.
2. `resources`에 `AppConfig.XML`를 생성하고 bean 패키지에 있는 파일들을 각각 Bean으로 등록함.
3. `BeanCountApplicationXL.java`에서 등록된 Bean이 기본 Bean 5개, Configuration Bean 1개, 등록한 Bean 2개로 총 8개임을 알 수 있음. 또한 `MyBean1.java`에 생성한 내부 클래스가 출력됨을 알 수 있음.

## The IoC Container - Bean Overview

### 개요

- 빈(Bean)은 스프링 IoC 컨테이너에 의해 관리되는 객체. 스프링에서는 애플리케이션의 핵심 컴포넌트를 빈으로 정의하고, 컨테이너가 빈의 생성, 의존성 주입, 생명주기 관리 등을 담당함. 빈은 일반적으로 자바 클래스로 구현되며, POJO(Plain Old Java Object) 형태로 작성됨. 스프링 컨테이너는 빈 설정 메타데이터를 기반으로 빈 인스턴스를 생성하고, 의존성을 주입하며, 빈의 생명주기를 관리함.
- `BeanDefinition` 객체는 스프링 컨테이너 내부에서 빈을 정의하는 데 사용되는 객체. 이 객체는 빈의 메타데이터를 포함하고 있으며, 스프링 컨테이너는 이 메타데이터를 기반으로 빈을 생성하고 관리함.
- `@Bean`, `@Controller`, `@Service`, `@Component` 등의 어노테이션을 사용하여 클래스를 빈으로 등록하면, 스프링 컨테이너는 해당 클래스의 정보를 기반으로 BeanDefinition 객체를 생성함.
- `BeanDefinition` 객체는 다음과 같은 메타데이터를 포함함.
  > - **빈의 클래스 이름 (패키지 경로 포함)**: 빈으로 정의된 클래스의 실제 구현 클래스 이름.
  > - **빈의 동작 설정**: 빈이 컨테이너에서 어떻게 동작해야 하는지에 대한 정보. 예를 들어 빈의 스코프(싱글톤, 프로토타입 등), 라이프사이클 콜백(초기화 메서드, 소멸 메서드 등) 등이 포함됨.
  > - **의존성 참조**: 빈이 의존하는 다른 빈에 대한 참조. 이를 통해 의존성 주입(Dependency Injection)이 이루어짐.
  > - **기타 설정**: 빈의 프로퍼티 값, 풀의 크기 제한, 커넥션 수 등 빈 생성 시 필요한 추가적인 설정 정보.
- 기존의 메타데이터와 싱글톤 인스턴스를 오버라이드하는 것은 어느 정도 지원되지만, 런타임에 새로운 빈을 등록하는 것은 공식적으로 지원되지 않음. 런타임에 빈을 등록하면 컨테이너에 동시 접근이 발생할 수 있으며, 이로 인해 동시성 문제(concurrent access exceptions)나 빈 컨테이너의 상태 불일치(inconsistent state) 문제가 발생할 수 있음. 따라서 가능한 한 빈의 등록은 애플리케이션 초기화 시점에 이루어져야 하며, 런타임에 동적으로 빈을 등록하는 것은 피하는 것이 좋음. 스프링 컨테이너는 초기화 시점에 빈의 메타데이터를 분석하고 처리하여 일관된 상태를 유지하므로, 런타임에 새로운 빈을 등록하면 이러한 일관성이 깨질 수 있음.

### Naming Beans

- 모든 빈은 하나 이상의 식별자를 가져야 함. 이러한 식별자는 빈을 고유하게 식별하는 데 사용됨. 빈의 식별자는 XML 설정에서는 id 속성이나 name 속성으로 지정할 수 있음. 자바 설정에서는 `@Bean` 어노테이션의 `name` 속성을 사용하여 빈의 이름을 지정할 수 있음. 빈의 이름은 컨테이너 내에서 고유해야 하며, 일반적으로 소문자로 시작하고 카멜 케이스(camelCase) 규칙을 따름.
- id 속성

  > - 빈의 고유한 식별자를 지정하는 데 사용됨.
  > - id 속성의 값은 빈의 유일한 이름이며, 컨테이너 내에서 고유해야 함.
  > - id 속성은 하나의 값만 가질 수 있음.
  > - id 속성은 XML 스키마에 의해 제약을 받음. 유효한 XML 식별자 규칙을 따라야 함. (예: 공백 문자를 포함할 수 없음)

- name 속성

  > - 빈의 하나 이상의 별칭을 지정하는 데 사용됨.
  > - name 속성은 빈의 추가적인 이름을 지정할 때 사용됨.
  > - name 속성은 여러 개의 값을 가질 수 있으며, 쉼표(,), 세미콜론(;), 공백 문자로 구분할 수 있음.
  > - name 속성은 id 속성보다 더 유연한 명명 규칙을 허용함. (예: 공백 문자 포함 가능)

- id와 name 속성이 모두 생략된 경우
  > - 스프링 컨테이너는 클래스 이름을 기반으로 빈의 이름을 생성함.
  > - 클래스 이름의 첫 글자를 소문자로 변환한 형태가 빈의 이름으로 사용됨.
  > - 예를 들어, com.example.MyBean 클래스의 경우 빈의 이름은 myBean이 됨.
  > - 이렇게 자동 생성된 빈의 이름은 컨테이너 내에서 고유해야 함.
  > - 자동 생성된 빈의 이름을 사용하여 빈을 참조할 수 있음.
- XML 예제

```xml
<bean id="myBean" name="alias1, alias2" class="com.example.MyBean">
  <!-- ... -->
</bean>
```

- 어노테이션 예제

```java
// 메소드 명인 'myBean'이 id로 사용됨
@Bean(name = {"myBean", "alias1", "alias2"})
public MyBean myBean() {
  return new MyBean();
}
```

### Aliasing a Bean outside the Bean Definition

- 빈에는 별칭(alias)을 지정할 수 있음. 별칭은 빈의 실제 이름과 다른 이름으로 빈을 참조할 수 있게 해줌. 이는 같은 빈을 다른 이름으로 사용해야 하는 경우에 유용함. XML 설정에서는 `<alias>` 태그를 사용하여 빈의 별칭을 정의할 수 있음. 자바 설정에서는 `@Bean` 어노테이션의 `name` 속성에 여러 개의 이름을 지정하여 별칭을 정의할 수 있음. 별칭은 빈의 실제 이름과 동일한 방식으로 사용할 수 있음.
- 별칭을 사용하는 것은 다음과 같은 이점이 있음.

  > - 서브시스템 간의 빈 이름 충돌을 방지할 수 있음. 서브시스템마다 고유한 명명 규칙을 사용할 수 있으며, 메인 애플리케이션에서는 별칭을 사용하여 충돌을 피할 수 있음.
  > - 서브시스템의 빈 이름을 변경하더라도 메인 애플리케이션의 설정을 변경하지 않아도 됨. 별칭을 사용하면 서브시스템의 빈 이름이 변경되어도 메인 애플리케이션에서는 별칭을 통해 동일한 빈을 참조할 수 있음.
  > - 서로 다른 컨텍스트나 설정 파일에서 동일한 빈을 참조할 때 별칭을 사용하면 코드의 가독성과 유지보수성을 높일 수 있음.

- 예제

```xml
<alias name="myApp-dataSource" alias="subsystemA-dataSource"/>
<alias name="myApp-dataSource" alias="subsystemB-dataSource"/>
```

### Instantiating Beans

- 스프링은 다양한 방법으로 빈을 인스턴스화할 수 있음. 가장 일반적인 방법은 빈 클래스의 기본 생성자를 사용하는 것. 스프링 컨테이너는 빈 클래스의 인스턴스를 생성하고, 필요한 의존성을 주입함. 또한 정적 팩토리 메서드나 인스턴스 팩토리 메서드를 사용하여 빈을 생성할 수도 있음. 이러한 방법을 사용하면 객체 생성 로직을 커스터마이즈할 수 있음.
- 생성된 Bean을 인스턴스화 하는 것은 `new` 연산자를 쓰는 것과 동일함.
- 일반적으로 빈은 해당 클래스의 생성자를 통해 생성되지만, 정적 팩토리 메서드를 사용하여 빈을 생성할 수도 있음. 정적 팩토리 메서드를 사용할 때는 해당 메서드가 위치한 클래스를 지정해야 함. 이 클래스는 실제로 빈을 생성하는 클래스일 수도 있고, 다른 클래스일 수도 있음. 스프링 컨테이너는 지정된 클래스의 정적 팩토리 메서드를 호출하여 빈을 생성함. 정적 팩토리 메서드가 반환하는 객체의 타입은 해당 메서드가 위치한 클래스와 동일할 수도 있고, 완전히 다른 클래스일 수도 있음. 이는 정적 팩토리 메서드를 사용하여 다양한 타입의 객체를 생성할 수 있음을 의미함.
- 내부에 포함된 static한 클래스테임을 가져올 경우에는 `$`나 `.`을 사용함. `com.example.SomeThing$OtherThing` 또는 `com.example.SomeThing.OtherThing`와 같은 식으로 사용 가능함.

### Instantiation with a Constructor

- 일반적인 클래스를 사용하여 빈을 생성할 때 사용됨.
- 클래스가 특정 인터페이스를 구현하거나 특정 방식으로 코딩될 필요는 없음.
- 빈 클래스를 지정하는 것만으로 충분함.
- 사용하는 IoC 유형에 따라 기본 생성자(인자가 없는 생성자)가 필요할 수 있음.
- XML 기반 설정에서는 `<bean>` 태그의 `class` 속성을 사용하여 빈 클래스를 지정함.

### Instantiation with a Static Factory Method

- 정적 팩토리 메서드를 사용하여 빈을 생성할 때 사용됨.
- `class` 속성에는 정적 팩토리 메서드가 포함된 클래스를 지정하고, `factory-method` 속성에는 팩토리 메서드의 이름을 지정함.
- 팩토리 메서드를 호출하여 객체를 반환받고, 이를 생성자를 통해 생성된 것처럼 다룸.
- 레거시 코드에서 정적 팩토리를 호출하는 데 사용될 수 있음.

### Instantiation by Using an Instance Factory Method

- 기존 빈의 인스턴스 팩토리 메서드를 사용하여 새로운 빈을 생성할 때 사용됨.
- `class` 속성은 비워두고, `factory-bean` 속성에는 인스턴스 메서드를 포함하는 빈의 이름을 지정함.
- `factory-method` 속성에는 호출할 인스턴스 메서드의 이름을 지정함.
- 하나의 팩토리 클래스에 여러 개의 팩토리 메서드를 가질 수 있음.
- 팩토리 빈 자체도 의존성 주입(DI)을 통해 관리되고 구성될 수 있음.

### Determining a Bean’s Runtime Type

- 스프링 문서에서 `factory bean`은 인스턴스 또는 정적 팩토리 메서드를 통해 객체를 생성하도록 스프링 컨테이너에 구성된 빈을 의미함. 반면에 `FactoryBean`은 스프링에서 제공하는 특정 인터페이스를 구현한 클래스를 의미함.
- 빈의 실제 런타임 타입을 결정하는 것은 간단하지 않음. 빈 메타데이터 정의에 지정된 클래스는 초기 클래스 참조일 뿐이며, 팩토리 메서드나 `FactoryBean` 클래스와 결합되어 실제 런타임 타입과 다를 수 있음. 또한 AOP 프록시가 빈 인스턴스를 래핑하여 실제 타입의 노출을 제한할 수 있음.
- 특정 빈의 실제 런타임 타입을 알아내는 권장 방법은 `BeanFactory.getType` 메서드를 사용하는 것. 이 메서드는 위의 모든 경우를 고려하여 동일한 빈 이름에 대해 `BeanFactory.getBean` 호출이 반환할 객체의 타입을 반환함.

## The IoC Container - Dependencies - Dependency Injection

- 의존성 주입(Dependency Injection)은 팩토리 메서드를 향한 생성자 인자 또는 객체 인스턴스에 설정(set)되는 속성을 통해서 객체가 의존성을 주입하는 과정을 의미함.
- 의존성 주입(Dependency Injection)을 통해서 코드는 결합도가 낮아짐.
- 객체는 의존성을 찾지 않고 위치 또는 의존성의 클래스에 대해서도 알지 못함. 결과적으로, 클래스는 테스트하기에 용이해짐.

### 생성자 기반 의존성 주입 (Constructor-based Dependency Injection)

- 생성자를 통해 객체의 의존성을 주입하는 방법.
- 정적 팩토리 메서드(static factory method)를 사용하여 빈(bean)을 생성하는 것과 생성자(constructor)를 사용하여 빈을 생성하는 것이 거의 동등함.
- 객체 생성 시점에 필요한 의존성을 모두 받아와서 객체를 초기화함.
- 의존성이 필수적으로 필요한 경우에 적합함.
- 스프링 4.3부터는 클래스에 생성자가 하나만 있고, 그 생성자의 매개변수가 빈으로 등록된 타입이라면 @Autowired 어노테이션을 생략할 수 있음. 따라서 @Autowired가 명시되어 있지 않아도 스프링 컨테이너는 해당 생성자를 사용하여 의존성을 주입함.
- 예제 코드

```java
public class SimpleMovieLister {

	// the SimpleMovieLister은 MovieFinder에 대해서 의존성을 가짐
	private final MovieFinder movieFinder;

	// 컨테이너가 MovideFinder를 주입할 수 있도록 하는 생성자
	public SimpleMovieLister(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}

	// 주입된 MovideFinder를 사용하는 비즈니스 로직은 생략
}
```

### 생성자 인자 해결 (Constructor Argument Resolution)

- 스프링 컨테이너가 빈을 인스턴스화할 때 생성자 인수를 해석하고 매칭하는 방법.

#### 타입에 의한 매칭

- 생성자 인수의 타입을 기반으로 매칭이 이루어짐.
- 생성자 인수에 모호성이 없다면 빈 정의에서 인수를 정의한 순서대로 생성자에 전달됨.
- 예를 들어, `ThingOne` 클래스의 생성자가 `ThingTwo`와 `ThingThree` 타입의 인수를 받고, 이 클래스들이 상속 관계가 아니라면 모호성이 없으므로 별도의 설정 없이 빈 정의에서 인수의 순서대로 생성자에 전달됨. 아래 예제에서는 확실하게 순서가 정해져 있으므로 `<constructor-arg>`을 설정할 필요는 없음.
- 예제 코드

```java
package x.y;

public class ThingOne {

	public ThingOne(ThingTwo thingTwo, ThingThree thingThree) {
		// ...
	}
}
```

```xml
<beans>
	<bean id="beanOne" class="x.y.ThingOne">
		<constructor-arg ref="beanTwo"/>
		<constructor-arg ref="beanThree"/>
	</bean>

	<bean id="beanTwo" class="x.y.ThingTwo"/>

	<bean id="beanThree" class="x.y.ThingThree"/>
</beans>
```

#### 단순 타입의 경우

- 단순 타입(예: `int`, `String` 등)을 사용할 때는 스프링이 타입을 결정할 수 없으므로 타입에 의한 매칭이 불가능함.
- 이 경우, `type` 속성을 사용하여 명시적으로 생성자 인수의 타입을 지정해야 함.
- 예를 들어, `ExampleBean` 클래스의 생성자가 int와 String 타입의 인수를 받는다면 `<constructor-arg>` 요소에 `type` 속성을 사용하여 타입을 명시해야 합니다.

```java
package examples;

public class ExampleBean {

	// Number of years to calculate the Ultimate Answer
	private final int years;

	// The Answer to Life, the Universe, and Everything
	private final String ultimateAnswer;

	public ExampleBean(int years, String ultimateAnswer) {
		this.years = years;
		this.ultimateAnswer = ultimateAnswer;
	}
}
```

```xml
<bean id="exampleBean" class="examples.ExampleBean">
	<constructor-arg type="int" value="7500000"/>
	<constructor-arg type="java.lang.String" value="42"/>
</bean>
```

#### 인덱스를 사용한 매칭

- `index` 속성을 사용하여 생성자 인수의 인덱스를 명시적으로 지정할 수 있음.
- 인덱스는 0부터 시작함.
- 이는 단순 값의 모호성을 해결할 뿐만 아니라, 생성자에 동일한 타입의 인수가 여러 개 있을 때도 모호성을 해결할 수 있음.
- 예제 코드

```xml
<bean id="exampleBean" class="examples.ExampleBean">
	<constructor-arg index="0" value="7500000"/>
	<constructor-arg index="1" value="42"/>
</bean>
```

#### 생성자 인수 이름을 사용한 매칭

- 생성자 인수의 이름을 사용하여 값의 모호성을 해결할 수 있음.
- `name` 속성을 사용하여 생성자 인수의 이름을 지정함.
- 이를 위해서는 코드를 디버그 플래그를 사용하여 컴파일해야 하며, 스프링이 생성자에서 인수의 이름을 찾을 수 있어야 함.
- 디버그 플래그를 사용하여 컴파일할 수 없거나 원하지 않는 경우, `@ConstructorProperties` 어노테이션을 사용하여 명시적으로 생성자 인수의 이름을 지정할 수 있음.

```xml
<bean id="exampleBean" class="examples.ExampleBean">
	<constructor-arg name="years" value="7500000"/>
	<constructor-arg name="ultimateAnswer" value="42"/>
</bean>
```

#### Bean의 사용

- 기존에는 XML 설정 파일을 사용하여 빈을 정의하고 의존성을 주입했음.
- 최근에는 어노테이션 기반의 설정을 더 많이 사용하며, `@Configuration` 클래스에서 `@Bean` 어노테이션을 사용하여 빈을 정의하고 의존성을 주입함.

- 예제 코드

```java
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
}
```

```java
@Configuration
public class AppConfig {

    @Bean
    public User user() {
        return new User("John Doe", 30);
    }
}
```

### Setter 기반 의존성 주입 (Setter-based Dependency Injection)

#### 개요

- Setter 기반 의존성 주입은 스프링 컨테이너가 빈의 _기본 생성자_ 또는 인자가 없는 정적 팩토리 메서드를 호출하여 빈을 인스턴스화한 후, 빈의 `setter` 메서드를 호출하여 의존성을 주입하는 방식.
- 순수한 자바 클래스로 구현된 POJO(Plain Old Java Object)에 적용할 수 있으며, 컨테이너 관련 인터페이스, 기본 클래스, 어노테이션 등에 대한 의존성이 없음.

#### 의존성 주입 방식 선택

- 생성자 주입과 `Setter` 주입을 혼용할 수 있음.
- 생성자 주입이 이루어진 후에 `Setter` 주입이 이루어질 수 있음. 의존성은 `BeanDefinition` 형태로 구성되며, `PropertyEditor` 인스턴스와 함께 사용하여 속성을 한 형식에서 다른 형식으로 변환함. 그러나 대부분의 Spring 사용자는 이러한 클래스를 직접(프로그래밍 방식으로) 사용하지 않음.
- 필수적인 의존성은 생성자를 통해 주입하고, 선택적인 의존성은 `Setter` 메서드나 설정 메서드를 통해 주입하는 것이 좋음.
- `@Autowired` 어노테이션을 `Setter` 메서드에 사용하면 해당 프로퍼티를 필수 의존성으로 만들 수 있지만, 생성자 주입과 인자 유효성 검사를 사용하는 것이 더 바람직함.

#### 생성자 주입 vs Setter 주입

- 스프링 팀은 일반적으로 생성자 주입을 권장함.
  > - 애플리케이션 컴포넌트를 불변 객체로 구현할 수 있음.
  > - 필수 의존성이 null이 아님을 보장함.
  > - 생성자 주입된 컴포넌트는 항상 완전히 초기화된 상태로 클라이언트 코드에 반환됨.
- `Setter` 주입은 주로 합리적인 기본값을 설정할 수 있는 선택적 의존성에 사용해야 함.
  > - 그렇지 않으면 의존성을 사용하는 모든 곳에서 not-null 검사를 수행해야 함.
  > - `Setter` 메서드를 사용하면 객체를 나중에 재구성하거나 재주입할 수 있음.
  > - JMX MBean을 통한 관리는 `Setter` 주입의 설득력 있는 사용 사례.

### 의존성 해결 과정 (Dependency Resolution Process)

#### 개요

- `ApplicationContext`는 모든 빈을 설명하는 구성 메타데이터를 사용하여 생성되고 초기화됨. 구성 메타데이터는 XML, Java 코드 또는 어노테이션으로 지정될 수 있음.
- 각 빈에 대해 의존성은 속성, 생성자 인수 또는 정적 팩토리 메서드에 대한 인수의 형태로 표현됨. 이러한 의존성은 빈이 실제로 생성될 때 빈에 제공됨.
- 각 속성 또는 생성자 인수는 설정할 값의 실제 정의이거나 컨테이너의 다른 빈에 대한 참조임.
- 값인 각 속성 또는 생성자 인수는 지정된 형식에서 해당 속성 또는 생성자 인수의 실제 유형으로 변환됨. 기본적으로 Spring은 문자열 형식으로 제공된 값을 `int`, `long`, `String`, `boolean` 등과 같은 모든 기본 제공 유형으로 변환할 수 있음.
- Spring 컨테이너는 컨테이너가 생성될 때 각 빈의 구성을 유효성 검사함. 그러나 빈 속성 자체는 빈이 실제로 생성될 때까지 설정되지 않음.
- 컨테이너가 생성될 때 싱글톤 범위이고 사전 인스턴스화되도록 설정된 빈(기본값)이 생성됨. 그렇지 않으면 요청 시에만 빈이 생성됨.
- 빈을 생성하면 해당 빈의 의존성과 의존성의 의존성이 생성되고 할당되므로 빈의 그래프가 생성될 수 있음. 이러한 의존성 간의 해결 불일치는 영향을 받는 빈이 처음 생성될 때 늦게 나타날 수 있음.

#### 순환 의존성 (Circular dependencies)

- 주로 생성자 주입을 사용하는 경우 해결할 수 없는 순환 의존성 시나리오가 발생할 수 있음.
- 예를 들어, A 클래스가 생성자 주입을 통해 B 클래스의 인스턴스를 필요로 하고 B 클래스도 생성자 주입을 통해 A 클래스의 인스턴스를 필요로 하는 경우. A와 B 클래스의 빈을 서로 주입하도록 구성하면 Spring IoC 컨테이너는 런타임에 이 순환 참조를 감지하고 `BeanCurrentlyInCreationException`을 던짐.
- 한 가지 가능한 해결책은 일부 클래스의 소스 코드를 편집하여 생성자가 아닌 setter로 구성하는 것. 또는 생성자 주입을 피하고 `setter` 주입만 사용하는 것.
- 일반적인 경우(순환 의존성 없음)와 달리 빈 A와 빈 B 사이의 순환 의존성은 한 빈이 완전히 초기화되기 전에 다른 빈에 주입되도록 함.
- Spring은 구성 문제(존재하지 않는 빈에 대한 참조 및 순환 의존성)를 컨테이너 로드 시점에 감지함. Spring은 빈이 실제로 생성될 때 가능한 한 늦게 속성을 설정하고 의존성을 해결함.
- `ApplicationContext` 구현은 기본적으로 싱글톤 빈을 사전 인스턴스화함. 이는 필요한 시점보다 빨리 빈을 생성하는 데 약간의 시간과 메모리가 소요되지만, `ApplicationContext`가 생성될 때 구성 문제를 발견할 수 있음.
- 순환 의존성이 없는 경우, 하나 이상의 협력 빈이 종속 빈에 주입될 때 각 협력 빈은 종속 빈에 주입되기 전에 완전히 구성됨.

### 예제 코드

- 아직 안 만들었어요... 졸려 ㅠㅠ

## The IoC Container - Dependencies - Dependencies and Configuration in Detail

## The IoC Container - Dependencies - Using depends-on

## The IoC Container - Dependencies - Lazy-initialized Beans

## The IoC Container - Dependencies - Autowiring Collaborators

## The IoC Container - Dependencies - Method Injection

## The IoC Container - Bean Scopes

## The IoC Container - Customizing the Nature of a Bean

## The IoC Container - Bean Definition Inheritance

## The IoC Container - Container Extension Points

## The IoC Container - Annotation-based Container Configuration

## The IoC Container - Annotation-based Container Configuration - Using @Autowired

## The IoC Container - Annotation-based Container Configuration - Fine-tuning Annotation-based Autowiring with @Primary

## The IoC Container - Annotation-based Container Configuration - Fine-tuning Annotation-based Autowiring with Qualifiers

## The IoC Container - Annotation-based Container Configuration - Using Generics as Autowiring Qualifiers

## The IoC Container - Annotation-based Container Configuration - Using CustomAutowireConfigurer

## The IoC Container - Annotation-based Container Configuration - Injection with @Resource

## The IoC Container - Annotation-based Container Configuration - Using @Value

## The IoC Container - Annotation-based Container Configuration - Using @PostConstruct and @PreDestroy

## The IoC Container - Classpath Scanning and Managed Components

## The IoC Container - Using JSR 330 Standard Annotations

## The IoC Container - Java-based Container Configuration

## The IoC Container - Java-based Container Configuration - Basic Concepts: @Bean and @Configuration

## The IoC Container - Java-based Container Configuration - Instantiating the Spring Container by Using AnnotationConfigApplicationContext

## The IoC Container - Java-based Container Configuration - Using the @Bean Annotation

## The IoC Container - Java-based Container Configuration - Using the @Configuration annotation

## The IoC Container - Java-based Container Configuration - Composing Java-based Configurations

## The IoC Container - Environment Abstraction

## The IoC Container - Registering a LoadTimeWeaver

## The IoC Container - Additional Capabilities of the ApplicationContext

## The IoC Container - The BeanFactory API

## Resources

## Validation, Data Binding, and Type Conversion

## Validation, Data Binding, and Type Conversion - Validation by Using Spring’s Validator Interface

## Validation, Data Binding, and Type Conversion - Data Binding

## Validation, Data Binding, and Type Conversion - Resolving Codes to Error Messages

## Validation, Data Binding, and Type Conversion - Spring Type Conversion

## Validation, Data Binding, and Type Conversion - Spring Field Formatting

## Validation, Data Binding, and Type Conversion - Configuring a Global Date and Time Format

## Validation, Data Binding, and Type Conversion - Java Bean Validation

## Spring Expression Language (SpEL)

- Spring Expression Language (SpEL)은 Spring 프레임워크에서 제공하는 강력한 표현 언어. 런타임에 객체 그래프를 쿼리하고 조작하는 기능을 지원함. SpEL의 언어 구문은 Jakarta Expression Language와 유사하지만 메서드 호출과 기본적인 문자열 템플릿 기능 등 추가적인 기능을 제공함.
- 다른 Java 표현 언어(OGNL, MVEL, JBoss EL 등)도 있지만, SpEL은 Spring 커뮤니티에 단일하고 잘 지원되는 표현 언어를 제공하기 위해 만들어짐. SpEL은 Spring 포트폴리오의 모든 프로젝트에서 사용될 수 있으며, Eclipse용 Spring Tools에서 코드 자동 완성 지원과 같은 도구 요구 사항에 의해 언어 기능이 결정됨. 그럼에도 불구하고 SpEL은 기술에 구애받지 않는 API를 기반으로 하므로 필요한 경우 다른 표현 언어 구현을 통합할 수 있음.
- SpEL은 Spring 포트폴리오 내에서 표현식 평가의 기반으로 사용되지만 Spring에 직접 연결되어 있지는 않으며 독립적으로 사용할 수 있음. 이 장의 많은 예제에서는 SpEL을 독립적인 표현 언어인 것처럼 사용함. 이를 위해서는 파서와 같은 부트스트래핑 인프라 클래스를 만들어야 함. 대부분의 Spring 사용자는 이러한 인프라를 다룰 필요가 없으며, 대신 평가할 표현식 문자열만 작성하면 됨. 이러한 일반적인 사용의 예로는 XML 또는 어노테이션 기반 빈 정의를 생성할 때 SpEL을 통합하는 것이 있음.
- 여러 곳에서 Inventor와 Society 클래스가 표현식 평가의 대상 객체로 사용됨.
- SpEL은 리터럴 표현식, 프로퍼티/배열/리스트/맵 접근, 인라인 리스트와 맵, 배열 생성, 관계 연산자, 정규식, 논리 연산자, 문자열 연산자, 수학 연산자, 할당, 타입 표현식, 메서드 호출, 생성자 호출, 변수, 사용자 정의 함수, 빈 참조, 삼항/Elvis/안전 탐색 연산자, 컬렉션 프로젝션과 선택, 템플릿 표현식 등 다양한 기능을 지원함.

## Spring Expression Language (SpEL) - Evaluation

### Evaluation

- SpEL의 인터페이스와 표현 언어를 프로그래밍 방식으로 사용하는 방법.

#### 리터럴 문자열 표현식 Hello World를 평가하기

```java
ExpressionParser parser = new SpelExpressionParser();
Expression exp = parser.parseExpression("'Hello World'");
String message = (String) exp.getValue();
System.out.println(message); // Hello World
```

#### 문자열 리터럴 Hello World에서 concat 메서드를 호출하기

```java
ExpressionParser parser = new SpelExpressionParser();
Expression exp = parser.parseExpression("'Hello World'.concat('!')");
String message = (String) exp.getValue();
System.out.println(message); // Hello World!
```

#### 문자열 리터럴 Hello World의 Bytes JavaBean 속성에 액세스하기

```java
ExpressionParser parser = new SpelExpressionParser();
Expression exp = parser.parseExpression("'Hello World'.bytes"); // 'getBytes()'를 호출
byte[] bytes = (byte[]) exp.getValue();
System.out.println(bytes);
```

#### 점 표기법을 사용하여 문자열 리터럴의 길이를 얻기

```java
ExpressionParser parser = new SpelExpressionParser();
Expression exp = parser.parseExpression("'Hello World'.bytes.length"); // 'getBytes().length'를 호출
int length = (Integer) exp.getValue();
System.out.println(length);
```

#### 문자열 리터럴을 사용하는 대신 String의 생성자를 호출

```java
ExpressionParser parser = new SpelExpressionParser();
Expression exp = parser.parseExpression("new String('hello world').toUpperCase()");
String message = exp.getValue(String.class);
```

#### Inventor 클래스의 사용

```java

GregorianCalendar c = new GregorianCalendar(); // 달력을 생성
c.set(1856, 7, 9);

// The constructor arguments are name, birthday, and nationality.
Inventor tesla = new Inventor("Nikola Tesla", c.getTime(), "Serbian"); // 생성자는 name, birthday, 그리고 nationality

ExpressionParser parser = new SpelExpressionParser();

Expression exp = parser.parseExpression("name"); // "name"을 파싱함.
String name = (String) exp.getValue(tesla);
System.out.println(name); // Nikola Tesla

Expression exp = parser.parseExpression("name == 'Nikola Tesla'");
Boolean result = exp.getValue(tesla, Boolean.class);
System.out.println(result); // true
```

### Understanding EvaluationContext

- `EvaluationContext` 인터페이스는 표현식을 평가할 때 속성, 메서드 또는 필드를 해결하고 타입 변환을 수행하는 데 사용됨. Spring은 두 가지 구현체를 제공함.
  > - `SimpleEvaluationContext`: SpEL 언어 구문의 전체 범위를 필요로 하지 않고 의미 있게 제한되어야 하는 표현식 범주에 대해 필수적인 SpEL 언어 기능과 구성 옵션의 하위 집합을 노출함. 예로는 데이터 바인딩 표현식과 속성 기반 필터가 있음.
  > - `StandardEvaluationContext`: SpEL 언어 기능과 구성 옵션의 전체 집합을 노출함. 기본 루트 객체를 지정하고 사용 가능한 모든 평가 관련 전략을 구성하는 데 사용할 수 있음.
- `SimpleEvaluationContext`는 SpEL 언어 구문의 하위 집합만 지원하도록 설계됨. Java 타입 참조, 생성자 및 빈 참조는 제외됨. 또한 표현식에서 속성과 메서드에 대한 지원 수준을 명시적으로 선택해야 함. 기본적으로 `create()` 정적 팩토리 메서드는 속성에 대한 읽기 접근만 활성화함. 필요한 정확한 지원 수준을 구성하기 위해 빌더를 얻을 수도 있으며, 다음 중 하나 또는 일부 조합을 대상으로 함.
  > - 사용자 정의 PropertyAccessor만 (리플렉션 없음)
  > - 읽기 전용 접근을 위한 데이터 바인딩 속성
  > - 읽기 및 쓰기를 위한 데이터 바인딩 속성

### Type Conversion

- 기본적으로 SpEL은 Spring 코어(`org.springframework.core.convert.ConversionService`)에서 사용 가능한 변환 서비스를 사용함. 이 변환 서비스에는 일반적인 변환을 위한 많은 기본 제공 변환기가 있지만, 사용자 정의 변환을 추가하여 타입 간의 변환을 완전히 확장할 수도 있음. 또한 제네릭을 인식함. 즉, 표현식에서 제네릭 타입으로 작업할 때 SpEL은 변환을 시도하여 만나는 모든 객체에 대해 타입 정확성을 유지함.
- 예제 코드

```java
class Simple {
	public List<Boolean> booleanList = new ArrayList<>();
}

public static void main(String[] args) {
    // Simple 인스턴스 생성
    Simple simple = new Simple();
    simple.booleanList.add(true);

    EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();
    ExpressionParser parser = new SpelExpressionParser();
    parser.parseExpression("booleanList[0]").setValue(context, simple, "false"); // Simple 인스턴스 안의 배열에 "false"를 집어넣음
    Boolean b = simple.booleanList.get(0);
    System.out.println(b); // false
}
```

### Parser Configuration

- 파서 설정 객체(`org.springframework.expression.spel.SpelParserConfiguration`)를 사용하여 SpEL 표현식 파서를 설정할 수 있음. 설정 객체는 일부 표현식 구성 요소의 동작을 제어함. 예를 들어, 배열이나 컬렉션에 인덱스를 지정하고 지정된 인덱스의 요소가 null인 경우 SpEL은 자동으로 해당 요소를 생성할 수 있음. 이는 프로퍼티 참조의 체인으로 구성된 표현식을 사용할 때 유용함. 배열이나 리스트에 인덱스를 지정하고 현재 배열 또는 리스트의 크기를 벗어나는 인덱스를 지정하면 SpEL은 해당 인덱스를 수용하기 위해 배열 또는 리스트를 자동으로 증가시킬 수 있음. 지정된 인덱스에 요소를 추가하기 위해 SpEL은 지정된 값을 설정하기 전에 요소 타입의 기본 생성자를 사용하여 요소를 생성하려고 시도함. 요소 타입에 기본 생성자가 없으면 null이 배열 또는 리스트에 추가됨. 값을 설정하는 방법을 아는 내장 변환기나 사용자 정의 변환기가 없으면 지정된 인덱스의 배열이나 리스트에 null이 남게 됨.

```java
class Demo {
	public List<String> list;
}

// SpelParserConfiguration의 두 매개변수는 '자동 null 참조 초기화'와 '자동 컬렉션 증가'를 활성화함.
SpelParserConfiguration config = new SpelParserConfiguration(true, true);

ExpressionParser parser = new SpelExpressionParser(config);

Expression expression = parser.parseExpression("list[3]");

Demo demo = new Demo();

Object o = expression.getValue(demo); // demo.list는 이제 4개의 항목을 가진 실제 컬렉션이 됨. 각 항목은 새로운 빈 문자열임.
```

- 기본적으로 SpEL 표현식은 10,000자를 초과할 수 없지만 maxExpressionLength는 구성 가능함. `SpelExpressionParser`를 프로그래밍 방식으로 생성하는 경우 `SpelExpressionParser`에 제공하는 `SpelParserConfiguration`을 생성할 때 사용자 정의 maxExpressionLength를 지정할 수 있음. `ApplicationContext` 내에서 SpEL 표현식을 파싱하는 데 사용되는 maxExpressionLength를 설정하려는 경우(예: XML 빈 정의, @Value 등에서) JVM 시스템 속성 또는 Spring 속성 `spring.context.expression.maxLength`를 애플리케이션에 필요한 최대 표현식 길이로 설정할 수 있음.

### SpEL Compilation

- Spring은 SpEL 표현식을 위한 기본 컴파일러를 제공함. 표현식은 일반적으로 해석되며, 이는 평가 중에 많은 동적 유연성을 제공하지만 최적의 성능을 제공하지는 않음. 가끔 표현식을 사용하는 경우에는 괜찮지만, Spring Integration과 같은 다른 구성 요소에서 사용될 때는 성능이 매우 중요할 수 있으며 동적인 특성이 실제로 필요하지 않음.
- SpEL 컴파일러는 이러한 요구를 해결하기 위한 것. 평가 중에 컴파일러는 런타임에 표현식 동작을 구현하는 Java 클래스를 생성하고 해당 클래스를 사용하여 훨씬 더 빠른 표현식 평가를 달성함. 표현식 주변의 타입 정보 부족으로 인해 컴파일러는 컴파일을 수행할 때 해석된 표현식 평가 중에 수집된 정보를 사용함. 예를 들어, 표현식에서 속성 참조의 타입을 순수하게 알 수는 없지만 첫 번째 해석된 평가 중에 해당 타입을 알아냄. 물론 이러한 파생된 정보를 기반으로 컴파일하면 시간이 지남에 따라 다양한 표현식 요소의 타입이 변경될 경우 나중에 문제가 발생할 수 있음. 이러한 이유로 컴파일은 반복적인 평가에서 타입 정보가 변경되지 않는 표현식에 가장 적합함.

### Compiler Configuration

- 컴파일러는 기본적으로 켜져 있지 않지만, 두 가지 다른 방법 중 하나로 켤 수 있음. 앞에서 설명한 파서 구성 프로세스를 사용하거나 SpEL 사용이 다른 구성 요소 내부에 포함되어 있을 때 Spring 속성을 사용하여 켤 수 있음.
- 컴파일러는 `org.springframework.expression.spel.SpelCompilerMode` 열거형에 포함된 세 가지 모드 중 하나로 작동할 수 있음. 모드는 다음과 같음.
  > - **OFF (기본값)**: 컴파일러가 꺼져 있음.
  > - **IMMEDIATE**: 즉시 모드에서는 표현식이 가능한 한 빨리 컴파일됨. 일반적으로 첫 번째 해석된 평가 후에 이루어짐. 컴파일된 표현식이 실패하면(일반적으로 앞에서 설명한 대로 타입 변경으로 인해) 표현식 평가의 호출자는 예외를 받음.
  > - **MIXED**: 혼합 모드에서는 표현식이 시간이 지남에 따라 해석된 모드와 컴파일된 모드 사이에서 자동으로 전환됨. 몇 번의 해석된 실행 후에 컴파일된 형식으로 전환되고, 컴파일된 형식에 문제가 발생하면(앞에서 설명한 대로 타입 변경 등) 표현식은 자동으로 다시 해석된 형식으로 전환됨. 나중에 다른 컴파일된 형식을 생성하고 그것으로 전환할 수 있음. 기본적으로 IMMEDIATE 모드에서 사용자가 받는 예외는 대신 내부적으로 처리됨.
- IMMEDIATE 모드는 MIXED 모드가 부작용이 있는 표현식에 문제를 일으킬 수 있기 때문에 존재함. 컴파일된 표현식이 부분적으로 성공한 후 폭발하면 시스템의 상태에 이미 영향을 미친 것일 수 있음. 이런 일이 발생했다면 호출자는 표현식의 일부가 두 번 실행될 수 있으므로 해석된 모드에서 자동으로 다시 실행하는 것을 원하지 않을 수 있음.
- 모드를 선택한 후에는 `SpelParserConfiguration`을 사용하여 파서를 구성함.

```java
SpelParserConfiguration config = new SpelParserConfiguration(SpelCompilerMode.IMMEDIATE,
		this.getClass().getClassLoader());

SpelExpressionParser parser = new SpelExpressionParser(config);

Expression expr = parser.parseExpression("payload");

MyMessage message = new MyMessage();

Object payload = expr.getValue(message);
```

- 컴파일러 모드를 지정할 때 ClassLoader를 지정할 수도 있음(null 전달이 허용됨). 컴파일된 표현식은 제공된 ClassLoader 아래에 생성된 자식 ClassLoader에서 정의됨. ClassLoader를 지정하는 경우 표현식 평가 프로세스에 관련된 모든 타입을 볼 수 있는지 확인하는 것이 중요함. ClassLoader를 지정하지 않으면 기본 ClassLoader가 사용됨(일반적으로 표현식 평가 중에 실행 중인 스레드의 컨텍스트 ClassLoader).
- 컴파일러를 구성하는 두 번째 방법은 SpEL이 다른 구성 요소 내부에 포함되어 있고 구성 객체를 통해 구성할 수 없는 경우에 사용하는 것. 이러한 경우에는 JVM 시스템 속성(또는 SpringProperties 메커니즘)을 통해 `spring.expression.compiler.mode` 속성을 SpelCompilerMode 열거형 값(off, immediate 또는 mixed) 중 하나로 설정할 수 있음.

### Compiler Limitations

- Spring은 모든 종류의 표현식을 컴파일하는 것을 지원하지 않음. 주요 초점은 성능에 중요한 컨텍스트에서 사용될 가능성이 높은 일반적인 표현식ㅇ;ㅁ. 다음과 같은 종류의 표현식은 컴파일할 수 없음.
  > - 할당을 포함하는 표현식
  > - 변환 서비스에 의존하는 표현식
  > - 사용자 정의 리졸버 또는 접근자를 사용하는 표현식
  > - 오버로드된 연산자를 사용하는 표현식
  > - 배열 생성 구문을 사용하는 표현식
  > - 선택 또는 프로젝션을 사용하는 표현식

## Spring Expression Language (SpEL) - Expressions in Bean Definitions

## Spring Expression Language (SpEL) - Language Reference

## Spring Expression Language (SpEL) - Language Reference - Literal Expressions

## Spring Expression Language (SpEL) - Language Reference - Properties, Arrays, Lists, Maps, and Indexers

## Spring Expression Language (SpEL) - Language Reference - Inline Lists

## Spring Expression Language (SpEL) - Language Reference - Inline Maps

## Spring Expression Language (SpEL) - Language Reference - Array Construction

## Spring Expression Language (SpEL) - Language Reference - Methods

## Spring Expression Language (SpEL) - Language Reference - Operators

## Spring Expression Language (SpEL) - Language Reference - Types

## Spring Expression Language (SpEL) - Language Reference - Constructors

## Spring Expression Language (SpEL) - Language Reference - Variables

## Spring Expression Language (SpEL) - Language Reference - Functions

## Spring Expression Language (SpEL) - Language Reference - Bean References

## Spring Expression Language (SpEL) - Language Reference - Ternary Operator (If-Then-Else)

## Spring Expression Language (SpEL) - Language Reference - The Elvis Operator

## Spring Expression Language (SpEL) - Language Reference - Safe Navigation Operator

## Spring Expression Language (SpEL) - Language Reference - Collection Selection

## Spring Expression Language (SpEL) - Language Reference - Collection Projection

## Spring Expression Language (SpEL) - Language Reference - Expression Templating

## Aspect Oriented Programming with Spring

## Aspect Oriented Programming with Spring - AOP Concepts

## Aspect Oriented Programming with Spring - Spring AOP Capabilities and Goals

## Aspect Oriented Programming with Spring - AOP Proxies

## Aspect Oriented Programming with Spring - @AspectJ support

## Aspect Oriented Programming with Spring - Enabling @AspectJ Support

## Aspect Oriented Programming with Spring - Enabling @AspectJ Support - Declaring an Aspect

## Aspect Oriented Programming with Spring - Enabling @AspectJ Support - Declaring a Pointcut

## Aspect Oriented Programming with Spring - Enabling @AspectJ Support - Declaring Advice

## Aspect Oriented Programming with Spring - Enabling @AspectJ Support - Introductions

## Aspect Oriented Programming with Spring - Enabling @AspectJ Support - Aspect Instantiation Models

## Aspect Oriented Programming with Spring - Enabling @AspectJ Support - An AOP Example

## Aspect Oriented Programming with Spring - Schema-based AOP Support

## Aspect Oriented Programming with Spring - Choosing which AOP Declaration Style to Use

## Aspect Oriented Programming with Spring - Mixing Aspect Types

## Aspect Oriented Programming with Spring - Proxying Mechanisms

## Aspect Oriented Programming with Spring - Programmatic Creation of @AspectJ Proxies

## Aspect Oriented Programming with Spring - Using AspectJ with Spring Applications

## Aspect Oriented Programming with Spring - Further Resources

## Spring AOP APIs

## Spring AOP APIs - Pointcut API in Spring

## Spring AOP APIs - Advice API in Spring

## Spring AOP APIs - The Advisor API in Spring

## Spring AOP APIs - Using the ProxyFactoryBean to Create AOP Proxies

## Spring AOP APIs - Concise Proxy Definitions

## Spring AOP APIs - Creating AOP Proxies Programmatically with the ProxyFactory

## Spring AOP APIs - Manipulating Advised Objects

## Spring AOP APIs - Using the "auto-proxy" facility

## Spring AOP APIs - Using TargetSource Implementations

## Spring AOP APIs - Defining New Advice Types

## Null-safety

## Data Buffers and Codecs

## Logging

## Ahead of Time Optimizations

## Appendix

## Appendix - XML Schemas

## Appendix - XML Schema Authoring

## Appendix - Application Startup Steps

---

## Spring Web MVC - DispatcherServlet

- `DispatcherServlet`은 Spring MVC의 핵심 컴포넌트로, Front Controller 패턴을 구현한 서블릿. `DispatcherServlet`은 요청 처리를 위한 공유 알고리즘을 제공하며, 실제 작업은 설정 가능한 delegate 컴포넌트에 의해 수행됨. 이러한 모델은 유연하며 다양한 워크플로우를 지원함.

  > - `DispatcherServlet`은 Java 설정이나 `web.xml`을 사용하여 Servlet 명세에 따라 선언되고 매핑되어야 함. 그리고 `DispatcherServlet`은 Spring 설정을 사용하여 요청 매핑, 뷰 해석, 예외 처리 등에 필요한 delegate 컴포넌트를 찾음.
  > - `ApplicationInitializer`에서는 `DispatcherServlet`을 등록하고 초기화함. `WebApplicationInitializer` 인터페이스를 구현하는 클래스에서 `onStartup` 메서드를 오버라이드하여 `AnnotationConfigWebApplicationContext`를 로드하고, `DispatcherServlet`을 생성 및 등록함. 이때 Servlet 컨테이너에 의해 자동으로 감지됨.
  > - `web.xml` 설정 예제에서는 `ContextLoaderListener`와 `DispatcherServlet`을 선언하고 초기화하는 과정을 보여줌. contextConfigLocation 매개변수를 사용하여 Spring 설정 파일의 위치를 지정할 수 있음.

- Spring에서 `WebApplicationInitializer`와 `web.xml`은 각각 서로 다른 방식으로 `DispatcherServlet`을 등록하고 설정하는 역할을 함. 둘 중 하나만 사용해도 되지만, 프로젝트의 요구사항과 설정 방식에 따라 선택할 수 있음.
- `DispatcherServlet`: Java 기반의 설정 방식으로, WebApplicationInitializer 인터페이스를 구현함.

```java
public class MyWebApplicationInitializer implements WebApplicationInitializer {

  @Override
  public void onStartup(ServletContext servletContext) {

    // Load Spring web application configuration
    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
    context.register(AppConfig.class);

    // Create and register the DispatcherServlet
    DispatcherServlet servlet = new DispatcherServlet(context); // DispatcherServlet을 생성하고 ServletContext에 등록함
    ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet); // ServletRegistration.Dynamic을 사용하여 DispatcherServlet의 매핑 정보를 설정함
    registration.setLoadOnStartup(1); // 서블릿 컨테이너 시작 시 DispatcherServlet을 초기화하도록 설정
    registration.addMapping("/app/*"); // /app/* 패턴으로 DispatcherServlet을 매핑
  }
}
```

- `web.xml`: XML 기반의 설정 방식으로, 웹 애플리케이션의 배포 설명자 파일.

```xml
<web-app>
  <!-- ContextLoaderListener를 등록 -->
	<listener>
    <!-- ContextLoaderListener는 DispatcherServlet의 부모 컨텍스트를 로드하는 역할 -->
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>

  <!-- <context-param> 태그를 사용하여 contextConfigLocation 파라미터를 설정 -->
	<context-param>
    <!-- contextConfigLocation 파라미터는 부모 컨텍스트의 설정 파일 위치를 지정 -->
		<param-name>contextConfigLocation</param-name>
		<param-value>/WEB-INF/app-context.xml</param-value>
	</context-param>

	<servlet>
		<servlet-name>app</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    <!-- DispatcherServlet의 초기화 파라미터를 설정 -->
		<init-param>
			<param-name>contextConfigLocation</param-name>
			<param-value></param-value>
		</init-param>
    <!-- <load-on-startup> 태그를 사용하여 서블릿 컨테이너 시작 시 DispatcherServlet을 초기화하도록 설정 -->
		<load-on-startup>1</load-on-startup>
	</servlet>

	<servlet-mapping>
		<servlet-name>app</servlet-name>
		<url-pattern>/app/*</url-pattern>
	</servlet-mapping>

</web-app>
```

- Spring Boot는 Servlet 컨테이너의 라이프사이클에 연결되는 대신 Spring 설정을 사용하여 자체적으로 부트스트랩하고 내장 Servlet 컨테이너를 초기화함. Spring Boot는 Spring 설정에서 Filter와 Servlet 선언을 감지하고 이를 Servlet 컨테이너에 등록함.
  > - Spring Boot에서는 `@SpringBootApplication` 어노테이션을 사용하여 설정 클래스를 정의하고, 이 클래스에 `@EnableAutoConfiguration` 어노테이션을 추가하여 Spring Boot의 자동 구성 기능을 활성화함. 이를 통해 Spring Boot는 클래스패스에 있는 라이브러리와 설정을 기반으로 필요한 Bean을 자동으로 구성함.
  > - Spring Boot는 내장 Servlet 컨테이너(예: Tomcat, Jetty)를 제공하므로 별도의 Servlet 컨테이너를 설치하고 구성할 필요가 없음. `application.properties` 또는 `application.yml` 파일을 사용하여 내장 Servlet 컨테이너의 설정을 쉽게 구성할 수 있음.
- `@SpringBootApplication` 어노테이션 안에는 다음과 같은 어노테이션들이 포함되어 있음.
  > - `@EnableAutoConfiguration`: Spring Boot의 자동 구성 기능을 활성화함. 클래스패스에 있는 라이브러리와 설정을 기반으로 필요한 Bean을 자동으로 구성해줌.
  > - `@ComponentScan`: 현재 패키지를 기준으로 컴포넌트 스캔을 수행함. `@Component`, `@Controller`, `@Service`, `@Repository` 등의 어노테이션이 붙은 클래스를 자동으로 감지하여 Bean으로 등록함.
  > - `@Configuration`: 해당 클래스를 설정 클래스로 지정함. 설정 클래스 내에서 @Bean 어노테이션을 사용하여 수동으로 Bean을 등록할 수 있음.

## DispatcherServlet - Context Hierarchy

![mvc_context_hierarchy](description_img/mvc_context_hierarchy.png)

- **단일 WebApplicationContext**
  > - 많은 애플리케이션에서는 단일 WebApplicationContext로 충분함.
  > - 이 경우 DispatcherServlet은 하나의 WebApplicationContext를 사용하여 설정되며, 모든 빈과 설정이 해당 컨텍스트에 포함됨.
- **컨텍스트 계층 구조**
  > - Spring은 컨텍스트 계층 구조를 지원하여 여러 WebApplicationContext를 계층적으로 구성할 수 있음.
  > - 루트 WebApplicationContext는 여러 DispatcherServlet 인스턴스에서 공유되는 공통의 상위 컨텍스트.
  > - 각 DispatcherServlet은 자체적인 자식 WebApplicationContext를 가질 수 있음.
  > - 자식 WebApplicationContext는 해당 DispatcherServlet에 특화된 설정을 포함함.
- **컨텍스트 계층 구조 예제 코드**

```java
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { App1Config.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/app1/*" };
	}
}
```

- **루트 WebApplicationContext의 역할**
  > - 루트 WebApplicationContext는 일반적으로 인프라스트럭처 빈들을 포함함.
  > - 여기에는 데이터 저장소, 비즈니스 서비스 등 여러 Servlet 인스턴스에서 공유되어야 하는 빈들이 있음.
  > - 이러한 빈들은 효과적으로 상속되며, 자식 WebApplicationContext에서 재정의(오버라이드)할 수 있음.
- **자식 WebApplicationContext의 역할**
  > - 자식 WebApplicationContext는 특정 Servlet에 국한된 빈들을 포함함.
  > - 이 컨텍스트는 해당 Servlet에 특화된 설정과 빈들을 정의함.
  > - 자식 WebApplicationContext에서는 루트 WebApplicationContext의 빈들을 상속받고, 필요한 경우 재정의할 수 있음.

## Spring Web MVC - DispatcherServlet - Context Hierarchy

## Spring Web MVC - DispatcherServlet - Special Bean Types

### 개요

- 이러한 특별한 빈들은 DispatcherServlet이 요청을 처리하고 적절한 응답을 렌더링하는 데 도움을 줌. 대부분의 경우 기본적인 내장 구현체를 사용하지만, 필요에 따라 속성을 커스터마이징하거나 확장 또는 교체할 수 있음.

### 종류

- **HandlerMapping**

  > - 요청을 처리할 핸들러와 인터셉터 목록을 매핑함.
  > - 주로 사용되는 구현체로는 `@RequestMapping` 어노테이션을 지원하는 `RequestMappingHandlerMapping`과 명시적으로 URI 패턴과 핸들러를 등록하는 `SimpleUrlHandlerMapping`이 있음.

- **HandlerAdapter**

  > - `DispatcherServlet`이 매핑된 핸들러를 실제로 어떻게 호출할지 도와주는 역할을 함.
  > - 예를 들어, 어노테이션이 적용된 컨트롤러를 호출하려면 어노테이션을 해석해야 함.
  > - `HandlerAdapter`의 주된 목적은 `DispatcherServlet`이 이러한 세부 사항으로부터 분리되도록 하는 것.

- **HandlerExceptionResolver**

  > - 예외를 해결하고 핸들러, HTML 오류 뷰 또는 다른 대상으로 매핑하는 전략.
  > - 예외 처리에 사용됨.

- **ViewResolver**

  > - 핸들러에서 반환된 논리적인 문자열 기반의 뷰 이름을 실제로 렌더링할 View 객체로 해석함.
  > - 뷰 해석 및 뷰 기술과 관련이 있음.

- **LocaleResolver, LocaleContextResolver**

  > - 클라이언트가 사용하는 Locale과 시간대를 결정하여 국제화된 뷰를 제공할 수 있도록 함.

- **ThemeResolver**

  > - 웹 애플리케이션에서 사용할 수 있는 테마를 해석함.
  > - 예를 들어, 개인화된 레이아웃을 제공하는 데 사용될 수 있음.

- **MultipartResolver**

  > - 멀티파트 요청(예: 브라우저 폼 파일 업로드)을 파싱하기 위한 추상화 계층.
  > - 멀티파트 파싱 라이브러리의 도움을 받아 처리함.

- **FlashMapManager**
  > - 한 요청에서 다른 요청으로 속성을 전달할 때 사용할 수 있는 "input" 및 "output" FlashMap을 저장하고 검색함.
  > - 주로 리다이렉트 시 속성을 유지하는 데 사용됨.

### [예제 코드](https://github.com/foreverfl/study-java-springDocumentation/blob/main/src/main/java/com/example/springDocumentation/config/WebConfig.java)

1. `WebConfig`는 `WebMvcConfigurer`을 구현해서 `Thymeleaf`의 `ViewResolver` 설정을 함.
2. Spring Boot는 `Thymeleaf`를 포함한 여러 기술에 대해 '자동 설정'을 제공함. 이 자동 설정은 application.properties 또는 application.yml 파일을 통해 설정할 수 있는 많은 기본값을 포함하고 있음. 예를 들어, Thymeleaf에 대한 기본적인 구성은 다음과 같이 제공됨.

   > - `spring.thymeleaf.prefix`: 템플릿 파일들의 위치 (기본값 classpath:/templates/)
   > - `spring.thymeleaf.suffix`: 템플릿 파일의 확장자 (기본값 .html)
   > - `spring.thymeleaf.mode`: 템플릿 모드 (기본값 HTML)
   > - `spring.thymeleaf.encoding`: 인코딩 방식 (기본값 UTF-8)

3. 직접 Java 설정 파일 (`@Configuration` 클래스)에서 `Thymeleaf` 설정을 정의하는 경우, 이 설정들이 Spring Boot의 자동 설정보다 우선시됨. 즉, 위의 `WebConfig` 클래스처럼 직접 `ViewResolver`, `TemplateEngine`, `TemplateResolver`를 설정하면, 이 설정들이 `application.properties`에서 제공하는 기본값 또는 변경된 설정들을 오버라이드(덮어쓰기)함.

## Spring Web MVC - DispatcherServlet - Web MVC Config

### 개요

- Spring Web MVC는 Java 기반 웹 프레임워크로, Spring Framework의 일부. 이 프레임워크는 모델-뷰-컨트롤러(MVC) 패턴을 따르며, 웹 애플리케이션 개발을 위해 강력하고 유연한 구조를 제공함. WebMvcConfigurer 인터페이스는 Spring MVC의 구성을 커스터마이즈할 수 있게 해주며, 개발자가 여러 설정을 세밀하게 조정할 수 있도록 지원함.

### WebMvcConfigurer 인터페이스

- WebMvcConfigurer 인터페이스는 Spring MVC 설정을 프로그래밍 방식으로 커스터마이징 할 수 있게 해즘. 이 인터페이스를 구현함으로써, 개발자는 `@EnableWebMvc` 어노테이션을 사용하여 기본적인 Spring MVC 구성을 쉽게 확장할 수 있음.

### 주요 메서드

- `WebMvcConfigurer`: 인터페이스에는 다양한 메서드가 포함되어 있어서 다음과 같은 설정을 커스터마이징 할 수 있음.
- `addResourceHandlers`: 정적 리소스를 제공하기 위한 경로를 설정함.
- `configureViewResolvers`: 뷰 리졸버를 구성하여 뷰 이름이 어떻게 실제 뷰 구현으로 매핑되는지 정의함.
- `addCorsMappings`: 크로스 오리진 리소스 공유(CORS) 설정을 추가함.
- `configureMessageConverters`: HTTP 메시지 컨버터를 커스터마이징 할 수 있음. 이를 통해 요청 및 응답 데이터의 형식을 제어할 수 있음.
- `addInterceptors`: 인터셉터를 추가하여 요청과 응답을 가로채 처리할 수 있음.
- `configureContentNegotiation`: 컨텐츠 협상 설정을 구성함.
- `addViewControllers`: 특정 URL 요청을 뷰 이름으로 매핑하는 간단한 컨트롤러를 등록함.
- `configureDefaultServletHandling`: 디스패처 서블릿에서 기본 서블릿을 통해 처리될 요청을 구성함.

## 예제 코드

```java
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/public-resources/");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", ".jsp");
    }
}
```

## Spring Web MVC - DispatcherServlet - Servlet Config

## Spring Web MVC - DispatcherServlet - Processing

## Spring Web MVC - DispatcherServlet - Path Matching

## Spring Web MVC - DispatcherServlet - Interception

## Spring Web MVC - DispatcherServlet - Exceptions

## Spring Web MVC - DispatcherServlet - View Resolution

## Spring Web MVC - DispatcherServlet - Locale

## Spring Web MVC - DispatcherServlet - Themes

## Spring Web MVC - DispatcherServlet - Multipart Resolver

## Spring Web MVC - DispatcherServlet - Logging

## Spring Web MVC - Filters

## Spring Web MVC - Annotated Controllers

- Spring MVC는 `@Controller`와 `@RestController` 구성요소가 요청 매핑, 요청 입력, 예외 처리 등을 표현하기 위해 어노테이션을 사용하는 어노테이션 기반 프로그래밍 모델을 제공함. 어노테이션을 사용한 컨트롤러는 유연한 메서드 시그니처를 가지고 있으며, 기본 클래스를 확장하거나 특정 인터페이스를 구현할 필요가 없음.
- [예제 코드](https://github.com/foreverfl/study-java-springDocumentation/blob/main/src/main/java/com/example/springDocumentation/controller/HomeController.java)

```java
@Controller
public class HelloController {

	@GetMapping("/hello")
	public String handle(Model model) {
		model.addAttribute("message", "Hello World!");
		return "index";
	}
}
```

## Spring Web MVC - Annotated Controllers - Declaration

## Spring Web MVC - Annotated Controllers - Mapping Requests

### @RequestMapping

- `@RequestMapping` 어노테이션은 요청 URL을 컨트롤러의 메서드와 매핑할 때 사용됨. 클래스 레벨과 메서드 레벨에서 사용할 수 있으며, 다양한 속성을 통해 매핑을 구체화할 수 있음.

```java
@Controller
@RequestMapping("/users")
public class UserController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable("id") Long id) {
        // ...
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String createUser(@RequestBody User user) {
        // ...
    }
}
```

### URI patterns

- URI 패턴을 사용하여 요청 URL을 매핑할 수 있습니다. 와일드카드 문자(\*, \*\*), 플레이스홀더({id}) 등을 지원함.

```java
@RequestMapping("/users/{id}")
public String getUser(@PathVariable("id") Long id) {
    // ...
}
```

### Pattern Comparison

- 여러 개의 URI 패턴이 요청 URL과 일치할 경우, 스프링은 가장 구체적인 패턴을 선택함. 패턴의 구체성은 URI 변수, 와일드카드의 수, 고정된 문자열의 길이 등을 기준으로 판단함.

### Suffix Match

- URI 패턴의 접미사를 사용하여 매핑할 수 있음. 예를 들어, `/users/{id}.\*`는 `/users/123.json`, `/users/123.xml` 등과 일치함.

### Suffix Match and RFD

- RFD(Reflected File Download) 공격을 방지하기 위해 접미사 패턴은 기본적으로 비활성화되어 있움. 필요한 경우 `PathMatchConfigurer`를 사용하여 활성화할 수 있음.

### Consumable Media Types

- consumes 속성을 사용하여 요청의 Content-Type 헤더를 기준으로 매핑할 수 있음.

```java
@PostMapping(value = "/users", consumes = "application/json")
public void createUser(@RequestBody User user) {
    // ...
}
```

### Producible Media Types

- produces 속성을 사용하여 응답의 Content-Type 헤더를 설정할 수 있음.

```java
@GetMapping(value = "/users/{id}", produces = "application/json")
public User getUser(@PathVariable("id") Long id) {
    // ...
}
```

### Parameters, headers

- params와 headers 속성을 사용하여 요청 파라미터와 헤더를 기준으로 매핑할 수 있음.

```java
@GetMapping(value = "/users", params = "sort=name")
public List<User> getUsersSortedByName() {
    // ...
}
```

### HTTP HEAD, OPTIONS

- `@RequestMapping`은 `HTTP HEAD`와 `OPTIONS` 메서드도 지원함. HEAD 요청은 GET 요청과 동일하게 처리되지만 응답 본문은 제외됨. `OPTIONS` 요청은 `@RequestMapping`의 method 속성에 명시된 HTTP 메서드를 응답 헤더에 포함시킴.

### Custom Annotations

- `@RequestMapping`을 메타 어노테이션으로 사용하여 커스텀 어노테이션을 만들 수 있음. `@GetMapping`, `@PostMapping` 등이 대표적인 예시.

```java
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@RequestMapping(method = RequestMethod.GET)
public @interface GetMapping {
    // ...
}
```

### Explicit Registrations

-` @RequestMapping` 어노테이션을 사용하지 않고도 명시적으로 요청 매핑을 등록할 수 있음. `RequestMappingHandlerMapping`의 `registerMapping` 메서드를 사용하여 직접 매핑을 등록할 수 있음.

### @HttpExchange

- `@HttpExchange` 어노테이션은 `@RequestMapping`의 모든 기능을 포함하면서도 더 간결한 문법을 제공함. @Controller 어노테이션 대신 @HttpExchange를 사용할 수 있음.

```java
@HttpExchange
public class UserController {

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id") Long id) {
        // ...
    }
}
```

## Spring Web MVC - Annotated Controllers - Handler Methods

## Spring Web MVC - Annotated Controllers - Handler Methods - Method Arguments

## Spring Web MVC - Annotated Controllers - Handler Methods - Return Values

## Spring Web MVC - Annotated Controllers - Handler Methods - Type Conversion

## Spring Web MVC - Annotated Controllers - Handler Methods - Matrix Variables

## Spring Web MVC - Annotated Controllers - Handler Methods - @RequestParam

## Spring Web MVC - Annotated Controllers - Handler Methods - @RequestHeader

## Spring Web MVC - Annotated Controllers - Handler Methods - @CookieValue

## Spring Web MVC - Annotated Controllers - Handler Methods - @ModelAttribute

## Spring Web MVC - Annotated Controllers - Handler Methods - @SessionAttributes

## Spring Web MVC - Annotated Controllers - Handler Methods - @SessionAttribute

## Spring Web MVC - Annotated Controllers - Handler Methods - @RequestAttribute

## Spring Web MVC - Annotated Controllers - Handler Methods - Redirect Attributes

## Spring Web MVC - Annotated Controllers - Handler Methods - Flash Attributes

## Spring Web MVC - Annotated Controllers - Handler Methods - Multipart

## Spring Web MVC - Annotated Controllers - Handler Methods - @RequestBody

## Spring Web MVC - Annotated Controllers - Handler Methods - HttpEntity

## Spring Web MVC - Annotated Controllers - Handler Methods - @ResponseBody

## Spring Web MVC - Annotated Controllers - Handler Methods - ResponseEntity

## Spring Web MVC - Annotated Controllers - Handler Methods - Jackson JSON

## Spring Web MVC - Annotated Controllers - Model

## Spring Web MVC - Annotated Controllers - @InitBinder

## Spring Web MVC - Annotated Controllers - Validation

## Spring Web MVC - Annotated Controllers - Exceptions

## Spring Web MVC - Annotated Controllers - Controller Advice

## Spring Web MVC - Functional Endpoints

## Spring Web MVC - URI Links

## Spring Web MVC - Asynchronous Requests

## pring Web MVC - CORS

## Spring Web MVC - Error Responses

## Spring Web MVC - Web Security

## Spring Web MVC - HTTP Caching

## Spring Web MVC - View Technologies

## Spring Web MVC - View Technologies - Thymeleaf

## Spring Web MVC - View Technologies - FreeMarker

## Spring Web MVC - View Technologies - Groovy Markup

## Spring Web MVC - View Technologies - Script Views

## Spring Web MVC - View Technologies - JSP and JSTL

## Spring Web MVC - View Technologies - RSS and Atom

## Spring Web MVC - View Technologies - PDF and Excel

## Spring Web MVC - View Technologies - Jackson

## Spring Web MVC - View Technologies - XML Marshalling

## Spring Web MVC - View Technologies - XSLT Views

## Spring Web MVC - MVC Config

## Spring Web MVC - MVC Config - Enable MVC Configuration

## Spring Web MVC - MVC Config - MVC Config API

## Spring Web MVC - MVC Config - Type Conversion

## Spring Web MVC - MVC Config - Validation

## Spring Web MVC - MVC Config - Interceptors

## Spring Web MVC - MVC Config - Content Types

## Spring Web MVC - MVC Config - Message Converters

## Spring Web MVC - MVC Config - View Controllers

## Spring Web MVC - MVC Config - View Resolvers

## Spring Web MVC - MVC Config - Static Resources

## Spring Web MVC - MVC Config - Default Servlet

## Spring Web MVC - MVC Config - Path Matching

## Spring Web MVC - MVC Config - Advanced Java Config

## Spring Web MVC - MVC Config - Advanced XML Config

## Spring Web MVC - HTTP/2

## REST Clients

## Testing

## WebSockets

## WebSockets - WebSocket API

## WebSockets - SockJS Fallback

## WebSockets - STOMP

## WebSockets - STOMP - Overview

## WebSockets - STOMP - Benefits

## WebSockets - STOMP - Enable STOMP

## WebSockets - STOMP - WebSocket Transport

## WebSockets - STOMP - Flow of Messages

## WebSockets - STOMP - Annotated Controllers

## WebSockets - STOMP - Sending Messages

## WebSockets - STOMP - Simple Broker

## WebSockets - STOMP - External Broker

## WebSockets - STOMP - Connecting to a Broker

## WebSockets - STOMP - Dots as Separators

## WebSockets - STOMP - Authentication

## WebSockets - STOMP - Token Authentication

## WebSockets - STOMP - Authorization

## WebSockets - STOMP - User Destinations

## WebSockets - STOMP - Order of Messages

## WebSockets - STOMP - Events

## WebSockets - STOMP - Interception

## WebSockets - STOMP - WebSocket Scope

## WebSockets - STOMP - STOMP Client

## WebSockets - STOMP - WebSocket Scope

## WebSockets - STOMP - Performance

## WebSockets - STOMP - Monitoring

## WebSockets - STOMP - Testing

## Other Web Frameworks
