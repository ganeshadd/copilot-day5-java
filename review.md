# Review & Decision (fill before PR)

Project: Java
Problem summary:
- Optimised code for better performance and readability.

Copilot prompt(s) used:
- Refactor this method to improve performance while preserving behavior. Add unit tests that demonstrate identical output for sample inputs
- Convert this blocking IO controller into an async streaming implementation and include a unit test or integration test

Raw Copilot suggestion:
- I'll analyze the current implementation and refactor it to improve performance from O(n²) to O(n), then add unit tests to verify the behavior is preserved.
  First, let me examine the current test file to understand the existing test structure:
  Now I'll refactor the calculateTotal method to improve performance from O(n²) to O(n) using a HashMap to count occurrences in a single pass, and then add comprehensive unit tests.
  ow I'll add comprehensive unit tests to verify that the refactored method produces identical output to the original implementation:
- Decision: Accept
  Reason:
- Complexity reduced from O(n²) to O(n), unit tests added to ensure behavior is preserved.

-Convert this blocking IO controller into an async streaming implementation and include a unit test or integration test
-Decision: Rejected
Reason:
- Added unnessary complexity without significant performance gain for the expected load
.
- Tests run (commands + summary output):
- e.g., `mvn test` => PASS
- (base) ashish@Ashishs-MacBook-Pro copilot-day5-java % mvn test
  [INFO] Scanning for projects...
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-parent/3.1.4/spring-boot-starter-parent-3.1.4.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-parent/3.1.4/spring-boot-starter-parent-3.1.4.pom (13 kB at 42 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-dependencies/3.1.4/spring-boot-dependencies-3.1.4.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-dependencies/3.1.4/spring-boot-dependencies-3.1.4.pom (94 kB at 1.2 MB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/apache/groovy/groovy-bom/4.0.15/groovy-bom-4.0.15.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/groovy/groovy-bom/4.0.15/groovy-bom-4.0.15.pom (27 kB at 852 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-bom/14.0.17.Final/infinispan-bom-14.0.17.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-bom/14.0.17.Final/infinispan-bom-14.0.17.Final.pom (24 kB at 749 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-build-configuration-parent/14.0.17.Final/infinispan-build-configuration-parent-14.0.17.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-build-configuration-parent/14.0.17.Final/infinispan-build-configuration-parent-14.0.17.Final.pom (24 kB at 816 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jersey/jersey-bom/3.1.3/jersey-bom-3.1.3.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jersey/jersey-bom/3.1.3/jersey-bom-3.1.3.pom (19 kB at 714 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-bom/11.0.16/jetty-bom-11.0.16.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-bom/11.0.16/jetty-bom-11.0.16.pom (19 kB at 607 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-bom/1.11.4/micrometer-bom-1.11.4.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-bom/1.11.4/micrometer-bom-1.11.4.pom (7.9 kB at 283 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-tracing-bom/1.1.5/micrometer-tracing-bom-1.1.5.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-tracing-bom/1.1.5/micrometer-tracing-bom-1.1.5.pom (4.6 kB at 157 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-bom/2022.0.11/reactor-bom-2022.0.11.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-bom/2022.0.11/reactor-bom-2022.0.11.pom (4.8 kB at 177 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/amqp/spring-amqp-bom/3.0.9/spring-amqp-bom-3.0.9.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/amqp/spring-amqp-bom/3.0.9/spring-amqp-bom-3.0.9.pom (3.4 kB at 125 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/batch/spring-batch-bom/5.0.3/spring-batch-bom-5.0.3.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/batch/spring-batch-bom/5.0.3/spring-batch-bom-5.0.3.pom (3.2 kB at 116 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-bom/2023.0.4/spring-data-bom-2023.0.4.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-bom/2023.0.4/spring-data-bom-2023.0.4.pom (5.5 kB at 190 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/6.0.12/spring-framework-bom-6.0.12.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/6.0.12/spring-framework-bom-6.0.12.pom (5.8 kB at 208 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/integration/spring-integration-bom/6.1.3/spring-integration-bom-6.1.3.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/integration/spring-integration-bom/6.1.3/spring-integration-bom-6.1.3.pom (9.9 kB at 367 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/security/spring-security-bom/6.1.4/spring-security-bom-6.1.4.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/security/spring-security-bom/6.1.4/spring-security-bom-6.1.4.pom (5.3 kB at 190 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/session/spring-session-bom/3.1.2/spring-session-bom-3.1.2.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/session/spring-session-bom/3.1.2/spring-session-bom-3.1.2.pom (2.9 kB at 111 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/ws/spring-ws-bom/4.0.6/spring-ws-bom-4.0.6.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/ws/spring-ws-bom/4.0.6/spring-ws-bom-4.0.6.pom (3.5 kB at 129 kB/s)
  [INFO]
  [INFO] ----------------------< com.example:orderservice >----------------------
  [INFO] Building orderservice 1.0-SNAPSHOT
  [INFO]   from pom.xml
  [INFO] --------------------------------[ jar ]---------------------------------
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/3.1.4/spring-boot-maven-plugin-3.1.4.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/3.1.4/spring-boot-maven-plugin-3.1.4.pom (3.4 kB at 116 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/3.1.4/spring-boot-maven-plugin-3.1.4.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/3.1.4/spring-boot-maven-plugin-3.1.4.jar (131 kB at 2.6 MB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-webflux/3.1.4/spring-boot-starter-webflux-3.1.4.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-webflux/3.1.4/spring-boot-starter-webflux-3.1.4.pom (2.9 kB at 83 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter/3.1.4/spring-boot-starter-3.1.4.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter/3.1.4/spring-boot-starter-3.1.4.pom (3.0 kB at 113 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/3.1.4/spring-boot-3.1.4.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/3.1.4/spring-boot-3.1.4.pom (2.2 kB at 81 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-core/6.0.12/spring-core-6.0.12.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-core/6.0.12/spring-core-6.0.12.pom (2.0 kB at 70 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jcl/6.0.12/spring-jcl-6.0.12.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jcl/6.0.12/spring-jcl-6.0.12.pom (1.8 kB at 63 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context/6.0.12/spring-context-6.0.12.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context/6.0.12/spring-context-6.0.12.pom (2.6 kB at 96 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aop/6.0.12/spring-aop-6.0.12.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aop/6.0.12/spring-aop-6.0.12.pom (2.2 kB at 82 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-beans/6.0.12/spring-beans-6.0.12.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-beans/6.0.12/spring-beans-6.0.12.pom (2.0 kB at 75 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-expression/6.0.12/spring-expression-6.0.12.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-expression/6.0.12/spring-expression-6.0.12.pom (2.1 kB at 74 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/3.1.4/spring-boot-autoconfigure-3.1.4.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/3.1.4/spring-boot-autoconfigure-3.1.4.pom (2.1 kB at 79 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-logging/3.1.4/spring-boot-starter-logging-3.1.4.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-logging/3.1.4/spring-boot-starter-logging-3.1.4.pom (2.5 kB at 95 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-json/3.1.4/spring-boot-starter-json-3.1.4.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-json/3.1.4/spring-boot-starter-json-3.1.4.pom (3.1 kB at 106 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-web/6.0.12/spring-web-6.0.12.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-web/6.0.12/spring-web-6.0.12.pom (2.4 kB at 92 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.11.4/micrometer-observation-1.11.4.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.11.4/micrometer-observation-1.11.4.pom (3.9 kB at 138 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.11.4/micrometer-commons-1.11.4.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.11.4/micrometer-commons-1.11.4.pom (3.4 kB at 123 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.15.2/jackson-databind-2.15.2.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.15.2/jackson-databind-2.15.2.pom (19 kB at 644 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-base/2.15.2/jackson-base-2.15.2.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-base/2.15.2/jackson-base-2.15.2.pom (11 kB at 389 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.15.2/jackson-annotations-2.15.2.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.15.2/jackson-annotations-2.15.2.pom (7.1 kB at 228 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.15.2/jackson-core-2.15.2.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.15.2/jackson-core-2.15.2.pom (9.8 kB at 287 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.15.2/jackson-datatype-jdk8-2.15.2.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.15.2/jackson-datatype-jdk8-2.15.2.pom (2.6 kB at 89 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-modules-java8/2.15.2/jackson-modules-java8-2.15.2.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-modules-java8/2.15.2/jackson-modules-java8-2.15.2.pom (3.1 kB at 107 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.15.2/jackson-datatype-jsr310-2.15.2.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.15.2/jackson-datatype-jsr310-2.15.2.pom (4.9 kB at 182 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.15.2/jackson-module-parameter-names-2.15.2.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.15.2/jackson-module-parameter-names-2.15.2.pom (4.4 kB at 145 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-reactor-netty/3.1.4/spring-boot-starter-reactor-netty-3.1.4.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-reactor-netty/3.1.4/spring-boot-starter-reactor-netty-3.1.4.pom (2.1 kB at 73 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/netty/reactor-netty-http/1.1.11/reactor-netty-http-1.1.11.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/netty/reactor-netty-http/1.1.11/reactor-netty-http-1.1.11.pom (4.3 kB at 138 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http/4.1.97.Final/netty-codec-http-4.1.97.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http/4.1.97.Final/netty-codec-http-4.1.97.Final.pom (4.2 kB at 150 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-parent/4.1.97.Final/netty-parent-4.1.97.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-parent/4.1.97.Final/netty-parent-4.1.97.Final.pom (83 kB at 2.1 MB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-common/4.1.97.Final/netty-common-4.1.97.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-common/4.1.97.Final/netty-common-4.1.97.Final.pom (12 kB at 407 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-buffer/4.1.97.Final/netty-buffer-4.1.97.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-buffer/4.1.97.Final/netty-buffer-4.1.97.Final.pom (1.6 kB at 56 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport/4.1.97.Final/netty-transport-4.1.97.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport/4.1.97.Final/netty-transport-4.1.97.Final.pom (2.2 kB at 68 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver/4.1.97.Final/netty-resolver-4.1.97.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver/4.1.97.Final/netty-resolver-4.1.97.Final.pom (1.6 kB at 59 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec/4.1.97.Final/netty-codec-4.1.97.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec/4.1.97.Final/netty-codec-4.1.97.Final.pom (5.3 kB at 183 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler/4.1.97.Final/netty-handler-4.1.97.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler/4.1.97.Final/netty-handler-4.1.97.Final.pom (4.6 kB at 178 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-unix-common/4.1.97.Final/netty-transport-native-unix-common-4.1.97.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-unix-common/4.1.97.Final/netty-transport-native-unix-common-4.1.97.Final.pom (29 kB at 980 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/4.1.97.Final/netty-codec-http2-4.1.97.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/4.1.97.Final/netty-codec-http2-4.1.97.Final.pom (5.0 kB at 172 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns/4.1.97.Final/netty-resolver-dns-4.1.97.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns/4.1.97.Final/netty-resolver-dns-4.1.97.Final.pom (3.7 kB at 138 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-dns/4.1.97.Final/netty-codec-dns-4.1.97.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-dns/4.1.97.Final/netty-codec-dns-4.1.97.Final.pom (2.7 kB at 104 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns-native-macos/4.1.97.Final/netty-resolver-dns-native-macos-4.1.97.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns-native-macos/4.1.97.Final/netty-resolver-dns-native-macos-4.1.97.Final.pom (18 kB at 600 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns-classes-macos/4.1.97.Final/netty-resolver-dns-classes-macos-4.1.97.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns-classes-macos/4.1.97.Final/netty-resolver-dns-classes-macos-4.1.97.Final.pom (2.0 kB at 69 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-epoll/4.1.97.Final/netty-transport-native-epoll-4.1.97.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-epoll/4.1.97.Final/netty-transport-native-epoll-4.1.97.Final.pom (19 kB at 686 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-classes-epoll/4.1.97.Final/netty-transport-classes-epoll-4.1.97.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-classes-epoll/4.1.97.Final/netty-transport-classes-epoll-4.1.97.Final.pom (2.1 kB at 82 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/netty/reactor-netty-core/1.1.11/reactor-netty-core-1.1.11.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/netty/reactor-netty-core/1.1.11/reactor-netty-core-1.1.11.pom (3.9 kB at 131 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler-proxy/4.1.97.Final/netty-handler-proxy-4.1.97.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler-proxy/4.1.97.Final/netty-handler-proxy-4.1.97.Final.pom (3.5 kB at 127 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-socks/4.1.97.Final/netty-codec-socks-4.1.97.Final.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-socks/4.1.97.Final/netty-codec-socks-4.1.97.Final.pom (2.5 kB at 94 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-core/3.5.10/reactor-core-3.5.10.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-core/3.5.10/reactor-core-3.5.10.pom (2.1 kB at 77 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-webflux/6.0.12/spring-webflux-6.0.12.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-webflux/6.0.12/spring-webflux-6.0.12.pom (2.6 kB at 103 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-test/3.1.4/spring-boot-starter-test-3.1.4.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-test/3.1.4/spring-boot-starter-test-3.1.4.pom (4.9 kB at 187 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test/3.1.4/spring-boot-test-3.1.4.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test/3.1.4/spring-boot-test-3.1.4.pom (2.0 kB at 78 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test-autoconfigure/3.1.4/spring-boot-test-autoconfigure-3.1.4.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test-autoconfigure/3.1.4/spring-boot-test-autoconfigure-3.1.4.pom (2.5 kB at 88 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.14.8/byte-buddy-1.14.8.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.14.8/byte-buddy-1.14.8.pom (16 kB at 396 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-parent/1.14.8/byte-buddy-parent-1.14.8.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-parent/1.14.8/byte-buddy-parent-1.14.8.pom (62 kB at 1.7 MB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.14.8/byte-buddy-agent-1.14.8.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.14.8/byte-buddy-agent-1.14.8.pom (10 kB at 387 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-test/6.0.12/spring-test-6.0.12.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-test/6.0.12/spring-test-6.0.12.pom (2.1 kB at 79 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-test/3.5.10/reactor-test-3.5.10.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-test/3.5.10/reactor-test-3.5.10.pom (2.1 kB at 81 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-webflux/3.1.4/spring-boot-starter-webflux-3.1.4.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-webflux/3.1.4/spring-boot-starter-webflux-3.1.4.jar (4.8 kB at 165 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter/3.1.4/spring-boot-starter-3.1.4.jar
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/3.1.4/spring-boot-3.1.4.jar
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context/6.0.12/spring-context-6.0.12.jar
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aop/6.0.12/spring-aop-6.0.12.jar
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-expression/6.0.12/spring-expression-6.0.12.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter/3.1.4/spring-boot-starter-3.1.4.jar (4.8 kB at 67 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/3.1.4/spring-boot-autoconfigure-3.1.4.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context/6.0.12/spring-context-6.0.12.jar (1.2 MB at 11 MB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-logging/3.1.4/spring-boot-starter-logging-3.1.4.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-logging/3.1.4/spring-boot-starter-logging-3.1.4.jar (4.8 kB at 34 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-json/3.1.4/spring-boot-starter-json-3.1.4.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-json/3.1.4/spring-boot-starter-json-3.1.4.jar (4.7 kB at 27 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.15.2/jackson-databind-2.15.2.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-expression/6.0.12/spring-expression-6.0.12.jar (296 kB at 997 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.15.2/jackson-annotations-2.15.2.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/3.1.4/spring-boot-3.1.4.jar (1.5 MB at 5.0 MB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.15.2/jackson-core-2.15.2.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/3.1.4/spring-boot-autoconfigure-3.1.4.jar (1.8 MB at 5.5 MB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.15.2/jackson-datatype-jdk8-2.15.2.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aop/6.0.12/spring-aop-6.0.12.jar (404 kB at 1.2 MB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.15.2/jackson-datatype-jsr310-2.15.2.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.15.2/jackson-annotations-2.15.2.jar (76 kB at 223 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.15.2/jackson-module-parameter-names-2.15.2.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.15.2/jackson-databind-2.15.2.jar (1.6 MB at 4.7 MB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-reactor-netty/3.1.4/spring-boot-starter-reactor-netty-3.1.4.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.15.2/jackson-datatype-jdk8-2.15.2.jar (36 kB at 103 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/netty/reactor-netty-http/1.1.11/reactor-netty-http-1.1.11.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.15.2/jackson-core-2.15.2.jar (549 kB at 1.5 MB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http/4.1.97.Final/netty-codec-http-4.1.97.Final.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.15.2/jackson-module-parameter-names-2.15.2.jar (10 kB at 28 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-common/4.1.97.Final/netty-common-4.1.97.Final.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-reactor-netty/3.1.4/spring-boot-starter-reactor-netty-3.1.4.jar (4.8 kB at 13 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-buffer/4.1.97.Final/netty-buffer-4.1.97.Final.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/netty/reactor-netty-http/1.1.11/reactor-netty-http-1.1.11.jar (451 kB at 1.1 MB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport/4.1.97.Final/netty-transport-4.1.97.Final.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.15.2/jackson-datatype-jsr310-2.15.2.jar (123 kB at 304 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec/4.1.97.Final/netty-codec-4.1.97.Final.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http/4.1.97.Final/netty-codec-http-4.1.97.Final.jar (657 kB at 1.5 MB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler/4.1.97.Final/netty-handler-4.1.97.Final.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-buffer/4.1.97.Final/netty-buffer-4.1.97.Final.jar (307 kB at 630 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/4.1.97.Final/netty-codec-http2-4.1.97.Final.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/4.1.97.Final/netty-codec-http2-4.1.97.Final.jar (484 kB at 865 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns/4.1.97.Final/netty-resolver-dns-4.1.97.Final.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec/4.1.97.Final/netty-codec-4.1.97.Final.jar (345 kB at 598 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver/4.1.97.Final/netty-resolver-4.1.97.Final.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns/4.1.97.Final/netty-resolver-dns-4.1.97.Final.jar (172 kB at 279 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-dns/4.1.97.Final/netty-codec-dns-4.1.97.Final.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver/4.1.97.Final/netty-resolver-4.1.97.Final.jar (38 kB at 61 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns-native-macos/4.1.97.Final/netty-resolver-dns-native-macos-4.1.97.Final-osx-x86_64.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-dns/4.1.97.Final/netty-codec-dns-4.1.97.Final.jar (67 kB at 103 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns-classes-macos/4.1.97.Final/netty-resolver-dns-classes-macos-4.1.97.Final.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns-native-macos/4.1.97.Final/netty-resolver-dns-native-macos-4.1.97.Final-osx-x86_64.jar (19 kB at 28 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-epoll/4.1.97.Final/netty-transport-native-epoll-4.1.97.Final-linux-x86_64.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns-classes-macos/4.1.97.Final/netty-resolver-dns-classes-macos-4.1.97.Final.jar (9.1 kB at 12 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-unix-common/4.1.97.Final/netty-transport-native-unix-common-4.1.97.Final.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-epoll/4.1.97.Final/netty-transport-native-epoll-4.1.97.Final-linux-x86_64.jar (39 kB at 52 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-classes-epoll/4.1.97.Final/netty-transport-classes-epoll-4.1.97.Final.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport/4.1.97.Final/netty-transport-4.1.97.Final.jar (490 kB at 650 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/netty/reactor-netty-core/1.1.11/reactor-netty-core-1.1.11.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-unix-common/4.1.97.Final/netty-transport-native-unix-common-4.1.97.Final.jar (44 kB at 55 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler-proxy/4.1.97.Final/netty-handler-proxy-4.1.97.Final.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/netty/reactor-netty-core/1.1.11/reactor-netty-core-1.1.11.jar (505 kB at 616 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-socks/4.1.97.Final/netty-codec-socks-4.1.97.Final.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler/4.1.97.Final/netty-handler-4.1.97.Final.jar (560 kB at 676 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-web/6.0.12/spring-web-6.0.12.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler-proxy/4.1.97.Final/netty-handler-proxy-4.1.97.Final.jar (25 kB at 30 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-beans/6.0.12/spring-beans-6.0.12.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-common/4.1.97.Final/netty-common-4.1.97.Final.jar (660 kB at 752 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.11.4/micrometer-observation-1.11.4.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-classes-epoll/4.1.97.Final/netty-transport-classes-epoll-4.1.97.Final.jar (147 kB at 168 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.11.4/micrometer-commons-1.11.4.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.11.4/micrometer-observation-1.11.4.jar (71 kB at 71 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-webflux/6.0.12/spring-webflux-6.0.12.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-web/6.0.12/spring-web-6.0.12.jar (1.8 MB at 1.7 MB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-test/3.1.4/spring-boot-starter-test-3.1.4.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-test/3.1.4/spring-boot-starter-test-3.1.4.jar (4.8 kB at 4.6 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test/3.1.4/spring-boot-test-3.1.4.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test/3.1.4/spring-boot-test-3.1.4.jar (248 kB at 228 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test-autoconfigure/3.1.4/spring-boot-test-autoconfigure-3.1.4.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.11.4/micrometer-commons-1.11.4.jar (47 kB at 43 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.14.8/byte-buddy-1.14.8.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-socks/4.1.97.Final/netty-codec-socks-4.1.97.Final.jar (121 kB at 109 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.14.8/byte-buddy-agent-1.14.8.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test-autoconfigure/3.1.4/spring-boot-test-autoconfigure-3.1.4.jar (223 kB at 195 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-core/6.0.12/spring-core-6.0.12.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-beans/6.0.12/spring-beans-6.0.12.jar (857 kB at 643 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jcl/6.0.12/spring-jcl-6.0.12.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.14.8/byte-buddy-agent-1.14.8.jar (257 kB at 192 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-test/6.0.12/spring-test-6.0.12.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jcl/6.0.12/spring-jcl-6.0.12.jar (24 kB at 18 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-test/3.5.10/reactor-test-3.5.10.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-test/3.5.10/reactor-test-3.5.10.jar (136 kB at 96 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-core/3.5.10/reactor-core-3.5.10.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-core/6.0.12/spring-core-6.0.12.jar (1.8 MB at 997 kB/s)
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-webflux/6.0.12/spring-webflux-6.0.12.jar (925 kB at 505 kB/s)
  Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-test/6.0.12/spring-test-6.0.12.jar (831 kB at 385 kB/s)
  Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-core/3.5.10/reactor-core-3.5.10.jar (1.8 MB at 735 kB/s)
  Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.14.8/byte-buddy-1.14.8.jar (4.2 MB at 969 kB/s)
  [INFO]
  [INFO] --- resources:3.3.1:resources (default-resources) @ orderservice ---
  [INFO] skip non existing resourceDirectory /Users/ashish/ashish/learning/Learning/day5/copilot-day5-java/src/main/resources
  [INFO] skip non existing resourceDirectory /Users/ashish/ashish/learning/Learning/day5/copilot-day5-java/src/main/resources
  [INFO]
  [INFO] --- compiler:3.11.0:compile (default-compile) @ orderservice ---
  [INFO] Changes detected - recompiling the module! :source
  [INFO] Compiling 1 source file with javac [debug release 17] to target/classes
  [INFO]
  [INFO] --- resources:3.3.1:testResources (default-testResources) @ orderservice ---
  [INFO] skip non existing resourceDirectory /Users/ashish/ashish/learning/Learning/day5/copilot-day5-java/src/test/resources
  [INFO]
  [INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ orderservice ---
  [INFO] Changes detected - recompiling the module! :dependency
  [INFO] Compiling 2 source files with javac [debug release 17] to target/test-classes
  [INFO]
  [INFO] --- surefire:3.0.0-M9:test (default-test) @ orderservice ---
  Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.0.0-M9/maven-surefire-common-3.0.0-M9.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.0.0-M9/maven-surefire-common-3.0.0-M9.jar (305 kB at 1.4 MB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.0.0-M9/surefire-api-3.0.0-M9.jar
  Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.0.0-M9/surefire-logger-api-3.0.0-M9.jar
  Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.0.0-M9/surefire-extensions-api-3.0.0-M9.jar
  Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.0.0-M9/surefire-booter-3.0.0-M9.jar
  Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.0.0-M9/surefire-extensions-spi-3.0.0-M9.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.0.0-M9/surefire-extensions-spi-3.0.0-M9.jar (8.1 kB at 278 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.0.0-M9/surefire-shared-utils-3.0.0-M9.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.0.0-M9/surefire-logger-api-3.0.0-M9.jar (14 kB at 377 kB/s)
  Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.0.0-M9/surefire-extensions-api-3.0.0-M9.jar (25 kB at 391 kB/s)
  Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.0.0-M9/surefire-api-3.0.0-M9.jar (170 kB at 1.5 MB/s)
  Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.0.0-M9/surefire-booter-3.0.0-M9.jar (117 kB at 920 kB/s)
  Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.0.0-M9/surefire-shared-utils-3.0.0-M9.jar (2.1 MB at 1.8 MB/s)
  [INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
  Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/3.0.0-M9/surefire-junit-platform-3.0.0-M9.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/3.0.0-M9/surefire-junit-platform-3.0.0-M9.jar (27 kB at 863 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/3.0.0-M9/surefire-junit-platform-3.0.0-M9.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/3.0.0-M9/surefire-junit-platform-3.0.0-M9.pom (5.1 kB at 198 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-providers/3.0.0-M9/surefire-providers-3.0.0-M9.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-providers/3.0.0-M9/surefire-providers-3.0.0-M9.pom (2.5 kB at 127 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/common-java5/3.0.0-M9/common-java5-3.0.0-M9.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/common-java5/3.0.0-M9/common-java5-3.0.0-M9.pom (2.7 kB at 117 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.3.2/junit-platform-launcher-1.3.2.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.3.2/junit-platform-launcher-1.3.2.pom (2.2 kB at 106 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-params/5.3.2/junit-jupiter-params-5.3.2.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-params/5.3.2/junit-jupiter-params-5.3.2.pom (2.2 kB at 105 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/2.28.2/mockito-core-2.28.2.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/2.28.2/mockito-core-2.28.2.pom (20 kB at 837 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.9.10/byte-buddy-1.9.10.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.9.10/byte-buddy-1.9.10.pom (10 kB at 382 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-parent/1.9.10/byte-buddy-parent-1.9.10.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-parent/1.9.10/byte-buddy-parent-1.9.10.pom (36 kB at 1.1 MB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.9.10/byte-buddy-agent-1.9.10.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.9.10/byte-buddy-agent-1.9.10.pom (6.0 kB at 302 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/powermock/powermock-reflect/2.0.9/powermock-reflect-2.0.9.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/powermock/powermock-reflect/2.0.9/powermock-reflect-2.0.9.pom (7.9 kB at 303 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.10.14/byte-buddy-1.10.14.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.10.14/byte-buddy-1.10.14.pom (11 kB at 441 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-parent/1.10.14/byte-buddy-parent-1.10.14.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-parent/1.10.14/byte-buddy-parent-1.10.14.pom (41 kB at 1.3 MB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.10.14/byte-buddy-agent-1.10.14.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.10.14/byte-buddy-agent-1.10.14.pom (9.6 kB at 435 kB/s)
  [INFO] Artifact org.assertj:assertj-core:pom:3.23.1 is present in the local repository, but cached from a remote repository ID that is unavailable in current build context, verifying that is downloadable from [central (https://repo.maven.apache.org/maven2, default, releases), apache.snapshots (https://repository.apache.org/snapshots, default, snapshots)]
  [INFO] Artifact org.assertj:assertj-core:pom:3.23.1 is present in the local repository, but cached from a remote repository ID that is unavailable in current build context, verifying that is downloadable from [central (https://repo.maven.apache.org/maven2, default, releases), apache.snapshots (https://repository.apache.org/snapshots, default, snapshots)]
  Downloading from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-core/3.23.1/assertj-core-3.23.1.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-core/3.23.1/assertj-core-3.23.1.pom (0 B at 0 B/s)
  [INFO] Artifact org.assertj:assertj-parent-pom:pom:2.2.17 is present in the local repository, but cached from a remote repository ID that is unavailable in current build context, verifying that is downloadable from [central (https://repo.maven.apache.org/maven2, default, releases), apache.snapshots (https://repository.apache.org/snapshots, default, snapshots)]
  [INFO] Artifact org.assertj:assertj-parent-pom:pom:2.2.17 is present in the local repository, but cached from a remote repository ID that is unavailable in current build context, verifying that is downloadable from [central (https://repo.maven.apache.org/maven2, default, releases), apache.snapshots (https://repository.apache.org/snapshots, default, snapshots)]
  Downloading from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-parent-pom/2.2.17/assertj-parent-pom-2.2.17.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-parent-pom/2.2.17/assertj-parent-pom-2.2.17.pom (0 B at 0 B/s)
  Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.12.10/byte-buddy-1.12.10.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.12.10/byte-buddy-1.12.10.pom (17 kB at 664 kB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-parent/1.12.10/byte-buddy-parent-1.12.10.pom
  Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-parent/1.12.10/byte-buddy-parent-1.12.10.pom (45 kB at 1.4 MB/s)
  Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/common-java5/3.0.0-M9/common-java5-3.0.0-M9.jar
  Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.3.2/junit-platform-launcher-1.3.2.jar
  Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/common-java5/3.0.0-M9/common-java5-3.0.0-M9.jar (17 kB at 578 kB/s)
  Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.3.2/junit-platform-launcher-1.3.2.jar (95 kB at 1.1 MB/s)
  [INFO]
  [INFO] -------------------------------------------------------
  [INFO]  T E S T S
  [INFO] -------------------------------------------------------
  [INFO] Running com.example.OrderServiceTest
  [INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.036 s - in com.example.OrderServiceTest
  [INFO]
  [INFO] Results:
  [INFO]
  [INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0
  [INFO]
  [INFO] ------------------------------------------------------------------------
  [INFO] BUILD SUCCESS
  [INFO] ------------------------------------------------------------------------
  [INFO] Total time:  11.223 s
  [INFO] Finished at: 2025-09-17T15:41:02+05:30
  [INFO] ------------------------------------------------------------------------
  (base) ashish@Ashishs-MacBook-Pro copilot-day5-java %

Final notes / PR link:
- https://github.com/ganeshadd/copilot-day5-java/pull/2
