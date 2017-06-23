package com.tashan.excelparser.Service;


import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.function.Consumer;


/**
 * Created by TCOTASHAN on 22.6.2017.
 */
public class MongoService {

    public ArrayList<String> connectionMongo(){

        final ArrayList<String> resultSet = new ArrayList<>();
        String url = "mongodb://otashan:123456@ds147995.mlab.com:47995/kampanyacekilis"; //

        try{
            MongoClient mongoClient = new MongoClient(new MongoClientURI(url, MongoClientOptions.builder().socketKeepAlive(true).socketTimeout(100000000))); //
            MongoDatabase database = mongoClient.getDatabase("kampanyacekilis");

            FindIterable<Document> list = database.getCollection("kampanyalar").find();

            list.forEach(new Consumer<Document>() {
                @Override
                public void accept(Document document) {
                    resultSet.add(document.get("duzenleyen").toString());
                }
            });

            mongoClient.close();

        }catch (Exception ce){
            System.out.print(ce);
        }

        return resultSet;
    }
}
