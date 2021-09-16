package org.timsoft.api

import javax.ws.rs.ApplicationPath
import javax.ws.rs.core.Application
import org.timsoft.api.hello.HelloResource

@ApplicationPath("/api")
open class HelloApplicationConfig : Application() {
    override fun getClasses() = mutableSetOf(HelloResource::class.java)
}