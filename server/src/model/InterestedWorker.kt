package deco.rodrigues.distribuidosrmi.model

import deco.rodrigues.distribuidosrmi.remote.WorkerInterface
import java.io.Serializable
import java.rmi.RemoteException


class InterestedWorker(val workerInterface: WorkerInterface, val area: String) :
    Serializable {

    @Throws(RemoteException::class)
    fun emitNotification(msg: String?) {
       // workerInterface.emitNofication(msg, "123")
    }

}
