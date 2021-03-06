package oop.inheritance.verifone.v240m;

import oop.inheritance.data.Transaction;
import oop.inheritance.data.TransactionResponse;
import oop.inheritance.tpv.CommunicationDevice;

public class VerifoneV240mEthernet implements CommunicationDevice {

    /**
     * Opens a connection using the ethernet device
     *
     * @return true if the connection was successfully opened
     */
    public boolean open() {

        return true;
    }

    @Override
    public boolean send(Transaction transaction) {
        return false;
    }

    /**
     * Method blocks until host send a response or until a timeout is reached.
     *
     * @return Message received from the host. In case of timeout it returns null
     */
    public TransactionResponse receive() {
        return new TransactionResponse(true, "12314");
    }

    /**
     * Closes the channel releasing every used resources
     */
    public void close() {

    }

}
