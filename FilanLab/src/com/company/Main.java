package com.company;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Main класс со считыванием данных и выводом двух запросов.
 */
public class Main {
    /**
     * Метод для получения имени продукта по его номеру
     * @param id - номер продукта
     * @param products - массив с продуктами
     * @return имя продукта
     */
    public static String getProductName(int id, Product[] products) {
        return Stream.of(products).filter(product -> product.getID() == id).map(Product::getName).findFirst()
                .orElse("name not found");
    }

    /**
     * Метод для задания 1:
     * Для каждого товара вывести в файл общее количество проданных товаров этого типа
     * @param sales - массив продаж
     * @param products - массив продуктов
     */
    public static void getZapros1(Sale[] sales, Product[] products){
        Map<String,Integer> a=new HashMap<>();
        for (Sale sale:sales) {
            int sum = 0;
            String id = getProductName(sale.getId_product(), products);
            if (a.get(id) != null) {
                sum = a.get(id);
            }
            a.put(id, sum + sale.getQuantity());
        }
        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        try(Writer writer = new FileWriter("out1.json")) {
            gson.toJson(a,writer);
        }
        catch (IOException e){
            System.out.println("Не удается записать файл");
        }
    }

    /**
     * Метод для задания 2:
     * Вывести в файл распределение общего количества продаж по датам
     * @param sales - массив продаж
     */
    public static  void getZapros2(Sale[] sales){
        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        Map<Date, Integer> map = new HashMap<>();
        for (Sale sale : sales) {
           int count = 0;
            Date date = sale.getDate();
            if (map.get(date) != null) {
                count = map.get(date);
            }
            map.put(date, count + 1);
        }
        try(Writer writer = new FileWriter("out2.json")) {
            gson.toJson(map,writer);
        }
        catch (IOException e){
            System.out.println("Не удается записать файл");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Gson gson=new GsonBuilder().setDateFormat("dd.MM.yyyy").create();
        //Создание Reader'ов для считывания из json файлов
        JsonReader read_product= new JsonReader(new FileReader("in_Product.json"));
        JsonReader read_seller= new JsonReader(new FileReader("in_Seller.json"));
        JsonReader read_sellerProduct=new JsonReader(new FileReader("in_SellerProduct.json"));
        JsonReader read_sale=new JsonReader(new FileReader("in_Sale.json"));
        //заполнение массивов из json файлов.
        Product[] products=gson.fromJson(read_product,Product[].class);
        Seller[] sellers=gson.fromJson(read_seller,Seller[].class);
        SellerProduct[] sellerProducts=gson.fromJson(read_sellerProduct,SellerProduct[].class);
        Sale[] sales=gson.fromJson(read_sale,Sale[].class);
        //выполнение запроса
        getZapros1(sales,products);
        getZapros2(sales);



    }
}
