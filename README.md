# Spring Documentation

- Spring 공식 문서 및 Claude Opus/ChatGPT4를 사용해서 만들었습니다.

## 목차

- Core Technologies

  > - [Introduction to the Spring IoC Container and Beans](#introduction-to-the-spring-ioc-container-and-beans)
  > - [Container Overview](#container-overview)
  > - Bean Overview
  > - Dependencies
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

  > - Spring Web MVC
  > - DispatcherServlet
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

### 예제 코드

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

### 예제 코드

1. `bean` 패키지에 `MyBean1.java`, `MyBean2.java`를 생성.
2. `resources`에 `AppConfig.XML`를 생성하고 bean 패키지에 있는 파일들을 각각 Bean으로 등록함.
3. `BeanCountApplicationXL.java`에서 등록된 Bean이 기본 Bean 5개, Configuration Bean 1개, 등록한 Bean 2개로 총 8개임을 알 수 있음. 또한 `MyBean1.java`에 생성한 내부 클래스가 출력됨을 알 수 있음.

## Bean Overview

## Dependencies

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
