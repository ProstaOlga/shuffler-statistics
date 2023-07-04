rootProject.name = "shuffler-statistics"

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenLocal()

        maven {
            name = "shuffler-catalog"
            url = uri("https://maven.pkg.github.com/QAcuma/shuffler-catalog")
            credentials {
                username = System.getenv("GH_USERNAME")
                password = System.getenv("GH_TOKEN")
            }
        }
    }

    versionCatalogs {
        create("libs") {
            from("ru.acuma:shuffler-catalog:2.0.7")
        }
    }
}