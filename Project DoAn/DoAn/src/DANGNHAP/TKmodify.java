/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DANGNHAP;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

import java.util.Objects;

import static com.mongodb.client.model.Filters.eq;
import doan.MongoDBConnection;

public class TKmodify {

    private static MongoDatabase database = MongoDBConnection.getMongoDBConnection(); // Sử dụng lớp kết nối MongoDB

    public static TAIKHOAN Login(String tdn, String mk) {
        MongoCollection<Document> collection = database.getCollection("TAIKHOAN");
        Document query = new Document("TenTK", tdn).append("MatKhauTK", mk);

        try (MongoCursor<Document> cursor = collection.find(query).iterator()) {
            if (cursor.hasNext()) {
                Document doc = cursor.next();
                TAIKHOAN tk = new TAIKHOAN();
                tk.setMaTK(doc.getString("MaTK"));
                tk.setTenTK(doc.getString("TenTK"));
                tk.setMatKhauTK(doc.getString("MatKhauTK"));
                tk.setLoaiTK(doc.getString("LoaiTK"));
                tk.setMaNV(doc.getString("MaNV"));
                return tk;
            }
        }
        return null;
    }

    public static TAIKHOAN find(String MaTK) {
        MongoCollection<Document> collection = database.getCollection("TAIKHOAN");
        Document query = new Document("MaTK", MaTK);

        try (MongoCursor<Document> cursor = collection.find(query).iterator()) {
            if (cursor.hasNext()) {
                Document doc = cursor.next();
                TAIKHOAN tk = new TAIKHOAN();
                tk.setMaTK(doc.getString("MaTK"));
                tk.setTenTK(doc.getString("TenTK"));
                tk.setMatKhauTK(doc.getString("MatKhauTK"));
                tk.setLoaiTK(doc.getString("LoaiTK"));
                tk.setMaNV(doc.getString("MaNV"));
                return tk;
            }
        }
        return null;
    }

    public static boolean DeleteTK(String MaTK) {
        MongoCollection<Document> collection = database.getCollection("TAIKHOAN");
        try {
            long deletedCount = collection.deleteOne(eq("MaTK", MaTK)).getDeletedCount();
            return deletedCount > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean InsertTK(TAIKHOAN tk) {
        MongoCollection<Document> collection = database.getCollection("TAIKHOAN");
        Document document = new Document("MaTK", tk.getMaTK())
                .append("TenTK", tk.getTenTK())
                .append("MatKhauTK", tk.getMatKhauTK())
                .append("LoaiTK", tk.getLoaiTK())
                .append("MaNV", tk.getMaNV());
        try {
            collection.insertOne(document);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean UpdateTK(TAIKHOAN tk) {
        MongoCollection<Document> collection = database.getCollection("TAIKHOAN");
        Document updateDoc = new Document("$set", new Document("TenTK", tk.getTenTK())
                .append("MatKhauTK", tk.getMatKhauTK())
                .append("LoaiTK", tk.getLoaiTK())
                .append("MaNV", tk.getMaNV()));
        try {
            long updatedCount = collection.updateOne(eq("MaTK", tk.getMaTK()), updateDoc).getModifiedCount();
            return updatedCount > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
