# fastFFI: Modern and Efficient FFI for Java and C++

Basically, fastFFI has three components:

* [FFI](./ffi): DSL and API used to develop FFI applications.
* [Annotation Processor](./annotation-processor): the code generator for FFI.
* LLVM4JNI: LLVM4JNI has two submodules:
    * LLVM4JNI: a tool that translates LLVM bitcode into Java bytecode.
    * [LLVM4JNI Runtime](./llvm4jni-runtime): the runtime component used by generated bytecode.

An FFI application must include `ffi` and `llvm4jni-runtime` in its class path as runtime dependency.

## Build

1. Checkout source code 

```bash
git clone <path-to-fastffi> fastffi
```

2. Prepare building environment

```bash
export LLVM11_HOME=<path-to-llvm-11>
```

`LLVM11_HOME` should point to the home of LLVM 11. In Ubuntu, it is at `/usr/lib/llvm-11`.
Basically, the build procedure the following binary:

* `$LLVM11_HOME/bin/clang++`
* `$LLVM11_HOME/bin/ld.lld`
* `$LLVM11_HOME/lib/cmake/llvm`


3. Use fastFFI with Maven.

```xml
<dependencies>
    <!-- The FFI annotation -->
    <dependency>
        <groupId>com.alibaba.fastffi</groupId>
        <artifactId>ffi</artifactId>
        <version>0.1</version>
    </dependency>
    <!-- The FFI annotation processor for code generation -->
    <dependency>
        <groupId>com.alibaba.fastffi</groupId>
        <artifactId>annotation-processor</artifactId>
        <version>0.1</version>
    </dependency>
    <!-- The runtime component of LLVM4JNI -->
    <dependency>
        <groupId>com.alibaba.fastffi</groupId>
        <artifactId>llvm4jni-runtime</artifactId>
        <version>0.1</version>
    </dependency>
</dependencies>
```

4. Use maven to build your applications. The generated code, including Java and C++ code, is available in `<project.dir>/target/generated-source/annotations`


## Options

A Java programming language compiler must support standard options in the format `-Akey[=value]`. fastFFI provides the following options:

1. `fastffi.handleException`: whether generating code to handle C++ exceptions
    * default value: `false`
2. `fastffi.manualBoxing`: using `new Integer()` or `new Long()` to box a primitive integer.
    * default value: `true`
    * Auto boxing uses `Integer.valueOf` or `Long.valueOf`, which cannot be properly handled by the escape analysis of C2 compiler.
3. `fastffi.strictTypeCheck`
    * default value: `false`
4. `fastffi.nullReturnValueCheck`
    * default value: `true`
    * insert additional null check for native pointers
5. `fastffi.cxxOutputLocation`
    * default value: `CLASS_OUTPUT`
    * accept values: `CLASS_OUTPUT`, `SOURCE_OUTPUT`, `NATIVE_HEADER_OUTPUT`.
6. `fastffi.traceJNICalls`
    * default value: `false`
    * generate stuffs to trace the invocations of JNI wrappers
7. `fastffi.compactFFINames`
    * default value: `true`
    * generate compact FFI wrapper type names, non-compact names will benefit debugging, but increase the binary size

Usage:

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.8.0</version>
    <configuration>
        <compilerVersion>${javac.target}</compilerVersion>
        <source>${javac.target}</source>
        <target>${javac.target}</target>
        <compilerArgs>
            <arg>-Afastffi.strictTypeCheck=true</arg>
        </compilerArgs>
    </configuration>
</plugin>
```

## Build Mac OS

0. Install a JDK (JDK 8 and 11)

1. Install LLVM 11, Maven and CMake

```
brew install llvm@11 cmake maven
```

2. Set ENV

```
export LLVM11_HOME=/usr/local/opt/llvm@11
```

## FAQ

TBA
