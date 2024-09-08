object Dependencies {
    object Modules {
        object Core {
            const val commons = ":core:commons"
        }

        object Data {
            const val remote = ":data_remote"
            //const val local = ":data_local"
        }

        object Repository {
            const val repository = ":repository"
        }
        object UseCase {
            const val characters = ":domain:characters_usecase"
        }
    }

    object Android {
        const val androidCoreKotlin = "androidx.core:core-ktx:1.10.0"
        const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.7.1"
        const val systemUiController = "com.google.accompanist:accompanist-systemuicontroller:0.31.0-alpha"
        const val navigationCommon = "androidx.navigation:navigation-common-ktx:2.7.0"
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3"
        const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3"
        const val roomRuntime = "androidx.room:room-runtime:2.5.1"
        const val roomKotlin = "androidx.room:room-ktx:2.5.1"
        const val roomCompiler = "androidx.room:room-compiler:2.5.1"
    }

    object External {
        const val koinCore = "io.insert-koin:koin-core:3.4.0"
        const val koinAndroid = "io.insert-koin:koin-android:3.4.0"
        const val okHttp = "com.squareup.okhttp3:okhttp:4.11.0"
        const val okHttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:4.11.0"
        const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
        const val retrofitConverterGson = "com.squareup.retrofit2:converter-gson:2.9.0"
    }

    object Test {
        const val jUnit = "junit:junit:4.13.2"
        const val mockK = "io.mockk:mockk:1.13.4"
        const val assertK = "com.willowtreeapps.assertk:assertk-jvm:0.25"
        const val coreTest = "androidx.arch.core:core-testing:2.1.0"
        const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3"
        const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3"
    }

    object AndroidTest {
        const val jUnit = "androidx.test.ext:junit:1.1.5"
        const val espressoCore = "androidx.test.espresso:espresso-core:3.5.1"
        const val composeUiTest = "androidx.compose.ui:ui-test-junit4:1.4.3"
    }
}
