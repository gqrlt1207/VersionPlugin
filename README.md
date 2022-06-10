# TestVersionPlugin



## Purpose

The purpose of this plugin is to grant the value of CI_COMMIT_TAG to project.version if CI_COMMIT_TAG is not empty, else set the value of project.version to 'DEVELOPMENT'.

## How to use it

Using the plugins DSL:

```
plugins {
    id 'io.github.gqrlt1207.versionplugin' version '1.0.0'
}
```
Using legacy plugin application:

```
buildscript {
  repositories {
    maven {
      url "https://plugins.gradle.org/m2/"
    }
  }
  dependencies {
    classpath "io.github.gqrlt1207:versionplugin:1.0.0"
  }
}

apply plugin: "io.github.gqrlt1207.versionplugin"
```
## Applied scenarios:
This is only tested with GitLab, typically, just use the value of 'CI_COMMIT_TAG' to replace the project.version in build.gradle file.
