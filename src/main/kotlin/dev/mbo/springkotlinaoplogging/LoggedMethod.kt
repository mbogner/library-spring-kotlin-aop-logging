package dev.mbo.springkotlinaoplogging

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class LoggedMethod(
    val mask: Array<String> = []
)
