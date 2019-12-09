package deco.rodrigues.distribuidosrmi.remote

import java.rmi.Remote
import java.rmi.RemoteException

interface WorkerInterface: Remote {

    @Throws(RemoteException::class)
    fun echo(mensagem: String?)


}