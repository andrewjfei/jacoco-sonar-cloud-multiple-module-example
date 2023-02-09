
# JaCoCo Sonar Cloud Multiple Module Example

A project generated based on a basic archetype.

## Prerequisites

- Java 17
- Maven 3

## Getting Started

Run the following to build the project.

```
mvn clean install
```


## Sonar Cloud Set Up

To set up Sonar Cloud for your project, you will need to have JaCoCo aggregate reporting set up. The JaCoCo report will
be used by Sonar for analysis.

An example of JaCoCo aggregate reporting can be found
[here](https://github.com/andrewjfei/jacoco-aggregation-reporting-example).

Also, the `sonar-maven-plugin` is required for new code analysis. Add the following to your project `pom.xml` file.
Making sure that you replace `${sonar.version}` with a valid version number.

```xml
...
<build>
    ...
    <plugins>
        ...
        <plugin>
            <groupId>org.sonarsource.scanner.maven</groupId>
            <artifactId>sonar-maven-plugin</artifactId>
            <version>${sonar.version}</version>
        </plugin>
        ...
    </plugins>
    ...
</build>
...
```

Now that you have everything set up, you are ready to analyse your code using Sonar.

### Running Locally

Run the following command in your project root directory to get a Sonar Cloud Analysis on the current state of your
project.

```
mvn clean verify sonar:sonar \
    -Dsonar.login=<SONAR_TOKEN> \
    -Dsonar.host.url=https://sonarcloud.io \
    -Dsonar.organization=<SONAR_ORGANSATION_KEY> \
    -Dsonar.projectKey=<SONAR_PROJECT_KEY>
```

After Sonar has successfully analysed your project, you can navigate to
`https://sonarcloud.io/dashboard?id=<SONAR_PROJECT_KEY>` to view your results.

### Running In CI

> Sonar quality gates currently do not run for forked pull-requests (09-02-2023)

Please refer to the [Sonar Cloud Documentation](https://docs.sonarcloud.io/advanced-setup/ci-based-analysis/overview/)
on how to set up test coverage analysis via CI.


