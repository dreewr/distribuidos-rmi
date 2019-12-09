package deco.rodrigues.distribuidosrmi

import deco.rodrigues.distribuidosrmi.remote.EmployerImpl
import deco.rodrigues.distribuidosrmi.remote.ServerInterface
import java.rmi.registry.LocateRegistry

class Employer{

    companion object{
        @JvmStatic fun main(args: Array<String>){
            println("Init Employer\n")

            val reg = LocateRegistry.getRegistry(1111)
            val server: ServerInterface = reg.lookup("Server") as ServerInterface
            val employer = EmployerImpl(server)    //referência que é passada em métodos do servidor

            server.echo("Employer Connected")



    }}

}