package deco.rodrigues.distribuidosrmi

import deco.rodrigues.distribuidosrmi.remote.ServerImpl
import java.rmi.registry.LocateRegistry

class Server {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            println("\n Server Started")

            val registry = LocateRegistry.createRegistry(1111)
            val server = ServerImpl()

            registry.rebind("Server", server)

            println("\n Server Ready")

        }
    }


}
