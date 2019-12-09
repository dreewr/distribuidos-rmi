package deco.rodrigues.distribuidosrmi

import deco.rodrigues.distribuidosrmi.remote.EmployerImpl
import deco.rodrigues.distribuidosrmi.remote.EmployerServiceInterface
import java.rmi.registry.LocateRegistry

class Employer{

    companion object{
        @JvmStatic fun main(args: Array<String>){
            println("Init Employer\n")

            val reg = LocateRegistry.getRegistry(1111)
            val service: EmployerServiceInterface = reg.lookup("Employer Service") as EmployerServiceInterface
            val employer = EmployerImpl(service)    //referência que é passada em métodos do servidor

            service.echo("Employer Connected")



    }}

}