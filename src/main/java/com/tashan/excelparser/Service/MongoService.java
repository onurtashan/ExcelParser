package com.tashan.excelparser.Service;


import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * Created by TCOTASHAN on 22.6.2017.
 */
public class MongoService {

    public String insertMongo(String siraNo, String duzenleyen, String kampanyaBslgncBts, String cekilisTarihi, String ilanTarihi, String gazete ){

        String url = "mongodb://otashan:123456@ds147995.mlab.com:47995/kampanyacekilis";
        MongoClient mongoClient = new MongoClient(new MongoClientURI(url, MongoClientOptions.builder().socketKeepAlive(true).socketTimeout(100000000))); //
        MongoDatabase database = mongoClient.getDatabase("kampanyacekilis");
        MongoCollection collection = database.getCollection("kampanyalar");

        org.bson.Document document = new org.bson.Document();

        document.put("siraNo", siraNo);
        document.put("duzenleyen", duzenleyen);
        document.put("kampanyaBslgncBts", kampanyaBslgncBts);
        document.put("cekilisTarihi", cekilisTarihi);
        document.put("ilanTarihi", ilanTarihi);
        document.put("gazete", gazete);

        collection.insertOne(document);

        return "OK";
    }
}
