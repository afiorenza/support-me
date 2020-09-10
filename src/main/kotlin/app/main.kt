package app

import Env
import io.javalin.Javalin
import me.liuwj.ktorm.database.Database


fun main() {
    val env = Env()

    val port = env.get("PORT")
    val dbName= env.get("DB_NAME")
    val dbPassword= env.get("DB_PASSWORD")
    val dbPort= env.get("DB_PORT")
    val dbServer= env.get("DB_SERVER")
    val dbUser= env.get("DB_USER")

    val database = Database.connect("jdbc:mysql://$dbServer:$dbPort/$dbName?user=$dbUser&password=$dbPassword&useSSL=false")

    val app = Javalin.create().start(port.toInt())

    app.get("/") { ctx ->
        ctx.result("Hello World")
    }
}