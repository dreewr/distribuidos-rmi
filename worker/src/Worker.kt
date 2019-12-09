package deco.rodrigues.distribuidosrmi

import deco.rodrigues.distribuidosrmi.remote.WorkerImpl
import deco.rodrigues.distribuidosrmi.remote.WorkerServiceInterface
import java.rmi.registry.LocateRegistry

class Worker{

    companion object{
        @JvmStatic fun main(args: Array<String>){
            println("Init Employer\n")

            val reg = LocateRegistry.getRegistry(1112)
            val service: WorkerServiceInterface = reg.lookup("Worker Service") as WorkerServiceInterface
            val worker = WorkerImpl(service)    //referência que é passada em métodos do servidor

            service.echo("Worker Connected")


    }}

}