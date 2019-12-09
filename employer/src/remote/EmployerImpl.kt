package deco.rodrigues.distribuidosrmi.remote

import java.rmi.server.UnicastRemoteObject

class EmployerImpl(server: ServerInterface): EmployerInterface, UnicastRemoteObject() {
    
    override fun echo(mensagem: String?) {
        println("Employer: Impl $mensagem")
    }
}