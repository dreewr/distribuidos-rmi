package deco.rodrigues.distribuidosrmi.remote

import java.rmi.Remote
import java.rmi.RemoteException

interface WorkerInterface: Remote {

    @Throws(RemoteException::class)
    fun echo(mensagem: String?)

//    @Throws(RemoteException::class)
//    fun notificarCurriculos(msg: String?, titulo: String?)

    @Throws(RemoteException::class)
    fun notificarVagas(/*msg: String?, titulo: String?*/)

    @Throws(RemoteException::class)
    fun getJobs(/*msg: String?, titulo: String?*/)

//    @Throws(RemoteException::class)
//    fun getJobs(/*msg: String?, titulo: String?*/)  getJobs with Filter

    @Throws(RemoteException::class)
    fun postWorker(/*msg: String?, titulo: String?*/)

    @Throws(RemoteException::class)
    fun notifyEmployer(/*msg: String?, titulo: String?*/)

}