package com.inspur.thrift.server;

import com.inspur.thrift.PersonService;
import com.inspur.thrift.provider.PersonServiceImpl;
import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TTransportException;

/**
 * User: YANG
 * Date: 2019/6/4-11:44
 * Description: No Description
 */
public class ThriftServer {

    public static void main(String[] args){
        try {
            TNonblockingServerSocket serverSocket = new TNonblockingServerSocket(8899);
            THsHaServer.Args arg = new THsHaServer.Args(serverSocket)
                    .minWorkerThreads(2)
                    .maxWorkerThreads(4);

            PersonService.Processor<PersonServiceImpl> processor =
                    new PersonService.Processor<PersonServiceImpl>(new PersonServiceImpl());

            arg.protocolFactory(new TCompactProtocol.Factory());
            arg.transportFactory(new TFramedTransport.Factory());
            arg.processorFactory(new TProcessorFactory(processor));

            THsHaServer server = new THsHaServer(arg);
            System.out.println("thrift server started!");
            server.serve();//死循环

        } catch (TTransportException e) {
            e.printStackTrace();
        }

    }
}
