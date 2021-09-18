package client;

import dao.Dao;
import dao.XmlDao;
import dao.MongoDBDao;
import service.Service;
import service.ServiceImpl;
import service.ServiceImplWithLog;

import java.util.List;

public class Client {
    private static final List<String> data = List.of("some", "data", "for", "test");

    public Client() {
        exp02();
    }

    private void exp01() {
        Dao dao = new XmlDao();
        Service service = new ServiceImpl(dao);
        System.out.println(service.validateAndSave(data));
    }

    private void exp02() {
        Dao dao = new MongoDBDao();
        Service service = new ServiceImplWithLog(dao);
        System.out.println(service.validateAndSave(data));
    }

    public static void main(String[] args) {
        new Client();
    }

}