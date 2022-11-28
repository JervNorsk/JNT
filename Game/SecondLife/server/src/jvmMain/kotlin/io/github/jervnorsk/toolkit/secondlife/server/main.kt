package io.github.jervnorsk.toolkit.secondlife.server

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.module() {
    routing {
        get("/") {
            call.respondText("Hello, world!")
        }

    }
}
