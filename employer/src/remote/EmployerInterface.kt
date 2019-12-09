package deco.rodrigues.distribuidosrmi.remote

import java.rmi.Remote
import java.rmi.RemoteException

interface EmployerInterface: Remote {

    @Throws(RemoteException::class)
    fun echo(mensagem: String?)


//    @Throws(RemoteException::class)
//    fun (mensagem: String?)


}