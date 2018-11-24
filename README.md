# Distributed tracing using Spring Cloud sleuth in Spring Boot

This Project uses shows how to send tracing information to zipkin using Spring cloud sleuth. It also shows how to send the logs from loback to ELK stack using logstash.

This project has two SpringBoot applications just to demonstrate distributed tracing.
- BackendGraabityTracingApplication
  - This application has one REST service available at /api/date
  - This application is launched on port 8082
- FrontendGraabityTracingApplication
  - This application has one REST service available at /rest/hello
  - This application is launched on port 8081
- Both applications expect an environment variable called `ZIPKIN_BASE_URL`