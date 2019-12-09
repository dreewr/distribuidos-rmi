package deco.rodrigues.distribuidosrmi.remote

import java.rmi.server.UnicastRemoteObject

class WorkerImpl(workerServiceInterface: WorkerServiceInterface): WorkerInterface, UnicastRemoteObject() {

    override fun echo(mensagem: String?) {
        println("WorkerImpl - echo: $mensagem")
    }
}