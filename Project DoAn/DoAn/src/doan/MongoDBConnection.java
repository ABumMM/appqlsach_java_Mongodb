/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {

    private static MongoClient mongoClient;
    private static final String uri = "mongodb://localhost:27017"; // Thay đổi URI nếu cần
    private static final String dbName = "BookStore"; // Tên database MongoDB của bạn

    // Phương thức để lấy kết nối MongoDB
    public static MongoDatabase getMongoDBConnection() {
        if (mongoClient == null) {
            try {
                MongoClientURI clientURI = new MongoClientURI(uri);
                mongoClient = new MongoClient(clientURI);
            } catch (Exception ex) {
                System.err.println("Lỗi kết nối: " + ex.getMessage());
                ex.printStackTrace();
                return null;
            }
        }
        // Trả về database bạn muốn kết nối
        return mongoClient.getDatabase(dbName);
    }

    public static void main(String[] args) {
        MongoDatabase connection = getMongoDBConnection();
        if (connection != null) {
            System.out.println("Kết nối MongoDB thành công!");
        } else {
            System.out.println("Kết nối MongoDB thất bại!");
        }
    }
}
