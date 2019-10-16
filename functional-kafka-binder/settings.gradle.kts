pluginManagement {
    repositories {
        gradlePluginPortal()
        maven {
            url = uri("https://repo.spring.io/milestone")
        }
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "org.springframework.boot") {
                useModule("org.springframework.boot:spring-boot-gradle-plugin:${requested.version}")
            }
        }
    }
}
rootProject.name = "functional-kafka-binder"
