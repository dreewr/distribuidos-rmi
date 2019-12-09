package deco.rodrigues.distribuidosrmi

import deco.rodrigues.distribuidosrmi.remote.WorkerImpl
import deco.rodrigues.distribuidosrmi.remote.ServerInterface
import java.rmi.registry.LocateRegistry

class Worker{

    companion object{
        @JvmStatic fun main(args: Array<String>){
            println("Init Worker\n")

            val reg = LocateRegistry.getRegistry(1111)
            val server: ServerInterface = reg.lookup("Server") as ServerInterface
            val worker = WorkerImpl(server)    //referência que é passada em métodos do servidor

            server.echo("Worker Connected")


    }}

}