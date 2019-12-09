package deco.rodrigues.distribuidosrmi

import deco.rodrigues.distribuidosrmi.remote.EmployerServiceImpl
import deco.rodrigues.distribuidosrmi.remote.WorkerServiceImpl
import java.rmi.registry.LocateRegistry

class Server {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            println("\n Server Started")

            val employerService = LocateRegistry.createRegistry(1111)
            val workerService = LocateRegistry.createRegistry(1112)

            val employerServer = EmployerServiceImpl()
            val workerServer = WorkerServiceImpl()

            employerService.rebind("Employer Service", employerServer)
            workerService.rebind("Worker Service", workerServer)

            println("\n Server Ready")

        }
    }


}
