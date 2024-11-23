# JComplex

A Java Library that adds support to Complex Numbers. Inspired by my other project, ComplexJS.

## Table of Contents

* [Installation](https://github.com/HotdoGuy90/JComplex/blob/master/README.md#installation)
* [Usage](https://github.com/HotdoGuy90/JComplex/blob/master/README.md#usage)

## Installation

You can extract the contents from `JComplex-x.x.x.jar` (which can be found [here](https://github.com/HotdoGuy90/JComplex/releases)) and add its directory into your project. Or, If your project uses Gradle, in your `build.gradle` file, add the following repository:
```groovy
repositories {
    maven {
        url "https://hotdoguy90.github.io/api/maven"
    }
}
```

Then, in for your dependencies for `build.gradle` add:

```groovy
dependencies {
    implementation "net.hotdoguy90:JComplex:1.+"
}
```

## Usage

You can import the package to your java file using:
```java
import net.hotdoguy90.Complex

Complex c = new Complex();
```
For a full fledged documentation, refer to this [article](https://github.com/HotdoGuy90/ComplexJS/tree/master/README.md).
