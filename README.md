# Overview

The Demo application used in the [Knative Tutorial](https://github.com/redhat-developer-demos/knative-tutorial).

[![Build Status](https://dev.azure.com/kameshsampath/knative-tutorial-greeter/_apis/build/status/redhat-developer-demos.knative-tutorial-greeter?branchName=master)](https://dev.azure.com/kameshsampath/knative-tutorial-greeter/_build/latest?definitionId=3&branchName=master)

The repository has simple greeter application built with two Java frameworks:

- [Quarkus](https://quarkus.io) --> [Sources](./java/quarkus)
- [Spring Boot](https://spring.io/projects/spring-boot) --> [Sources](./java/springboot)

# Container Images

The pre-built container images of this application is available at https://quay.io/rhdevelopers/knative-tutorial-greeter

To pull [Quarkus based image](https://quay.io/repository/rhdevelopers/knative-tutorial-greeter?tag=quarkus&tab=tags) run the following command:

```shell
docker pull quay.io/rhdevelopers/knative-tutorial-greeter:quarkus
```

To pull [SpringBoot based image](https://quay.io/repository/rhdevelopers/knative-tutorial-greeter?tag=sb&tab=tags) run the following command:

```shell
docker pull quay.io/rhdevelopers/knative-tutorial-greeter:sb
```

# Issues

Please log any issues related to this application in [Knative Tutorial Issues](https://github.com/redhat-developer-demos/knative-tutorial/issues).
