package deco.rodrigues.distribuidosrmi.remote

import java.rmi.server.UnicastRemoteObject

class EmployerImpl(service: EmployerServiceInterface): EmployerInterface, UnicastRemoteObject() {
    
    override fun echo(mensagem: String?) {
        println("Employer: Impl $mensagem")
    }
}