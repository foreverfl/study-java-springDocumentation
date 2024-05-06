# Spring Documentation

- Spring 공식 문서 및 Claude Opus/ChatGPT4를 사용해서 만들었습니다.

## 목차

- Core Technologies

  > - [Introduction to the Spring IoC Container and Beans](#introduction-to-the-spring-ioc-container-and-beans)
  > - [Container Overview](#container-overview)
  > - [Bean Overview](#bean-overview)
  > - Dependency Injection
  > - Dependencies and Configuration in Detail
  > - Using depends-on
  > - Lazy-initialized Beans
  > - Autowiring Collaborators
  > - Method Injection
  > - Bean Scopes
  > - Customizing the Nature of a Bean
  > - Bean Definition Inheritance
  > - Container Extension Points
  > - Annotation-based Container Configuration
  > - Using @Autowired
  > - Fine-tuning Annotation-based Autowiring with @Primary
  > - Fine-tuning Annotation-based Autowiring with Qualifiers
  > - Using Generics as Autowiring Qualifiers
  > - Using CustomAutowireConfigurer
  > - Injection with @Resource
  > - Using @Value
  > - Using @PostConstruct and @PreDestroy
  > - Classpath Scanning and Managed Components
  > - Using JSR 330 Standard Annotations
  > - Java-based Container Configuration
  > - Basic Concepts: @Bean and @Configuration
  > - Instantiating the Spring Container by Using AnnotationConfigApplicationContext
  > - Using the @Bean Annotation
  > - Using the @Configuration annotation
  > - Composing Java-based Configurations
  > - Environment Abstraction
  > - Registering a LoadTimeWeaver
  > - Additional Capabilities of the ApplicationContext
  > - The BeanFactory API
  > - Resources
  > - Validation, Data Binding, and Type Conversion
  > - Validation by Using Spring’s Validator Interface
  > - Data Binding
  > - Resolving Codes to Error Messages
  > - Spring Type Conversion
  > - Spring Field Formatting
  > - Configuring a Global Date and Time Format
  > - Java Bean Validation
  > - Spring Expression Language (SpEL)
  > - Evaluation
  > - Expressions in Bean Definitions
  > - Language Reference
  > - Literal Expressions
  > - Properties, Arrays, Lists, Maps, and Indexers
  > - Inline Lists
  > - Inline Maps
  > - Array Construction
  > - Methods
  > - Operators
  > - Types
  > - Constructors
  > - Variables
  > - Functions
  > - Bean References
  > - Ternary Operator (If-Then-Else)
  > - The Elvis Operator
  > - Safe Navigation Operator
  > - Collection Selection
  > - Collection Projection
  > - Expression Templating
  > - Classes Used in the Examples
  > - Aspect Oriented Programming with Spring
  > - AOP Concepts
  > - Spring AOP Capabilities and Goals
  > - AOP Proxies
  > - @AspectJ support
  > - Enabling @AspectJ Support
  > - Declaring an Aspect
  > - Declaring a Pointcut
  > - Declaring Advice
  > - Introductions
  > - Aspect Instantiation Models
  > - An AOP Example
  > - Schema-based AOP Support
  > - Choosing which AOP Declaration Style to Use
  > - Mixing Aspect Types
  > - Proxying Mechanisms
  > - Programmatic Creation of @AspectJ Proxies
  > - Using AspectJ with Spring Applications
  > - Further Resources
  > - Spring AOP APIs
  > - Pointcut API in Spring
  > - Advice API in Spring
  > - The Advisor API in Spring
  > - Using the ProxyFactoryBean to Create AOP Proxies
  > - Concise Proxy Definitions
  > - Creating AOP Proxies Programmatically with the ProxyFactory
  > - Manipulating Advised Objects
  > - Using the "auto-proxy" facility
  > - Using TargetSource Implementations
  > - Defining New Advice Types
  > - Null-safety
  > - Data Buffers and Codecs
  > - Logging
  > - Ahead of Time Optimizations
  > - Appendix
  > - XML Schemas
  > - XML Schema Authoring
  > - Application Startup Steps

- Testing

  > - Introduction to Spring Testing
  > - Unit Testing
  > - Integration Testing
  > - JDBC Testing Support
  > - Spring TestContext Framework
  > - Key Abstractions
  > - Bootstrapping the TestContext Framework
  > - TestExecutionListener Configuration
  > - Application Events
  > - Test Execution Events
  > - Context Management
  > - Context Configuration with XML resources
  > - Context Configuration with Groovy Scripts
  > - Context Configuration with Component Classes
  > - Mixing XML, Groovy Scripts, and Component Classes
  > - Configuration Configuration with Context Customizers
  > - Context Configuration with Context Initializers
  > - Context Configuration Inheritance
  > - Context Configuration with Environment Profiles
  > - Context Configuration with Test Property Sources
  > - Context Configuration with Dynamic Property Sources
  > - Loading a WebApplicationContext
  > - Working with Web Mocks
  > - Context Caching
  > - Context Failure Threshold
  > - Context Hierarchies
  > - Dependency Injection of Test Fixtures
  > - Testing Request- and Session-scoped Beans
  > - Transaction Management
  > - Executing SQL Scripts
  > - Parallel Test Execution
  > - TestContext Framework Support Classes
  > - Ahead of Time Support for Tests
  > - WebTestClient
  > - MockMvc
  > - Overview
  > - Static Imports
  > - Setup Choices
  > - Setup Features
  > - Performing Requests
  > - Defining Expectations
  > - Async Requests
  > - Streaming Responses
  > - Filter Registrations
  > - MockMvc vs End-to-End Tests
  > - Further Examples
  > - HtmlUnit Integration
  > - Why HtmlUnit Integration?
  > - MockMvc and HtmlUnit
  > - MockMvc and WebDriver
  > - MockMvc and Geb
  > - Testing Client Applications
  > - Appendix
  > - Annotations
  > - Standard Annotation Support
  > - Spring Testing Annotations
  > - @BootstrapWith
  > - @ContextConfiguration
  > - @WebAppConfiguration
  > - @ContextHierarchy
  > - @ContextCustomizerFactories
  > - @ActiveProfiles
  > - @TestPropertySource
  > - @DynamicPropertySource
  > - @DirtiesContext
  > - @TestExecutionListeners
  > - @RecordApplicationEvents
  > - @Commit
  > - @Rollback
  > - @BeforeTransaction
  > - @AfterTransaction
  > - @Sql
  > - @SqlConfig
  > - @SqlMergeMode
  > - @SqlGroup
  > - @DisabledInAotMode
  > - Spring JUnit 4 Testing Annotations
  > - Spring JUnit Jupiter Testing Annotations
  > - Meta-Annotation Support for Testing
  > - Further Resources

- Data Access

  > - Transaction Management
  > - Advantages of the Spring Framework’s Transaction Support Model
  > - Understanding the Spring Framework Transaction Abstraction
  > - Synchronizing Resources with Transactions
  > - Declarative Transaction Management
  > - Understanding the Spring Framework’s Declarative Transaction Implementation
  > - Example of Declarative Transaction Implementation
  > - Rolling Back a Declarative Transaction
  > - Configuring Different Transactional Semantics for Different Beans
  > - <tx:advice/> Settings
  > - Using @Transactional
  > - Transaction Propagation
  > - Advising Transactional Operations
  > - Using @Transactional with AspectJ
  > - Programmatic Transaction Management
  > - Choosing Between Programmatic and Declarative Transaction Management
  > - Transaction-bound Events
  > - Application server-specific integration
  > - Solutions to Common Problems
  > - Further Resources
  > - DAO Support
  > - Data Access with JDBC
  > - Choosing an Approach for JDBC Database Access
  > - Package Hierarchy
  > - Using the JDBC Core Classes to Control Basic JDBC Processing and Error Handling
  > - Controlling Database Connections
  > - JDBC Batch Operations
  > - Simplifying JDBC Operations with the SimpleJdbc Classes
  > - Modeling JDBC Operations as Java Objects
  > - Common Problems with Parameter and Data Value Handling
  > - Embedded Database Support
  > - Initializing a DataSource
  > - Data Access with R2DBC
  > - Object Relational Mapping (ORM) Data Access
  > - Introduction to ORM with Spring
  > - General ORM Integration Considerations
  > - Hibernate
  > - JPA
  > - Marshalling XML by Using Object-XML Mappers
  > - Appendix

- Web on Servlet Stack

  > - [DispatcherServlet](#dispatcherservlet)
  > - Context Hierarchy
  > - Special Bean Types
  > - Web MVC Config
  > - Servlet Config
  > - Processing
  > - Path Matching
  > - Interception
  > - Exceptions
  > - View Resolution
  > - Locale
  > - Themes
  > - Multipart Resolver
  > - Logging
  > - Filters
  > - Annotated Controllers
  > - Declaration
  > - Mapping Requests
  > - Handler Methods
  > - Method Arguments
  > - Return Values
  > - Type Conversion
  > - Matrix Variables
  > - @RequestParam
  > - @RequestHeader
  > - @CookieValue
  > - @ModelAttribute
  > - @SessionAttributes
  > - @SessionAttribute
  > - @RequestAttribute
  > - Redirect Attributes
  > - Flash Attributes
  > - Multipart
  > - @RequestBody
  > - HttpEntity
  > - @ResponseBody
  > - ResponseEntity
  > - Jackson JSON
  > - Model
  > - @InitBinder
  > - Validation
  > - Exceptions
  > - Controller Advice
  > - Functional Endpoints
  > - URI Links
  > - Asynchronous Requests
  > - CORS
  > - Error Responses
  > - Web Security
  > - HTTP Caching
  > - View Technologies
  > - Thymeleaf
  > - FreeMarker
  > - Groovy Markup
  > - Script Views
  > - JSP and JSTL
  > - RSS and Atom
  > - PDF and Excel
  > - Jackson
  > - XML Marshalling
  > - XSLT Views
  > - MVC Config
  > - Enable MVC Configuration
  > - MVC Config API
  > - Type Conversion
  > - Validation
  > - Interceptors
  > - Content Types
  > - Message Converters
  > - View Controllers
  > - View Resolvers
  > - Static Resources
  > - Default Servlet
  > - Path Matching
  > - Advanced Java Config
  > - Advanced XML Config
  > - HTTP/2
  > - REST Clients
  > - Testing
  > - WebSockets
  > - WebSocket API
  > - SockJS Fallback
  > - STOMP
  > - Overview
  > - Benefits
  > - Enable STOMP
  > - WebSocket Transport
  > - Flow of Messages
  > - Annotated Controllers
  > - Sending Messages
  > - Simple Broker
  > - External Broker
  > - Connecting to a Broker
  > - Dots as Separators
  > - Authentication
  > - Token Authentication
  > - Authorization
  > - User Destinations
  > - Order of Messages
  > - Events
  > - Interception
  > - WebSocket Scope
  > - STOMP Client
  > - WebSocket Scope
  > - Performance
  > - Monitoring
  > - Testing
  > - Other Web Frameworks

- Web on Reactive Stack

  > - Spring WebFlux
  > - Overview
  > - Reactive Core
  > - DispatcherHandler
  > - Annotated Controllers
  > - @Controller
  > - Mapping Requests
  > - Handler Methods
  > - Method Arguments
  > - Return Values
  > - Type Conversion
  > - Matrix Variables
  > - @RequestParam
  > - @RequestHeader
  > - @CookieValue
  > - @ModelAttribute
  > - @SessionAttributes
  > - @SessionAttribute
  > - @RequestAttribute
  > - Multipart Content
  > - @RequestBody
  > - HttpEntity
  > - @ResponseBody
  > - ResponseEntity
  > - Jackson JSON
  > - Model
  > - DataBinder
  > - Validation
  > - Exceptions
  > - Controller Advice
  > - Functional Endpoints
  > - URI Links
  > - CORS
  > - Error Responses
  > - Web Security
  > - HTTP Caching
  > - View Technologies
  > - WebFlux Config
  > - HTTP/2
  > - WebClient
  > - Configuration
  > - retrieve()
  > - Exchange
  > - Request Body
  > - Filters
  > - Attributes
  > - Context
  > - Synchronous Use
  > - Testing
  > - HTTP Interface Client
  > - WebSockets
  > - Testing
  > - RSocket
  > - Reactive Libraries

- Integration

  > - REST Clients
  > - JMS (Java Message Service)
  > - Using Spring JMS
  > - Sending a Message
  > - Receiving a Message
  > - Support for JCA Message Endpoints
  > - Annotation-driven Listener Endpoints
  > - JMS Namespace Support
  > - JMX
  > - Exporting Your Beans to JMX
  > - Controlling the Management Interface of Your Beans
  > - Controlling ObjectName Instances for Your Beans
  > - Using JSR-160 Connectors
  > - Accessing MBeans through Proxies
  > - Notifications
  > - Further Resources
  > - Email
  > - Task Execution and Scheduling
  > - Cache Abstraction
  > - Understanding the Cache Abstraction
  > - Declarative Annotation-based Caching
  > - JCache (JSR-107) Annotations
  > - Declarative XML-based Caching
  > - Configuring the Cache Storage
  > - Plugging-in Different Back-end Caches
  > - How can I Set the TTL/TTI/Eviction policy/XXX feature?
  > - Observability Support
  > - JVM Checkpoint Restore
  > - CDS
  > - Appendix

## Introduction to the Spring IoC Container and Beans

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

## Container Overview

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

## Bean Overview

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

## Dependency Injection

## Dependencies and Configuration in Detail

## Using depends-on

## Lazy-initialized Beans

## Autowiring Collaborators

## Method Injection

## Bean Scopes

## Customizing the Nature of a Bean

## Bean Definition Inheritance

## Container Extension Points

## Annotation-based Container Configuration

## Using @Autowired

## Fine-tuning Annotation-based Autowiring with @Primary

## Fine-tuning Annotation-based Autowiring with Qualifiers

## Using Generics as Autowiring Qualifiers

## Using CustomAutowireConfigurer

## Injection with @Resource

## Using @Value

## Using @PostConstruct and @PreDestroy

## Classpath Scanning and Managed Components

## Using JSR 330 Standard Annotations

## Java-based Container Configuration

## Basic Concepts: @Bean and @Configuration

## Instantiating the Spring Container by Using AnnotationConfigApplicationContext

## Using the @Bean Annotation

## Using the @Configuration annotation

## Composing Java-based Configurations

## Environment Abstraction

## Registering a LoadTimeWeaver

## Additional Capabilities of the ApplicationContext

## The BeanFactory API

## Resources

## Validation, Data Binding, and Type Conversion

## Validation by Using Spring’s Validator Interface

## Data Binding

## Resolving Codes to Error Messages

## Spring Type Conversion

## Spring Field Formatting

## Configuring a Global Date and Time Format

## Java Bean Validation

## Spring Expression Language (SpEL)

## Evaluation

## Expressions in Bean Definitions

## Language Reference

## Literal Expressions

## Properties, Arrays, Lists, Maps, and Indexers

## Inline Lists

## Inline Maps

## Array Construction

## Methods

## Operators

## Types

## Constructors

## Variables

## Functions

## Bean References

## Ternary Operator (If-Then-Else)

## The Elvis Operator

## Safe Navigation Operator

## Collection Selection

## Collection Projection

## Expression Templating

## Classes Used in the Examples

## Aspect Oriented Programming with Spring

## AOP Concepts

## Spring AOP Capabilities and Goals

## AOP Proxies

## @AspectJ support

## Enabling @AspectJ Support

## Declaring an Aspect

## Declaring a Pointcut

## Declaring Advice

## Introductions

## Aspect Instantiation Models

## An AOP Example

## Schema-based AOP Support

## Choosing which AOP Declaration Style to Use

## Mixing Aspect Types

## Proxying Mechanisms

## Programmatic Creation of @AspectJ Proxies

## Using AspectJ with Spring Applications

## Further Resources

## Spring AOP APIs

## Pointcut API in Spring

## Advice API in Spring

## The Advisor API in Spring

## Using the ProxyFactoryBean to Create AOP Proxies

## Concise Proxy Definitions

## Creating AOP Proxies Programmatically with the ProxyFactory

## Manipulating Advised Objects

## Using the "auto-proxy" facility

## Using TargetSource Implementations

## Defining New Advice Types

## Null-safety

## Data Buffers and Codecs

## Logging

## Ahead of Time Optimizations

## Appendix

## XML Schemas

## XML Schema Authoring

## Application Startup Steps

---

## DispatcherServlet

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

## Context Hierarchy

## Special Bean Types

## Web MVC Config

## Servlet Config

## Processing

## Path Matching

## Interception

## Exceptions

## View Resolution

## Locale

## Themes

## Multipart Resolver

## Logging

## Filters

## Annotated Controllers

## Declaration

## Mapping Requests

## Handler Methods

## Method Arguments

## Return Values

## Type Conversion

## Matrix Variables

## @RequestParam

## @RequestHeader

## @CookieValue

## @ModelAttribute

## @SessionAttributes

## @SessionAttribute

## @RequestAttribute

## Redirect Attributes

## Flash Attributes

## Multipart

## @RequestBody

## HttpEntity

## @ResponseBody

## ResponseEntity

## Jackson JSON

## Model

## @InitBinder

## Validation

## Exceptions

## Controller Advice

## Functional Endpoints

## URI Links

## Asynchronous Requests

## CORS

## Error Responses

## Web Security

## HTTP Caching

## View Technologies

## Thymeleaf

## FreeMarker

## Groovy Markup

## Script Views

## JSP and JSTL

## RSS and Atom

## PDF and Excel

## Jackson

## XML Marshalling

## XSLT Views

## MVC Config

## Enable MVC Configuration

## MVC Config API

## Type Conversion

## Validation

## Interceptors

## Content Types

## Message Converters

## View Controllers

## View Resolvers

## Static Resources

## Default Servlet

## Path Matching

## Advanced Java Config

## Advanced XML Config

## HTTP/2

## REST Clients

## Testing

## WebSockets

## WebSocket API

## SockJS Fallback

## STOMP

## Overview

## Benefits

## Enable STOMP

## WebSocket Transport

## Flow of Messages

## Annotated Controllers

## Sending Messages

## Simple Broker

## External Broker

## Connecting to a Broker

## Dots as Separators

## Authentication

## Token Authentication

## Authorization

## User Destinations

## Order of Messages

## Events

## Interception

## WebSocket Scope

## STOMP Client

## WebSocket Scope

## Performance

## Monitoring

## Testing

## Other Web Frameworks
