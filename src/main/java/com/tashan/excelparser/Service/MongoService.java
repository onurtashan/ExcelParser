package com.tashan.excelparser.Service;


import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;


/**
 * Created by TCOTASHAN on 22.6.2017.
 */
public class MongoService {

    public String connectionMongo(){

        try{
            MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://<otashan>:<alex10fb>@ds147995.mlab.com:47995/kampanyacekilis"));

            String conn = "Successfully connection.";
            System.out.print(conn);
            return conn;

        }catch (Exception ce){
            System.out.print(ce);
        }

        return "";
    }
}
