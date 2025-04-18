package com.example;

import rife.bld.WebProject;

import java.util.List;

import static rife.bld.dependencies.Repository.*;
import static rife.bld.dependencies.Scope.*;
import static rife.bld.operations.TemplateType.*;

public class EncodingTestBuild extends WebProject {
    public EncodingTestBuild() {
        pkg = "com.example";
        name = "EncodingTest";
        mainClass = "com.example.EncodingTestSite";
        uberJarMainClass = "com.example.EncodingTestSiteUber";
        version = version(0,1,0);

        downloadSources = true;
        repositories = List.of(MAVEN_CENTRAL, RIFE2_RELEASES);
        scope(compile)
            .include(dependency("com.uwyn.rife2", "rife2", version(1,9,1)));
        scope(test)
            .include(dependency("org.jsoup", "jsoup", version(1,18,3)))
            .include(dependency("org.junit.jupiter", "junit-jupiter", version(5,11,4)))
            .include(dependency("org.junit.platform", "junit-platform-console-standalone", version(1,11,4)));
        scope(standalone)
            .include(dependency("org.eclipse.jetty.ee10", "jetty-ee10", version(12,0,16)))
            .include(dependency("org.eclipse.jetty.ee10", "jetty-ee10-servlet", version(12,0,16)))
            .include(dependency("org.slf4j", "slf4j-simple", version(2,0,16)));

        precompileOperation()
            .templateTypes(HTML);
    }

    public static void main(String[] args) {
        new EncodingTestBuild().start(args);
    }
}