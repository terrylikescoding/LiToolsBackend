## project structure
```text
src
├── main
│   ├── java
│   │   └── com
│   │       └── litools
│   │               ├── config   # Spring configuration files
│   │               ├── controller   # REST API controllers
│   │               ├── entity   # JPA entities
│   │               ├── repository   # JPA repositories
│   │               ├── security   # Spring Security configuration
│   │               └── service   # business logic services
│   │               ├── LitoolsBackendApplication   # Spring Boot application entry point
│   ├── resources
│   │   └── application.yml   # Spring application properties
└── test   # unit and integration tests
└── java
└── com
└── example
└── demo
└── service
└── MyServiceTest.java  # example test class
```


## Todo
- [ ] 使用nginx存放文件等，不要直接放到resouce中，数据库中存nginx服务器中的地址即可
- [ ] 直接使用docker compose一键部署