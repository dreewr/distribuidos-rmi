package deco.rodrigues.distribuidosrmi.remote

import model.Job
import java.rmi.Remote
import java.rmi.RemoteException
import java.util.*

interface EmployerServiceInterface : Remote {

    @Throws(RemoteException::class)
    fun echo(mensagem: String?)

    @Throws(RemoteException::class)
    fun notifyWorkers(msg: String?, title: String?)
}