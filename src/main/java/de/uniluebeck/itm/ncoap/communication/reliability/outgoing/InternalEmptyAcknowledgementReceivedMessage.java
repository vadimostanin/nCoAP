/**
 * Copyright (c) 2012, Oliver Kleine, Institute of Telematics, University of Luebeck
 * All rights reserved
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the
 * following conditions are met:
 *
 *  - Redistributions of source messageCode must retain the above copyright notice, this list of conditions and the following
 *    disclaimer.
 *
 *  - Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the
 *    following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 *  - Neither the name of the University of Luebeck nor the names of its contributors may be used to endorse or promote
 *    products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE
 * GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package de.uniluebeck.itm.ncoap.communication.reliability.outgoing;

import de.uniluebeck.itm.ncoap.application.Token;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;

/**
* Instances are sent upstream (i.e. to the plugtest) by the {@link OutgoingMessageReliabilityHandler}
* when there was an empty acknowledgement received indicating that a recipient received a a confirmable
* message.
*
* @author Oliver Kleine
*/
public class InternalEmptyAcknowledgementReceivedMessage {

    private InetSocketAddress remoteSocketAddress;
    private Token token;

    /**
     * @param token the token of the confirmed message
     */
    public InternalEmptyAcknowledgementReceivedMessage(InetSocketAddress remoteSocketAddress, Token token){
        this.remoteSocketAddress = remoteSocketAddress;
        this.token = token;
    }

    /**
     * Returns the token of the confirmed message
     * @return the token of the confirmed message
     */
    public Token getToken(){
        return token;
    }


    public InetSocketAddress getRemoteSocketAddress() {
        return remoteSocketAddress;
    }

    @Override
    public String toString(){
        return "[Internal message for empty ACK reception] "
                + "Remote address: " + this.remoteSocketAddress.toString()
                + ", Token: " + token.toString();
    }
}
