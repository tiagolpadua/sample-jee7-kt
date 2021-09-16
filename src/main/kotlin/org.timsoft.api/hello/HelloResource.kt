package org.timsoft.api.hello

import javax.enterprise.context.RequestScoped
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@RequestScoped
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
open class HelloResource {
    @GET
    open fun hello(): Response = Response.ok("Hello Kotlin Resource!").build()
}