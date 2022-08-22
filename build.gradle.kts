import com.soywiz.korge.gradle.*

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
	alias(libs.plugins.korge)
}

korge {
	id = "io.triodos.mukduk"

// To enable all targets at once
//	targetAll()

// To enable targets based on properties/environment variables
	//targetDefault()

// To selectively enable targets
	targetJvm()
	targetJs()
//	targetDesktop()
//	targetIos()
//	targetAndroidIndirect() // targetAndroidDirect()

	serializationJson()
	//targetAndroidDirect()
}

tasks.register("stage") {
    dependsOn("build", "clean")
}
