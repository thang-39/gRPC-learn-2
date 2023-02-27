package org.example.service;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(6565)
                .addService(new BankService())
                .build();

        server.start();



        server.awaitTermination();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        list.forEach(i->System.out.print(i*2));
        list.forEach(i->System.out.print(i));

    }
}
