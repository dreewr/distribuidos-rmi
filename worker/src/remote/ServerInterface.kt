package deco.rodrigues.distribuidosrmi.remote

import java.rmi.Remote
import java.rmi.RemoteException

interface ServerInterface: Remote {

    @Throws(RemoteException::class)
    fun echo(msg: String?)

}