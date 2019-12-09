package deco.rodrigues.distribuidosrmi.remote

import java.rmi.RemoteException
import java.rmi.server.UnicastRemoteObject

/**
 * Implementação do servidor para chamadas de trabalhadores interessados em vagas
 */
class ServerImpl : UnicastRemoteObject(), ServerInterface {

    @Throws(RemoteException::class)
    override fun echo(msg: String?){
        println("Server called: $msg")
    }


}
