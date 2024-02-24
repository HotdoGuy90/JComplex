# JComplex

A Java Library that adds support to Complex Numbers. Inspired by my other project, ComplexJS.

## Table of Contents

* [Installation](https://github.com/HotdoGuy90/JComplex/blob/master/README.md#installation)
* [Usage](https://github.com/HotdoGuy90/JComplex/master/blob/README.md#usage)

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

The package id for JComplex is `net.hotdoguy90.Complex` I tried to make this close to my other project ComplexJS, to avoid confusion. Because of this, and because Java's syntax is very close to Javascript's syntax (hence the name) I don't even need to make a documentation, since the [documentation for ComplexJS](https://github.com/HotdoGuy90/ComplexJS/tree/master/README.md) is so close. (I would not do any copy/pasting though. Java and Javascript are *similar,* just not the same.)