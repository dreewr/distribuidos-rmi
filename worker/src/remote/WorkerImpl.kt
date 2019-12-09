package deco.rodrigues.distribuidosrmi.remote

import java.rmi.server.UnicastRemoteObject

class WorkerImpl(serverInterface: ServerInterface): WorkerInterface, UnicastRemoteObject() {

    override fun echo(mensagem: String?) {
        println("WorkerImpl - echo: $mensagem")
    }
}