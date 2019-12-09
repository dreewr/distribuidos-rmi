package deco.rodrigues.distribuidosrmi.remote

import java.rmi.Remote
import java.rmi.RemoteException

interface EmployerServiceInterface: Remote {
    @Throws(RemoteException::class)
    fun echo(mensagem: String?)

    @Throws(RemoteException::class)
    fun notifyWorkers(msg: String?, title: String?)

}