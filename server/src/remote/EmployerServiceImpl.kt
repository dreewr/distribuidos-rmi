package deco.rodrigues.distribuidosrmi.remote

import java.rmi.server.UnicastRemoteObject

class EmployerServiceImpl: UnicastRemoteObject(), EmployerServiceInterface {
    override fun echo(mensagem: String?) {
        println("Employer Service: $mensagem")
    }

    override fun notifyWorkers(msg: String?, title: String?) {
        println("Notify $msg")
    }


}