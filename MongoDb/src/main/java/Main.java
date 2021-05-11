import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] arg)
    {
        try {
            MongoClientURI uri = new MongoClientURI(
                   "mongodb+srv://yajith:vishwa@crop.ry3da.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
            MongoClient mongoClient = new MongoClient(uri);
            DB db=mongoClient.getDB("Scriptons");
            DBCollection crop=db.getCollection("Water");
            HashMap<String,String> map=new HashMap<>();
            map.put("field1","20");
            map.put("field2","100");
            map.put("field3","10");
            map.put("field4","50");
            DBObject dbObject=new BasicDBObject("sankar",map);
            db.createCollection("Ram",dbObject);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
