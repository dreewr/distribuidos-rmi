package deco.rodrigues.distribuidosrmi.remote

import java.rmi.Remote
import java.rmi.RemoteException

interface EmployerInterface: Remote {

    @Throws(RemoteException::class)
    fun echo(mensagem: String?)

//    @Throws(RemoteException::class)
//    fun notificarCurriculos(msg: String?, titulo: String?)

//    @Throws(RemoteException::class)
//    fun notificarVagas(/*msg: String?, titulo: String?*/)
//
//    @Throws(RemoteException::class)
//    fun getWorkers(/*msg: String?, titulo: String?*/)

//    @Throws(RemoteException::class)
//    fun getWorkers(/*msg: String?, titulo: String?*/)  getWorkers with Filter

//    @Throws(RemoteException::class)
//    fun postJob(/*msg: String?, titulo: String?*/)

}