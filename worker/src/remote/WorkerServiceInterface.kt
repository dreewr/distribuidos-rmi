package deco.rodrigues.distribuidosrmi.remote

import java.rmi.Remote
import java.rmi.RemoteException

interface WorkerServiceInterface: Remote {

    @Throws(RemoteException::class)
    fun echo(msg: String?)

}