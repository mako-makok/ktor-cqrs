plugins {
    java
    alias(libs.plugins.flyway)
}

repositories {
    mavenCentral()
}

buildscript {
    dependencies {
        classpath(libs.flyway.database.postgresql)
    }
}

dependencies {
    implementation(libs.flyway.core)
    runtimeOnly("org.postgresql:postgresql:42.7.3")
}

flyway {
    driver = "org.postgresql.Driver"
    url = "jdbc:postgresql://localhost:5432/example"
    user = "postgres"
    password = "postgres"
    schemas = arrayOf("public")
    cleanDisabled = false
}
