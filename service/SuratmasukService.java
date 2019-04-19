package service;

import java.util.LinkedList;
import java.util.List;

import model.Suratmasuk;

public class SuratmasukService {

    private static List<Suratmasuk> data = new LinkedList<>();

    public void addData(Suratmasuk sm) {
        data.add(sm);
        System.out.println("data telah tersimpan");
    }

    public void updateData(Suratmasuk sm) {
        int result = data.indexOf(sm);
        
        if(result >= 0) {
            data.set(result, sm);
            System.out.println("data telah diubah");
        } else {
            System.out.println("data yang ingin diubah tidak ditemukan");
        }
    }

    public void deleteData(Suratmasuk sm) {
        int result = data.indexOf(sm);

        if(result >= 0) {
            data.remove(result);
            System.out.println("data telah terhapus");
        } else {
            System.out.println("Data yang ingin dihapus tidak ada");
        }
    }

    public List<Suratmasuk> getAllData() {
        return data;
    }

}