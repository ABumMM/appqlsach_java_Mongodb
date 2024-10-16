package TLForm;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;
import doan.MongoDBConnection;
import java.util.HashMap;
import java.util.Map;

public class tacvuTL {

    private MongoCollection<Document> theLoaiCollection;

    public tacvuTL() {
        // Kết nối tới MongoDB
        MongoDatabase database = MongoDBConnection.getMongoDBConnection();
        if (database != null) {
            theLoaiCollection = database.getCollection("TheLoai");
        }
    }

    public boolean insert(TheLoai TL) {
        try {
            Document doc = new Document();
            doc.put("MaTL", TL.getMaTL());
            doc.put("TenTL", TL.getTenTL());
            doc.put("MoTaTL", TL.getMoTaTL());

            theLoaiCollection.insertOne(doc);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public TheLoai find(String MaTL) {
        try {
            Document doc = theLoaiCollection.find(eq("MaTL", MaTL)).first();
            if (doc != null) {
                TheLoai TL = new TheLoai();
                TL.setMaTL(doc.getString("MaTL"));
                TL.setTenTL(doc.getString("TenTL"));
                TL.setMoTaTL(doc.getString("MoTaTL"));
                return TL;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean update(TheLoai TL) {
        try {
            Document updateDoc = new Document();
            updateDoc.put("TenTL", TL.getTenTL());
            updateDoc.put("MoTaTL", TL.getMoTaTL());

            theLoaiCollection.updateOne(eq("MaTL", TL.getMaTL()), new Document("$set", updateDoc));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(String MaTL) {
        try {
            theLoaiCollection.deleteOne(eq("MaTL", MaTL));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
